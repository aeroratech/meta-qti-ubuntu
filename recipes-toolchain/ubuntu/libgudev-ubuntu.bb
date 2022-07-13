inherit upkg_base

LICENSE = "LGPL-2.0+"
LICENSE_libgudev-1.0-0 = "LGPL-2.0+"
LICENSE_gir1.2-gudev-1.0 = "LGPL-2.0+"
LICENSE_libgudev-1.0-dev = "LGPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libg/libgudev/libgudev-1.0-dev_233-1_arm64.deb;name=libgudev-1.0-dev"
SRC_URI[libgudev-1.0-dev.md5sum] = "33d2ccde828ef425ace76ada722c8339"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libg/libgudev/gir1.2-gudev-1.0_233-1_arm64.deb;name=gir1.2-gudev-1.0"
SRC_URI[gir1.2-gudev-1.0.md5sum] = "dff971ebadf577a36426f171518a57e7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libg/libgudev/libgudev-1.0-0_233-1_arm64.deb;name=libgudev-1.0-0"
SRC_URI[libgudev-1.0-0.md5sum] = "696ef38cb44a3a0987243915ccd8f1fd"

# other configs to feed compilation
PKG_${UPN} = "libgudev-1.0-0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc glib-2.0 udev  gobject-introspection"
PROVIDES += "libgudev "
