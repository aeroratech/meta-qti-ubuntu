inherit upkg_base

LICENSE = "Expat"
LICENSE_libepoxy0 = "Expat"
LICENSE_libepoxy-dev = "Expat"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libe/libepoxy/libepoxy-dev_1.5.4-1_arm64.deb;name=libepoxy-dev"
SRC_URI[libepoxy-dev.md5sum] = "7248b3d81e003de498e6c772115912d3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libe/libepoxy/libepoxy0_1.5.4-1_arm64.deb;name=libepoxy0"
SRC_URI[libepoxy0.md5sum] = "bc317203cfed915d1c204a9a731db5f8"

# other configs to feed compilation
PKG_${UPN} = "libepoxy0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc    virtual/egl"
PROVIDES += "libepoxy "
