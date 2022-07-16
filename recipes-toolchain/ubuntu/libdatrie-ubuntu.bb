inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-2.0+"
LICENSE_libdatrie1 = "LGPL-2.1+ & GPL-2.0+"
LICENSE_libdatrie1-bin = "LGPL-2.1+ & GPL-2.0+"
LICENSE_libdatrie-dev = "LGPL-2.1+ & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdatrie/libdatrie-dev_0.2.12-3_arm64.deb;name=libdatrie-dev"
SRC_URI[libdatrie-dev.md5sum] = "dedf6d08058720c52d6f41f11443831b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libd/libdatrie/libdatrie1-bin_0.2.12-3_arm64.deb;name=libdatrie1-bin"
SRC_URI[libdatrie1-bin.md5sum] = "0e96487f6a8c365e1aa09fb6430e80f4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdatrie/libdatrie1_0.2.12-3_arm64.deb;name=libdatrie1"
SRC_URI[libdatrie1.md5sum] = "ab23afe35672c5296fda6a5f3c844c7d"

# other configs to feed compilation
PKG_${UPN} = "libdatrie1"

DEPENDS += "virtual/libc"
