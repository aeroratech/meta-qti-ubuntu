inherit upkg_base

LICENSE = "MIT Variant"
LICENSE_libtiff-opengl = "MIT Variant"
LICENSE_libtiff-tools = "MIT Variant"
LICENSE_libtiffxx5 = "MIT Variant"
LICENSE_libtiff5-dev = "MIT Variant"
LICENSE_libtiff5 = "MIT Variant"
LICENSE_libtiff-dev = "MIT Variant"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tiff/libtiff-dev_4.1.0+git191117-2build1_arm64.deb;name=libtiff-dev"
SRC_URI[libtiff-dev.md5sum] = "67c3703652da0b127fc354392d6b3fff"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tiff/libtiff5_4.1.0+git191117-2build1_arm64.deb;name=libtiff5"
SRC_URI[libtiff5.md5sum] = "3593b8632cb3fe84603776bc43c93b2f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tiff/libtiff5-dev_4.1.0+git191117-2build1_arm64.deb;name=libtiff5-dev"
SRC_URI[libtiff5-dev.md5sum] = "46213a2acac8fdb3ed64510594b3a8c0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tiff/libtiffxx5_4.1.0+git191117-2build1_arm64.deb;name=libtiffxx5"
SRC_URI[libtiffxx5.md5sum] = "9aeb5a3d0237ccaeff9695533802cf94"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/t/tiff/libtiff-tools_4.1.0+git191117-2build1_arm64.deb;name=libtiff-tools"
SRC_URI[libtiff-tools.md5sum] = "7a35364d2b6b91945492b11032c59f68"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/t/tiff/libtiff-opengl_4.1.0+git191117-2build1_arm64.deb;name=libtiff-opengl"
SRC_URI[libtiff-opengl.md5sum] = "6c5e4b421a605f4a8b0caa3766d96d6c"

# other configs to feed compilation
PKG_${UPN} = "libtiff-opengl"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  jpeg xz zlib"
PROVIDES += "tiff "
