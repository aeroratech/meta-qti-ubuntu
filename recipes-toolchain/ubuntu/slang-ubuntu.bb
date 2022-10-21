inherit upkg_base

LICENSE = "GPL-2+"
LICENSE_libslang2 = "GPL-2+"
LICENSE_libslang2-dev = "GPL-2+"
LICENSE_libslang2-modules = "GPL-2+"



# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/slang2/libslang2-modules_2.3.2-4_arm64.deb;name=libslang2-modules"
SRC_URI[libslang2-modules.md5sum] = "23586aae1c29b3e0929f01a58410a9ff"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/slang2/libslang2-dev_2.3.2-4_arm64.deb;name=libslang2-dev"
SRC_URI[libslang2-dev.md5sum] = "f5612ded623b499fd1cdb965c6ee9e3b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/slang2/libslang2_2.3.2-4_arm64.deb;name=libslang2"
SRC_URI[libslang2.md5sum] = "a2e683bebb84ae0e27b1ae1e78c177d3"

# other configs to feed compilation
PKG_${UPN} = "libslang2"
DEPENDS += "libtool-cross virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc ncurses virtual/libiconv pcre"
PROVIDES += "slang libslang2"

RPROVIDES_slang += "slang libslang2"

