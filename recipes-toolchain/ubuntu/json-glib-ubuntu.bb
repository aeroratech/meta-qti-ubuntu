inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libjson-glib-1.0-0 = "LGPL-2.1+"
LICENSE_libjson-glib-dev = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/j/json-glib/libjson-glib-dev_1.4.4-2ubuntu2_arm64.deb;name=libjson-glib-dev"
SRC_URI[libjson-glib-dev.md5sum] = "226aff0abae51ac99c41c9f5ec181085"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/j/json-glib/libjson-glib-1.0-0_1.4.4-2ubuntu2_arm64.deb;name=libjson-glib-1.0-0"
SRC_URI[libjson-glib-1.0-0.md5sum] = "4966bce93fb949f72c1be7950e179e20"

# other configs to feed compilation
PKG_${UPN} = "libjson-glib-1.0-0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc glib-2.0  gobject-introspection"
PROVIDES += "json-glib "
