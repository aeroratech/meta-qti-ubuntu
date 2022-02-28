inherit deb-dl


LICENSE = "BSD-3-clause-clear"

DEPENDS += " \
    libgirepository-1.0-1-sysroot \
    gobject-introspection-sysroot \
    "

do_install() {
   CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

   install -d ${D}/usr/lib/aarch64-linux-gnu/gobject-introspection

   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/gobject-introspection/*  ${D}/usr/lib/aarch64-linux-gnu/gobject-introspection/

   install -d ${D}/usr/share/aclocal
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/aclocal/introspection.m4 ${D}/usr/share/aclocal/
}

do_package_qa[noexec] = "1"
