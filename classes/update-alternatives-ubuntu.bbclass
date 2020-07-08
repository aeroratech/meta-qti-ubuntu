#Copyright (c) 2020, The Linux Foundation. All rights reserved.
#
#This file is derived from https://source.codeaurora.org/quic/ype/external/yoctoproject.org/poky/tree/meta/classes/update-alternatives.bbclass
#
#Permission is hereby granted, free of charge, to any person obtaining a copy
#of this software and associated documentation files (the "Software"), to deal
#in the Software without restriction, including without limitation the rights
#to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
#copies of the Software, and to permit persons to whom the Software is
#furnished to do so, subject to the following conditions:
#
#The above copyright notice and this permission notice shall be included in
#all copies or substantial portions of the Software.
#
#THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
#IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
#FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
#AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
#LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
#OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
#THE SOFTWARE.

# This class is used to help the alternatives system which is useful when
# multiple sources provide same command. You can use update-alternatives
# command directly in your recipe, but in most cases this class simplifies
# that job.
#
# To use this class a number of variables should be defined:
#
# List all of the alternatives needed by a package:
# ALTERNATIVE_<pkg> = "name1 name2 name3 ..."
#
#   i.e. ALTERNATIVE_busybox = "sh sed test bracket"
#
# The pathname of the link
# ALTERNATIVE_LINK_NAME[name] = "target"
#
#   This is the name of the binary once it's been installed onto the runtime.
#   This name is global to all split packages in this recipe, and should match
#   other recipes with the same functionality.
#   i.e. ALTERNATIVE_LINK_NAME[bracket] = "/usr/bin/["
#
# NOTE: If ALTERNATIVE_LINK_NAME is not defined, it defaults to ${bindir}/name
#
# The default link to create for all targets
# ALTERNATIVE_TARGET = "target"
#
#   This is useful in a multicall binary case
#   i.e. ALTERNATIVE_TARGET = "/bin/busybox"
#
# A non-default link to create for a target
# ALTERNATIVE_TARGET[name] = "target"
#
#   This is the name of the binary as it's been install by do_install
#   i.e. ALTERNATIVE_TARGET[sh] = "/bin/bash"
#
# A package specific link for a target
# ALTERNATIVE_TARGET_<pkg>[name] = "target"
#
#   This is useful when a recipe provides multiple alternatives for the
#   same item.
#
# NOTE: If ALTERNATIVE_TARGET is not defined, it will inherit the value
# from ALTERNATIVE_LINK_NAME.
#
# NOTE: If the ALTERNATIVE_LINK_NAME and ALTERNATIVE_TARGET are the same,
# ALTERNATIVE_TARGET will have '.{BPN}' appended to it.  If the file
# referenced has not been renamed, it will also be renamed.  (This avoids
# the need to rename alternative files in the do_install step, but still
# supports it if necessary for some reason.)
#
# The default priority for any alternatives
# ALTERNATIVE_PRIORITY = "priority"
#
#   i.e. default is ALTERNATIVE_PRIORITY = "10"
#
# The non-default priority for a specific target
# ALTERNATIVE_PRIORITY[name] = "priority"
#
# The package priority for a specific target
# ALTERNATIVE_PRIORITY_<pkg>[name] = "priority"

ALTERNATIVE_PRIORITY = "10"

# We need special processing for vardeps because it can not work on
# modified flag values.  So we aggregate the flags into a new variable
# and include that vairable in the set.
UPDALTVARS  = "ALTERNATIVE ALTERNATIVE_LINK_NAME ALTERNATIVE_TARGET ALTERNATIVE_PRIORITY"

PACKAGE_WRITE_DEPS += "virtual/update-alternatives-native"

do_package_qa[noexec] = "1"

RDEPENDS_${PN} += "update-alternatives-recovery"

