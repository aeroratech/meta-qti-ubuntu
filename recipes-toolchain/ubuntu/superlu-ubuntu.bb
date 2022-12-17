inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libsuperlu5 = "BSD-3-clause"
LICENSE_libsuperlu-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/superlu/libsuperlu-dev_5.2.1+dfsg1-4_arm64.deb;name=libsuperlu-dev"
SRC_URI[libsuperlu-dev.md5sum] = "569eae0cda1f8301da6aa9a5e1a2272e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/superlu/libsuperlu5_5.2.1+dfsg1-4_arm64.deb;name=libsuperlu5"
SRC_URI[libsuperlu5.md5sum] = "5ca7ab740ef4bdea2e81675fb2ef6b8c"

# other configs to feed compilation
PKG_${UPN} = "libsuperlu5"

DEPENDS += "lapack"
