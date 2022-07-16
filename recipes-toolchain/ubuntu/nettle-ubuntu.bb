inherit upkg_base

LICENSE = "LGPL-2.1+ & LGPL-2.0+ & BSD-3-Clause & GPL-2.0+"
LICENSE_libnettle7 = "LGPL-2.1+ & LGPL-2.0+ & BSD-3-Clause & GPL-2.0+"
LICENSE_nettle-dev = "LGPL-2.1+ & LGPL-2.0+ & BSD-3-Clause & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nettle/nettle-dev_3.5.1+really3.5.1-2_arm64.deb;name=nettle-dev"
SRC_URI[nettle-dev.md5sum] = "675ec740bd86ac44223cae222371bbaa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nettle/libnettle7_3.5.1+really3.5.1-2_arm64.deb;name=libnettle7"
SRC_URI[libnettle7.md5sum] = "7bfb9cc57bc7c3cd1d4f7ba220d40bfa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nettle/libhogweed5_3.5.1+really3.5.1-2_arm64.deb;name=libhogweed5"
SRC_URI[libhogweed5.md5sum] = "462c9c0f20619873239e03059a5e9d5d"

# other configs to feed compilation
PKG_${UPN} = "libnettle7"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  gmp"
PROVIDES += "nettle "
