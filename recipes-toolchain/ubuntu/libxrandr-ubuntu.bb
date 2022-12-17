inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxrandr2 = "MIT-Style"
LICENSE_libxrandr-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxrandr/libxrandr-dev_1.5.2-0ubuntu1_arm64.deb;name=libxrandr-dev"
SRC_URI[libxrandr-dev.md5sum] = "bde6c0784f08dfc93463868e1607d92d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxrandr/libxrandr2_1.5.2-0ubuntu1_arm64.deb;name=libxrandr2"
SRC_URI[libxrandr2.md5sum] = "1854cb48de76e2f3d82c7e0a5c9c012b"

# other configs to feed compilation
PKG_${UPN} = "libxrandr2"

DEPENDS += "libx11 libxext libxrender xorgproto"
