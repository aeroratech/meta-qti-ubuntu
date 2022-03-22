inherit upkg_base

LICENSE = "MIT & ISC"
LICENSE_libpciaccess0 = "MIT & ISC"
LICENSE_libpciaccess-dev = "MIT & ISC"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpciaccess/libpciaccess-dev_0.16-0ubuntu1_arm64.deb;name=libpciaccess-dev"
SRC_URI[libpciaccess-dev.md5sum] = "399f5583f9dea97e96511402e5f99f96"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpciaccess/libpciaccess0_0.16-0ubuntu1_arm64.deb;name=libpciaccess0"
SRC_URI[libpciaccess0.md5sum] = "04829f610086417a8f80c664d36254db"

# other configs to feed compilation
PKG_${UPN} = "libpciaccess0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-oe-linux-compilerlibs virtual/libc util-macros"
PROVIDES += "libpciaccess "