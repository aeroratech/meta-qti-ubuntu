inherit upkg_base

LICENSE = "PD & GPL-2.0+"
LICENSE_sqlite3 = "PD & GPL-2.0+"
LICENSE_libsqlite3-0 = "PD & GPL-2.0+"
LICENSE_libsqlite3-dev = "PD & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/sqlite3/libsqlite3-dev_3.31.1-4_arm64.deb;name=libsqlite3-dev"
SRC_URI[libsqlite3-dev.md5sum] = "bff508af781c6519fdd456ae0b136a43"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/sqlite3/libsqlite3-0_3.31.1-4_arm64.deb;name=libsqlite3-0"
SRC_URI[libsqlite3-0.md5sum] = "5ea92da908a64e04338c77edd691ff59"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/sqlite3/sqlite3_3.31.1-4_arm64.deb;name=sqlite3"
SRC_URI[sqlite3.md5sum] = "4562b243380e3aae3eb5df8014f2220f"

# other configs to feed compilation
PKG_${UPN} = "libsqlite3-0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "sqlite3"
