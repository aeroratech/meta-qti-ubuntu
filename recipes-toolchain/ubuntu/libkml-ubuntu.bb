inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libkml-dev = "BSD-3-Clause"
LICENSE_libkmlxsd1 = "BSD-3-Clause"
LICENSE_libkmlregionator1 = "BSD-3-Clause"
LICENSE_libkmlengine1 = "BSD-3-Clause"
LICENSE_libkmldom1 = "BSD-3-Clause"
LICENSE_libkmlconvenience1 = "BSD-3-Clause"
LICENSE_libkmlbase1 = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libk/libkml/libkmlbase1_1.3.0-8build1_arm64.deb;name=libkmlbase1"
SRC_URI[libkmlbase1.md5sum] = "be050c6a427e739e2e218371bba24443"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libk/libkml/libkmlconvenience1_1.3.0-8build1_arm64.deb;name=libkmlconvenience1"
SRC_URI[libkmlconvenience1.md5sum] = "fbeb1dd8695256545ac1bd225b74efd4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libk/libkml/libkmldom1_1.3.0-8build1_arm64.deb;name=libkmldom1"
SRC_URI[libkmldom1.md5sum] = "a08614cac2f27563a5288e5c7ba36307"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libk/libkml/libkmlengine1_1.3.0-8build1_arm64.deb;name=libkmlengine1"
SRC_URI[libkmlengine1.md5sum] = "e09251bfc0eb7c9286ef07a95f254afa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libk/libkml/libkmlregionator1_1.3.0-8build1_arm64.deb;name=libkmlregionator1"
SRC_URI[libkmlregionator1.md5sum] = "9e247ce856e8348033de232fb9d02300"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libk/libkml/libkmlxsd1_1.3.0-8build1_arm64.deb;name=libkmlxsd1"
SRC_URI[libkmlxsd1.md5sum] = "9d6ea7728a9eb98dc709bc847dc8df30"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libk/libkml/libkml-dev_1.3.0-8build1_arm64.deb;name=libkml-dev"
SRC_URI[libkml-dev.md5sum] = "6a86168371722c2f8068368fd13d2d1e"

# other configs to feed compilation
PKG_${UPN} = "libkml-dev"

DEPENDS += "boost curl expat minizip uriparser"
