inherit upkg_base

LICENSE = "GPL-2.0+ & LGPL-2.0+"
LICENSE_libkeyutils1 = "GPL-2.0+ & LGPL-2.0+"
LICENSE_libkeyutils-dev = "GPL-2.0+ & LGPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/keyutils/libkeyutils-dev_1.6-6ubuntu1_arm64.deb;name=libkeyutils-dev"
SRC_URI[libkeyutils-dev.md5sum] = "91854ab3b374833750c8995f23e730c0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/keyutils/libkeyutils1_1.6-6ubuntu1_arm64.deb;name=libkeyutils1"
SRC_URI[libkeyutils1.md5sum] = "7dd0ba4b8994f1c17993878244185de4"

# other configs to feed compilation
PKG_${UPN} = "libkeyutils1"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "keyutils "
