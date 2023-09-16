RDEPENDS_packagegroup-qti-gst_append = " \
      ${@bb.utils.contains("DISTRO_FEATURES", "wayland", "gstreamer1.0-plugins-bad-waylandsink", "", d)} \
      ${@bb.utils.contains("DISTRO_FEATURES", "pulseaudio", "gstreamer1.0-plugins-good-pulse", "", d)} \
      gstreamer1.0-plugins-good-v4l2 \
      gstreamer1.0-plugins-qti-oss-codec2 \
      gstreamer1.0-plugins-qti-oss-jpegenc \
    "

RDEPENDS_packagegroup-qti-gst_remove_qrb5165 = " \
      ${@bb.utils.contains_any("COMBINED_FEATURES", "qti-video qti-audio", "gstreamer1.0-libav", "", d)} \
    "
