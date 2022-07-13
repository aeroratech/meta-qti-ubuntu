inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-2.0+"
LICENSE_libthai0 = "LGPL-2.1+ & GPL-2.0+"
LICENSE_libthai-dev = "LGPL-2.1+ & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libthai/libthai-dev_0.1.28-3_arm64.deb;name=libthai-dev"
SRC_URI[libthai-dev.md5sum] = "6937041cb80d38e8277fe0b0cd0aa0bc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libthai/libthai0_0.1.28-3_arm64.deb;name=libthai0"
SRC_URI[libthai0.md5sum] = "86dc6c3d1601f1c42ad4f79d026300a8"

# other configs to feed compilation
PKG_${UPN} = "libthai0"

DEPENDS += "libdatrie"
