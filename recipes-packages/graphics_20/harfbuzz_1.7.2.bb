inherit deb-dl


LICENSE = "BSD-3-clause-clear"

DEPENDS += " \
    libharfbuzz0b-sysroot \
    libharfbuzz-icu0-sysroot \
    libharfbuzz-gobject0-sysroot \
    libharfbuzz-dev-sysroot \
    libgraphite2-3-sysroot \
    libgraphite2-dev-sysroot \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu
   install -d ${D}/usr/include/harfbuzz
   install -d ${D}/usr/lib/aarch64-linux-gnu/pkgconfig
   install -d ${D}/usr/lib/pkgconfig

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libharfbuzz*  ${D}/usr/lib/aarch64-linux-gnu/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/harfbuzz/* ${D}/usr/include/harfbuzz/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/harfbuzz*.pc  ${D}/usr/lib/aarch64-linux-gnu/pkgconfig/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/harfbuzz*.pc  ${D}/usr/lib/pkgconfig/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/graphite2.pc ${D}/usr/lib/pkgconfig/
}

do_package_qa[noexec] = "1"
