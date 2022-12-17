inherit upkg_base

LICENSE = "GPL-3+ or LGPL-3+"
LICENSE_libepsilon1 = "GPL-3+ or LGPL-3+"
LICENSE_libepsilon-dev = "GPL-3+ or LGPL-3+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libe/libepsilon/libepsilon-dev_0.9.2+dfsg-4_arm64.deb;name=libepsilon-dev"
SRC_URI[libepsilon-dev.md5sum] = "ecd59dfa5c31083566a5f23343bb351c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libe/libepsilon/libepsilon1_0.9.2+dfsg-4_arm64.deb;name=libepsilon1"
SRC_URI[libepsilon1.md5sum] = "1f8888a5242856564c660e3478402e6a"

# other configs to feed compilation
PKG_${UPN} = "libepsilon1"

DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
