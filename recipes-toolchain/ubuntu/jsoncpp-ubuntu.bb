inherit upkg_base

LICENSE = "MIT | PD & GPL-3.0+"
LICENSE_libjsoncpp1 = "MIT | PD & GPL-3.0+"
LICENSE_libjsoncpp-dev = "MIT | PD & GPL-3.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libj/libjsoncpp/libjsoncpp-dev_1.7.4-3.1ubuntu2_arm64.deb;name=libjsoncpp-dev"
SRC_URI[libjsoncpp-dev.md5sum] = "5306f8d7d03e0920442b88dd672a3c80"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libj/libjsoncpp/libjsoncpp1_1.7.4-3.1ubuntu2_arm64.deb;name=libjsoncpp1"
SRC_URI[libjsoncpp1.md5sum] = "3c3dd0461f04d1fd57927c5949a6992e"

# other configs to feed compilation
PKG_${UPN} = "libjsoncpp1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "jsoncpp "
