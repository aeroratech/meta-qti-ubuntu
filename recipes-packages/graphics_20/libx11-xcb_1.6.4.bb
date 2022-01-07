inherit deb-dl


LICENSE = "BSD-3-clause-clear"

DEPENDS += " \
    libx11 \
    libx11-xcb1 \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/include/X11

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libX11-xcb*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/Xlib-xcb.h  ${D}/usr/include/X11/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/x11-xcb.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
}

do_package_qa[noexec] = "1"
