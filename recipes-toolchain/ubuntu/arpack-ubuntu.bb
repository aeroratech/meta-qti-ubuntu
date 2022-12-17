inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libarpack2 = "BSD-3-clause"
LICENSE_libarpack2-dev = "BSD-3-clause"
LICENSE_libparpack2 = "BSD-3-clause"
LICENSE_libparpack2-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/arpack/libparpack2-dev_3.7.0-3_arm64.deb;name=libparpack2-dev"
SRC_URI[libparpack2-dev.md5sum] = "92df709fc23e92205252e18217227a44"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/arpack/libparpack2_3.7.0-3_arm64.deb;name=libparpack2"
SRC_URI[libparpack2.md5sum] = "ded63adccdd58720ec9e053f0f08b1c6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/arpack/libarpack2-dev_3.7.0-3_arm64.deb;name=libarpack2-dev"
SRC_URI[libarpack2-dev.md5sum] = "4c3dbe988d673408c9a96a9b08e3d7c3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/arpack/libarpack2_3.7.0-3_arm64.deb;name=libarpack2"
SRC_URI[libarpack2.md5sum] = "a2c6c2df59d1da56623034b7a82e28ec"

# other configs to feed compilation
PKG_${UPN} = "libarpack2"

DEPENDS += "lapack gcc-runtime"
