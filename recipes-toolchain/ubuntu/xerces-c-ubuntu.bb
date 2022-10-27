inherit upkg_base

LICENSE = "Apache-2.0 & Permissive-fsf"
LICENSE_libxerces-c3.2 = "Apache-2.0 & Permissive-fsf"
LICENSE_libxerces-c-dev = "Apache-2.0 & Permissive-fsf"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/x/xerces-c/libxerces-c-dev_3.2.2+debian-1build3_arm64.deb;name=libxerces-c-dev"
SRC_URI[libxerces-c-dev.md5sum] = "fc1fd317e4f41a783f0964a4251b86fd"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/x/xerces-c/libxerces-c3.2_3.2.2+debian-1build3_arm64.deb;name=libxerces-c3.2"
SRC_URI[libxerces-c3.2.md5sum] = "fae6b41e30f0062ba3cf912f804d6602"

# other configs to feed compilation
PKG_${UPN} = "libxerces-c3.2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  curl icu"
PROVIDES += "xerces-c "
