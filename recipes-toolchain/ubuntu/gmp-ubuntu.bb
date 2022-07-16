inherit upkg_base

LICENSE = "LGPL-3.0+ & GPL-2.0+"
LICENSE_libgmp10 = "LGPL-3.0+ & GPL-2.0+"
LICENSE_libgmp-dev = "LGPL-3.0+ & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gmp/libgmp-dev_6.2.0+dfsg-4_arm64.deb;name=libgmp-dev"
SRC_URI[libgmp-dev.md5sum] = "0cb75605d1a0475124f2becfd92e59ba"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gmp/libgmp10_6.2.0+dfsg-4_arm64.deb;name=libgmp10"
SRC_URI[libgmp10.md5sum] = "58f7fae1af1a46074d0f429bbfec57ab"

# other configs to feed compilation
PKG_${UPN} = "libgmp10"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "gmp "
