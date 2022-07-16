inherit upkg_base

LICENSE = "GPL-2.0+ & LGPL-2.0+ & MIT & BSD-2-clause"
LICENSE_gobject-introspection = "GPL-2.0+ & LGPL-2.0+ & MIT & BSD-2-clause"
LICENSE_gir1.2-glib-2.0 = "GPL-2.0+ & LGPL-2.0+ & MIT & BSD-2-clause"
LICENSE_libgirepository-1.0-1 = "GPL-2.0+ & LGPL-2.0+ & MIT & BSD-2-clause"
LICENSE_libgirepository1.0-dev = "GPL-2.0+ & LGPL-2.0+ & MIT & BSD-2-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gobject-introspection/libgirepository1.0-dev_1.64.0-2_arm64.deb;name=libgirepository1.0-dev"
SRC_URI[libgirepository1.0-dev.md5sum] = "272f31c4e4b8558452fb61bfd60d316a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gobject-introspection/libgirepository-1.0-1_1.64.0-2_arm64.deb;name=libgirepository-1.0-1"
SRC_URI[libgirepository-1.0-1.md5sum] = "8e22eb90913d64731d2f7b2e99abd707"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gobject-introspection/gir1.2-glib-2.0_1.64.0-2_arm64.deb;name=gir1.2-glib-2.0"
SRC_URI[gir1.2-glib-2.0.md5sum] = "1aebac356857bda071564eb514e60e66"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gobject-introspection/gobject-introspection_1.64.0-2_arm64.deb;name=gobject-introspection"
SRC_URI[gobject-introspection.md5sum] = "6acf1c7bd8d37f79bf5fe44e6f3eaee2"

# other configs to feed compilation
PKG_${UPN} = "gobject-introspection"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc   libffi zlib glib-2.0 python3 autoconf-archive"
PROVIDES += "gobject-introspection "
