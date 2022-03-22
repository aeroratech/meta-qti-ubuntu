inherit upkg_base

LICENSE = "GPL-2.0 & LGPL-2.1+ & BSD-3-clause & BSD-2-clause & BSD-4-clause"
LICENSE_libtirpc3 = "GPL-2.0 & LGPL-2.1+ & BSD-3-clause & BSD-2-clause & BSD-4-clause"
LICENSE_libtirpc-dev = "GPL-2.0 & LGPL-2.1+ & BSD-3-clause & BSD-2-clause & BSD-4-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtirpc/libtirpc-dev_1.2.5-1_arm64.deb;name=libtirpc-dev"
SRC_URI[libtirpc-dev.md5sum] = "bf81ca59f04e45aa5e3712dc442ce4e7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtirpc/libtirpc3_1.2.5-1_arm64.deb;name=libtirpc3"
SRC_URI[libtirpc3.md5sum] = "36462bf3191f8adb3943f2d1b79f05bd"

# other configs to feed compilation
PKG_${UPN} = "libtirpc3"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libtirpc virtual/librpc"