def gen_updatealternativesvardeps(d):
    pkgs = (d.getVar("PACKAGES") or "").split()
    vars = (d.getVar("UPDALTVARS") or "").split()

    # First compute them for non_pkg versions
    for v in vars:
        for flag in sorted((d.getVarFlags(v) or {}).keys()):
            if flag == "doc" or flag == "vardeps" or flag == "vardepsexp":
                continue
            d.appendVar('%s_VARDEPS' % (v), ' %s:%s' % (flag, d.getVarFlag(v, flag, False)))

    for p in pkgs:
        for v in vars:
            for flag in sorted((d.getVarFlags("%s_%s" % (v,p)) or {}).keys()):
                if flag == "doc" or flag == "vardeps" or flag == "vardepsexp":
                    continue
                d.appendVar('%s_VARDEPS_%s' % (v,p), ' %s:%s' % (flag, d.getVarFlag('%s_%s' % (v,p), flag, False)))

def ua_extend_depends(d):
    if not 'virtual/update-alternatives' in d.getVar('PROVIDES'):
        d.appendVar('DEPENDS', ' virtual/${MLPREFIX}update-alternatives')

python __anonymous() {
    # Update Alternatives only works on target packages...
    if bb.data.inherits_class('native', d) or \
       bb.data.inherits_class('cross', d) or bb.data.inherits_class('crosssdk', d) or \
       bb.data.inherits_class('cross-canadian', d):
        return

    # Disable when targeting mingw32 (no target support)
    if d.getVar("TARGET_OS") == "mingw32":
        return

    # compute special vardeps
    gen_updatealternativesvardeps(d)

    # extend the depends to include virtual/update-alternatives
    # ua_extend_depends(d)
}

def gen_updatealternativesvars(d):
    ret = []
    pkgs = (d.getVar("PACKAGES") or "").split()
    vars = (d.getVar("UPDALTVARS") or "").split()

    for v in vars:
        ret.append(v + "_VARDEPS")

    for p in pkgs:
        for v in vars:
            ret.append(v + "_" + p)
            ret.append(v + "_VARDEPS_" + p)
    return " ".join(ret)

# Now the new stuff, we use a custom function to generate the right values
populate_packages[vardeps] += "${UPDALTVARS} ${@gen_updatealternativesvars(d)}"

