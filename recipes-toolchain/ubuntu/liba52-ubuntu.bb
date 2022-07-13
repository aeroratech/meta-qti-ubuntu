inherit upkg_base

LICENSE = "GPL-2.0+"
LICENSE_liba52-0.7.4 = "GPL-2.0+"
LICENSE_liba52-0.7.4-dev = "GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/a52dec/liba52-0.7.4-dev_0.7.4-20_arm64.deb;name=liba52-0.7.4-dev"
SRC_URI[liba52-0.7.4-dev.md5sum] = "f4f41c154e600ee486529e70edfd3872"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/a52dec/liba52-0.7.4_0.7.4-20_arm64.deb;name=liba52-0.7.4"
SRC_URI[liba52-0.7.4.md5sum] = "81df7b3d55df5472d00ee80940725d5f"

# other configs to feed compilation
PKG_${UPN} = "liba52-0.7.4"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "liba52 "
