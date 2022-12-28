# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "gstreamer1.0-plugins-bad-waylandsink" package
ALTERNATIVE_PRIORITY_gstreamer1.0-plugins-bad-waylandsink = "100"

# set update-alternatives register name for "gstreamer1.0-plugins-bad-waylandsink" package
ALTERNATIVE_gstreamer1.0-plugins-bad-waylandsink = " libgstwaylandsink.so libgstwayland-1.0.so.0 libgstwayland-1.0.so libgstsctp-1.0.so libgstsctp-1.0.so.0"

# set update-alternatives symbolic link path or real target path for "gstreamer1.0-plugins-bad-waylandsink" package
QTI_SEPECIFIC_LINK[libgstwaylandsink.so] = "/usr/lib/gstreamer-1.0/libgstwaylandsink.so"
ALTERNATIVE_LINK_NAME[libgstwaylandsink.so] = "/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstwaylandsink.so"

# set update-alternatives symbolic link path or real target path for "libgstwayland-1.0" package
ALTERNATIVE_LINK_NAME[libgstwayland-1.0.so.0] = "/usr/lib/aarch64-linux-gnu/libgstwayland-1.0.so.0"

QTI_SEPECIFIC_LINK[libgstwayland-1.0.so] = "/usr/lib/libgstwayland-1.0.so"
ALTERNATIVE_LINK_NAME[libgstwayland-1.0.so] = "/usr/lib/aarch64-linux-gnu/libgstwayland-1.0.so"

QTI_SEPECIFIC_LINK[libgstsctp-1.0.so] = "/usr/lib/libgstsctp-1.0.so"
ALTERNATIVE_LINK_NAME[libgstsctp-1.0.so] = "/usr/lib/aarch64-linux-gnu/libgstsctp-1.0.so"

ALTERNATIVE_LINK_NAME[libgstsctp-1.0.so.0] = "/usr/lib/aarch64-linux-gnu/libgstsctp-1.0.so.0"
