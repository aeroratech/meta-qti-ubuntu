inherit deb-dl

LICENSE = "BSD-3-clause-clear"

DEPENDS += " \
    libwayland-dev-sysroot \
    libwayland-client0-sysroot \
    libwayland-server0-sysroot \
    libwayland-cursor0-sysroot \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/include
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/lib/pkgconfig
   install -d ${D}/usr/bin
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/bin/wayland* ${D}/usr/bin/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwayland-*  ${D}${libdir}/${UBUN_TARGET_SYS}
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwayland-*  ${D}/usr/lib/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/wayland-*.h ${D}/usr/include/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/wayland-*.pc  ${D}${libdir}/${UBUN_TARGET_SYS}/pkgconfig/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/wayland-*.pc  ${D}${libdir}/pkgconfig/
   rm -rf ${D}${libdir}/pkgconfig/wayland-egl.pc
   rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/pkgconfig/wayland-egl.pc
   rm -rf ${D}${libdir}/libwayland-egl*.so*
}

do_package_qa[noexec] = "1"
