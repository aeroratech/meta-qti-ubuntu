inherit upkg_base

LICENSE = "MPL-2.0"
LICENSE_libnspr4 = "MPL-2.0"
LICENSE_libnspr4-dev = "MPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nspr/libnspr4-dev_4.25-1_arm64.deb;name=libnspr4-dev"
SRC_URI[libnspr4-dev.md5sum] = "7a5ae6a561e72cd0c0a9d5bde17c17c4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nspr/libnspr4_4.25-1_arm64.deb;name=libnspr4"
SRC_URI[libnspr4.md5sum] = "ab0c15985c00647a32f3e0b876ac2780"

# other configs to feed compilation
PKG_${UPN} = "libnspr4"
