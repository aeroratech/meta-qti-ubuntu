inherit deb-dl


LICENSE = "MIT-style"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

DEPENDS += " \
    libbsd0 \
    x11proto-dev \
    libxdmcp6 \
    libxdmcp-dev \
    libxau6 \
    libxau-dev \
    libxcb1-0 \
    libxcb1-dev \
    libxcb-render0-0 \
    libxcb-render0-dev \
    libxcb-shm0-0 \
    libxcb-shm0-dev \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/share/pkgconfig/
   install -d ${D}/lib/aarch64-linux-gnu/

   install -d ${D}/usr/include/xcb
   install -d ${D}/usr/include/X11

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/aarch64-linux-gnu/libbsd*   ${D}/lib/aarch64-linux-gnu/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/applewmproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/bigreqsproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/compositeproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/damageproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/dmxproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/dri2proto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/dri3proto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/fixesproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/fontsproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/inputproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/kbproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/presentproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/randrproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/recordproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/renderproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/resourceproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/scrnsaverproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/videoproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/windowswmproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/xcmiscproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/xextproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/xineramaproto.pc  ${D}/usr/share/pkgconfig
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/xproto.pc  ${D}/usr/share/pkgconfig

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXdmcp*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xdmcp.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXau*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xau.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libxcb*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/xcb/* ${D}/usr/include/xcb/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xcb*.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
}

do_package_qa[noexec] = "1"
