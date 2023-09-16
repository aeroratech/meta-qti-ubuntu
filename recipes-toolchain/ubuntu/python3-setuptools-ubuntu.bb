inherit upkg_base

LICENSE = "PSF | ZPL"
LICENSE_python3-setuptools = "PSF | ZPL"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/setuptools/python3-setuptools_45.2.0-1ubuntu0.1_all.deb;name=python3-setuptools"
SRC_URI[python3-setuptools.md5sum] = "411f3bbd905efbca864c2473c1704df1"

# other configs to feed compilation
PKG_${UPN} = "python3-setuptools"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc python3 "
PROVIDES += "python3-setuptools "
