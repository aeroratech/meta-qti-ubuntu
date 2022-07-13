inherit native
# License applies to this recipe code, not the toolchain itself
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

DEB_BB_PATH = "${COREBASE}/meta-qti-ubuntu/recipes-packages/"

def gen_src_uri(d):
    import re
    DEB_BB_PATH = d.getVar('DEB_BB_PATH')
    src_uri_list = []
    recipe_list = []
    src_uri = ''
    for dir_index in os.listdir(DEB_BB_PATH):
        DEB_BB_DIR = os.path.join(DEB_BB_PATH,dir_index)
        if os.path.isdir(DEB_BB_DIR):
            for file in os.listdir(DEB_BB_DIR):
                filename = os.path.join(DEB_BB_DIR, file)
                if os.path.isfile(filename):
                    if "-ubuntu-native.bb" in file or \
                        "-cross-native.bb" in file or \
                        "-sysroot.bb" in file:
                        recipe_list.append(filename)

    for recipe in recipe_list:
        with open(recipe, "r") as fd:
            dl_url = ''
            md5sum = ''
            for line in fd:
                if "FULL_LINK" in line:
                    dl_url = re.findall(r"\'.*\'", line)
                    dl_url = dl_url[0].strip("\"\'") if dl_url else ''

                elif "SRC_URI[md5sum]" in line:
                    md5sum = re.findall(r'\"\w+\"', line)
                    md5sum = md5sum[0].strip("\"\'") if md5sum else ''

                if dl_url and md5sum:
                    break

            if not dl_url or not md5sum:
                bb.fatal("no FULL_LINK or MD5SUM defined in %s, please check" %recipe)

            src_uri_list.append("%s;md5sum=%s" %(dl_url, md5sum))

    src_uri = " ".join(src_uri_list)
    return src_uri

SRC_URI := "${@gen_src_uri(d)}"

python do_install() {
    deb_dir =  (d.getVar('EXTERNAL_TOOLCHAIN') or '') + '/deb/*'
    cmd_remove = "/usr/bin/rm -rf %s" %(deb_dir)
    if os.system(cmd_remove) != 0 :
        bb.fatal("failed to excute cmd: " + cmd_remove)
    src_uri = (d.getVar('SRC_URI') or '').split()
    for item in src_uri:
        deb_name = os.path.basename(item.split(';')[0])
        deb_file = os.path.join(d.getVar('DL_DIR'), deb_name)
        inst_dir = (d.getVar('EXTERNAL_TOOLCHAIN') or '')
        if not inst_dir :
            bb.fatal("EXTERNAL_TOOLCHAIN not define")
        elif not os.path.isfile(deb_file) :
            bb.fatal("deb not found: " + deb_file)

        inst_dir = os.path.join(inst_dir, "deb")
        cmd = "/usr/bin/dpkg-deb -X %s %s" %(deb_file, inst_dir)
        #bb.warn(cmd)
        if os.system(cmd) != 0 :
            bb.fatal("failed to excute cmd: " + cmd)
}


deltask do_unpack
