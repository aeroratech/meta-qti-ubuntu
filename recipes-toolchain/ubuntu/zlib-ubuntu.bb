LICENSE = "Zlib"
LICENSE_zlib1g-dev = "Zlib"
LICENSE_zlib1g = "Zlib"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/z/zlib/zlib1g-dev_1.2.11.dfsg-2ubuntu1_arm64.deb;name=zlib1g-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/z/zlib/zlib1g_1.2.11.dfsg-2ubuntu1_arm64.deb;name=zlib1g \
          "
SRC_URI[zlib1g-dev.md5sum] = "5c67a3b738f5a7d63cd6dcdca24391c3"
SRC_URI[zlib1g.md5sum] = "8b5d376fa23b25fc3b0e95c21695b659"

# other configs to feed compilation
PKG_${UPN} ="zlib1g"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
