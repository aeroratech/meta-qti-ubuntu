SECTION = "base"
DESCRIPTION = "Gives a fake root environment which can support chroot"
LICENSE = "LGPL-2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8a43f747016f82968a6e7aabae1ebdda"

# inherit autotools
inherit autotools-brokensep pkgconfig

RDEPENDS_fakechroot = "perl"
#INSANE_SKIP_fakechroot += "dev-deps"
FILES_${PN} += "${libdir}/*"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/dex4er/fakechroot.git;tag=daf4d5f5501d5290dd436cea3a87a430f4152059;protocol=https"




SRC_URI[md5sum] = "9bc6ea366b6d1bf59a50443372684265"
SRC_URI[sha256sum] = "ff8e6e5252758f73f274e181d51f22cfbcf2caad4bc364030eb3e03a3b4d545e"
do_package_qa[noexec] = "1"
