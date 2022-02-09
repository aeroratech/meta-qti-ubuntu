LICENSE = "BSD-3-Clause"
LICENSE_libspeex1 = "BSD-3-clause"
LICENSE_libspeex-dev = "BSD-3-clause"
LICENSE_libspeexdsp1 = "BSD-3-clause"
LICENSE_libspeexdsp-dev = "BSD-3-clause"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/speex/libspeex1_1.2~rc1.2-1.1ubuntu1_arm64.deb;name=libspeex1 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/s/speex/libspeex-dev_1.2~rc1.2-1.1ubuntu1_arm64.deb;name=libspeex-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/s/speex/libspeexdsp1_1.2~rc1.2-1.1ubuntu1_arm64.deb;name=libspeexdsp1 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/s/speex/libspeexdsp-dev_1.2~rc1.2-1.1ubuntu1_arm64.deb;name=libspeexdsp-dev"

SRC_URI[libspeex1.md5sum] = "cb4c9a0e80d8b58ed41b26332cd99651"
SRC_URI[libspeex-dev.md5sum] = "688f4124c99fa1456a00011b830ac0aa"
SRC_URI[libspeexdsp1.md5sum] = "cb2ee62a7f4f04a75a44521ad08110c6"
SRC_URI[libspeexdsp-dev.md5sum] = "076924d87232df28a13ddbbf2c7f37a7"

# other configs to feed compilation
PKG_${UPN} = "libspeex1"
PROVIDES += "speexdsp"
DEPENDS += "libtool-cross virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc " 