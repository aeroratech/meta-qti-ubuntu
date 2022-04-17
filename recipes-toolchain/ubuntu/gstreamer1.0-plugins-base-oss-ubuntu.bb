inherit upkg_base
require ${PN}.inc

LICENSE = "LGPL-2.0+ & BSD & MIT"
LICENSE_gstreamer1.0-plugins-base = "LGPL-2.0+ & BSD & MIT"
LICENSE_libgstreamer-plugins-base1.0-0 = "LGPL-2.0+ & BSD & MIT"
LICENSE_libgstreamer-plugins-base1.0-dev = "LGPL-2.0+ & BSD & MIT"
LICENSE_libgstreamer-gl1.0-0 = "LGPL-2.0+ & BSD & MIT"
LICENSE_gstreamer1.0-gl = "LGPL-2.0+ & BSD & MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-base1.0/gstreamer1.0-gl_1.16.2-4_arm64.deb;name=gstreamer1.0-gl"
SRC_URI[gstreamer1.0-gl.md5sum] = "395337baaa4bf7cfae5d2214aacd0c57"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-base1.0/libgstreamer-gl1.0-0_1.16.2-4_arm64.deb;name=libgstreamer-gl1.0-0"
SRC_URI[libgstreamer-gl1.0-0.md5sum] = "903d29116e5de74a967dad79599f68f0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-base1.0/libgstreamer-plugins-base1.0-dev_1.16.2-4_arm64.deb;name=libgstreamer-plugins-base1.0-dev"
SRC_URI[libgstreamer-plugins-base1.0-dev.md5sum] = "fde850702e766c9dd1f7242ab0eef221"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-base1.0/libgstreamer-plugins-base1.0-0_1.16.2-4_arm64.deb;name=libgstreamer-plugins-base1.0-0"
SRC_URI[libgstreamer-plugins-base1.0-0.md5sum] = "534e65575545c722951d6929ed5be09f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-base1.0/gstreamer1.0-plugins-base_1.16.2-4_arm64.deb;name=gstreamer1.0-plugins-base"
SRC_URI[gstreamer1.0-plugins-base.md5sum] = "33bd21920eb5aeb484afc0f5b29f26b8"

# other configs to feed compilation
PKG_${UPN} = "libgstreamer-plugins-base1.0-0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc gstreamer1.0 iso-codes util-linux zlib libxcb glib-2.0  gobject-introspection orc"
PROVIDES = " gstreamer1.0-plugins-base-oss"

#PACKAGES += "gstreamer1.0-plugins-base"
#RPROVIDES_gstreamer1.0-plugins-base += "gstreamer1.0-plugins-base"

do_install_append(){
	rm -rf ${D}/usr/include/gstreamer-1.0/gst/audio
	rm -rf ${D}/usr/lib/aarch64-linux-gnu/libgstaudio-1.0.so*
}

