DESCRIPTION = "Gives a fake root environment"
HOMEPAGE = "http://fakeroot.alioth.debian.org"
SECTION = "base"
LICENSE = "GPLv3 & (Artistic-1.0 | GPL-1.0+ )"
PR = "r2"

SRC_URI = "\
http://archive.ubuntu.com/ubuntu/pool/main/f/fakeroot/fakeroot_1.22.orig.tar.bz2 \
"

DEPENDS = "libcap"

inherit autotools

INSANE_SKIP_${PN}-dev += "dev-elf"

do_configure_prepend() {
    mkdir -p ${S}/build-aux
}

do_populate_lic[noexec] = "1"

#do_install_append() {
#        install -d ${D}${includedir}/fakeroot
#        install -m 644 *.h ${D}${includedir}/fakeroot
#        install -d ${D}${libdir}/libfakeroot/
#        oe_libinstall -so libfakeroot ${D}${libdir}/libfakeroot/
#}

# fakeroot needs getopt which is provided by the util-linux package
RDEPENDS_${PN} = "util-linux"

SRC_URI[md5sum] = "fae64c9aeb2c895ead8e1b99bf50c631"
SRC_URI[sha256sum] = "bd806a4a1e641203eb3d4571a10089e8a038c10ec7e492fa1e061b03ae3ec6fe"
