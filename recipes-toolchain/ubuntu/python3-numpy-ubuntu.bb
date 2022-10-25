inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_python3-numpy = "BSD-3-Clause"
LICENSE_python-numpy = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/python-numpy/python-numpy_1.16.5-2ubuntu7_arm64.deb;name=python-numpy"
SRC_URI[python-numpy.md5sum] = "0345a612e8e7ffcb80bb04a7a439f967"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/numpy/python3-numpy_1.17.4-5ubuntu3_arm64.deb;name=python3-numpy"
SRC_URI[python3-numpy.md5sum] = "4230382094222fe5454fdd92ac3b6fa4"

# other configs to feed compilation
PKG_${UPN} = "python3-numpy"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  python3  python3"
PROVIDES += "python3-numpy "
