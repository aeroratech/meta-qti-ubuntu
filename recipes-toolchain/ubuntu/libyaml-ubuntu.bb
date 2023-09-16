inherit upkg_base

LICENSE = "Expat"
LICENSE_libyaml-0-2 = "Expat"
LICENSE_libyaml-dev = "Expat"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/liby/libyaml/libyaml-dev_0.2.2-1_arm64.deb;name=libyaml-dev"
SRC_URI[libyaml-dev.md5sum] = "8b1fb2376d668ccde61cd73826e84174"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/liby/libyaml/libyaml-0-2_0.2.2-1_arm64.deb;name=libyaml-0-2"
SRC_URI[libyaml-0-2.md5sum] = "92d97ed04d2cdc9ea3e2d34da966bfb2"

# other configs to feed compilation
PKG_${UPN} = "libyaml-0-2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libyaml "
