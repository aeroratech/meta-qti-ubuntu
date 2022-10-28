inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxfixes-dev = "MIT-Style"
LICENSE_libxfixes3 = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxfixes/libxfixes3_5.0.3-2_arm64.deb;name=libxfixes3"
SRC_URI[libxfixes3.md5sum] = "3ce2c8c27a7a38572e334bdbee00cb19"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxfixes/libxfixes-dev_5.0.3-2_arm64.deb;name=libxfixes-dev"
SRC_URI[libxfixes-dev.md5sum] = "f7d9e771b26c3893e1f5196c0606cefe"

# other configs to feed compilation
PKG_${UPN} = "libxfixes-dev"

DEPENDS += "libx11 xorgproto"
