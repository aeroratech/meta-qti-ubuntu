inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libfontconfig1-dev = "MIT-Style"
LICENSE_libfontconfig1 = "MIT-Style"
LICENSE_fontconfig = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/fontconfig/fontconfig_2.13.1-2ubuntu3_arm64.deb;name=fontconfig"
SRC_URI[fontconfig.md5sum] = "47bb050b869e6c7cdf51fb7b205d65ec"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/fontconfig/libfontconfig1_2.13.1-2ubuntu3_arm64.deb;name=libfontconfig1"
SRC_URI[libfontconfig1.md5sum] = "b782135df14e8c925787a2c8fae1d90f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/fontconfig/libfontconfig1-dev_2.13.1-2ubuntu3_arm64.deb;name=libfontconfig1-dev"
SRC_URI[libfontconfig1-dev.md5sum] = "5a34f5c3763d8e04f9737d25794e8872"

# other configs to feed compilation
PKG_${UPN} = "libfontconfig1"

DEPENDS += "expat freetype"
PROVIDES += "fontconfig-utils"
RPROVIDES_fontconfig += "fontconfig-utils kbd"
