inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libbsd0 = "BSD-3-clause"
LICENSE_libbsd-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libb/libbsd/libbsd-dev_0.10.0-1_arm64.deb;name=libbsd-dev"
SRC_URI[libbsd-dev.md5sum] = "365a3e633ecc4982d053a27cf55c34fb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libb/libbsd/libbsd0_0.10.0-1_arm64.deb;name=libbsd0"
SRC_URI[libbsd0.md5sum] = "3603623835c0493328a1e5efaaa8dfbc"

# other configs to feed compilation
PKG_${UPN} = "libbsd0"
