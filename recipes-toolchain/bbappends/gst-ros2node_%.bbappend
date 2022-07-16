FILESEXTRAPATHS_append := "${THISDIR}:${THISDIR}/gst-ros2node:"

SRC_URI += " \
    file://gst-ros2node.patch \
"
DEPENDS += "gstreamer1.0-plugins-base"
