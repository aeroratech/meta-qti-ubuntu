inherit upkg_base

LICENSE = "GPL-2.0"
LICENSE_bridge-utils = "GPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/bridge-utils/bridge-utils_1.6-2ubuntu1_arm64.deb;name=bridge-utils"
SRC_URI[bridge-utils.md5sum] = "6b7147583c6ae6b45adb00b056200781"

# other configs to feed compilation
PKG_${UPN} = "bridge-utils"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc sysfsutils"
PROVIDES += "bridge-utils"

