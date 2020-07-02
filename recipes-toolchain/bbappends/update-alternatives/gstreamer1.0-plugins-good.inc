# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for gstreamer1.0-plugins-good-pulse package
ALTERNATIVE_PRIORITY_gstreamer1.0-plugins-good-pulse = "100"

# set update-alternatives register name for gstreamer1.0-plugins-good-pulse package
ALTERNATIVE_gstreamer1.0-plugins-good-pulse = "libgstpulseaudio.so"

# set update-alternatives symbolic link path and real target path for gstreamer1.0-plugins-good-pulse package
ALTERNATIVE_LINK_NAME[libgstpulseaudio.so] = "/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstpulseaudio.so"
