LICENSE = "BSD-variant"
LICENSE_libbz2-dev = "BSD-variant"
LICENSE_libbz2 = "BSD-variant"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/bzip2/libbz2-dev_1.0.8-2_arm64.deb;name=libbz2-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/b/bzip2/libbz2-1.0_1.0.8-2_arm64.deb;name=libbz2"

SRC_URI[libbz2-dev.md5sum] = "239228b4f3ce6b3f6d929445df491380"
SRC_URI[libbz2.md5sum] = "b264cacc4783b91a49c929abf9a997e6"

# other configs to feed compilation
PKG_${UPN} = "libbz2"
