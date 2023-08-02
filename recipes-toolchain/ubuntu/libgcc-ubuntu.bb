LICENSE = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_libgcc-10-dev-arm64-cross = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_libgcc-s1-arm64-cross = "GPL-3.0-with-GCC-exception-3.1"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gcc-10-cross/libgcc-10-dev-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libgcc-10-dev-arm64-cross \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libgcc-s1-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libgcc-s1-arm64-cross"

SRC_URI[libgcc-10-dev-arm64-cross.md5sum] = "530f71a90d9639ab404cd63b4bc30b46"
SRC_URI[libgcc-s1-arm64-cross.md5sum] = "2fce0eb3b56e8036b8df34ed303355c7"

# other configs to feed compilation
FILES_${UPN} += "${exec_prefix}/${UBUNTU_TARGET_ARCH} ${libdir}/gcc-cross/*"
PKG_${UPN} = "libgcc1"

PROVIDES += "libgcc-initial"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-g++ virtual/libc"
