inherit upkg_base

LICENSE = "GPL-V2"
LICENSE_libatk1.0-0 = "GPL-V2"
LICENSE_gir1.2-atk-1.0 = "GPL-V2"
LICENSE_libatk1.0-dev = "GPL-V2"
LICENSE_libatk1.0-data = "GPL-V2"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/atk1.0/libatk1.0-data_2.35.1-1ubuntu2_all.deb;name=libatk1.0-data"
SRC_URI[libatk1.0-data.md5sum] = "7d9ff258e9a5251f19056525168a5acb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/atk1.0/libatk1.0-dev_2.35.1-1ubuntu2_arm64.deb;name=libatk1.0-dev"
SRC_URI[libatk1.0-dev.md5sum] = "21801f3328a31a4a874801188516cf3f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/atk1.0/gir1.2-atk-1.0_2.35.1-1ubuntu2_arm64.deb;name=gir1.2-atk-1.0"
SRC_URI[gir1.2-atk-1.0.md5sum] = "f30cbee132005ad6cac8328565a765ab"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/atk1.0/libatk1.0-0_2.35.1-1ubuntu2_arm64.deb;name=libatk1.0-0"
SRC_URI[libatk1.0-0.md5sum] = "e9e0a20d14b405876ac5244478fca123"

# other configs to feed compilation
PKG_${UPN} = "libatk1.0-0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc glib-2.0  gobject-introspection"
PROVIDES += "atk "
