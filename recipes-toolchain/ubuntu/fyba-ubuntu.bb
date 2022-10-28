inherit upkg_base

LICENSE = "MIT"
LICENSE_libfyba-dev = "MIT"
LICENSE_libfyba0 = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/fyba/libfyba0_4.1.1-6build1_arm64.deb;name=libfyba0"
SRC_URI[libfyba0.md5sum] = "b4e773c5c9a2649677d543abf9689991"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/fyba/libfyba-dev_4.1.1-6build1_arm64.deb;name=libfyba-dev"
SRC_URI[libfyba-dev.md5sum] = "b2fbab8d44e626159635f0f101c72f09"

# other configs to feed compilation
PKG_${UPN} = "libfyba-dev"

DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libgcc"
