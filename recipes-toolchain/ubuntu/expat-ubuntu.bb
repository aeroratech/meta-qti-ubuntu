inherit upkg_base

LICENSE = "MIT"
LICENSE_expat = "MIT"
LICENSE_libexpat1 = "MIT"
LICENSE_libexpat1-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/expat/libexpat1-dev_2.2.9-1build1_arm64.deb;name=libexpat1-dev"
SRC_URI[libexpat1-dev.md5sum] = "efc8240a49b99cdeffed4150d5bf294d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/expat/libexpat1_2.2.9-1build1_arm64.deb;name=libexpat1"
SRC_URI[libexpat1.md5sum] = "f14e6aec3905e43d3c80cddc9ed61b95"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/e/expat/expat_2.2.9-1build1_arm64.deb;name=expat"
SRC_URI[expat.md5sum] = "1d9b859eba532294f2bb0b8a3f9efc4a"

# other configs to feed compilation
PKG_${UPN} = "libexpat1"

#RPROVIDES_libexpat1 += "expat"

DEPENDS += "libgcc"
