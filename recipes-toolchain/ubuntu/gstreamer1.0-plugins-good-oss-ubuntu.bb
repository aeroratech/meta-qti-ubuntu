inherit upkg_base

LICENSE = "LGPL-2.0+ & LGPL-2.1+ & MIT & GPL-2.0+ & BSD"
LICENSE_libgstreamer-plugins-good1.0-0 = "LGPL-2.0+ & LGPL-2.1+ & MIT & GPL-2.0+ & BSD"
LICENSE_libgstreamer-plugins-good1.0-dev = "LGPL-2.0+ & LGPL-2.1+ & MIT & GPL-2.0+ & BSD"
LICENSE_gstreamer1.0-plugins-good = "LGPL-2.0+ & LGPL-2.1+ & MIT & GPL-2.0+ & BSD"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-good1.0/gstreamer1.0-plugins-good_1.16.2-1ubuntu2_arm64.deb;name=gstreamer1.0-plugins-good"
SRC_URI[gstreamer1.0-plugins-good.md5sum] = "c45edd1448e396b0a20d5a3ef19b1cdf"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-good1.0/libgstreamer-plugins-good1.0-dev_1.16.2-1ubuntu2_arm64.deb;name=libgstreamer-plugins-good1.0-dev"
SRC_URI[libgstreamer-plugins-good1.0-dev.md5sum] = "e719899269a179785a0687570c049e8c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gst-plugins-good1.0/libgstreamer-plugins-good1.0-0_1.16.2-1ubuntu2_arm64.deb;name=libgstreamer-plugins-good1.0-0"
SRC_URI[libgstreamer-plugins-good1.0-0.md5sum] = "52807278f59cf38f5501e43f8f465bad"

# other configs to feed compilation
PKG_${UPN} = "libgstreamer-plugins-good1.0-0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc gstreamer1.0 gstreamer1.0-plugins-base libcap zlib orc  pulseaudio"
#PROVIDES += "gstreamer1.0-plugins-good"#
#PACKEGS += "gstreamer1.0-plugins-good"
#RPROVIDES += "gstreamer1.0-plugins-good"
#RPROVIDES_gstreamer1.0-plugins-good += "gstreamer1.0-plugins-good"
