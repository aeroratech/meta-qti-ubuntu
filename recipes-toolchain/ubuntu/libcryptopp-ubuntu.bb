inherit upkg_base

LICENSE = "BSL-1.0 & PD"
LICENSE_libcrypto++6 = "BSL-1.0 & PD"
LICENSE_libcrypto++-dev = "BSL-1.0 & PD"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libc/libcrypto++/libcrypto++-dev_5.6.4-9build1_arm64.deb;name=libcrypto++-dev"
SRC_URI[libcrypto++-dev.md5sum] = "b4443ee1267965e98f3d526528af7c46"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libc/libcrypto++/libcrypto++6_5.6.4-9build1_arm64.deb;name=libcrypto++6"
SRC_URI[libcrypto++6.md5sum] = "ed2ed53eaf74bc7edf0d146c9dd74440"

# other configs to feed compilation
PKG_${UPN} = "libcrypto++6"
DEPENDS += ""
PROVIDES += ""
