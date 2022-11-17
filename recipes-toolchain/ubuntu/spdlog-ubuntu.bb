inherit upkg_base

LICENSE = "MIT & BSD-2-clause"
LICENSE_libspdlog-dev = "MIT & BSD-2-clause"
LICENSE_libspdlog1 = "MIT & BSD-2-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/spdlog/libspdlog1_1.5.0-1_arm64.deb;name=libspdlog1"
SRC_URI[libspdlog1.md5sum] = "54ba4e06912d57bda3442ac7386d0894"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/s/spdlog/libspdlog-dev_1.5.0-1_arm64.deb;name=libspdlog-dev"
SRC_URI[libspdlog-dev.md5sum] = "b8423627add63a13a93fecce02319337"

# other configs to feed compilation
PKG_${UPN} = "libspdlog1"
