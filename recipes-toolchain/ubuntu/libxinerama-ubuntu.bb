inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxinerama1 = "MIT-Style"
LICENSE_libxinerama-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxinerama/libxinerama-dev_1.1.4-2_arm64.deb;name=libxinerama-dev"
SRC_URI[libxinerama-dev.md5sum] = "1e1bc4c427f004790389186ab1238b9c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxinerama/libxinerama1_1.1.4-2_arm64.deb;name=libxinerama1"
SRC_URI[libxinerama1.md5sum] = "273067ca95988989635d3fbb1d4f0e96"

# other configs to feed compilation
PKG_${UPN} = "libxinerama1"

DEPENDS += "libx11 libxext  xorgproto"
