inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libp11-kit0 = "BSD-3-Clause"
LICENSE_libp11-kit-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/p11-kit/libp11-kit-dev_0.23.20-1build1_arm64.deb;name=libp11-kit-dev"
SRC_URI[libp11-kit-dev.md5sum] = "464010bec419b04288e467d3a661524d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/p11-kit/libp11-kit0_0.23.20-1build1_arm64.deb;name=libp11-kit0"
SRC_URI[libp11-kit0.md5sum] = "1ebb9e3c5e513a2c29f349e8dc2a9a0c"

# other configs to feed compilation
PKG_${UPN} = "libp11-kit0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libtasn1 libffi  bash-completion"
PROVIDES += "p11-kit "
