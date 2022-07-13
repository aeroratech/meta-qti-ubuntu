inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_xtrans-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xtrans/xtrans-dev_1.4.0-1_all.deb;name=xtrans-dev"
SRC_URI[xtrans-dev.md5sum] = "5411362f7caeccc1185750f3a1a508ee"

# other configs to feed compilation
PKG_${UPN} = "xtrans-dev"

PACKAGE_ARCH = "all"
