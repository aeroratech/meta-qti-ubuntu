inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_liburiparser1 = "BSD-3-clause"
LICENSE_liburiparser-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/u/uriparser/liburiparser-dev_0.9.3-2_arm64.deb;name=liburiparser-dev"
SRC_URI[liburiparser-dev.md5sum] = "58f5c2173cc6050ec200c6afd195a46b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/u/uriparser/liburiparser1_0.9.3-2_arm64.deb;name=liburiparser1"
SRC_URI[liburiparser1.md5sum] = "dbe4024e827fa75f751105dcd73b5a90"

# other configs to feed compilation
PKG_${UPN} = "liburiparser1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "uriparser "
