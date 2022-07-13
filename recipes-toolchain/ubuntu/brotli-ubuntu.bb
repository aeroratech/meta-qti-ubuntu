inherit upkg_base

LICENSE = "MIT"
LICENSE_libbrotli1 = "MIT"
LICENSE_python3-brotli = "MIT"
LICENSE_libbrotli-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/brotli/libbrotli-dev_1.0.7-6build1_arm64.deb;name=libbrotli-dev"
SRC_URI[libbrotli-dev.md5sum] = "4d31e324eeef221a43331e9cef39af24"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/brotli/python3-brotli_1.0.7-6build1_arm64.deb;name=python3-brotli"
SRC_URI[python3-brotli.md5sum] = "d7325be70c487b80c81bd39c85c6a284"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/brotli/libbrotli1_1.0.7-6build1_arm64.deb;name=libbrotli1"
SRC_URI[libbrotli1.md5sum] = "e81c40f3ce55f8a97d1e3a92954eb2cb"

# other configs to feed compilation
PKG_${UPN} = "libbrotli1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "brotli "
