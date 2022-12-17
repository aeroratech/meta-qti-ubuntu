inherit upkg_base

LICENSE = "MIT Variant"
LICENSE_libogdi4.1 = "MIT Variant"
LICENSE_libogdi-dev = "MIT Variant"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/ogdi-dfsg/libogdi-dev_4.1.0+ds-1build1_arm64.deb;name=libogdi-dev"
SRC_URI[libogdi-dev.md5sum] = "5c35494795929f4677959fdd6df9e742"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/ogdi-dfsg/libogdi4.1_4.1.0+ds-1build1_arm64.deb;name=libogdi4.1"
SRC_URI[libogdi4.1.md5sum] = "55605e719ae6ebd4af6d04b3fc66a491"

# other configs to feed compilation
PKG_${UPN} = "libogdi4.1"
