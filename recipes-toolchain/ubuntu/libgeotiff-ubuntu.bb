inherit upkg_base

LICENSE = "MIT"
LICENSE_libgeotiff5 = "MIT"
LICENSE_libgeotiff-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libg/libgeotiff/libgeotiff-dev_1.5.1-2_arm64.deb;name=libgeotiff-dev"
SRC_URI[libgeotiff-dev.md5sum] = "cb5476553b24fd73afd0e13248e972c3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libg/libgeotiff/libgeotiff5_1.5.1-2_arm64.deb;name=libgeotiff5"
SRC_URI[libgeotiff5.md5sum] = "433adc38eefa81558f6990a8f08f1afa"

# other configs to feed compilation
PKG_${UPN} = "libgeotiff5"

DEPENDS += "proj tiff zlib libjpeg8-empty"
