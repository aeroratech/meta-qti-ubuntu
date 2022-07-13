inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libtheora0 = "BSD-3-clause"
LICENSE_libtheora-bin = "BSD-3-clause"
LICENSE_libtheora-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtheora/libtheora-dev_1.1.1+dfsg.1-15ubuntu2_arm64.deb;name=libtheora-dev"
SRC_URI[libtheora-dev.md5sum] = "2532cf49b9f912b20b87bad228b031b6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libt/libtheora/libtheora-bin_1.1.1+dfsg.1-15ubuntu2_arm64.deb;name=libtheora-bin"
SRC_URI[libtheora-bin.md5sum] = "47ce051b12d225aac5923a8cf47fcf19"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtheora/libtheora0_1.1.1+dfsg.1-15ubuntu2_arm64.deb;name=libtheora0"
SRC_URI[libtheora0.md5sum] = "dc1243674d0610c1744b8ee2c908c3ce"

# other configs to feed compilation
PKG_${UPN} = "libtheora0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libogg"
PROVIDES += "libtheora "