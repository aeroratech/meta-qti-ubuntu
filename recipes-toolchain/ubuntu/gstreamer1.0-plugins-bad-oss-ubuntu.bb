inherit upkg_base

LICENSE = "LGPL-2.0+ & MIT & BSD & GPL-2.0+ & MPL-1.1 & GPL-3.0+ & LGPL-2.1+"
LICENSE_libgstreamer-plugins-bad1.0-dev = "LGPL-2.0+ & MIT & BSD & GPL-2.0+ & MPL-1.1 & GPL-3.0+ & LGPL-2.1+"
LICENSE_libgstreamer-plugins-bad1.0-dev = "LGPL-2.0+ & MIT & BSD & GPL-2.0+ & MPL-1.1 & GPL-3.0+ & LGPL-2.1+"
LICENSE_gstreamer1.0-plugins-bad = "LGPL-2.0+ & MIT & BSD & GPL-2.0+ & MPL-1.1 & GPL-3.0+ & LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-plugins-bad1.0/gstreamer1.0-plugins-bad_1.16.2-2.1ubuntu1_arm64.deb;name=gstreamer1.0-plugins-bad"
SRC_URI[gstreamer1.0-plugins-bad.md5sum] = "db9c8b0125a3aeaf95a13e650e154d4d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-plugins-bad1.0/libgstreamer-plugins-bad1.0-0_1.16.2-2.1ubuntu1_arm64.deb;name=libgstreamer-plugins-bad1.0-0"
SRC_URI[libgstreamer-plugins-bad1.0-0.md5sum] = "a16d4afe528f4ba9088bff772a14bfeb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-plugins-bad1.0/libgstreamer-plugins-bad1.0-dev_1.16.2-2.1ubuntu1_arm64.deb;name=libgstreamer-plugins-bad1.0-dev"
SRC_URI[libgstreamer-plugins-bad1.0-dev.md5sum] = "9277d196584b52b453f216db366d8b1b"

# other configs to feed compilation
PKG_${UPN} = "libgstreamer-plugins-bad1.0-0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc gstreamer1.0 gstreamer1.0-plugins-base orc gbm gobject-introspection  gobject-introspection wayland wayland-protocols libdrm"
PROVIDES = "gstreamer1.0-plugins-bad-ubuntu"

do_install_append(){
	rm -rf ${D}/${libdir}/${UBUN_TARGET_SYS}/libgstwayland-1.0.so*
}
