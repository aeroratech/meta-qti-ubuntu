inherit upkg_base

LICENSE = "MIT Variant"
LICENSE_libsocket++1 = "MIT Variant"
LICENSE_libsocket++-dev = "MIT Variant"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/socket++/libsocket++-dev_1.12.13-10build1_arm64.deb;name=libsocket++-dev"
SRC_URI[libsocket++-dev.md5sum] = "41e211d77a84fd4895ddc119423a9766"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/socket++/libsocket++1_1.12.13-10build1_arm64.deb;name=libsocket++1"
SRC_URI[libsocket++1.md5sum] = "93bc72b153cc7845bffe69b741db077f"

# other configs to feed compilation
PKG_${UPN} = "libsocket++1"
