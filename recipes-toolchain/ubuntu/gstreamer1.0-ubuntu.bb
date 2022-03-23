inherit upkg_base

LICENSE = "LGPL-2.0+ & LGPL-2.1+ & GPL-2.0+ & GPL-3.0+"
LICENSE_libgstreamer1.0-0 = "LGPL-2.0+ & LGPL-2.1+ & GPL-2.0+ & GPL-3.0+"
LICENSE_gstreamer1.0-tools = "LGPL-2.0+ & LGPL-2.1+ & GPL-2.0+ & GPL-3.0+"
LICENSE_gir1.2-gstreamer-1.0 = "LGPL-2.0+ & LGPL-2.1+ & GPL-2.0+ & GPL-3.0+"
LICENSE_libgstreamer1.0-dev = "LGPL-2.0+ & LGPL-2.1+ & GPL-2.0+ & GPL-3.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gstreamer1.0/libgstreamer1.0-dev_1.16.2-2_arm64.deb;name=libgstreamer1.0-dev"
SRC_URI[libgstreamer1.0-dev.md5sum] = "7e692e6cc6b47e199a58884b63b5a3b9"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gstreamer1.0/gir1.2-gstreamer-1.0_1.16.2-2_arm64.deb;name=gir1.2-gstreamer-1.0"
SRC_URI[gir1.2-gstreamer-1.0.md5sum] = "ade9a487816fca097685d7a9e894c281"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gstreamer1.0/gstreamer1.0-tools_1.16.2-2_arm64.deb;name=gstreamer1.0-tools"
SRC_URI[gstreamer1.0-tools.md5sum] = "08e4f9e236679d1667e8b35c8089ffa0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gstreamer1.0/libgstreamer1.0-0_1.16.2-2_arm64.deb;name=libgstreamer1.0-0"
SRC_URI[libgstreamer1.0-0.md5sum] = "35b6db3329422082c41f91981d9294b6"

# other configs to feed compilation
PKG_${UPN} = "libgstreamer1.0-0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/libc glib-2.0 libxml2  gobject-introspection"
PROVIDES += "gstreamer1.0 "
