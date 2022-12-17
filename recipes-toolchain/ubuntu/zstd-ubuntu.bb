inherit upkg_base

LICENSE = "BSD-3-clause and GPL-2"
LICENSE_libzstd1 = "BSD-3-clause and GPL-2"
LICENSE_zstd = "BSD-3-clause and GPL-2"
LICENSE_libzstd-dev = "BSD-3-clause and GPL-2"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libz/libzstd/libzstd-dev_1.4.4+dfsg-3_arm64.deb;name=libzstd-dev"
SRC_URI[libzstd-dev.md5sum] = "d4d881b2f4c76d6c28f324fac8a3e3d6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libz/libzstd/zstd_1.4.4+dfsg-3_arm64.deb;name=zstd"
SRC_URI[zstd.md5sum] = "5dbcb6a6befa042731008e8d9d147d59"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libz/libzstd/libzstd1_1.4.4+dfsg-3_arm64.deb;name=libzstd1"
SRC_URI[libzstd1.md5sum] = "f26cfd87e0c23d6083da25c825d6cd7f"

# other configs to feed compilation
PKG_${UPN} = "libzstd1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "zstd "
