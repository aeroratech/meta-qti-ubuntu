inherit upkg_base

LICENSE = "LGPL-2.0 & MIT"
LICENSE_libsoup2.4-1 = "LGPL-2.0 & MIT"
LICENSE_libsoup2.4-dev = "LGPL-2.0 & MIT"
LICENSE_libsoup-gnome2.4-1 = "LGPL-2.0 & MIT"
LICENSE_libsoup-gnome2.4-dev = "LGPL-2.0 & MIT"
LICENSE_gir1.2-soup-2.4 = "LGPL-2.0 & MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsoup2.4/gir1.2-soup-2.4_2.70.0-1_arm64.deb;name=gir1.2-soup-2.4"
SRC_URI[gir1.2-soup-2.4.md5sum] = "7eb52928b3f6de1f6f05ed8e2c9cf124"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsoup2.4/libsoup-gnome2.4-dev_2.70.0-1_arm64.deb;name=libsoup-gnome2.4-dev"
SRC_URI[libsoup-gnome2.4-dev.md5sum] = "c2615fa6d7a7352702a683ae692fec24"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsoup2.4/libsoup-gnome2.4-1_2.70.0-1_arm64.deb;name=libsoup-gnome2.4-1"
SRC_URI[libsoup-gnome2.4-1.md5sum] = "e6e6a446ffb0a0327086fbd563166486"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsoup2.4/libsoup2.4-dev_2.70.0-1_arm64.deb;name=libsoup2.4-dev"
SRC_URI[libsoup2.4-dev.md5sum] = "d398bde6898799e9265cb8a1968b6b6e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libsoup2.4/libsoup2.4-1_2.70.0-1_arm64.deb;name=libsoup2.4-1"
SRC_URI[libsoup2.4-1.md5sum] = "01a40acc1f57f889953d9cf1fc992fa2"

# other configs to feed compilation
PKG_${UPN} = "libsoup2.4-1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc glib-2.0 libxml2 sqlite3 libpsl  gobject-introspection"
PROVIDES += "libsoup-2.4 "
