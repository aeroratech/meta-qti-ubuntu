inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-3.0+"
LICENSE_libgpg-error0 = "LGPL-2.1+ & GPL-3.0+"
LICENSE_libgpg-error-dev = "LGPL-2.1+ & GPL-3.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libg/libgpg-error/libgpg-error-dev_1.37-1_arm64.deb;name=libgpg-error-dev"
SRC_URI[libgpg-error-dev.md5sum] = "91793d0150ad80c1d9c7dd431a1d847e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libg/libgpg-error/libgpg-error0_1.37-1_arm64.deb;name=libgpg-error0"
SRC_URI[libgpg-error0.md5sum] = "5bcfb76578115c3ca120ae4286533900"

# other configs to feed compilation
PKG_${UPN} = "libgpg-error0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libgpg-error "
