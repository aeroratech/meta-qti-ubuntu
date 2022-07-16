inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxdmcp6 = "MIT-Style"
LICENSE_libxdmcp-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxdmcp/libxdmcp-dev_1.1.3-0ubuntu1_arm64.deb;name=libxdmcp-dev"
SRC_URI[libxdmcp-dev.md5sum] = "c9d9176c053f7bd343e18bd128cf2e1a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxdmcp/libxdmcp6_1.1.3-0ubuntu1_arm64.deb;name=libxdmcp6"
SRC_URI[libxdmcp6.md5sum] = "1a87759bc2d4199db6514afbe46057ba"

# other configs to feed compilation
PKG_${UPN} = "libxdmcp6"

DEPENDS += "xorgproto libbsd"
