inherit upkg_base

LICENSE = "LGPL-2.1"
LICENSE_mpg123 = "LGPL-2.1"
LICENSE_libmpg123-0 = "LGPL-2.1"
LICENSE_libout123-0 = "LGPL-2.1"
LICENSE_libmpg123-dev = "LGPL-2.1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/m/mpg123/libmpg123-dev_1.25.13-1_arm64.deb;name=libmpg123-dev"
SRC_URI[libmpg123-dev.md5sum] = "8b7e4a422e5f27f28550545e3b79b30d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/m/mpg123/libout123-0_1.25.13-1_arm64.deb;name=libout123-0"
SRC_URI[libout123-0.md5sum] = "b0b79939a98991eae3819bfb9db2ac69"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/m/mpg123/libmpg123-0_1.25.13-1_arm64.deb;name=libmpg123-0"
SRC_URI[libmpg123-0.md5sum] = "4d9ec0124dd25aa4ebed62d918986792"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/m/mpg123/mpg123_1.25.13-1_arm64.deb;name=mpg123"
SRC_URI[mpg123.md5sum] = "cb34cbbe0f6c5deaedde3d8486dc2874"

# other configs to feed compilation
PKG_${UPN} = "mpg123"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  pulseaudio"
PROVIDES += "mpg123 "
