inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-3.0+"
LICENSE_libgnutls28-dev = "LGPL-2.1+ & GPL-3.0+"
LICENSE_ibgnutls30 = "LGPL-2.1+ & GPL-3.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gnutls28/libgnutls28-dev_3.6.13-2ubuntu1_arm64.deb;name=libgnutls28-dev"
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gnutls28/libgnutls30_3.6.13-2ubuntu1_arm64.deb;name=libgnutls30"
SRC_URI[libgnutls30.md5sum] = "6978fc5b135070bb531e225da0c352e5"
SRC_URI[libgnutls28-dev.md5sum] = "5c978b6e115ff0a1ef78566156c2183d"

# other configs to feed compilation
PKG_${UPN} = "libgnutls30"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc nettle gmp virtual/libiconv libunistring  libidn2"
PROVIDES += "gnutls "

#dependency for ubuntu
DEPENDS += "libtasn1 p11-kit"
