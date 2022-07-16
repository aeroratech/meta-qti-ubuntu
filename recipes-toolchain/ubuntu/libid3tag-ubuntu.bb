inherit upkg_base

LICENSE = "GPL-2.0+"
LICENSE_libid3tag0 = "GPL-2.0+"
LICENSE_libid3tag0-dev = "GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libi/libid3tag/libid3tag0-dev_0.15.1b-14_arm64.deb;name=libid3tag0-dev"
SRC_URI[libid3tag0-dev.md5sum] = "db8ecca114d94afda6b3560302e9d350"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libi/libid3tag/libid3tag0_0.15.1b-14_arm64.deb;name=libid3tag0"
SRC_URI[libid3tag0.md5sum] = "4401df386eafa31cda97c57e6dbf615f"

# other configs to feed compilation
PKG_${UPN} = "libid3tag0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc zlib"
PROVIDES += "libid3tag "
