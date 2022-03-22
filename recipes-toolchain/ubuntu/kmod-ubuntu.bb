inherit upkg_base

LICENSE = "GPL-2.0+ & LGPL-2.1+"
LICENSE_libkmod2 = "GPL-2.0+ & LGPL-2.1+"
LICENSE_libkmod-dev = "GPL-2.0+ & LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/kmod/libkmod-dev_27-1ubuntu2_arm64.deb;name=libkmod-dev"
SRC_URI[libkmod-dev.md5sum] = "63ff2701038d8af8834c8b4e6cd74c48"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/kmod/libkmod2_27-1ubuntu2_arm64.deb;name=libkmod2"
SRC_URI[libkmod2.md5sum] = "a3a33d335b3cd5fed647f806ab85fbbf"

# other configs to feed compilation
PKG_${UPN} = "libkmod2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  zlib  bash-completion"
PROVIDES += "kmod  module-init-tools-insmod-static module-init-tools-depmod module-init-tools"
