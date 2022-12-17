inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libpcre3 = "BSD-3-Clause"
LICENSE_libpcre32-3 = "BSD-3-Clause"
LICENSE_libpcre16-3 = "BSD-3-Clause"
LICENSE_libpcre3-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre3/libpcre3-dev_8.39-12build1_arm64.deb;name=libpcre3-dev"
SRC_URI[libpcre3-dev.md5sum] = "5b1ecbd87094ef5ac19a79c9ce41bd8f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre3/libpcre16-3_8.39-12build1_arm64.deb;name=libpcre16-3"
SRC_URI[libpcre16-3.md5sum] = "1782a8b61b5d1529c72a23842197d4db"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre3/libpcre32-3_8.39-12build1_arm64.deb;name=libpcre32-3"
SRC_URI[libpcre32-3.md5sum] = "ab884ca6ecf1fc54d6cf1b37bbb311cc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pcre3/libpcre3_8.39-12build1_arm64.deb;name=libpcre3"
SRC_URI[libpcre3.md5sum] = "5468d33e7cb52ac5faf8c3e7666ba4f5"

# other configs to feed compilation
PKG_${UPN} = "libpcre3"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  bzip2 zlib"
PROVIDES += "libpcre  pcre pcre3"
