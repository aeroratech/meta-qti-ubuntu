inherit upkg_base

LICENSE = "LGPL-2.0+"
LICENSE_librsvg2-2 = "LGPL-2.0+"
LICENSE_librsvg2-common = "LGPL-2.0+"
LICENSE_librsvg2-dev = "LGPL-2.0+"
LICENSE_gir1.2-rsvg-2.0 = "LGPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libr/librsvg/gir1.2-rsvg-2.0_2.48.2-1_arm64.deb;name=gir1.2-rsvg-2.0"
SRC_URI[gir1.2-rsvg-2.0.md5sum] = "52efc68a8b9ebb6ba8a9ca5e3edbf07e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libr/librsvg/librsvg2-dev_2.48.2-1_arm64.deb;name=librsvg2-dev"
SRC_URI[librsvg2-dev.md5sum] = "2195a938720ca8e9e2bef0c498ca26b0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libr/librsvg/librsvg2-common_2.48.2-1_arm64.deb;name=librsvg2-common"
SRC_URI[librsvg2-common.md5sum] = "8ff9b89125f74ccfcbbe5142a2a8be12"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libr/librsvg/librsvg2-2_2.48.2-1_arm64.deb;name=librsvg2-2"
SRC_URI[librsvg2-2.md5sum] = "31006729e4f9e5a7b104a91110c65583"

# other configs to feed compilation
PKG_${UPN} = "librsvg2-2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc cairo gdk-pixbuf glib-2.0 libcroco libxml2 pango  gobject-introspection"
PROVIDES += "librsvg "
