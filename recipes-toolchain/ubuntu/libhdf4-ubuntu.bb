inherit upkg_base

LICENSE = "BSD-5-Clause  & NetCDF"
LICENSE_libhdf4-alt-dev = "BSD-5-Clause  & NetCDF"
LICENSE_libhdf4-0-alt = "BSD-5-Clause  & NetCDF"
LICENSE_libhdf4-dev = "BSD-5-Clause  & NetCDF"
LICENSE_libhdf4-0 = "BSD-5-Clause  & NetCDF"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libh/libhdf4/libhdf4-0_4.2.14-1ubuntu1_arm64.deb;name=libhdf4-0"
SRC_URI[libhdf4-0.md5sum] = "cedbb8e51aa9796cf631982f3c3a1dd8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libh/libhdf4/libhdf4-dev_4.2.14-1ubuntu1_arm64.deb;name=libhdf4-dev"
SRC_URI[libhdf4-dev.md5sum] = "5e37ba7e8986d6ba1b5fa18bdfe49a23"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libh/libhdf4/libhdf4-0-alt_4.2.14-1ubuntu1_arm64.deb;name=libhdf4-0-alt"
SRC_URI[libhdf4-0-alt.md5sum] = "023428c89cff133dd0110ee7b03b0cbf"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libh/libhdf4/libhdf4-alt-dev_4.2.14-1ubuntu1_arm64.deb;name=libhdf4-alt-dev"
SRC_URI[libhdf4-alt-dev.md5sum] = "2b6a8061009513b6d5c9daa1e1ad0ad4"

# other configs to feed compilation
PKG_${UPN} = "libhdf4-alt-dev"

DEPENDS += "libaec libjpeg8-empty zlib"
