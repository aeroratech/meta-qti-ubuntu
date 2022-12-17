inherit upkg_base

LICENSE = "MIT-Style & LGPL-2"
LICENSE_libcfitsio-dev = "MIT-Style & LGPL-2"
LICENSE_libcfitsio8 = "MIT-Style & LGPL-2"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/c/cfitsio/libcfitsio8_3.470-3_arm64.deb;name=libcfitsio8"
SRC_URI[libcfitsio8.md5sum] = "789e2114f158fc63bca40a5ca286319c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/c/cfitsio/libcfitsio-dev_3.470-3_arm64.deb;name=libcfitsio-dev"
SRC_URI[libcfitsio-dev.md5sum] = "7c40fc61d6ff264a5b9dea694d12e7b4"

# other configs to feed compilation
PKG_${UPN} = "libcfitsio8"

DEPENDS += "zlib bzip2 curl"
