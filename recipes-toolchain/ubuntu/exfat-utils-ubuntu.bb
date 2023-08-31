inherit upkg_base

LICENSE = "GPL-2+"
LICENSE_exfat-utils = "GPL-2+"

DEPENDS = "virtual/libc"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/e/exfat-utils/exfat-utils_1.3.0-1_arm64.deb;name=exfat-utils"
SRC_URI[exfat-utils.md5sum] = "e41f757a5b57de6ba047f647abfc2808"

# other configs to feed compilation
PKG_${UPN} = "exfat-utils"
