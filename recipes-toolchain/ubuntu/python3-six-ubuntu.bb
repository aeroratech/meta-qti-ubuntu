inherit upkg_base

LICENSE = "Expat"
LICENSE_python3-six = "Expat"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/six/python3-six_1.14.0-2_all.deb;name=python3-six"
SRC_URI[python3-six.md5sum] = "8ee0a191e55fab94f431f79d531143b1"

# other configs to feed compilation
PKG_${UPN} = "python3-six"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  python3 "
PROVIDES += "python3-six "
