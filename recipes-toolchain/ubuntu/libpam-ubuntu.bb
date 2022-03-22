inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libpam0g = "BSD-3-Clause"
LICENSE_libpam-modules = "BSD-3-Clause"
LICENSE_libpam0g-dev = "BSD-3-Clause"
LICENSE_libpam-cracklib = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pam/libpam-cracklib_1.3.1-5ubuntu4_arm64.deb;name=libpam-cracklib"
SRC_URI[libpam-cracklib.md5sum] = "46547178d6699700bbcb8ad70c77633b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pam/libpam0g-dev_1.3.1-5ubuntu4_arm64.deb;name=libpam0g-dev"
SRC_URI[libpam0g-dev.md5sum] = "f4366724853ca5c579d7c7d940875126"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pam/libpam-modules_1.3.1-5ubuntu4_arm64.deb;name=libpam-modules"
SRC_URI[libpam-modules.md5sum] = "d4c0e23c9a343076e0693b9220e30e81"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pam/libpam0g_1.3.1-5ubuntu4_arm64.deb;name=libpam0g"
SRC_URI[libpam0g.md5sum] = "06a030983fe87f9e38ed250d05495a0c"

# other configs to feed compilation
PKG_${UPN} = "libpam0g"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc audit "
#DEPENDS += "flex cracklib virtual/crypt libselinux"
PROVIDES += "libpam "

do_install_append(){

cp ${D}/usr/include/security/* ${D}/usr/include/ -rf
}
