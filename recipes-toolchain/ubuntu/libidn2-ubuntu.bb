inherit upkg_base

LICENSE = "GPL-3+ & LGPL-3.0+ | GPL-2.0+ & Unicode"
LICENSE_libidn2-0 = "GPL-3+ & LGPL-3.0+ | GPL-2.0+ & Unicode"
LICENSE_libidn2-dev = "GPL-3+ & LGPL-3.0+ | GPL-2.0+ & Unicode"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libi/libidn2/libidn2-dev_2.2.0-2_arm64.deb;name=libidn2-dev"
SRC_URI[libidn2-dev.md5sum] = "f2879890217b209065f1efeca3985df5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libi/libidn2/libidn2-0_2.2.0-2_arm64.deb;name=libidn2-0"
SRC_URI[libidn2-0.md5sum] = "e90f3f389370955d9d380b140b271092"

# other configs to feed compilation
PKG_${UPN} = "libidn2-0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc virtual/libiconv libunistring "
PROVIDES += "libidn2 "
