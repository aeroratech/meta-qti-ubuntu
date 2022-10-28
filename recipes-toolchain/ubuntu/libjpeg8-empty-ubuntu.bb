inherit upkg_base

LICENSE = "LGPL-2.1"
LICENSE_libjpeg-dev = "LGPL-2.1"
LICENSE_libjpeg8-dev = "LGPL-2.1"
LICENSE_libjpeg8 = "LGPL-2.1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libj/libjpeg8-empty/libjpeg8_8c-2ubuntu8_arm64.deb;name=libjpeg8"
SRC_URI[libjpeg8.md5sum] = "358a37a2cf30c072440cd86a3fdcbae5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libj/libjpeg8-empty/libjpeg8-dev_8c-2ubuntu8_arm64.deb;name=libjpeg8-dev"
SRC_URI[libjpeg8-dev.md5sum] = "df7604911ff5d2a3171ad464c13e7057"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libj/libjpeg8-empty/libjpeg-dev_8c-2ubuntu8_arm64.deb;name=libjpeg-dev"
SRC_URI[libjpeg-dev.md5sum] = "90c71b4ee10b266f0eb706f7922055df"

# other configs to feed compilation
PKG_${UPN} = "libjpeg-dev"

DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
