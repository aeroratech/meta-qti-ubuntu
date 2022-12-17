inherit upkg_base

LICENSE = "MIT"
LICENSE_libgif-dev = "MIT"
LICENSE_libgif7 = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/giflib/libgif7_5.1.9-1_arm64.deb;name=libgif7"
SRC_URI[libgif7.md5sum] = "fc9cc7df9452e403cf42dceeea054f0a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/giflib/libgif-dev_5.1.9-1_arm64.deb;name=libgif-dev"
SRC_URI[libgif-dev.md5sum] = "d2f98b23e35bae402f89a8c953baad8c"

# other configs to feed compilation
PKG_${UPN} = "libgif7"

DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libgcc libtool-cross"
