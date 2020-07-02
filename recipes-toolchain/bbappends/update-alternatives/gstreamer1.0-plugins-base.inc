# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for gstreamer1.0-plugins-base-audio package
ALTERNATIVE_PRIORITY_gstreamer1.0-plugins-base-audio = "100"

# set update-alternatives register name for gstreamer1.0-plugins-base-audio package
ALTERNATIVE_gstreamer1.0-plugins-base-audio = "libgstaudio-1.0.so libgstaudio-1.0.so.0"

# set update-alternatives symbolic link path and real target path for gstreamer1.0-plugins-base-audio package
ALTERNATIVE_LINK_NAME[libgstaudio-1.0.so] = "/usr/lib/aarch64-linux-gnu/libgstaudio-1.0.so"

ALTERNATIVE_LINK_NAME[libgstaudio-1.0.so.0] = "/usr/lib/aarch64-linux-gnu/libgstaudio-1.0.so.0"
