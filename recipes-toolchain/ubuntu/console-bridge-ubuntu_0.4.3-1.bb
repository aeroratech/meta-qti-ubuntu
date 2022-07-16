inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libconsole-bridge0.4 = "BSD-3-Clause"
LICENSE_libconsole-bridge-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/c/console-bridge/libconsole-bridge-dev_0.4.4+dfsg-1build1_arm64.deb;name=libconsole-bridge-dev"
SRC_URI[libconsole-bridge-dev.md5sum] = "457231419968dde5e43fb65841458588"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/c/console-bridge/libconsole-bridge0.4_0.4.4+dfsg-1build1_arm64.deb;name=libconsole-bridge0.4"
SRC_URI[libconsole-bridge0.4.md5sum] = "1536fd5e0cbcbe916b48290a9b7506a0"

# other configs to feed compilation
PKG_${UPN} = "libconsole-bridge0.4"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "

#DEPENDS += "boost"
PROVIDES += "console-bridge "
