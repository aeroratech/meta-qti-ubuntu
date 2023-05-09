RDEPENDS_packagegroup-qti-gst_append = " \
      ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "gstreamer1.0-plugins-bad-waylandsink", "", d)} \
      ${@bb.utils.contains("DISTRO_FEATURES", "pulseaudio", "gstreamer1.0-plugins-good-pulse", "", d)} \
      ${@bb.utils.contains("BASEMACHINE", "qrb5165", "gstreamer1.0-plugins-qti-oss-codec2", "", d)} \
      ${@bb.utils.contains("BASEMACHINE", "qcs6490", "gstreamer1.0-plugins-qti-oss-codec2", "", d)} \
      ${@bb.utils.contains("BASEMACHINE", "qrb5165", "gstreamer1.0-plugins-qti-oss-jpegenc", "", d)} \
      ${@bb.utils.contains("BASEMACHINE", "qcs6490", "gstreamer1.0-plugins-qti-oss-jpegenc", "", d)} \
      gstreamer1.0-plugins-good-v4l2 \
    "

RDEPENDS_packagegroup-qti-gst_remove = " \
      ${@bb.utils.contains_any("COMBINED_FEATURES", "qti-video qti-audio", "gstreamer1.0-libav", "", d)} \
    "
