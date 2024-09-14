#Copyright (c) 2020, The Linux Foundation. All rights reserved.
#
#Redistribution and use in source and binary forms, with or without
#modification, are permitted provided that the following conditions are
#met:
#    * Redistributions of source code must retain the above copyright
#      notice, this list of conditions and the following disclaimer.
#    * Redistributions in binary form must reproduce the above
#      copyright notice, this list of conditions and the following
#      disclaimer in the documentation and/or other materials provided
#      with the distribution.
#    * Neither the name of The Linux Foundation nor the names of its
#      contributors may be used to endorse or promote products derived
#      from this software without specific prior written permission.
#
#THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
#WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
#MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
#ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
#BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
#CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
#SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
#BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
#WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
#OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
#IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

# Use the following to extend qimage with custom functions like signing
QIMGEXTENSION ?= ""

inherit core-image ${QIMGEXTENSION}

# Only when verity feature is enabled, start including related tasks.
VERITY_PROVIDER ?= "${@bb.utils.contains('DISTRO_FEATURES', 'dm-verity', 'dm-verity', '', d)}"
inherit ${VERITY_PROVIDER}

# The work directory for image recipes is retained as the 'rootfs' directory
# can be used as sysroot during remote gdb debgging
RM_WORK_EXCLUDE += "${PN}"

# generate a companion debug archive containing symbols from the -dbg packages
#IMAGE_GEN_DEBUGFS = "1"
#IMAGE_FSTYPES_DEBUGFS = "tar.bz2"
do_image_ext4[noexec] = "1"


### Don't append timestamp to image name
IMAGE_VERSION_SUFFIX = ""

# Default Image names
DTBOIMAGE_TARGET ?= "dtbo.img"
BOOTIMAGE_TARGET ?= "${IMAGE_NAME}-boot.img"
SYSTEMIMAGE_TARGET ?= "${IMAGE_NAME}-sysfs.ext4"
SYSTEMIMAGE_MAP_TARGET ?= "${IMAGE_NAME}-sysfs.map"
OVERLAYIMAGE_TARGET ?= "${IMAGE_NAME}-overlayfs.ext4"
OVERLAYIMAGE_MAP_TARGET ?= "${IMAGE_NAME}-overlayfs.map"

#  Function to get most suitable .inc file with list of packages
#  to be installed into root filesystem from layer it is called.
#  Following is the order of priority.
#  P1: <basemachine>/<basemachine>-<distro>-<layerkey>-image.inc
#  P2: <basemachine>/<basemachine>-<layerkey>-image.inc
#  P3: common/common-<layerkey>-image.inc
def get_bblayer_img_inc(layerkey, d):
    distro      = d.getVar('DISTRO', True)
    basemachine = d.getVar('BASEMACHINE', True)

    lkey = ''
    if layerkey != '':
        lkey = layerkey + "-"

    common_inc  = "common-"+ lkey + "image.inc"
    machine_inc = basemachine + "-" + lkey + "image.inc"
    distro_inc  = machine_inc
    if distro != 'base' or '':
        distro_inc = basemachine + "-" + distro +"-" + lkey + "image.inc"

    distro_inc_path  = os.path.join(d.getVar('THISDIR'), basemachine, distro_inc)
    machine_inc_path = os.path.join(d.getVar('THISDIR'), basemachine, machine_inc)
    common_inc_path  = os.path.join(d.getVar('THISDIR'), "common", common_inc)

    if os.path.exists(distro_inc_path):
        img_inc_path = distro_inc_path
    elif os.path.exists(machine_inc_path):
        img_inc_path = machine_inc_path
    else:
        img_inc_path = common_inc_path
    bb.note(" Incuding packages from %s" % (img_inc_path))
    return img_inc_path

IMAGE_INSTALL_ATTEMPTONLY ?= ""
IMAGE_INSTALL_ATTEMPTONLY[type] = "list"

# Original definition is in image.bbclass. Overloading it with internal list of packages
# to ensure dependencies are not messed up in case package is absent.
PACKAGE_INSTALL_ATTEMPTONLY = "${IMAGE_INSTALL_ATTEMPTONLY} ${FEATURE_INSTALL_OPTIONAL}"

