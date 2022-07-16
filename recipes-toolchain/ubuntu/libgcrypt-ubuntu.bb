inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-2.0+"
LICENSE_libgcrypt20 = "LGPL-2.1+ & GPL-2.0+"
LICENSE_libgcrypt20-dev = "LGPL-2.1+ & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libg/libgcrypt20/libgcrypt20-dev_1.8.5-5ubuntu1_arm64.deb;name=libgcrypt20-dev"
SRC_URI[libgcrypt20-dev.md5sum] = "210044bb48a6629b772c1ba4a71c8b4a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libg/libgcrypt20/libgcrypt20_1.8.5-5ubuntu1_arm64.deb;name=libgcrypt20"
SRC_URI[libgcrypt20.md5sum] = "61217026493caca5224939cc99e8b17a"

# other configs to feed compilation
PKG_${UPN} = "libgcrypt20"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libgpg-error libcap"
PROVIDES += "libgcrypt libgcrypt20"
RPROVIDES_${UPN} += "libgcrypt20"
