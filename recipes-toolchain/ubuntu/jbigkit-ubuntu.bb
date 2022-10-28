inherit upkg_base

LICENSE = "GPL-2+"
LICENSE_libjbig0 = "GPL-2+"
LICENSE_libjbig-dev = "GPL-2+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/j/jbigkit/libjbig-dev_2.1-3.1build1_arm64.deb;name=libjbig-dev"
SRC_URI[libjbig-dev.md5sum] = "23a679ecd2b9e27f509651eef1172c49"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/j/jbigkit/libjbig0_2.1-3.1build1_arm64.deb;name=libjbig0"
SRC_URI[libjbig0.md5sum] = "12e7f85273927967f7b5a2ce0147ee92"

# other configs to feed compilation
PKG_${UPN} = "libjbig0"
