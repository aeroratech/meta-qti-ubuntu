inherit upkg_base

LICENSE = "LGPL-2.0+ & GPL-2.0+"
LICENSE_gstreamer1.0-plugins-ugly = "LGPL-2.0+ & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-plugins-ugly1.0/gstreamer1.0-plugins-ugly_1.16.2-2build1_arm64.deb;name=gstreamer1.0-plugins-ugly"
SRC_URI[gstreamer1.0-plugins-ugly.md5sum] = "02a4ea019bd8ce82acee00a314803257"

# other configs to feed compilation
PKG_${UPN} = "gstreamer1.0-plugins-ugly"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc gstreamer1.0 gstreamer1.0-plugins-base  liba52 mpeg2dec orc"
PROVIDES += "gstreamer1.0-plugins-ugly "
