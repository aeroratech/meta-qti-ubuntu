DESCRIPTION = "Gives a fake root environment"
HOMEPAGE = "http://fakeroot.alioth.debian.org"
SECTION = "base"
LICENSE = "GPL-3.0+"
PR = "r2"

SRC_URI = "\
http://archive.ubuntu.com/ubuntu/pool/main/f/fakeroot/fakeroot_1.24.orig.tar.gz \
"

DEPENDS = "libcap"

inherit autotools

INSANE_SKIP_${PN}-dev += "dev-elf"

do_configure_prepend() {
    mkdir -p ${S}/build-aux
}

do_populate_lic[noexec] = "1"
do_package_qa[noexec] = "1"
#do_install_append() {
#        install -d ${D}${includedir}/fakeroot
#        install -m 644 *.h ${D}${includedir}/fakeroot
#        install -d ${D}${libdir}/libfakeroot/
#        oe_libinstall -so libfakeroot ${D}${libdir}/libfakeroot/
#}

# fakeroot needs getopt which is provided by the util-linux package
RDEPENDS_${PN} = "util-linux"

SRC_URI[md5sum] = "964e5f438f1951e5a515dd54edd50fa6"
SRC_URI[sha256sum] = "2e045b3160370b8ab4d44d1f8d267e5d1d555f1bb522d650e7167b09477266ed"
