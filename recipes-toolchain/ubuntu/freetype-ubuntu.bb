inherit upkg_base

LICENSE = "FTL | GPL-2.0+"
LICENSE_libfreetype6 = "FTL | GPL-2.0+"
LICENSE_libfreetype-dev = "FTL | GPL-2.0+"
LICENSE_libfreetype6-dev = "FTL | GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/freetype/libfreetype6-dev_2.10.1-2_arm64.deb;name=libfreetype6-dev"
SRC_URI[libfreetype6-dev.md5sum] = "e058563294c86618e823cab0ba602ac1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/freetype/libfreetype-dev_2.10.1-2_arm64.deb;name=libfreetype-dev"
SRC_URI[libfreetype-dev.md5sum] = "cde1fce8d0242e6d0bf41f7504319107"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/freetype/libfreetype6_2.10.1-2_arm64.deb;name=libfreetype6"
SRC_URI[libfreetype6.md5sum] = "b5ef6ccb4008937e79a8d60dda803f74"

# other configs to feed compilation
PKG_${UPN} = "libfreetype6"

DEPENDS = "libpng zlib" 
