inherit upkg_base

LICENSE = "MIT"
LICENSE_libmtdev-dev = "MIT"
LICENSE_libmtdev1 = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/m/mtdev/libmtdev1_1.1.5-1.1_arm64.deb;name=libmtdev1"
SRC_URI[libmtdev1.md5sum] = "20e25721223a2fe03203a83bc881853e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/m/mtdev/libmtdev-dev_1.1.5-1.1_arm64.deb;name=libmtdev-dev"
SRC_URI[libmtdev-dev.md5sum] = "c595b8d042359e3c3cd737c31f2e031a"

# other configs to feed compilation
PKG_${UPN} = "libmtdev1"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "mtdev "
