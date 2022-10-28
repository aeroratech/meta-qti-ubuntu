inherit upkg_base

LICENSE = "MIT"
LICENSE_libxrender1 = "MIT"
LICENSE_libxrender-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxrender/libxrender-dev_0.9.10-1_arm64.deb;name=libxrender-dev"
SRC_URI[libxrender-dev.md5sum] = "2d09206560e001bcb9b455ea92504bb8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxrender/libxrender1_0.9.10-1_arm64.deb;name=libxrender1"
SRC_URI[libxrender1.md5sum] = "bc735af99800cf2014aa58b2ec4c1c44"

# other configs to feed compilation
PKG_${UPN} = "libxrender1"

DEPENDS += "libx11 xorgproto"
