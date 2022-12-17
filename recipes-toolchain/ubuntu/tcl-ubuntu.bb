inherit upkg_base

LICENSE = "TCL/TK & BSD-4-Clause"
LICENSE_libtcl8.6 = "TCL/TK & BSD-4-Clause"
LICENSE_tcl8.6-dev = "TCL/TK & BSD-4-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tcl8.6/tcl8.6-dev_8.6.10+dfsg-1_arm64.deb;name=tcl8.6-dev"
SRC_URI[tcl8.6-dev.md5sum] = "dcee1eb7d4f79eb75a87a19f37609a87"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tcl8.6/libtcl8.6_8.6.10+dfsg-1_arm64.deb;name=libtcl8.6"
SRC_URI[libtcl8.6.md5sum] = "5a51089b989e8e658ebb131ff1eee526"

# other configs to feed compilation
PKG_${UPN} = "libtcl8.6"
DEPENDS += "zlib"
