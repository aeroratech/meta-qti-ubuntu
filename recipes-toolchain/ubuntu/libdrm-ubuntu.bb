inherit upkg_base

LICENSE = "MIT"
LICENSE_libdrm2 = "MIT"
LICENSE_libdrm-freedreno1 = "MIT"
LICENSE_libdrm-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdrm/libdrm-dev_2.4.101-2_arm64.deb;name=libdrm-dev"
SRC_URI[libdrm-dev.md5sum] = "2518de48c591e1dff12aba5ce6e6f74f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdrm/libdrm-freedreno1_2.4.101-2_arm64.deb;name=libdrm-freedreno1"
SRC_URI[libdrm-freedreno1.md5sum] = "d778dd2c5c7f7928845a6bed2b45e9df"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdrm/libdrm2_2.4.101-2_arm64.deb;name=libdrm2"
SRC_URI[libdrm2.md5sum] = "4f0fc724eae7f8c65a77d5364795a188"

# other configs to feed compilation
PKG_${UPN} = "libdrm2"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libpthread-stubs "
PROVIDES += "libdrm drm"
