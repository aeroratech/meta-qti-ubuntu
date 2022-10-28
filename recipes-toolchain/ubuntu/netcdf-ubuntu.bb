inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libnetcdf15 = "BSD-3-Clause"
LICENSE_libnetcdf-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/n/netcdf/libnetcdf-dev_4.7.3-1_arm64.deb;name=libnetcdf-dev"
SRC_URI[libnetcdf-dev.md5sum] = "dc7a435626ee05874fe3bead1f7a39fe"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/n/netcdf/libnetcdf15_4.7.3-1_arm64.deb;name=libnetcdf15"
SRC_URI[libnetcdf15.md5sum] = "58860d0034d95960c7e4121c484c9917"

# other configs to feed compilation
PKG_${UPN} = "libnetcdf15"

DEPENDS += "hdf5"
