inherit upkg_base

LICENSE = "GPL-2.0+"
LICENSE_libpci-dev = "GPL-2.0+"
LICENSE_libpci3 = "GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pciutils/libpci3_3.6.4-1_arm64.deb;name=libpci3"
SRC_URI[libpci3.md5sum] = "ff6527e9ce231419bdb4de47b1a3856c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pciutils/libpci-dev_3.6.4-1_arm64.deb;name=libpci-dev"
SRC_URI[libpci-dev.md5sum] = "7af3aa6ef96919e2e84684fc9b6822e7"

# other configs to feed compilation
PKG_${UPN} = "pciutils"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc zlib kmod udev"
PROVIDES += "pciutils "
