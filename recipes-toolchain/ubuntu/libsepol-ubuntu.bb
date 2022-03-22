inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-2.0"
LICENSE_libsepol1 = "LGPL-2.1+ & GPL-2.0"
LICENSE_libsepol1-dev = "LGPL-2.1+ & GPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsepol/libsepol1-dev_3.0-1_arm64.deb;name=libsepol1-dev"
SRC_URI[libsepol1-dev.md5sum] = "d81cc3b116cbbc63c6096eb55ac44685"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsepol/libsepol1_3.0-1_arm64.deb;name=libsepol1"
SRC_URI[libsepol1.md5sum] = "675f872f99c4e534cfd2f33a1c155cfb"

# other configs to feed compilation
PKG_${UPN} = "libsepol1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libsepol "