# We need to do the rename after the image creation step, but before
# the split and strip steps..  packagecopy seems to be the earliest reasonable
# place.
python perform_packagecopy_append () {
    # skip files
    def skip_files(d, pkg):
        files = []
        if bb.utils.contains('DISTRO_FEATURES', 'systemd', True, False, d):
           systemd_packages = d.getVar('SYSTEMD_PACKAGES') or ""
           if pkg in systemd_packages.split():
              files = files + (d.getVar('SYSTEMD_SERVICE_' + pkg) or "").split()
        return files

    # remove alternative files from FILES
    def filter_files(d, pkg, rm):
        files = d.getVar('FILES_%s' % pkg) or ""
        files_list = files.split()
        try:
            files_list.remove(rm)
        except ValueError:
            return
        d.setVar('FILES_%s' % pkg, ' '.join(files_list))

    # get files from FILES
    def get_files(d, pkg):
        pkgdest = d.getVar('PKGD') or ""
        old_files = d.getVar('FILES_%s' % pkg) or ""
        new_files = []
        file_list = []
        if not old_files:
            return
        for file in old_files.split():
            path = pkgdest + file
            out = os.popen("find %s -type f,l;find %s -type d -empty" % (path, path))
            str1 = out.read()
            out.close()
            new_files += str1.split()
        new_files = list(set(new_files))
        new_files.sort()
        for f in new_files:
            file_list.append(f[len(pkgdest):])
        d.setVar('FILES_%s' % pkg, ' '.join(file_list))

    # Check for deprecated usage...
    pn = d.getVar('BPN')
    if d.getVar('ALTERNATIVE_LINKS') != None:
        bb.fatal('%s: Use of ALTERNATIVE_LINKS/ALTERNATIVE_PATH/ALTERNATIVE_NAME is no longer supported, please convert to the updated syntax, see update-alternatives.bbclass for more info.' % pn)

    # Do actual update alternatives processing
    pkgdest = d.getVar('PKGD')
    for pkg in (d.getVar('PACKAGES') or "").split():
        if (d.getVar('ALTERNATIVE_%s' % pkg) or "").split():
            get_files(d, pkg)
            # append package name to qti-xxxxx
            pkg_name = d.getVar('PKG_%s' % pkg) or ""
            if pkg_name:
               pkg_name = 'qti-' + pkg_name
            else:
               pkg_name = 'qti-' + pkg
            d.setVar('PKG_%s' % pkg, pkg_name)
        else:
            continue

        skip_list = skip_files(d, pkg)

        for alt_name in (d.getVar('ALTERNATIVE_%s' % pkg) or "").split():
            if alt_name in skip_list:
               continue
            alt_link     = d.getVarFlag('ALTERNATIVE_LINK_NAME', alt_name)
            if not alt_link:
                alt_link = "%s/%s" % (d.getVar('bindir'), alt_name)
                d.setVarFlag('ALTERNATIVE_LINK_NAME', alt_name, alt_link)
            filter_files(d, pkg, alt_link)

            alt_target   = d.getVarFlag('ALTERNATIVE_TARGET_%s' % pkg, alt_name) or d.getVarFlag('ALTERNATIVE_TARGET', alt_name)
            alt_target   = alt_target or d.getVar('ALTERNATIVE_TARGET_%s' % pkg) or d.getVar('ALTERNATIVE_TARGET') or alt_link

            # Rename the target.
            src = '%s/%s' % (pkgdest, alt_target)
            alt_target_rename = '/opt/qcom%s.%s' % (alt_target, pn)
            vendor_path = '%s/%s' % (pkgdest, os.path.dirname(alt_target_rename))
            os.makedirs(vendor_path, exist_ok=True)
            dest = '%s/%s' % (pkgdest, alt_target_rename)
            d.appendVar('FILES_%s' % pkg, ' ' + alt_target_rename)
            if os.path.lexists(dest):
                bb.note('%s: Already renamed: %s' % (pn, alt_target_rename))
            elif os.path.lexists(src):
                if os.path.islink(src):
                    link = os.readlink(src)
                    link_path = os.path.dirname(alt_target) + '/' + link
                    src_path = os.path.dirname(src)
                    if link == "" or link[0] != '/':
                        os.unlink(src)
                        os.symlink(link_path, src)
                bb.note('%s: Rename %s -> %s' % (pn, alt_target, alt_target_rename))
                os.rename(src, dest)
                # If the target and link have different name, make a soft link for target
                if alt_link != alt_target:
                    os.symlink(('../' * (alt_target.count('/') - 1) + alt_target_rename[1:]), pkgdest + alt_target)
                    d.appendVar('FILES_%s' % pkg, ' ' + alt_target)
            else:
                bb.warn("%s: alternative target (%s or %s) does not exist, skipping..." % (pn, alt_target, alt_target_rename))
                continue

            d.setVarFlag('ALTERNATIVE_TARGET_%s' % pkg, alt_name, alt_target_rename)
}

PACKAGESPLITFUNCS_prepend = "${@'' if 'update-alternatives.bbclass' in (d.getVar('BBINCLUDED', True)) else 'populate_packages_updatealternatives '}"

