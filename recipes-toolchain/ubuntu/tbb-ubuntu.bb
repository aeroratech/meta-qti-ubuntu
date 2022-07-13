inherit upkg_base

LICENSE = "Apache-2.0"
LICENSE_libtbb2 = "Apache-2.0"
LICENSE_libtbb-dev = "Apache-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/t/tbb/libtbb-dev_2020.1-2_arm64.deb;name=libtbb-dev"
SRC_URI[libtbb-dev.md5sum] = "a0711f2acf4dfd7b34c8a1171bbb2319"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/t/tbb/libtbb2_2020.1-2_arm64.deb;name=libtbb2"
SRC_URI[libtbb2.md5sum] = "93d611bf9d86c9338277316a25ec02f3"

# other configs to feed compilation
PKG_${UPN} = "libtbb2"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "tbb "
