inherit upkg_base

LICENSE = "MIT"
LICENSE_libpixman-1-0 = "MIT"
LICENSE_libpixman-1-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pixman/libpixman-1-dev_0.38.4-0ubuntu1_arm64.deb;name=libpixman-1-dev"
SRC_URI[libpixman-1-dev.md5sum] = "543c8e0b21f40a26a8d9c18a87649605"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pixman/libpixman-1-0_0.38.4-0ubuntu1_arm64.deb;name=libpixman-1-0"
SRC_URI[libpixman-1-0.md5sum] = "e1809b7a8649aa876920a5a803ba48a4"

# other configs to feed compilation
PKG_${UPN} = "libpixman-1-0"

#PV = "0"
#PR = "0"

DEPENDS += "virtual/libc"
