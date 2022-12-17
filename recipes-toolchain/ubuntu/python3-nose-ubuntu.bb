inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_python3-nose = "BSD-3-Clause"
LICENSE_python-nose = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/n/nose/python-nose_1.3.7-5_all.deb;name=python-nose"
SRC_URI[python-nose.md5sum] = "cf4eab99af834f6084ac6a75fbf838e2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/n/nose/python3-nose_1.3.7-5_all.deb;name=python3-nose"
SRC_URI[python3-nose.md5sum] = "5088c03a3f046acafc23189077af64ba"

# other configs to feed compilation
PKG_${UPN} = "python3-nose"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  python3  python3"
PROVIDES += "python3-nose "
