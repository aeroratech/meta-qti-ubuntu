inherit upkg_base

LICENSE = "zlib"
LICENSE_libminizip1 = "zlib"
LICENSE_libminizip-dev = "zlib"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/m/minizip/libminizip-dev_1.1-8build1_arm64.deb;name=libminizip-dev"
SRC_URI[libminizip-dev.md5sum] = "d6ea829cd5cb4eb2966576b81ec07414"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/m/minizip/libminizip1_1.1-8build1_arm64.deb;name=libminizip1"
SRC_URI[libminizip1.md5sum] = "631fd211eadb28034790750b7a4f1b5c"

# other configs to feed compilation
PKG_${UPN} = "libminizip1"

DEPENDS += "zlib"
