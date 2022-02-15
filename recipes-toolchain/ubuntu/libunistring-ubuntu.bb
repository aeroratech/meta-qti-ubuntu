inherit upkg_base

LICENSE = "LGPL-3.0+ | GPL-2.0+ & GPL-3.0+ | GFDL-1.2+ & MIT"
LICENSE_libunistring2 = "LGPL-3.0+ | GPL-2.0+ & GPL-3.0+ | GFDL-1.2+ & MIT"
LICENSE_libunistring-dev = "LGPL-3.0+ | GPL-2.0+ & GPL-3.0+ | GFDL-1.2+ & MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libu/libunistring/libunistring-dev_0.9.10-2_arm64.deb;name=libunistring-dev"
SRC_URI[libunistring-dev.md5sum] = "431f6a68ffb8a395df01d2eba454c76b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libu/libunistring/libunistring2_0.9.10-2_arm64.deb;name=libunistring2"
SRC_URI[libunistring2.md5sum] = "418c1646f62589ef1e0755f1e1653d93"

# other configs to feed compilation
PKG_${UPN} = "libunistring2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libunistring "
