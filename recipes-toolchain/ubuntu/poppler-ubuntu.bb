inherit upkg_base

LICENSE = "GPL-2 & Apache-2.0"
LICENSE_libpoppler97 = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-cpp-dev = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-cpp0v5 = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-qt5-dev = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-qt5-1 = "GPL-2 & Apache-2.0"
LICENSE_gir1.2-poppler-0.18 = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-glib-dev = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-glib8 = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-private-dev = "GPL-2 & Apache-2.0"
LICENSE_libpoppler-dev = "GPL-2 & Apache-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/libpoppler-dev_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-dev"
SRC_URI[libpoppler-dev.md5sum] = "07ada66b4fdcdf0d2eff8df7a94a0fc2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/libpoppler-private-dev_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-private-dev"
SRC_URI[libpoppler-private-dev.md5sum] = "6a5a28b178296483fbdf4c7981373fc6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/libpoppler-glib8_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-glib8"
SRC_URI[libpoppler-glib8.md5sum] = "48d31eb8df92917a4161851346a6cf83"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/libpoppler-glib-dev_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-glib-dev"
SRC_URI[libpoppler-glib-dev.md5sum] = "47d6dea81b2349f9e7e09c0c796b2dff"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/gir1.2-poppler-0.18_0.86.1-0ubuntu1_arm64.deb;name=gir1.2-poppler-0.18"
SRC_URI[gir1.2-poppler-0.18.md5sum] = "3aa0a312f142d94949413e4ab0885562"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/poppler/libpoppler-qt5-1_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-qt5-1"
SRC_URI[libpoppler-qt5-1.md5sum] = "360187a80fc171c516aa14878c0962e3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/poppler/libpoppler-qt5-dev_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-qt5-dev"
SRC_URI[libpoppler-qt5-dev.md5sum] = "34fd42b2f1185e51937aea0fe5f8005b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/libpoppler-cpp0v5_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-cpp0v5"
SRC_URI[libpoppler-cpp0v5.md5sum] = "555fa9ab3d2146f281a88d05a91da81e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/libpoppler-cpp-dev_0.86.1-0ubuntu1_arm64.deb;name=libpoppler-cpp-dev"
SRC_URI[libpoppler-cpp-dev.md5sum] = "339fdddbb5accbc6ada5c9bf3c5461b3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/poppler/libpoppler97_0.86.1-0ubuntu1_arm64.deb;name=libpoppler97"
SRC_URI[libpoppler97.md5sum] = "578c31a221e7072133917ca90de58a39"

# other configs to feed compilation
PKG_${UPN} = "libpoppler97"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc fontconfig zlib cairo lcms glib-2.0  gobject-introspection jpeg nss openjpeg2 libpng boost tiff"
PROVIDES += "poppler "
