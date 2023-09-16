inherit upkg_base

LICENSE = "GPL-2.0+"
LICENSE_net-tools = "GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/net-tools/net-tools_1.60+git20180626.aebd88e-1ubuntu1_arm64.deb;name=net-tools"
SRC_URI[net-tools.md5sum] = "40c81ba93bd5b1c7e4e5346e4598af45"

# other configs to feed compilation
PKG_${UPN} = "net-tools"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  libselinux virtual/update-alternatives"
PROVIDES += "net-tools "
