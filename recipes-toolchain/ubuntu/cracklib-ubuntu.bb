inherit upkg_base

LICENSE = "LGPL-2.1"
LICENSE_libcrack2 = "LGPL-2.1"
LICENSE_libcrack2-dev = "LGPL-2.1"
LICENSE_python3-cracklib = "LGPL-2.1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/c/cracklib2/python3-cracklib_2.9.6-3.2_arm64.deb;name=python3-cracklib"
SRC_URI[python3-cracklib.md5sum] = "4eb2cec4b77d57ecdad3bf70d4579572"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cracklib2/libcrack2-dev_2.9.6-3.2_arm64.deb;name=libcrack2-dev"
SRC_URI[libcrack2-dev.md5sum] = "2507661e09df90715a2edc86e2fe27c7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cracklib2/libcrack2_2.9.6-3.2_arm64.deb;name=libcrack2"
SRC_URI[libcrack2.md5sum] = "d9927fd4a97b2165986861b97502775c"

# other configs to feed compilation
PKG_${UPN} = "libcrack2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc zlib"
PROVIDES += "cracklib "
