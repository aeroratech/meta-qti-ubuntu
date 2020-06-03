DESCRIPTION = "Userspace interface to the kernel DRM services"
HOMEPAGE = "http://dri.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://xf86drm.c;beginline=9;endline=32;md5=c8a3b961af7667c530816761e949dc71"

inherit autotools pkgconfig manpages

FILESPATH =+ "${WORKSPACE}:"
SRC_URI   = "file://display/libdrm"
SRCREV = "${AUTOREV}"
S      = "${WORKDIR}/display/libdrm"


DEPENDS = "libpthread-stubs libpciaccess"

EXTRA_OECONF += "--disable-cairo-tests \
                 --enable-omap-experimental-api \
                 --enable-install-test-programs \
                 --disable-valgrind \
                "


PACKAGECONFIG[manpages] = "--enable-manpages, --disable-manpages, libxslt-native xmlto-native"


do_package_qa[noexec] = "1"

FILES_${PN} = "${bindir}/modetest"
