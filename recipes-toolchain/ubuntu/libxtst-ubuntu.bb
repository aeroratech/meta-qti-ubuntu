inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxtst6 = "MIT-Style"
LICENSE_libxtst-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxtst/libxtst-dev_1.2.3-1_arm64.deb;name=libxtst-dev"
SRC_URI[libxtst-dev.md5sum] = "31329682de2ad745011b441287e1639b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxtst/libxtst6_1.2.3-1_arm64.deb;name=libxtst6"
SRC_URI[libxtst6.md5sum] = "a4ae34aa761976d1c275ff11b34bf607"

# other configs to feed compilation
PKG_${UPN} = "libxtst6"

DEPENDS += "libx11 libxext libxi xorgproto"
