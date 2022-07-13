inherit upkg_base

LICENSE = "libpng"
LICENSE_libpng-dev = "libpng"
LICENSE_libpng16-16 = "libpng"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpng1.6/libpng16-16_1.6.37-2_arm64.deb;name=libpng16-16"
SRC_URI[libpng16-16.md5sum] = "b3e8d85f27cec8f023a7e291b31d5fab"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpng1.6/libpng-dev_1.6.37-2_arm64.deb;name=libpng-dev"
SRC_URI[libpng-dev.md5sum] = "05d3dc4ceeee1a4893a5afb268cff79e"

# other configs to feed compilation
PKG_${UPN} = "libpng16-16"

DEPENDS += "zlib"
