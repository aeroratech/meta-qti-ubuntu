inherit deb-dl


LICENSE = "GPL-2.0+ | AFL-2.1"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

DEPENDS += " \
    libdbus-1-3-sysroot \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/lib/aarch64-linux-gnu

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/aarch64-linux-gnu/libdbus-1.so.*  ${D}/lib/aarch64-linux-gnu/
}

do_package_qa[noexec] = "1"
