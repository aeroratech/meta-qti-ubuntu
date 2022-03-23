inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libwebp6 = "BSD-3-clause"
LICENSE_libwebp-dev = "BSD-3-clause"
LICENSE_libwebpmux3 = "BSD-3-clause"
LICENSE_libwebpdemux2 = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libw/libwebp/libwebpdemux2_0.6.1-2_arm64.deb;name=libwebpdemux2"
SRC_URI[libwebpdemux2.md5sum] = "5b894ccbadd9a2126934c4014c0824e4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libw/libwebp/libwebpmux3_0.6.1-2_arm64.deb;name=libwebpmux3"
SRC_URI[libwebpmux3.md5sum] = "a1bd0c77d57928c8caa38da5297c6ebf"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libw/libwebp/libwebp-dev_0.6.1-2_arm64.deb;name=libwebp-dev"
SRC_URI[libwebp-dev.md5sum] = "66d14e5175b9488273b078dd9903da96"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libw/libwebp/libwebp6_0.6.1-2_arm64.deb;name=libwebp6"
SRC_URI[libwebp6.md5sum] = "f62098e26756d5f21319da94ce0843f0"

# other configs to feed compilation
PKG_${UPN} = "libwebp6"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libwebp "
