LICENSE = "LGPL-2.1+"
LICENSE_libcrypt1 = "LGPL-2.1+"
LICENSE_libcrypt-dev = "LGPL-2.1+"
inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcrypt/libcrypt1_4.4.10-10ubuntu4_arm64.deb;name=libcrypt1 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcrypt/libcrypt-dev_4.4.10-10ubuntu4_arm64.deb;name=libcrypt-dev"

SRC_URI[libcrypt1.md5sum] = "41ffe3deba96b6a616667ecf455b42ec"
SRC_URI[libcrypt-dev.md5sum] = "e7b9c19b2315949aa7898e2cab9fd063"

# other configs to feed compilation
PROVIDES += "virtual/crypt"
PKG_${UPN} = "libcrypt1"
DEPENDS += "libtool-cross virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc " 