IMAGE_LINGUAS = ""

#Exclude packages
PACKAGE_EXCLUDE += "readline"

# Use busybox as login manager
#IMAGE_LOGIN_MANAGER = "busybox-static"

DEPENDS += "\
             ext4-utils-native \
             gen-partitions-tool-native \
             mkbootimg-native \
             mtd-utils-native \
             openssl-native \
             pkgconfig-native \
	     ptool-native \
"

do_gen_partition_bin[dirs]      = "${DEPLOY_DIR_IMAGE}"

do_gen_partition_bin () {
    # Generate partition.xml using gen_partition utility
    python ${STAGING_BINDIR_NATIVE}/gen_partition.py \
        -i ${THISDIR}/partition/${MACHINE_PARTITION_CONF} \
        -o ${WORKDIR}/partition.xml \
        -m boot="${BOOTIMAGE_TARGET}",system="${SYSTEMIMAGE_TARGET}",userdata="${OVERLAYIMAGE_TARGET}"

    install ${WORKDIR}/partition.xml ${DEPLOY_DIR_IMAGE}

    # Call ptool to generate partition bins
    python ${STAGING_BINDIR_NATIVE}/ptool.py -x ${WORKDIR}/partition.xml -t ${DEPLOY_DIR_IMAGE}
}

addtask do_gen_partition_bin after do_prepare_recipe_sysroot before do_image

# Check and remove empty packages before rootfs creation
do_rootfs[prefuncs] += "rootfs_ignore_packages"
python rootfs_ignore_packages() {
    excl_pkgs = d.getVar("PACKAGE_EXCLUDE", True).split()
    atmt_only_pkgs = d.getVar("PACKAGE_INSTALL_ATTEMPTONLY", True).split()
    inst_atmt_pkgs = d.getVar("IMAGE_INSTALL_ATTEMPTONLY", True).split()

    empty_pkgs = "${TMPDIR}/prebuilt/${MACHINE}/empty_pkgs"
    if (os.path.isfile(empty_pkgs)):
        with open(empty_pkgs) as file:
            ignore_pkgs = file.read().splitlines()
    else:
        ignore_pkgs=""

    for pkg in inst_atmt_pkgs:
        if pkg in ignore_pkgs:
            excl_pkgs.append(pkg)
            atmt_only_pkgs.remove(pkg)
            bb.debug(1, "Adding empty package %s, in %s IMAGE_INSTALL_ATTEMPTONLY to exclude list. (%s) " % (pkg, d.getVar('PN', True), excl_pkgs))

    d.setVar("PACKAGE_EXCLUDE", ' '.join(excl_pkgs))
    d.setVar("PACKAGE_INSTALL_ATTEMPTONLY", ' '.join(atmt_only_pkgs))
}

ROOTFS_POSTPROCESS_COMMAND += "gen_buildprop;"

gen_buildprop() {
   mkdir -p ${IMAGE_ROOTFS}/cache
   echo ro.build.version.release=`cat ${IMAGE_ROOTFS}/etc/version ` >> ${IMAGE_ROOTFS}/build.prop
   echo ro.product.name=${BASEMACHINE}-${DISTRO} >> ${IMAGE_ROOTFS}/build.prop
   echo ${MACHINE} >> ${IMAGE_ROOTFS}/target
}


# Call function makesystem to generate sparse ext4 image
python __anonymous () {
    machine = d.getVar("MACHINE", True)
    if (machine!="sdxpoorwills") and (machine!="mdm9607") and (machine!="sdxprairie"):
        bb.build.addtask('makesystem', 'do_build', 'do_rootfs', d)
}

