inherit upkg_base

LICENSE = "MIT"
LICENSE_libxslt1-dev = "MIT"
LICENSE_libxslt1.1 = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxslt/libxslt1-dev_1.1.34-4_arm64.deb;name=libxslt1-dev"
SRC_URI[libxslt1-dev.md5sum] = "64082d822d5c2e6f7562f282e89ef711"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxslt/libxslt1.1_1.1.34-4_arm64.deb;name=libxslt1.1"
SRC_URI[libxslt1.1.md5sum] = "667b889cffa87ae53bb5044e57302478"

# other configs to feed compilation
PKG_${UPN} = "libxslt1.1"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libxml2"
PROVIDES += "libxslt "
