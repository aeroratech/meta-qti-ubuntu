inherit deb-dl


LICENSE = "BSD-3-clause-clear"

DEPENDS += " \
    libxcb \
    libx11-6-sysroot \
    libx11-dev-sysroot \
    libxext6-sysroot \
    libxext-dev-sysroot \
    libxrender1-sysroot \
    libxrender-dev-sysroot \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/share/pkgconfig/
   install -d ${D}/lib/aarch64-linux-gnu/

   install -d ${D}/usr/include/X11

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libX11*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/* ${D}/usr/include/X11/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/x11.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXext*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xext.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXrender* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xrender.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
}

do_package_qa[noexec] = "1"
