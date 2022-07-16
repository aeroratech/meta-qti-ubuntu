inherit upkg_base

LICENSE = "MIT-Style & ISC"
LICENSE_python3-libxml2 = "MIT-Style & ISC"
LICENSE_python-libxml2 = "MIT-Style & ISC"
LICENSE_libxml2-dev = "MIT-Style & ISC"
LICENSE_libxml2-utils = "MIT-Style & ISC"
LICENSE_libxml2 = "MIT-Style & ISC"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxml2/python3-libxml2_2.9.10+dfsg-5_arm64.deb;name=python3-libxml2"
SRC_URI[python3-libxml2.md5sum] = "733069ad5a3ee418d080fbb4cd05e72e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libx/libxml2/python-libxml2_2.9.10+dfsg-5_arm64.deb;name=python-libxml2"
SRC_URI[python-libxml2.md5sum] = "3edc549af1933740908ff015d17bfce7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxml2/libxml2-dev_2.9.10+dfsg-5_arm64.deb;name=libxml2-dev"
SRC_URI[libxml2-dev.md5sum] = "732d52953a1d846919bdbf1330e58ed3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxml2/libxml2-utils_2.9.10+dfsg-5_arm64.deb;name=libxml2-utils"
SRC_URI[libxml2-utils.md5sum] = "e3a22a30205ed3e086617c18cc227906"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxml2/libxml2_2.9.10+dfsg-5_arm64.deb;name=libxml2"
SRC_URI[libxml2.md5sum] = "ba30849b81596b430b9fc4b73d8b1820"

# other configs to feed compilation
PKG_${UPN} = "libxml2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc zlib virtual/libiconv  python3 python3 icu"
PROVIDES += "libxml2 "