#mount boot_a /boot
do_mount_bootfs() {
    if ! grep -q boot_a ${IMAGE_ROOTFS}/etc/fstab;then
        echo "/dev/disk/by-partlabel/boot_a       /boot           ext3    defaults        0       2" >> ${IMAGE_ROOTFS}/etc/fstab
    fi
}
### Generate system.img #####
# Alter system image size if varity is enabled.
do_makesystem[prefuncs]  += " ${@bb.utils.contains('DISTRO_FEATURES', 'dm-verity', 'adjust_system_size_for_verity', '', d)}"
do_makesystem[prefuncs]  += " ${@bb.utils.contains('DISTRO_FEATURES', 'boot_with_fs', 'do_mount_bootfs', '', d)}"
do_makesystem[postfuncs] += " ${@bb.utils.contains('DISTRO_FEATURES', 'dm-verity', 'make_verity_enabled_system_image', '', d)}"
do_makesystem[dirs]       = "${DEPLOY_DIR_IMAGE}"


do_makesystem() {
    cp ${THISDIR}/${BASEMACHINE}/${BASEMACHINE}-fsconfig.conf ${WORKDIR}/rootfs-fsconfig.conf
	# Delete .debug files
	rm -rf ${IMAGE_ROOTFS}/usr/lib/.debug ${IMAGE_ROOTFS}/usr/lib64/.debug ${IMAGE_ROOTFS}/usr/lib/gcc
	find ${IMAGE_ROOTFS} -name ".debug" -exec rm -rf {} + 2>/dev/null
    make_ext4fs -s -l ${SYSTEM_SIZE_EXT4} -C ${WORKDIR}/rootfs-fsconfig.conf -B ${DEPLOY_DIR_IMAGE}/system.map ${IMAGE_EXT4_SELINUX_OPTIONS} -a / -b 4096 ${DEPLOY_DIR_IMAGE}/${SYSTEMIMAGE_TARGET} ${IMAGE_ROOTFS}
}

################################################
############# Generate dtbo.img ################
################################################
MKDTUTIL = '${@oe.utils.conditional("PREFERRED_PROVIDER_virtual/mkdtimg-native", "mkdtimg-gki-native", "mkdtboimg/bin/mkdtboimg.py", "mkdtimg", d)}'
DTBODEPLOYDIR = "${WORKDIR}/deploy-${PN}-dtboimage-complete"

# Create dtbo.img if DTBO support is enabled
python do_makedtbo () {
    import subprocess

    mkdtimg_bin_path = d.getVar('STAGING_BINDIR_NATIVE', True) + "/" + d.getVar('MKDTUTIL')
    dtbodeploydir = d.getVar('DEPLOY_DIR_IMAGE', True) + "/" + "DTOverlays"
    pagesize = d.getVar("PAGE_SIZE")
    output          = d.getVar('DTBOIMAGE_TARGET', True)
    # cmd to make dtbo.img
    cmd = mkdtimg_bin_path + " create "+ output +" --page_size="+ pagesize +" "+ dtbodeploydir + "/*.dtbo"
    bb.debug(1, "do_makedtbo cmd: %s" % (cmd))
    try:
        ret = subprocess.check_output(cmd, shell=True)
    except RuntimeError as e:
        bb.error("cmd: %s failed with error %s" % (cmd, str(e)))
}

do_makedtbo[dirs]      = "${DTBODEPLOYDIR}"
# Make sure dtb files ready to create dtbo.img
do_makedtbo[depends] += "virtual/kernel:do_deploy virtual/mkdtimg-native:do_populate_sysroot"
SSTATETASKS += "do_makedtbo"
SSTATE_SKIP_CREATION_task-makedtbo = '1'
do_makedtbo[sstate-inputdirs] = "${DTBODEPLOYDIR}"
do_makedtbo[sstate-outputdirs] = "${DEPLOY_DIR_IMAGE}"
do_makedtbo[stamp-extra-info] = "${MACHINE_ARCH}"

python do_makedtbo_setscene () {
    sstate_setscene(d)
}

