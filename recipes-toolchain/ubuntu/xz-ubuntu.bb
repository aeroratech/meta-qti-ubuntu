inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & PD"
LICENSE_liblzma5 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & PD"
LICENSE_liblzma-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & PD"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xz-utils/liblzma-dev_5.2.4-1_arm64.deb;name=liblzma-dev"
SRC_URI[liblzma-dev.md5sum] = "ff5f84f3c09ea6dc1c717aaf51f8bb43"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xz-utils/liblzma5_5.2.4-1_arm64.deb;name=liblzma5"
SRC_URI[liblzma5.md5sum] = "e92de24a196bfa4657b40f5f72156c96"

# other configs to feed compilation
PKG_${UPN} = "liblzma5"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "xz "
