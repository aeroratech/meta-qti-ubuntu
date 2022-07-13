inherit upkg_base

LICENSE = "MIT"
LICENSE_libjson-c4 = "MIT"
LICENSE_libjson-c-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/j/json-c/libjson-c-dev_0.13.1+dfsg-7_arm64.deb;name=libjson-c-dev"
SRC_URI[libjson-c-dev.md5sum] = "d7194e64a69d5cc16c7bc8f46c12cc68"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/j/json-c/libjson-c4_0.13.1+dfsg-7_arm64.deb;name=libjson-c4"
SRC_URI[libjson-c4.md5sum] = "f76eb32dc35d1bfd639b8eea866dbd4e"

# other configs to feed compilation
PKG_${UPN} = "libjson-c4"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "json-c "
