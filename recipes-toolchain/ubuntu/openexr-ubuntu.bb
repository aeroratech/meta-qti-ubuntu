inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libopenexr24 = "BSD-3-clause"
LICENSE_libopenexr-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/openexr/libopenexr-dev_2.3.0-6build1_arm64.deb;name=libopenexr-dev"
SRC_URI[libopenexr-dev.md5sum] = "0d08421be55656c62f27a77e72e1222d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/openexr/libopenexr24_2.3.0-6build1_arm64.deb;name=libopenexr24"
SRC_URI[libopenexr24.md5sum] = "7b7e6c73d6b57ea124b603fa4ed24975"

# other configs to feed compilation
PKG_${UPN} = "libopenexr24"

DEPENDS += "ilmbase zlib libgcc libstdc++ "
