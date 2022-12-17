inherit upkg_base

LICENSE = "BSD-2-Clause"
LICENSE_libsz2 = "BSD-2-Clause"
LICENSE_libaec0 = "BSD-2-Clause"
LICENSE_libaec-dev = "BSD-2-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/liba/libaec/libaec-dev_1.0.4-1_arm64.deb;name=libaec-dev"
SRC_URI[libaec-dev.md5sum] = "0ee36c43c9fc44c32b781730dd9ac5a4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/liba/libaec/libaec0_1.0.4-1_arm64.deb;name=libaec0"
SRC_URI[libaec0.md5sum] = "3d0f9ec9e52ffd9ab4629809434fc321"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/liba/libaec/libsz2_1.0.4-1_arm64.deb;name=libsz2"
SRC_URI[libsz2.md5sum] = "e0150491dc7fe498a6d32f8cb6c19d39"

# other configs to feed compilation
PKG_${UPN} = "libaec0"
