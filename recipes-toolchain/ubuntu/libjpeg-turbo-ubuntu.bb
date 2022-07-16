inherit upkg_base

LICENSE = "IJG & LGPL-2.1"
LICENSE_libjpeg-turbo8 = "IJG & LGPL-2.1"
LICENSE_libturbojpeg0-dev = "IJG & LGPL-2.1"
LICENSE_libturbojpeg = "IJG & LGPL-2.1"
LICENSE_libjpeg-turbo8-dev = "IJG & LGPL-2.1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libj/libjpeg-turbo/libjpeg-turbo8-dev_2.0.3-0ubuntu1_arm64.deb;name=libjpeg-turbo8-dev"
SRC_URI[libjpeg-turbo8-dev.md5sum] = "0b57412a377fae33d07eb820fb877bd0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libj/libjpeg-turbo/libturbojpeg_2.0.3-0ubuntu1_arm64.deb;name=libturbojpeg"
SRC_URI[libturbojpeg.md5sum] = "0ab901a200cb8c4ef244a815a6cca6c6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libj/libjpeg-turbo/libturbojpeg0-dev_2.0.3-0ubuntu1_arm64.deb;name=libturbojpeg0-dev"
SRC_URI[libturbojpeg0-dev.md5sum] = "bb86d6cdb51249f99bbf82fe7db9a047"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libj/libjpeg-turbo/libjpeg-turbo8_2.0.3-0ubuntu1_arm64.deb;name=libjpeg-turbo8"
SRC_URI[libjpeg-turbo8.md5sum] = "d9b861903491caa94ff8ea88220b9bf9"

# other configs to feed compilation
PKG_${UPN} = "libjpeg-turbo8"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libjpeg-turbo jpeg"
