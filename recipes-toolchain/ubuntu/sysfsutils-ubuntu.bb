inherit upkg_base

LICENSE = "GPL-2.0+ & LGPL-2.1+"
LICENSE_libsysfs2 = "GPL-2.0+ & LGPL-2.1+"

# the information of ubuntu package(s)

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/sysfsutils/libsysfs2_2.1.0+repack-6_arm64.deb;name=libsysfs2"
SRC_URI[libsysfs2.md5sum] = "4def2daae2d041764f15de0a12dc9920"

# other configs to feed compilation
PKG_${UPN} = "libsysfs2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "sysfsutils "
