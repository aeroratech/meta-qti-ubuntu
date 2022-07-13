inherit upkg_base

LICENSE = "GPL-2.0+ & LGPL-2.0+"
LICENSE_libsbc1 = "GPL-2.0+ & LGPL-2.0+"
LICENSE_libsbc-dev = "GPL-2.0+ & LGPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/sbc/libsbc-dev_1.4-1_arm64.deb;name=libsbc-dev"
SRC_URI[libsbc-dev.md5sum] = "db18e08f0d60234761e93df24e35263a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/sbc/libsbc1_1.4-1_arm64.deb;name=libsbc1"
SRC_URI[libsbc1.md5sum] = "949bc6771eea8a98adf662babee774b1"

# other configs to feed compilation
PKG_${UPN} = "libsbc1"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libsndfile1"
PROVIDES += "sbc "
