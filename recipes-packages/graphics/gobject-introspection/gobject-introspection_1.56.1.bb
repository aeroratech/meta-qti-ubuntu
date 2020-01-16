inherit deb-dl


LICENSE = "LGPL-2.0+ & GPL-2.0+ & MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

DEPENDS += " \
    libgirepository-1.0-1 \
    gobject-introspection-arm64 \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu/gobject-introspection

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/gobject-introspection/*  ${D}/usr/lib/aarch64-linux-gnu/gobject-introspection/
}

do_package_qa[noexec] = "1"
