inherit upkg_base

LICENSE = "LGPL-2.1"
LICENSE_libdap-dev = "LGPL-2.1"
LICENSE_libdapserver7v5 = "LGPL-2.1"
LICENSE_libdapclient6v5 = "LGPL-2.1"
LICENSE_libdap25 = "LGPL-2.1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libd/libdap/libdap25_3.20.5-1_arm64.deb;name=libdap25"
SRC_URI[libdap25.md5sum] = "616f5d61c8ddeee542f82c0d6f359b78"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libd/libdap/libdapclient6v5_3.20.5-1_arm64.deb;name=libdapclient6v5"
SRC_URI[libdapclient6v5.md5sum] = "a0d172dcb63fe53b720eda148987c9af"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libd/libdap/libdapserver7v5_3.20.5-1_arm64.deb;name=libdapserver7v5"
SRC_URI[libdapserver7v5.md5sum] = "ab10267bb71738c27c2bb6902b7af130"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libd/libdap/libdap-dev_3.20.5-1_arm64.deb;name=libdap-dev"
SRC_URI[libdap-dev.md5sum] = "0df15fdb9aca3bdf1f2e47174fceaa9f"

# other configs to feed compilation
PKG_${UPN} = "libdap25"

DEPENDS += "zlib libxml2 curl util-linux cppunit openssl flex pth"
