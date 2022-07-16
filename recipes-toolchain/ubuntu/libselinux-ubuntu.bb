inherit upkg_base

LICENSE = "PD & GPL-2.0 & LGPL-2.1+"
LICENSE_libselinux1 = "PD & GPL-2.0 & LGPL-2.1+"
LICENSE_libselinux1-dev = "PD & GPL-2.0 & LGPL-2.1+"
LICENSE_python3-selinux = "PD & GPL-2.0 & LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libs/libselinux/python3-selinux_3.0-1build2_arm64.deb;name=python3-selinux"
SRC_URI[python3-selinux.md5sum] = "d9ac21dd9820d74bcaaeb59a1d2a33fc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libselinux/libselinux1-dev_3.0-1build2_arm64.deb;name=libselinux1-dev"
SRC_URI[libselinux1-dev.md5sum] = "61d70f703fe050ddb1ceb48700ad9070"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libselinux/libselinux1_3.0-1build2_arm64.deb;name=libselinux1"
SRC_URI[libselinux1.md5sum] = "27f6b805e67028b00a012663edfa198f"

# other configs to feed compilation
PKG_${UPN} = "libselinux1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  libsepol libpcre libpcre2"
PROVIDES += "libselinux "
