inherit upkg_base

LICENSE = "GPL-2+"
LICENSE_libomp5-10 = "GPL-2+"
LICENSE_libomp-10-dev = "GPL-2+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/l/llvm-toolchain-10/libomp-10-dev_10.0.0-4ubuntu1_arm64.deb;name=libomp-10-dev"
SRC_URI[libomp-10-dev.md5sum] = "792a0d87c9f8c3561ee33411745b4575"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/l/llvm-toolchain-10/libomp5-10_10.0.0-4ubuntu1_arm64.deb;name=libomp5-10"
SRC_URI[libomp5-10.md5sum] = "0756b3400d8cadc29cae7ad50e9b9d0d"

# other configs to feed compilation
PKG_${UPN} = "libomp5-10"
#DEPENDS += "libatomic1 libc6 libgcc-s1 libstdc++6 virtual/libc"
PROVIDES += "libomp "
