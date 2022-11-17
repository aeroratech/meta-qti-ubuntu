inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxi-dev = "MIT-Style"
LICENSE_libxi6 = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxi/libxi6_1.7.10-0ubuntu1_arm64.deb;name=libxi6"
SRC_URI[libxi6.md5sum] = "b3ee9b268731a8794c1d40bc7a026a89"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxi/libxi-dev_1.7.10-0ubuntu1_arm64.deb;name=libxi-dev"
SRC_URI[libxi-dev.md5sum] = "2009c9e83e1585a081a14e8ba02953e2"

# other configs to feed compilation
PKG_${UPN} = "libxi6"

DEPENDS += "libx11 libxfixes libxext xorgproto"
