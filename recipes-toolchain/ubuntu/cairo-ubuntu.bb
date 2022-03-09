inherit upkg_base

LICENSE = "LGPL-2.1 | MPL-1.1 & MIT-Style"
LICENSE_libcairo-script-interpreter2 = "LGPL-2.1 | MPL-1.1 & MIT-Style"
LICENSE_libcairo-gobject2 = "LGPL-2.1 | MPL-1.1 & MIT-Style"
LICENSE_libcairo2 = "LGPL-2.1 | MPL-1.1 & MIT-Style"
LICENSE_libcairo2-dev = "LGPL-2.1 | MPL-1.1 & MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cairo/libcairo2-dev_1.16.0-4ubuntu1_arm64.deb;name=libcairo2-dev"
SRC_URI[libcairo2-dev.md5sum] = "22d08f944b46b6ec7ccb84293cff5906"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cairo/libcairo2_1.16.0-4ubuntu1_arm64.deb;name=libcairo2"
SRC_URI[libcairo2.md5sum] = "f415889730a7d6aaf78becd611279321"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cairo/libcairo-gobject2_1.16.0-4ubuntu1_arm64.deb;name=libcairo-gobject2"
SRC_URI[libcairo-gobject2.md5sum] = "0eb99b72fe0ce03f944025e90dc78720"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cairo/libcairo-script-interpreter2_1.16.0-4ubuntu1_arm64.deb;name=libcairo-script-interpreter2"
SRC_URI[libcairo-script-interpreter2.md5sum] = "7042ae4a7899c60e93fbdf94fd931715"

# other configs to feed compilation
PKG_${UPN} = "libcairo2"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libx11 freetype expat fontconfig libxcb pixman libxext libxrender"
PROVIDES += "cairo "
