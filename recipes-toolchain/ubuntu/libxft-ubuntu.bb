inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxft2 = "MIT-Style"
LICENSE_libxft-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xft/libxft-dev_2.3.3-0ubuntu1_arm64.deb;name=libxft-dev"
SRC_URI[libxft-dev.md5sum] = "15185819505e857a0a324375f99fdf4b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xft/libxft2_2.3.3-0ubuntu1_arm64.deb;name=libxft2"
SRC_URI[libxft2.md5sum] = "331db14912db76c4d2547cd411662aca"

# other configs to feed compilation
PKG_${UPN} = "libxft2"

PROVIDES += "xft"
DEPENDS += "fontconfig freetype libx11 zlib libxrender"
