inherit upkg_base

LICENSE = "LGPL-2.1+ | MPL-1.1 | GPL-2.0+"
LICENSE_libgraphite2-dev = "LGPL-2.1+ | MPL-1.1 | GPL-2.0+"
LICENSE_libgraphite2-3 = "LGPL-2.1+ | MPL-1.1 | GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/graphite2/libgraphite2-3_1.3.13-11build1_arm64.deb;name=libgraphite2-3"
SRC_URI[libgraphite2-3.md5sum] = "3bb6331fdcffdd560d8e9940705aef68"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/graphite2/libgraphite2-dev_1.3.13-11build1_arm64.deb;name=libgraphite2-dev"
SRC_URI[libgraphite2-dev.md5sum] = "d3fc4e78cb7ae10ebcae86f472e2c125"

# other configs to feed compilation
PKG_${UPN} = "libgraphite2-3"

DEPENDS += "virtual/libc"
