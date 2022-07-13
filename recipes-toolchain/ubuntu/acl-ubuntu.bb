inherit upkg_base

LICENSE = "GPL-2.0+ & LGPL-2.1+"
LICENSE_libacl1-dev = "GPL-2.0+ & LGPL-2.1+"

# the information of ubuntu package(s)
#SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/acl/libacl1_2.2.53-6_arm64.deb;name=libacl1"
#SRC_URI[libacl1.md5sum] = "2746d505ac8d56e71dbd311c6b4b2e36"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/acl/libacl1-dev_2.2.53-6_arm64.deb;name=libacl1-dev"
SRC_URI[libacl1-dev.md5sum] = "b19d520d78eee168092795fd64fbfc4d"

# other configs to feed compilation
PKG_${UPN} = "libacl1-dev"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc attr"
PROVIDES += "acl "
