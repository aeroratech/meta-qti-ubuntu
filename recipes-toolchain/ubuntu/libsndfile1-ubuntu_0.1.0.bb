inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libsndfile1-dev = "LGPL-2.1+"
LICENSE_libsndfile1 = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsndfile/libsndfile1_1.0.28-7_arm64.deb;name=libsndfile1"
SRC_URI[libsndfile1.md5sum] = "4994ace956562f5afca86b02716df18d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsndfile/libsndfile1-dev_1.0.28-7_arm64.deb;name=libsndfile1-dev"
SRC_URI[libsndfile1-dev.md5sum] = "55412d2642906125ee588a13bf01cace"

# other configs to feed compilation
PKG_${UPN} = "libsndfile1"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc flac libogg libvorbis"
PROVIDES += "libsndfile1 "
