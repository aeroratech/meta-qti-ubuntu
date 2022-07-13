inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libfribidi-bin = "LGPL-2.1+"
LICENSE_libfribidi-dev = "LGPL-2.1+"
LICENSE_libfribidi0 = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/fribidi/libfribidi0_1.0.8-2_arm64.deb;name=libfribidi0"
SRC_URI[libfribidi0.md5sum] = "b6c2ca1ebaae9fb089eb7b59e264efbc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/fribidi/libfribidi-dev_1.0.8-2_arm64.deb;name=libfribidi-dev"
SRC_URI[libfribidi-dev.md5sum] = "134d3d2dfe45e60215541f024f31cde6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/fribidi/libfribidi-bin_1.0.8-2_arm64.deb;name=libfribidi-bin"
SRC_URI[libfribidi-bin.md5sum] = "5b604668c94016ccb47d2ea49763c71c"

# other configs to feed compilation
PKG_${UPN} = "libfribidi0"

DEPENDS += "virtual/libc"
