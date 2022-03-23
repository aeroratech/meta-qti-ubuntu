inherit upkg_base

LICENSE = "MIT & BSD-3-Clause"
LICENSE_libpsl5 = "MIT & BSD-3-Clause"
LICENSE_libpsl-dev = "MIT & BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpsl/libpsl-dev_0.21.0-1ubuntu1_arm64.deb;name=libpsl-dev"
SRC_URI[libpsl-dev.md5sum] = "46618901857bd69c654623c6c31fa1f6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpsl/libpsl5_0.21.0-1ubuntu1_arm64.deb;name=libpsl5"
SRC_URI[libpsl5.md5sum] = "4071d38db6a0cfe3465522cb95473e1c"

# other configs to feed compilation
PKG_${UPN} = "libpsl5"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc   libidn2 libunistring"
PROVIDES += "libpsl "
