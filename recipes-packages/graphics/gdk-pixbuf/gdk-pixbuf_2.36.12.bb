inherit deb-dl


LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

DEPENDS += " \
    libgdk-pixbuf2.0-0 \
    libgdk-pixbuf2.0-dev \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu/gdk-pixbuf-2.0
   install -d ${D}/usr/bin
   install -d ${D}/usr/include/gdk-pixbuf-2.0
   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/gdk-pixbuf-2.0/* ${D}/usr/lib/aarch64-linux-gnu/gdk-pixbuf-2.0
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libgdk_pixbuf* ${D}/usr/lib/aarch64-linux-gnu/

   #dev
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/bin/gdk-pixbuf* ${D}/usr/bin/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/gdk-pixbuf-2.0/*  ${D}/usr/include/gdk-pixbuf-2.0/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libgdk_pixbuf*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/gdk-pixbuf*.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
}

do_package_qa[noexec] = "1"
