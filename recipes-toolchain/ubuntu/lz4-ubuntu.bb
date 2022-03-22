inherit upkg_base

LICENSE = "BSD-2-clause & GPL-2.0+"
LICENSE_liblz4-1 = "BSD-2-clause & GPL-2.0+"
LICENSE_liblz4-dev = "BSD-2-clause & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lz4/liblz4-dev_1.9.2-2_arm64.deb;name=liblz4-dev"
SRC_URI[liblz4-dev.md5sum] = "852272923e25d005cd60d388d8a9eee8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lz4/liblz4-1_1.9.2-2_arm64.deb;name=liblz4-1"
SRC_URI[liblz4-1.md5sum] = "576cfe6b63d00b11b5db2f9555923ed7"

# other configs to feed compilation
PKG_${UPN} = "liblz4-1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "lz4 "
