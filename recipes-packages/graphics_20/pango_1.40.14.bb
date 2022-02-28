inherit deb-dl


LICENSE = "BSD-3-clause-clear"

DEPENDS += " \
    gir1.2-pango-1.0-sysroot \
    libpango-1.0-0-sysroot \
    libpangocairo-1.0-0-sysroot \
    libpangoft2-1.0-0-sysroot \
    libpangoxft-1.0-0-sysroot \
    libpango1.0-dev-sysroot \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/include/pango-1.0
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/lib/pkgconfig

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libpango*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/pango-1.0/* ${D}/usr/include/pango-1.0/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/pango*.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/pango*.pc  ${D}/usr/lib/pkgconfig/

}

do_package_qa[noexec] = "1"
