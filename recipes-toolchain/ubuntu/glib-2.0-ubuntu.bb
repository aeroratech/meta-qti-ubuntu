LICENSE = "LGPL-2.0+ & MIT & GPL-2.0+"
LICENSE_libglib2.0 = "LGPL-2.0+ & MIT & GPL-2.0+"
LICENSE_libglib2.0-dev = "LGPL-2.0+ & MIT & GPL-2.0+"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/glib2.0/libglib2.0-0_2.64.2-1~fakesync1_arm64.deb;name=libglib2.0 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/g/glib2.0/libglib2.0-dev_2.64.2-1~fakesync1_arm64.deb;name=libglib2.0-dev"

SRC_URI[libglib2.0.md5sum] = "1e2d55c0d8a07a22b92c99c3a86cec13"
SRC_URI[libglib2.0-dev.md5sum] = "01d216bbd4cf8a16ac5ab0df5fd9a8b7"

# other configs to feed compilation
PKG_${UPN} = "libglib2.0-0"
PACKAGES += "${UPN}-codegen ${UPN}-utils"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc virtual/libintl virtual/libiconv libffi zlib bash-completion util-linux libselinux libpcre"


do_install() {
    cp -r ${DEBOUT}/* ${D}/
    rm -rf ${D}/${libdir}/${UBUN_TARGET_SYS}/*
    cp -r ${DEBOUT}${libdir}/${UBUN_TARGET_SYS}/* ${D}${libdir}/
    cp -r ${DEBOUT}${libdir}/${UBUN_TARGET_SYS}/glib-2.0/include/*.h ${D}${includedir}
}
