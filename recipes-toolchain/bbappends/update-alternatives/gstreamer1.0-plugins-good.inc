# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "gstreamer1.0-plugins-good-pulse" package
ALTERNATIVE_PRIORITY_gstreamer1.0-plugins-good-pulse = "100"

# set update-alternatives register name for "gstreamer1.0-plugins-good-pulse" package
ALTERNATIVE_gstreamer1.0-plugins-good-pulse = " libgstpulseaudio.so"

# set update-alternatives symbolic link path or real target path for "gstreamer1.0-plugins-good-pulse" package
QTI_SEPECIFIC_LINK[libgstpulseaudio.so] = "/usr/lib/gstreamer-1.0/libgstpulseaudio.so"
ALTERNATIVE_LINK_NAME[libgstpulseaudio.so] = "/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstpulseaudio.so"

# set update-alternatives priority for "gstreamer1.0-plugins-good-v4l2" package
ALTERNATIVE_PRIORITY_gstreamer1.0-plugins-good-v4l2 = "100"

# set update-alternatives register name for "gstreamer1.0-plugins-good-v4l2" package
ALTERNATIVE_gstreamer1.0-plugins-good-v4l2 = " libgstvideo4linux2.so"

# set update-alternatives symbolic link path or real target path for "gstreamer1.0-plugins-good-v4l2" package
QTI_SEPECIFIC_LINK[libgstvideo4linux2.so] = "/usr/lib/gstreamer-1.0/libgstvideo4linux2.so"
ALTERNATIVE_LINK_NAME[libgstvideo4linux2.so] = "/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstvideo4linux2.so"