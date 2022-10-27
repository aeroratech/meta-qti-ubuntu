inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libdaemon0 = "LGPL-2.1+"
LICENSE_libdaemon-dev = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdaemon/libdaemon-dev_0.14-7_arm64.deb;name=libdaemon-dev"
SRC_URI[libdaemon-dev.md5sum] = "1e450de925f4513c93dca0b8ef408d1f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdaemon/libdaemon0_0.14-7_arm64.deb;name=libdaemon0"
SRC_URI[libdaemon0.md5sum] = "bb3c2eb3a9f922bab4534faa9477c367"

# other configs to feed compilation
PKG_${UPN} = "libdaemon0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libdaemon "
