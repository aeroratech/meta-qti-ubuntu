inherit upkg_base

LICENSE = "GPL-3+"
LICENSE_libbison-dev = "GPL-3+"
LICENSE_bison = "GPL-3+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/bison/bison_3.5.1+dfsg-1_arm64.deb;name=bison"
SRC_URI[bison.md5sum] = "fedcf16dfd56215ccdbb2e4ae77f8f94"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/bison/libbison-dev_3.5.1+dfsg-1_arm64.deb;name=libbison-dev"
SRC_URI[libbison-dev.md5sum] = "d4832d1cd8c1f23a97bc43a3aa2cc2da"

# other configs to feed compilation
PKG_${UPN} = "libbison-dev"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
PROVIDES += "bison "
