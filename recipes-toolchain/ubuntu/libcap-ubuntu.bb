inherit upkg_base

LICENSE = "BSD-3-clause | GPL-2.0"
LICENSE_libcap2 = "BSD-3-clause | GPL-2.0"
LICENSE_libcap-dev = "BSD-3-clause | GPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libc/libcap2/libcap-dev_2.32-1_arm64.deb;name=libcap-dev"
SRC_URI[libcap-dev.md5sum] = "2a3e9324968a2b72c90f6c1a2a4a413b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libc/libcap2/libcap2_2.32-1_arm64.deb;name=libcap2"
SRC_URI[libcap2.md5sum] = "b2b63c58c7729aef011ca9be196c58c1"

# other configs to feed compilation
PKG_${UPN} = "libcap2"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
PROVIDES += "libcap"
