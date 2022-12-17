inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libcharls2 = "BSD-3-clause"
LICENSE_libcharls-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/c/charls/libcharls-dev_2.0.0+dfsg-1build1_arm64.deb;name=libcharls-dev"
SRC_URI[libcharls-dev.md5sum] = "ca2133d5f89406d9e76f3f139bfa2c04"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/c/charls/libcharls2_2.0.0+dfsg-1build1_arm64.deb;name=libcharls2"
SRC_URI[libcharls2.md5sum] = "057bf8991e14d220264c3d138ec068a5"

# other configs to feed compilation
PKG_${UPN} = "libcharls2"

DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libgcc"
