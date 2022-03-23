inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libpcre2-8-0 = "BSD-3-Clause"
LICENSE_libpcre2-16-0 = "BSD-3-Clause"
LICENSE_libpcre2-32-0 = "BSD-3-Clause"
LICENSE_libpcre2-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre2/libpcre2-dev_10.34-7_arm64.deb;name=libpcre2-dev"
SRC_URI[libpcre2-dev.md5sum] = "0aa6f2862768ab08fbf3c27d3c600998"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre2/libpcre2-32-0_10.34-7_arm64.deb;name=libpcre2-32-0"
SRC_URI[libpcre2-32-0.md5sum] = "219e9bc64ca7673022157188e76cbce6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre2/libpcre2-16-0_10.34-7_arm64.deb;name=libpcre2-16-0"
SRC_URI[libpcre2-16-0.md5sum] = "ebfcff0becfc0c278b91224020380c64"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre2/libpcre2-8-0_10.34-7_arm64.deb;name=libpcre2-8-0"
SRC_URI[libpcre2-8-0.md5sum] = "3b654c6c3e623b1b67c557622efaee3c"

# other configs to feed compilation
PKG_${UPN} = "libpcre2-8-0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  bzip2 zlib"
PROVIDES += "libpcre2  pcre2"
