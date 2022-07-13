inherit upkg_base

LICENSE = "X11 & MIT & GPL-2.0+ & Apache-2.0 & BSD-3-Clause"
LICENSE_libevdev2 = "X11 & MIT & GPL-2.0+ & Apache-2.0 & BSD-3-Clause"
LICENSE_libevdev-dev = "X11 & MIT & GPL-2.0+ & Apache-2.0 & BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libe/libevdev/libevdev-dev_1.9.0+dfsg-1_arm64.deb;name=libevdev-dev"
SRC_URI[libevdev-dev.md5sum] = "1db02ed1b82d6008170ba0e1de13cd1b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libe/libevdev/libevdev2_1.9.0+dfsg-1_arm64.deb;name=libevdev2"
SRC_URI[libevdev2.md5sum] = "3405d5ab302ef8ea58ca7b1ed50a4098"

# other configs to feed compilation
PKG_${UPN} = "libevdev2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libevdev libevdev-dev"
#RDEPENDS += "libevdev "
