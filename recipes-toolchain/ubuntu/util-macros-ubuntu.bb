inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_xutils-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/x/xutils-dev/xutils-dev_7.7+5ubuntu2_arm64.deb;name=xutils-dev"
SRC_URI[xutils-dev.md5sum] = "bfa738f4cc66fbcf9973816b7699d926"

# other configs to feed compilation
PKG_${UPN} = "xutils-dev"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-oe-linux-compilerlibs virtual/libc "
PROVIDES += "util-macros "
#RDEPENDS_${UPN} += "util-macros "
