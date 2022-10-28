inherit upkg_base

LICENSE = "BSD-2,ZLIB & MIT"
LICENSE_libopenjp3d7 = "BSD-2 , ZLIB & MIT"
LICENSE_libopenjpip7 = "BSD-2 , ZLIB & MIT"
LICENSE_libopenjp2-7 = "BSD-2 , ZLIB & MIT"
LICENSE_libopenjp2-7-dev = "BSD-2 , ZLIB & MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/openjpeg2/libopenjp2-7-dev_2.3.1-1ubuntu4_arm64.deb;name=libopenjp2-7-dev"
SRC_URI[libopenjp2-7-dev.md5sum] = "e70420c41e30bd291689a5a961e9dc47"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/openjpeg2/libopenjp2-7_2.3.1-1ubuntu4_arm64.deb;name=libopenjp2-7"
SRC_URI[libopenjp2-7.md5sum] = "7e12f6a88363930fef133cfb61d8c02f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/openjpeg2/libopenjpip7_2.3.1-1ubuntu4_arm64.deb;name=libopenjpip7"
SRC_URI[libopenjpip7.md5sum] = "04b3494f4e772e6f037a322f3647923a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/openjpeg2/libopenjp3d7_2.3.1-1ubuntu4_arm64.deb;name=libopenjp3d7"
SRC_URI[libopenjp3d7.md5sum] = "25c7b0ec8f5dbba23b23cb18f2f19e32"

# other configs to feed compilation
PKG_${UPN} = "libopenjp3d7"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libpng tiff lcms zlib"
PROVIDES += "openjpeg2"
