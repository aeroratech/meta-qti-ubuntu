inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-3.0+ & MIT & GPL-2.0+"
LICENSE_liburcu6 = "LGPL-2.1+ & GPL-3.0+ & MIT & GPL-2.0+"
LICENSE_liburcu-dev = "LGPL-2.1+ & GPL-3.0+ & MIT & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libu/liburcu/liburcu-dev_0.11.1-2_arm64.deb;name=liburcu-dev"
SRC_URI[liburcu-dev.md5sum] = "7afc44a891fc77c315000c330f6352f0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libu/liburcu/liburcu6_0.11.1-2_arm64.deb;name=liburcu6"
SRC_URI[liburcu6.md5sum] = "c882f21da16ecf644541cadcc1e50b56"

# other configs to feed compilation
PKG_${UPN} = "liburcu6"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "liburcu "
