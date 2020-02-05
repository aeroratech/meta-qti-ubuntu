inherit deb-dl


LICENSE = "LGPL-2.0+"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

DEPENDS += " \
    gir1.2-pango-1.0 \
    libpango-1.0-0 \
    libpangocairo-1.0-0 \
    libpangoft2-1.0-0 \
    libpangoxft-1.0-0 \
    libpango1.0-dev \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/include/pango-1.0
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libpango*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/pango-1.0/* ${D}/usr/include/pango-1.0/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/pango*.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
}

do_package_qa[noexec] = "1"
