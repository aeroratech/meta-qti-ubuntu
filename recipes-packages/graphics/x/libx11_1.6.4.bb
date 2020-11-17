inherit deb-dl


LICENSE = "MIT & MIT-style & BSD"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

DEPENDS += " \
    libxcb \
    libx11-6 \
    libx11b-dev \
    libxext6 \
    libxext-dev \
    libxrender1 \
    libxrender-dev \
    libxdamage1 \
    libxdamage-dev \
    libxfixes3 \
    libxfixes-dev \
    libx11-xcb \
    libxxf86vm-dev \
    libxxf86vm1 \
    libxrandr-dev \
    libxrandr2 \
    libxshmfence-dev \
    libxshmfence1 \
    xtrans-dev \
    libxkbfile-dev \
    libxkbfile1 \
    libxfont-dev \
    libxfont3 \
    libfontenc-dev \
    libfontenc1 \
    libepoxy0 \
    libepoxy-dev \
    libfontconfig1-0 \
    libfontconfig1-dev \
    libxtst-dev \
    libxtst6 \
    libsm-dev \
    libsm6 \
    libice-dev \
    libice6 \
    libxi-dev \
    libxi6 \
    libfreetype6-0 \
    libfreetype6-dev \
    "
PROVIDES = "virtual/libx11"

PACKAGES = "libx11"
FILES_libx11 = "${libdir}/${UBUN_TARGET_SYS}/libX11.so.*"
RPROVIDES_libx11 = "libx11"

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/share/pkgconfig/
   install -d ${D}/lib/aarch64-linux-gnu/

   install -d ${D}/usr/include/X11
   install -d ${D}/usr/include/X11/extensions
   install -d ${D}/usr/include/X11/Xtrans
   install -d ${D}/usr/include/X11/fonts
   install -d ${D}/usr/include/X11/SM
   install -d ${D}/usr/include/X11/ICE
   install -d ${D}/usr/include/epoxy
   install -d ${D}/usr/include/freetype2/
   install -d ${D}/usr/share/aclocal

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libX11.*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/*.h ${D}/usr/include/X11/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/x11.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXext*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/extensions/*.h ${D}/usr/include/X11/extensions/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xext.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXrender* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xrender.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXrand* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xrandr.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXfixes* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xfixes.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXdamage* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xdamage.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXxf86vm* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xxf86vm.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libxshmfence* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xshmfence.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/aclocal/xtrans.m4 ${D}/usr/share/aclocal/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/Xtrans/* ${D}/usr/include/X11/Xtrans/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/xtrans.pc ${D}/usr/share/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/fonts/libxfont2.h ${D}/usr/include/X11/fonts/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/fonts/fontenc.h ${D}/usr/include/X11/fonts/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXfont2* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xfont2.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
   
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libxkbfile* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xkbfile.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libfontenc* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/fontenc.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/epoxy/*.h ${D}/usr/include/epoxy/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libepoxy.so* ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/epoxy.pc  ${D}/usr/share/pkgconfig
   
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libfreetype*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/freetype2/* ${D}/usr/include/freetype2/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/freetype2.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXtst*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xtst.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/SM/*.h ${D}/usr/include/X11/SM/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libSM*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/sm.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/X11/ICE/*.h ${D}/usr/include/X11/ICE/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libICE*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/ice.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libXi*   ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/xi.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
}

do_package_qa[noexec] = "1"
