inherit upkg_base

LICENSE = "LGPL-2.0+ & LGPL-2.1+"
LICENSE_gstreamer1.0-libav = "LGPL-2.0+ & LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-libav1.0/gstreamer1.0-libav_1.16.2-2_arm64.deb;name=gstreamer1.0-libav"
SRC_URI[gstreamer1.0-libav.md5sum] = "95af9be488b9d6da12b1ddd312f77400"

# other configs to feed compilation
PKG_${UPN} = "gstreamer1.0-libav"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc gstreamer1.0 gstreamer1.0-plugins-base ffmpeg"
PROVIDES += "gstreamer1.0-libav "
