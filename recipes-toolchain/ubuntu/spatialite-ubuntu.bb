inherit upkg_base

LICENSE = "MPL-1.1 or GPL-2+ or LGPL-2.1+"
LICENSE_libspatialite7 = "MPL-1.1 or GPL-2+ or LGPL-2.1+"
LICENSE_libspatialite-dev = "MPL-1.1 or GPL-2+ or LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/spatialite/libspatialite-dev_4.3.0a-6build1_arm64.deb;name=libspatialite-dev"
SRC_URI[libspatialite-dev.md5sum] = "0c726c6c27222c9ff320e5184b840b40"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/spatialite/libspatialite7_4.3.0a-6build1_arm64.deb;name=libspatialite7"
SRC_URI[libspatialite7.md5sum] = "d7d7fee79d1f112161fcbf3c67280cd2"

# other configs to feed compilation
PKG_${UPN} = "libspatialite7"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc proj geos sqlite3 libxml2 zlib"
PROVIDES += "libspatialite "
