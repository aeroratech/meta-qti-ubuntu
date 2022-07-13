inherit upkg_base

LICENSE = "LGPL-2.1 | MPL-1.1 & BSD-2-clause"
LICENSE_libtag1-dev = "LGPL-2.1 | MPL-1.1 & BSD-2-clause"
LICENSE_libtag1v5 = "LGPL-2.1 | MPL-1.1 & BSD-2-clause"
LICENSE_libtag1v5-vanilla = "LGPL-2.1 | MPL-1.1 & BSD-2-clause"
LICENSE_libtagc0 = "LGPL-2.1 | MPL-1.1 & BSD-2-clause"
LICENSE_libtagc0-dev = "LGPL-2.1 | MPL-1.1 & BSD-2-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/taglib/libtagc0-dev_1.11.1+dfsg.1-0.3ubuntu2_arm64.deb;name=libtagc0-dev"
SRC_URI[libtagc0-dev.md5sum] = "8b1b07233c65185a5b403aa2f063d412"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/taglib/libtagc0_1.11.1+dfsg.1-0.3ubuntu2_arm64.deb;name=libtagc0"
SRC_URI[libtagc0.md5sum] = "c5b13ce0bb7a26d211f494461658c9b4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/taglib/libtag1v5-vanilla_1.11.1+dfsg.1-0.3ubuntu2_arm64.deb;name=libtag1v5-vanilla"
SRC_URI[libtag1v5-vanilla.md5sum] = "8a08f5f77aa4538bef67f06e24831b8c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/taglib/libtag1v5_1.11.1+dfsg.1-0.3ubuntu2_arm64.deb;name=libtag1v5"
SRC_URI[libtag1v5.md5sum] = "8c65ed75fda9e03f25e0887bdd960796"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/taglib/libtag1-dev_1.11.1+dfsg.1-0.3ubuntu2_arm64.deb;name=libtag1-dev"
SRC_URI[libtag1-dev.md5sum] = "c56993b15b001672498f4d89665e904e"

# other configs to feed compilation
PKG_${UPN} = "libtag1v5"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc zlib"
PROVIDES += "taglib "
