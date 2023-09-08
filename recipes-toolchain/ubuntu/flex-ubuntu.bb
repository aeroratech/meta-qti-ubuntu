inherit upkg_base

LICENSE = "BSD Like"
LICENSE_libfl-dev = "BSD Like"
LICENSE_libfl2 = "BSD Like"
LICENSE_flex = "BSD Like"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/flex/flex_2.6.4-6.2_arm64.deb;name=flex"
SRC_URI[flex.md5sum] = "7d0c3d7c3a61f00da709162369905067"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/flex/libfl2_2.6.4-6.2_arm64.deb;name=libfl2"
SRC_URI[libfl2.md5sum] = "e175d5bfbc63a6418edf892e3fe19369"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/flex/libfl-dev_2.6.4-6.2_arm64.deb;name=libfl-dev"
SRC_URI[libfl-dev.md5sum] = "7372a7624ac1041e41d3f409ec01ad50"

# other configs to feed compilation
PKG_${UPN} = "libfl-dev"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "flex "
