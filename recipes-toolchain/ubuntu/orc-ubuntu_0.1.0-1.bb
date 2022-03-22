inherit upkg_base

LICENSE = "BSD-3-Clause & BSD-2-clause"
LICENSE_liborc-0.4-0 = "BSD-3-Clause & BSD-2-clause"
LICENSE_liborc-0.4-dev = "BSD-3-Clause & BSD-2-clause"
LICENSE_liborc-0.4-dev-bin = "BSD-3-Clause & BSD-2-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/orc/liborc-0.4-dev-bin_0.4.31-1_arm64.deb;name=liborc-0.4-dev-bin"
SRC_URI[liborc-0.4-dev-bin.md5sum] = "08a2197a35f0de61cdef9cc304eca557"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/orc/liborc-0.4-dev_0.4.31-1_arm64.deb;name=liborc-0.4-dev"
SRC_URI[liborc-0.4-dev.md5sum] = "9f5529686be131aa4ef9743196e55053"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/orc/liborc-0.4-0_0.4.31-1_arm64.deb;name=liborc-0.4-0"
SRC_URI[liborc-0.4-0.md5sum] = "e1e63efe934c27e54f9be666a1640fe9"

# other configs to feed compilation
PKG_${UPN} = "liborc-0.4-0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "orc "
