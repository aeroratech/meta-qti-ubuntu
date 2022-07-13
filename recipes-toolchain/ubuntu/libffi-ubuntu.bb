inherit upkg_base

LICENSE = "MIT & GPL-2.0+"
LICENSE_libffi7 = "MIT & GPL-2.0+"
LICENSE_libffi-dev = "MIT & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libf/libffi/libffi-dev_3.3-4_arm64.deb;name=libffi-dev"
SRC_URI[libffi-dev.md5sum] = "d0e053bdfdaa35c8a2cd61cb2cd66ffa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libf/libffi/libffi7_3.3-4_arm64.deb;name=libffi7"
SRC_URI[libffi7.md5sum] = "eae849d100aadd84a3ebee069b63acda"

# other configs to feed compilation
PKG_${UPN} = "libffi7"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "libffi "

do_install_append() {

cp -rf ${D}/usr/include/${UBUN_TARGET_SYS}/ffi*.h ${D}${includedir}
mv -f ${D}/usr/lib/${UBUN_TARGET_SYS}/* ${D}/usr/lib/

}
