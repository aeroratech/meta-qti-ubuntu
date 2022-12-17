inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxcursor-dev = "MIT-Style"
LICENSE_libxcursor1 = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcursor/libxcursor1_1.2.0-2_arm64.deb;name=libxcursor1"
SRC_URI[libxcursor1.md5sum] = "1f2f1833507208e41856bcce3de7d51d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcursor/libxcursor-dev_1.2.0-2_arm64.deb;name=libxcursor-dev"
SRC_URI[libxcursor-dev.md5sum] = "31cde09ac079c091dacc2972458cca39"

# other configs to feed compilation
PKG_${UPN} = "libxcursor1"

DEPENDS += "libx11 libxfixes libxrender xorgproto"
