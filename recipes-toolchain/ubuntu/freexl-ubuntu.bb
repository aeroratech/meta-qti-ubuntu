inherit upkg_base

LICENSE = "MPL-1.1 or GPL-2+ or LGPL-2.1+"
LICENSE_libfreexl1 = "MPL-1.1 or GPL-2+ or LGPL-2.1+"
LICENSE_libfreexl-dev = "MPL-1.1 or GPL-2+ or LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/freexl/libfreexl-dev_1.0.5-3_arm64.deb;name=libfreexl-dev"
SRC_URI[libfreexl-dev.md5sum] = "f07c87272f70fa43f9ae5ca04f6b08ac"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/freexl/libfreexl1_1.0.5-3_arm64.deb;name=libfreexl1"
SRC_URI[libfreexl1.md5sum] = "bfee0d3f6808b95b1b30d2cb45262f28"

# other configs to feed compilation
PKG_${UPN} = "libfreexl1"

DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
