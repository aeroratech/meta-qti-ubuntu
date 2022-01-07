inherit deb-dl


# License applies to this recipe code, not to the packages itself
LICENSE = "BSD-3-clause-clear"

DEPENDS += " \
    libx11 \
    libfreetype6-sysroot \
    libfreetype6-dev-sysroot \
    expat \
    libfontconfig1-sysroot \
    libfontconfig1-dev-sysroot \
    libcairo2-sysroot \
    libcairo-gobject2-sysroot \
    libcairo-script-interpreter2-sysroot \
    libcairo2-dev-sysroot \
    pixman \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/include/cairo
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig

   #dependencies
   install -d ${D}/lib/aarch64-linux-gnu/
   install -d ${D}/usr/include/fontconfig/
   install -d ${D}/usr/include/freetype2/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libcairo*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/cairo/* ${D}/usr/include/cairo/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/cairo*.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   #dependencies
#   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/aarch64-linux-gnu/libexpat*  ${D}/lib/aarch64-linux-gnu/
#   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libexpatw*  ${D}/usr/lib/aarch64-linux-gnu/
   
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libfreetype*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/freetype2/* ${D}/usr/include/freetype2/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/freetype2.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libfontconfig* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/fontconfig/* ${D}/usr/include/fontconfig/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/fontconfig.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
   
}

do_package_qa[noexec] = "1"
