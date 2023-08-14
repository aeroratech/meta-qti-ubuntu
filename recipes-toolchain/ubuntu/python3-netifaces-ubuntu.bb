inherit upkg_base

LICENSE = "MIT-style"
LICENSE_python3-netifaces = "MIT-style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/netifaces/python3-netifaces_0.10.4-1ubuntu4_arm64.deb;name=python3-netifaces"
SRC_URI[python3-netifaces.md5sum] = "e9169673996e5b8320dd18871e459dcf"

# other configs to feed compilation
PKG_${UPN} = "python3-netifaces"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  python3  python3"
PROVIDES += "python3-netifaces "
