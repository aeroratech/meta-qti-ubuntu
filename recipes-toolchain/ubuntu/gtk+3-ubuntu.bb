inherit upkg_base

LICENSE = "LGPL-2+"
LICENSE_libgail-3-dev = "LGPL-2+"
LICENSE_libgail-3-0 = "LGPL-2+"
LICENSE_gir1.2-gtk-3.0 = "LGPL-2+"
LICENSE_libgtk-3-doc = "LGPL-2+"
LICENSE_libgtk-3-dev = "LGPL-2+"
LICENSE_libgtk-3-bin = "LGPL-2+"
LICENSE_libgtk-3-common = "LGPL-2+"
LICENSE_libgtk-3-0 = "LGPL-2+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/libgtk-3-0_3.24.18-1ubuntu1_arm64.deb;name=libgtk-3-0"
SRC_URI[libgtk-3-0.md5sum] = "ec36ca5f170085a8e5b3406c19baa91a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/libgtk-3-common_3.24.18-1ubuntu1_all.deb;name=libgtk-3-common"
SRC_URI[libgtk-3-common.md5sum] = "76055c16b35bfb8fd28517bd85021397"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/libgtk-3-bin_3.24.18-1ubuntu1_arm64.deb;name=libgtk-3-bin"
SRC_URI[libgtk-3-bin.md5sum] = "170530f7235eec325f3a3952f892a184"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/libgtk-3-dev_3.24.18-1ubuntu1_arm64.deb;name=libgtk-3-dev"
SRC_URI[libgtk-3-dev.md5sum] = "a7d9c9883d80db5b75f9491db65524ca"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/libgtk-3-doc_3.24.18-1ubuntu1_all.deb;name=libgtk-3-doc"
SRC_URI[libgtk-3-doc.md5sum] = "ebb21e28c81be85ad45ff23053636e85"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/gir1.2-gtk-3.0_3.24.18-1ubuntu1_arm64.deb;name=gir1.2-gtk-3.0"
SRC_URI[gir1.2-gtk-3.0.md5sum] = "2bfb56483c4f6e1b93469f0878cccce8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/libgail-3-0_3.24.18-1ubuntu1_arm64.deb;name=libgail-3-0"
SRC_URI[libgail-3-0.md5sum] = "bba733e7d8e59527d3ef483814868372"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gtk+3.0/libgail-3-dev_3.24.18-1ubuntu1_arm64.deb;name=libgail-3-dev"
SRC_URI[libgail-3-dev.md5sum] = "de47bd6a22c052f2af24f6ad2c21b995"

# other configs to feed compilation
PKG_${UPN} = "libgtk-3-0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc glib-2.0 libxi libxfixes at-spi2-atk cairo pango atk jpeg libpng gdk-pixbuf             gobject-introspection libepoxy wayland wayland-protocols libxkbcommon virtual/egl virtual/libgles2"
PROVIDES += "gtk+3  gtk-icon-utils"
