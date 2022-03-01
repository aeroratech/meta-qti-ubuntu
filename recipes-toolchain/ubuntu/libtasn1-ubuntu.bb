inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-3.0+ & GFDL-1.3+"
LICENSE_libtasn1-6 = "LGPL-2.1+ & GPL-3.0+ & GFDL-1.3+"
LICENSE_libtasn1-6-dev = "LGPL-2.1+ & GPL-3.0+ & GFDL-1.3+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtasn1-6/libtasn1-6-dev_4.16.0-2_arm64.deb;name=libtasn1-6-dev"
SRC_URI[libtasn1-6-dev.md5sum] = "2aa4ed81d517fa9f44508fb1fca1a1cb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtasn1-6/libtasn1-6_4.16.0-2_arm64.deb;name=libtasn1-6"
SRC_URI[libtasn1-6.md5sum] = "51c13005f6e7d32cc6b935fc1b8a327b"

# other configs to feed compilation
PKG_${UPN} = "libtasn1-6"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libtasn1 "
