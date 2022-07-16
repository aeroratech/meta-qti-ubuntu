inherit upkg_base

LICENSE = "ICU & Unicode-DFS"
LICENSE_libicu-dev = "ICU & Unicode-DFS"
LICENSE_libicu66 = "ICU & Unicode-DFS"
LICENSE_icu-devtools = "ICU & Unicode-DFS"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/i/icu/icu-devtools_66.1-2ubuntu2_arm64.deb;name=icu-devtools"
SRC_URI[icu-devtools.md5sum] = "d60a174ff094fb07821479f5cd2a9941"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/i/icu/libicu66_66.1-2ubuntu2_arm64.deb;name=libicu66"
SRC_URI[libicu66.md5sum] = "2cd9228d607e0bad4caacd0cf8eac86e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/i/icu/libicu-dev_66.1-2ubuntu2_arm64.deb;name=libicu-dev"
SRC_URI[libicu-dev.md5sum] = "c59a1a1e0ebddb4bb18d4ad9513cb15a"

# other configs to feed compilation
PKG_${UPN} = "libicu66"
