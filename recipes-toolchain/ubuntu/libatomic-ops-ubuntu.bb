inherit upkg_base

LICENSE = "MIT-Style & GPL-2.0+"
LICENSE_libatomic-ops-dev = "MIT-Style & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/liba/libatomic-ops/libatomic-ops-dev_7.6.10-1ubuntu2_arm64.deb;name=libatomic-ops-dev"
SRC_URI[libatomic-ops-dev.md5sum] = "f3734131dbae295d2bd5258340485763"

# other configs to feed compilation
PKG_${UPN} = "libatomic-ops-dev"
PACKAGES_remove = "libatomic-ops-dev"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libatomics-ops"