python populate_packages_updatealternatives () {
    pn = d.getVar('BPN')

    # Do actual update alternatives processing
    pkgdest = d.getVar('PKGD')
    for pkg in (d.getVar('PACKAGES') or "").split():
        # Create post install/removal scripts
        alt_setup_links = ""
        alt_remove_links = ""
        for alt_name in (d.getVar('ALTERNATIVE_%s' % pkg) or "").split():
            alt_link     = d.getVarFlag('ALTERNATIVE_LINK_NAME', alt_name)
            alt_target   = d.getVarFlag('ALTERNATIVE_TARGET_%s' % pkg, alt_name) or d.getVarFlag('ALTERNATIVE_TARGET', alt_name)
            alt_target   = alt_target or d.getVar('ALTERNATIVE_TARGET_%s' % pkg) or d.getVar('ALTERNATIVE_TARGET') or alt_link
            # Sometimes alt_target is specified as relative to the link name.
            alt_target   = os.path.join(os.path.dirname(alt_link), alt_target)

            alt_priority = d.getVarFlag('ALTERNATIVE_PRIORITY_%s' % pkg,  alt_name) or d.getVarFlag('ALTERNATIVE_PRIORITY',  alt_name)
            alt_priority = alt_priority or d.getVar('ALTERNATIVE_PRIORITY_%s' % pkg) or d.getVar('ALTERNATIVE_PRIORITY')

            # This shouldn't trigger, as it should have been resolved earlier!
            if alt_link == alt_target:
                bb.note('alt_link == alt_target: %s == %s -- correcting, this should not happen!' % (alt_link, alt_target))
                alt_target = '%s.%s' % (alt_target, pn)

            if not os.path.lexists('%s/%s' % (pkgdest, alt_target)):
                bb.warn('%s: NOT adding alternative provide %s: %s does not exist' % (pn, alt_link, alt_target))
                continue

            # Default to generate shell script.. eventually we may want to change this...
            alt_target = os.path.normpath(alt_target)

            alt_setup_links  += '\tupdate-alternatives --install %s %s %s %s --force\n' % (alt_link, alt_name, alt_target, alt_priority)
            alt_remove_links += '\tupdate-alternatives --remove  %s %s\n' % (alt_name, alt_target)

        if alt_setup_links:
            bb.note('adding update-alternatives calls to postinst/prerm for %s' % pkg)
            bb.note('%s' % alt_setup_links)
            postinst = d.getVar('pkg_postinst_%s' % pkg) or '#!/bin/sh\n'
            postinst += alt_setup_links
            d.setVar('pkg_postinst_%s' % pkg, postinst)

            bb.note('%s' % alt_remove_links)
            prerm = d.getVar('pkg_prerm_%s' % pkg) or '#!/bin/sh\n'
            prerm += alt_remove_links
            d.setVar('pkg_prerm_%s' % pkg, prerm)

}

python package_do_filedeps_append () {
    pn = d.getVar('BPN')
    pkgdest = d.getVar('PKGDEST')

    for pkg in packages.split():
        for alt_name in (d.getVar('ALTERNATIVE_%s' % pkg) or "").split():
            alt_link     = d.getVarFlag('ALTERNATIVE_LINK_NAME', alt_name)
            alt_target   = d.getVarFlag('ALTERNATIVE_TARGET_%s' % pkg, alt_name) or d.getVarFlag('ALTERNATIVE_TARGET', alt_name)
            alt_target   = alt_target or d.getVar('ALTERNATIVE_TARGET_%s' % pkg) or d.getVar('ALTERNATIVE_TARGET') or alt_link

            if alt_link == alt_target:
                bb.warn('%s: alt_link == alt_target: %s == %s' % (pn, alt_link, alt_target))
                alt_target = '%s.%s' % (alt_target, pn)

            if not os.path.lexists('%s/%s/%s' % (pkgdest, pkg, alt_target)):
                continue

            # Add file provide
            trans_target = oe.package.file_translate(alt_target)
            d.appendVar('FILERPROVIDES_%s_%s' % (trans_target, pkg), " " + alt_link)
            if not trans_target in (d.getVar('FILERPROVIDESFLIST_%s' % pkg) or ""):
                d.appendVar('FILERPROVIDESFLIST_%s' % pkg, " " + trans_target)
}

