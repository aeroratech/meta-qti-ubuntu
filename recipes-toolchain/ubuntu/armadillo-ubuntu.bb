inherit upkg_base

LICENSE = "Apache-2.0"
LICENSE_libarmadillo9 = "Apache-2.0"
LICENSE_libarmadillo-dev = "Apache-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/armadillo/libarmadillo-dev_9.800.4+dfsg-1build1_arm64.deb;name=libarmadillo-dev"
SRC_URI[libarmadillo-dev.md5sum] = "24eae080195b00793553d45fb244b3e4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/armadillo/libarmadillo9_9.800.4+dfsg-1build1_arm64.deb;name=libarmadillo9"
SRC_URI[libarmadillo9.md5sum] = "3cb7fb627bfe595ec8cb37a1225e4ab9"

# other configs to feed compilation
PKG_${UPN} = "libarmadillo9"

DEPENDS += "lapack arpack superlu"
