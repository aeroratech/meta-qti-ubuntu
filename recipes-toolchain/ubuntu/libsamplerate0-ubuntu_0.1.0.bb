inherit upkg_base

LICENSE = "BSD-2-clause & GPL-2.0"
LICENSE_libsamplerate0-dev = "BSD-2-clause & GPL-2.0"
LICENSE_libsamplerate0 = "BSD-2-clause & GPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsamplerate/libsamplerate0_0.1.9-2_arm64.deb;name=libsamplerate0"
SRC_URI[libsamplerate0.md5sum] = "9acaacc4460560d52b2480617fbb662e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsamplerate/libsamplerate0-dev_0.1.9-2_arm64.deb;name=libsamplerate0-dev"
SRC_URI[libsamplerate0-dev.md5sum] = "d4cfb1756cdc365271ddea21be2448b8"

# other configs to feed compilation
PKG_${UPN} = "libsamplerate0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libsndfile1"
PROVIDES += "libsamplerate0 "
