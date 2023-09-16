inherit upkg_base

LICENSE = "PD"
LICENSE_python3-docutils = "PD"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/python-docutils/python3-docutils_0.16+dfsg-2_all.deb;name=python3-docutils"
SRC_URI[python3-docutils.md5sum] = "266f58b6140ab56100d104d756477fa4"

# other configs to feed compilation
PKG_${UPN} = "python3-docutils"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc python3"
PROVIDES += "python3-docutils "
