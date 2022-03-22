inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libcap-ng0 = "LGPL-2.1+"
LICENSE_libcap-ng-dev = "LGPL-2.1+"
LICENSE_python3-cap-ng = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libc/libcap-ng/python3-cap-ng_0.7.9-2.1build1_arm64.deb;name=python3-cap-ng"
SRC_URI[python3-cap-ng.md5sum] = "e09cbf81b114ab180b6ddeb528b7c5f9"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libc/libcap-ng/libcap-ng-dev_0.7.9-2.1build1_arm64.deb;name=libcap-ng-dev"
SRC_URI[libcap-ng-dev.md5sum] = "fb5fc3f68526aa437c77f27737680853"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libc/libcap-ng/libcap-ng0_0.7.9-2.1build1_arm64.deb;name=libcap-ng0"
SRC_URI[libcap-ng0.md5sum] = "faeb3e0ffdd91f467951824e743096ae"

# other configs to feed compilation
PKG_${UPN} = "libcap-ng0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libcap-ng "
