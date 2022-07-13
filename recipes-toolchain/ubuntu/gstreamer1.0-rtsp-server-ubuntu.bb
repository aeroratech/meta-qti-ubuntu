LICENSE = "LGPL-2.0+"
LICENSE_gstreamer1.0-rtsp = "LGPL-2.0+"
LICENSE_libgstrtspserver-1.0-dev = "LGPL-2.0+"
LICENSE_libgstrtspserver-1.0-0 = "LGPL-2.0+"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-rtsp-server1.0/gstreamer1.0-rtsp_1.16.2-3_arm64.deb;name=gstreamer-rtsp \
           http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-rtsp-server1.0/libgstrtspserver-1.0-dev_1.16.2-3_arm64.deb;name=libgstrtspserver-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gst-rtsp-server1.0/libgstrtspserver-1.0-0_1.16.2-3_arm64.deb;name=libgstrtspserver"

SRC_URI[gstreamer-rtsp.md5sum] = "fe5c878f28c46486efc4748b57b4e50b"
SRC_URI[libgstrtspserver-dev.md5sum] = "9fa9f3243c329e123ec1e5b7a2b4ec63"
SRC_URI[libgstrtspserver.md5sum] = "8affd1ea1a6e799c43e992138be183fa"

# other configs to feed compilation
PKG_${UPN} = "libgstrtspserver-1.0-0"
