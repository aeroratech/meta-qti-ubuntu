inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libnpth0 = "LGPL-2.1+"
LICENSE_libnpth0-dev = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/npth/libnpth0-dev_1.6-1_arm64.deb;name=libnpth0-dev"
SRC_URI[libnpth0-dev.md5sum] = "8d6c384e9cf465da03e94667ce718626"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/npth/libnpth0_1.6-1_arm64.deb;name=libnpth0"
SRC_URI[libnpth0.md5sum] = "5ee01d929fb4babb17baf4ad2c751557"

# other configs to feed compilation
PKG_${UPN} = "libnpth0"

DEPENDS += "virtual/libc"
