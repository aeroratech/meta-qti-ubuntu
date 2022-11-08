inherit upkg_base

LICENSE = "PD & BSL-1.0"
LICENSE_libcrypto++-utils = "PD & BSL-1.0"
LICENSE_libcrypto++-dev = "PD & BSL-1.0"
LICENSE_libcrypto++6 = "PD & BSL-1.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libc/libcrypto++/libcrypto++6_5.6.4-9build1_arm64.deb;name=libcrypto++6"
SRC_URI[libcrypto++6.md5sum] = "ed2ed53eaf74bc7edf0d146c9dd74440"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libc/libcrypto++/libcrypto++-dev_5.6.4-9build1_arm64.deb;name=libcrypto++-dev"
SRC_URI[libcrypto++-dev.md5sum] = "b4443ee1267965e98f3d526528af7c46"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libc/libcrypto++/libcrypto++-utils_5.6.4-9build1_arm64.deb;name=libcrypto++-utils"
SRC_URI[libcrypto++-utils.md5sum] = "c0ed45472be5e7a8bc282428f6375eae"

# other configs to feed compilation
PKG_${UPN} = "libcrypto++-utils"

DEPENDS += "libgcc"
