inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libgeos-3.8.0 = "LGPL-2.1+"
LICENSE_libgeos-c1v5 = "LGPL-2.1+"
LICENSE_libgeos++-dev = "LGPL-2.1+"
LICENSE_libgeos-dev = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/geos/libgeos-dev_3.8.0-1build1_arm64.deb;name=libgeos-dev"
SRC_URI[libgeos-dev.md5sum] = "26b27bf7eaa754b3239246d166597d6c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/geos/libgeos++-dev_3.8.0-1build1_arm64.deb;name=libgeos++-dev"
SRC_URI[libgeos++-dev.md5sum] = "914d64f8f1f9a64a71185bcffa05edd1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/geos/libgeos-c1v5_3.8.0-1build1_arm64.deb;name=libgeos-c1v5"
SRC_URI[libgeos-c1v5.md5sum] = "514800a602d7222ec96135666396bbff"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/geos/libgeos-3.8.0_3.8.0-1build1_arm64.deb;name=libgeos-3.8.0"
SRC_URI[libgeos-3.8.0.md5sum] = "e3d8c7c652f51aa393d94b365812c135"

# other configs to feed compilation
PKG_${UPN} = "libgeos-3.8.0"

DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libgcc libtool-cross"
