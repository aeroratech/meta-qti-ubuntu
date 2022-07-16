inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxau-dev = "MIT-Style"
LICENSE_libxau6 = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxau/libxau6_1.0.9-0ubuntu1_arm64.deb;name=libxau6"
SRC_URI[libxau6.md5sum] = "778330b2b0b397dd782751e54288304a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxau/libxau-dev_1.0.9-0ubuntu1_arm64.deb;name=libxau-dev"
SRC_URI[libxau-dev.md5sum] = "289b8a8490eb702dafc76a96fadd0c5d"

# other configs to feed compilation
PKG_${UPN} = "libxau6"

DEPENDS += "xorgproto virtual/libc"
