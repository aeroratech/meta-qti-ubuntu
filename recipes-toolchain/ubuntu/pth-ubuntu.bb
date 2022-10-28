inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libpth20 = "LGPL-2.1+"
LICENSE_libpth-dev = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/pth/libpth-dev_2.0.7-22_arm64.deb;name=libpth-dev"
SRC_URI[libpth-dev.md5sum] = "bf35e718a312c12bdde605d38ca97118"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/pth/libpth20_2.0.7-22_arm64.deb;name=libpth20"
SRC_URI[libpth20.md5sum] = "ea6daa9647da7c0fe6b3ccb2ec084b4d"

# other configs to feed compilation
PKG_${UPN} = "libpth20"
