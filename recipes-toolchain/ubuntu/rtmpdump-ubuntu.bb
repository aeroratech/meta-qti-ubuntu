inherit upkg_base

LICENSE = "GPL-2.0+ & LGPL-2.1+"
LICENSE_librtmp1 = "GPL-2.0+ & LGPL-2.1+"
LICENSE_librtmp-dev = "GPL-2.0+ & LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/r/rtmpdump/librtmp-dev_2.4+20151223.gitfa8646d.1-2build1_arm64.deb;name=librtmp-dev"
SRC_URI[librtmp-dev.md5sum] = "536410250f9cc8bd2880a65385211ba5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/r/rtmpdump/librtmp1_2.4+20151223.gitfa8646d.1-2build1_arm64.deb;name=librtmp1"
SRC_URI[librtmp1.md5sum] = "1ae2894844d248d2b808b4e7c9489c7c"

# other configs to feed compilation
PKG_${UPN} = "librtmp1"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc gnutls zlib"
PROVIDES += "rtmpdump "
