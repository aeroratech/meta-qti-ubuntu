inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libexif12 = "LGPL-2.1+"
LICENSE_libexif-dev = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libe/libexif/libexif-dev_0.6.21-6_arm64.deb;name=libexif-dev"
SRC_URI[libexif-dev.md5sum] = "f31cb9df23fb6b68c3219d4e2b693908"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libe/libexif/libexif12_0.6.21-6_arm64.deb;name=libexif12"
SRC_URI[libexif12.md5sum] = "45b640cc8f09677a6d44a860f0448e3d"

# other configs to feed compilation
PKG_${UPN} = "libexif12"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libexif "
