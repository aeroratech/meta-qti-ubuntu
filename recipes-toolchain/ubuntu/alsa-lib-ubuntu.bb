inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libasound2 = "LGPL-2.1+"
LICENSE_libasound2-dev = "LGPL-2.1+"
LICENSE_libasound2-plugin-smixer = "LGPL-2.1+"
LICENSE_libatopology2 = "LGPL-2.1+"
LICENSE_libatopology-dev = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/alsa-lib/libatopology-dev_1.2.2-2.1_arm64.deb;name=libatopology-dev"
SRC_URI[libatopology-dev.md5sum] = "a121ace92a77a1d59f5401ede6aa8223"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/alsa-lib/libatopology2_1.2.2-2.1_arm64.deb;name=libatopology2"
SRC_URI[libatopology2.md5sum] = "e43813535eed27656aca98e0ae1c98f0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/alsa-lib/libasound2-plugin-smixer_1.2.2-2.1_arm64.deb;name=libasound2-plugin-smixer"
SRC_URI[libasound2-plugin-smixer.md5sum] = "f7794c9b952f2a7e48e6b538e2dfac1e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/alsa-lib/libasound2-dev_1.2.2-2.1_arm64.deb;name=libasound2-dev"
SRC_URI[libasound2-dev.md5sum] = "93e15d9a03b31eadc711c30d380b85ef"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/alsa-lib/libasound2_1.2.2-2.1_arm64.deb;name=libasound2"
SRC_URI[libasound2.md5sum] = "fbefc5f478d87b3b153287c88bdb6d84"

# other configs to feed compilation
PKG_${UPN} = "libasound2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "alsa-lib "