################################################
############# Generate boot.img ################
################################################
python do_make_bootimg () {
    import subprocess

    xtra_parms=""
    if bb.utils.contains('DISTRO_FEATURES', 'nand-boot', True, False, d):
        xtra_parms = " --tags-addr" + " " + d.getVar('KERNEL_TAGS_OFFSET')

    mkboot_bin_path = d.getVar('STAGING_BINDIR_NATIVE', True) + '/mkbootimg'
    zimg_path       = d.getVar('DEPLOY_DIR_IMAGE', True) + "/" + d.getVar('KERNEL_IMAGETYPE', True)
    cmdline         = "\"" + d.getVar('KERNEL_CMD_PARAMS', True) + "\""
    pagesize        = d.getVar('PAGE_SIZE', True)
    base            = d.getVar('KERNEL_BASE', True)

    # When verity is enabled add '.noverity' suffix to default boot img.
    output          = d.getVar('DEPLOY_DIR_IMAGE', True) + "/" + d.getVar('BOOTIMAGE_TARGET', True)
    if bb.utils.contains('DISTRO_FEATURES', 'dm-verity', True, False, d):
            output += ".noverity"

    # cmd to make boot.img
    cmd =  mkboot_bin_path + " --kernel %s --cmdline %s --pagesize %s --base %s %s --ramdisk /dev/null --ramdisk_offset 0x0 --output %s" \
           % (zimg_path, cmdline, pagesize, base, xtra_parms, output )

    bb.debug(1, "do_make_bootimg cmd: %s" % (cmd))

    ret = subprocess.call(cmd, shell=True)
    if ret != 0:
        bb.error("Running: %s failed." % cmd)

}
do_make_bootimg[dirs]      = "${DEPLOY_DIR_IMAGE}"
# Make sure native tools and vmlinux ready to create boot.img
do_make_bootimg[depends] += "virtual/kernel:do_deploy"

addtask do_make_bootimg before do_image_complete after do_prepare_recipe_sysroot

# With dm-verity, kernel cmdline has to be updated with correct hash value of
# system image. This means final boot image can be created only after system image.
# But many a times when only kernel need to be built waiting for full image is
# time consuming. To over come this make_veritybootimg task is added to build boot
# img with verity. Normal do_make_bootimg continue to build boot.img without verity.
python do_make_veritybootimg () {
    import subprocess

    xtra_parms=""
    if bb.utils.contains('DISTRO_FEATURES', 'nand-boot', True, False, d):
        xtra_parms = " --tags-addr" + " " + d.getVar('KERNEL_TAGS_OFFSET')

    verity_cmdline = ""
    if bb.utils.contains('DISTRO_FEATURES', 'dm-verity', True, False, d):
        verity_cmdline = get_verity_cmdline(d).strip()

    mkboot_bin_path = d.getVar('STAGING_BINDIR_NATIVE', True) + '/mkbootimg'
    zimg_path       = d.getVar('DEPLOY_DIR_IMAGE', True) + "/" + d.getVar('KERNEL_IMAGETYPE', True)
    cmdline         = "\"" + d.getVar('KERNEL_CMD_PARAMS', True) + " " + verity_cmdline + "\""
    pagesize        = d.getVar('PAGE_SIZE', True)
    base            = d.getVar('KERNEL_BASE', True)
    output          = d.getVar('DEPLOY_DIR_IMAGE', True) + "/" + d.getVar('BOOTIMAGE_TARGET', True)

    # cmd to make boot.img
    cmd =  mkboot_bin_path + " --kernel %s --cmdline %s --pagesize %s --base %s %s --ramdisk /dev/null --ramdisk_offset 0x0 --output %s" \
           % (zimg_path, cmdline, pagesize, base, xtra_parms, output )

    bb.debug(1, "do_make_veritybootimg cmd: %s" % (cmd))

    ret = subprocess.call(cmd, shell=True)
    if ret != 0:
        bb.error("Running: %s failed." % cmd)
}
do_make_veritybootimg[depends]  += "${PN}:do_makesystem"
do_make_veritybootimg[dirs]      = "${DEPLOY_DIR_IMAGE}"
do_make_veritybootimg[depends] += "virtual/kernel:do_deploy"

python () {
    if bb.utils.contains('DISTRO_FEATURES', 'dm-verity', True, False, d):
        bb.build.addtask('do_make_veritybootimg', 'do_image_complete', 'do_rootfs', d)
    if bb.utils.contains('DISTRO_FEATURES', 'boot_with_fs', True, False, d):
        bb.build.addtask('do_make_bootfs', 'do_image_complete', 'do_image', d)
        bb.build.addtask('do_bootimg_deb', 'do_image_complete', 'do_make_bootfs', d)
    if bb.utils.contains('MACHINE_SUPPORTS_DTBO', 'True', True, False, d):
        bb.build.addtask('do_makedtbo', 'do_image', 'do_make_bootimg', d)
}

# With boot_with_fs, make the bootfs.img
BOOTFS_TARGET ?= "${IMAGE_NAME}-bootfs.img"
BOOTIMAGE_DATETIME ?= "${IMAGE_NAME}-boot-${DATETIME}.img"
do_make_bootfs() {
    if [ -d "${WORKDIR}/boot" ];then
        rm -rf ${WORKDIR}/boot
    fi
    mkdir ${WORKDIR}/boot
    cp ${DEPLOY_DIR_IMAGE}/${BOOTIMAGE_TARGET} ${WORKDIR}/boot/${BOOTIMAGE_DATETIME}
    cp ${THISDIR}/${BASEMACHINE}/${BASEMACHINE}-menu.cfg ${WORKDIR}/boot/menu.cfg
    echo "boot=${BOOTIMAGE_DATETIME}" >> ${WORKDIR}/boot/menu.cfg
    /sbin/mke2fs -b ${BOOTFS_BLOCK_SIZE} -t ${BOOTFS_TYPE} -d ${WORKDIR}/boot/ ${DEPLOY_DIR_IMAGE}/${BOOTFS_TARGET} ${BOOTFS_SIZE_EXT3}
}

#with boot_with_fs, make bootimg deb package
BOOTIMAGE_DEB ?= "${WORKDIR}/deploy-debs/bootimg_0.1_arm64"
do_bootimg_deb() {
    if [ ! -d "${WORKDIR}/deploy-debs" ];then
        mkdir ${WORKDIR}/deploy-debs
    fi
    mkdir ${BOOTIMAGE_DEB}
    cp -rf ${WORKDIR}/boot ${BOOTIMAGE_DEB}/
    mkdir ${BOOTIMAGE_DEB}/DEBIAN
    touch ${BOOTIMAGE_DEB}/DEBIAN/control
    chmod 0755 ${BOOTIMAGE_DEB}/DEBIAN/control
    echo "Package: bootimg" >> ${BOOTIMAGE_DEB}/DEBIAN/control
    echo "Version: 0.1" >> ${BOOTIMAGE_DEB}/DEBIAN/control
    echo "Section: kernel" >> ${BOOTIMAGE_DEB}/DEBIAN/control
    echo "Priority: optional" >> ${BOOTIMAGE_DEB}/DEBIAN/control
    echo "Architecture: arm64" >> ${BOOTIMAGE_DEB}/DEBIAN/control
    echo "Maintainer: OE-Core Developers <openembedded-core@lists.openembedded.org>" >> ${BOOTIMAGE_DEB}/DEBIAN/control
    echo "Description: bootimg version 0.1" >> ${BOOTIMAGE_DEB}/DEBIAN/control
    echo  >> ${BOOTIMAGE_DEB}/DEBIAN/control
    dpkg -b ${BOOTIMAGE_DEB} ${BOOTIMAGE_DEB}.deb
    cp ${BOOTIMAGE_DEB}.deb ${DEPLOY_DIR_DEB}/all
    rm -rf ${BOOTIMAGE_DEB}
}

# add a task for populated rootfs as Ubuntu's SDK sysroot
do_populate_ubuntu_sdk() {
    if [ ! -s "${WORKDIR}/sdk_sysroot.tar.gz" ];then
        tar -zcf ${WORKDIR}/sdk_sysroot.tar.gz ${IMAGE_ROOTFS} ${DEPLOY_DIR_IMAGE}/system.map ${WORKDIR}/rootfs-fsconfig.conf
    fi
}
do_populate_ubuntu_sdk[depends] += "${PN}:do_rootfs"
addtask do_populate_ubuntu_sdk
