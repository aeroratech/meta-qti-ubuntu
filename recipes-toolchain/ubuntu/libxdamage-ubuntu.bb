inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxdamage-dev = "MIT-Style"
LICENSE_libxdamage1 = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxdamage/libxdamage1_1.1.5-2_arm64.deb;name=libxdamage1"
SRC_URI[libxdamage1.md5sum] = "c9ed394b463f348cff10cd1a5713b338"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxdamage/libxdamage-dev_1.1.5-2_arm64.deb;name=libxdamage-dev"
SRC_URI[libxdamage-dev.md5sum] = "8bafa7466e36a279a6e2993dd1ccb7c4"

# other configs to feed compilation
PKG_${UPN} = "libxdamage-dev"

DEPENDS += "libx11 libxfixes xorgproto"
