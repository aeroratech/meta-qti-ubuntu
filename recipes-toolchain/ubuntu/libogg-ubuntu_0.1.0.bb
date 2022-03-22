inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libogg0 = "BSD-3-Clause"
LICENSE_libogg-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libo/libogg/libogg-dev_1.3.4-0ubuntu1_arm64.deb;name=libogg-dev"
SRC_URI[libogg-dev.md5sum] = "ddcab26bc4a6e4fc89b60c416caf9683"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libo/libogg/libogg0_1.3.4-0ubuntu1_arm64.deb;name=libogg0"
SRC_URI[libogg0.md5sum] = "ac559450229ee7b2fde042b63a2b8dc7"

# other configs to feed compilation
PKG_${UPN} = "libogg0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libogg "
