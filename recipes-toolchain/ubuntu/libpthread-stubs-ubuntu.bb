inherit upkg_base

LICENSE = "MIT"
LICENSE_libpthread-stubs0-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpthread-stubs/libpthread-stubs0-dev_0.4-1_arm64.deb;name=libpthread-stubs0-dev"
SRC_URI[libpthread-stubs0-dev.md5sum] = "93dbd5c581ed753f34c2cc84253d3069"

# other configs to feed compilation
PKG_${UPN} = "libpthread-stubs0-dev"
