inherit upkg_base

LICENSE = "Qhull & GPL-3.0+"
LICENSE_libqhull7 = "Qhull & GPL-3.0+"
LICENSE_libqhull-dev = "Qhull & GPL-3.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/q/qhull/libqhull-dev_2015.2-4_arm64.deb;name=libqhull-dev"
SRC_URI[libqhull-dev.md5sum] = "86ec54c06cf9121e2d9e205aafc1672e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/q/qhull/libqhull7_2015.2-4_arm64.deb;name=libqhull7"
SRC_URI[libqhull7.md5sum] = "16c6edd259c3785c1765c763a99e9b68"

# other configs to feed compilation
PKG_${UPN} = "libqhull7"
DEPENDS += ""
PROVIDES += ""
