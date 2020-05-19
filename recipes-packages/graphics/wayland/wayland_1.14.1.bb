inherit deb-dl

LICENSE = "X11"

DEPENDS += " \
    libwayland-dev \
    libwayland-client0 \
    libwayland-server0 \
    libwayland-cursor0 \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/include
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/lib/pkgconfig

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwayland-*  ${D}${libdir}/${UBUN_TARGET_SYS}
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwayland-*  ${D}/usr/lib/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/wayland-*.h ${D}/usr/include/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/wayland-*.pc  ${D}${libdir}/${UBUN_TARGET_SYS}/pkgconfig/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/wayland-*.pc  ${D}${libdir}/pkgconfig/
}

do_package_qa[noexec] = "1"
