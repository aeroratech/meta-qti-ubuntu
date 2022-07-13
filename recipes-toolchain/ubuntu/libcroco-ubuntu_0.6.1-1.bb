inherit upkg_base

LICENSE = "LGPL-2.0+"
LICENSE_libcroco3 = "LGPL-2.0+"
LICENSE_libcroco3-dev = "LGPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libc/libcroco/libcroco3-dev_0.6.13-1_arm64.deb;name=libcroco3-dev"
SRC_URI[libcroco3-dev.md5sum] = "494f2d09a4f136de4a18a6fb3c86e7e3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libc/libcroco/libcroco3_0.6.13-1_arm64.deb;name=libcroco3"
SRC_URI[libcroco3.md5sum] = "7db73a023f7760ddfc7a35a8be15a43e"

# other configs to feed compilation
PKG_${UPN} = "libcroco3"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc glib-2.0 libxml2 zlib "
PROVIDES += "libcroco "
