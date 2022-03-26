# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "wayland" package
ALTERNATIVE_PRIORITY_wayland = "100"

# set update-alternatives register name for "wayland" package
ALTERNATIVE_wayland = " libwayland-server.so.0 libwayland-cursor.so.0 libwayland-client.so.0 libwayland-cursor.so.0.0.0 libwayland-server.so.0.1.0 libwayland-client.so.0.3.0 wayland-scanner"

# set update-alternatives symbolic link path or real target path for "wayland" package
QTI_SEPECIFIC_LINK[libwayland-cursor.so.0.0.0] = "/usr/lib/libwayland-cursor.so.0.0.0"
ALTERNATIVE_LINK_NAME[libwayland-cursor.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libwayland-cursor.so.0.0.0"

QTI_SEPECIFIC_LINK[libwayland-server.so.0] = "/usr/lib/libwayland-server.so.0"
ALTERNATIVE_LINK_NAME[libwayland-server.so.0] = "/usr/lib/aarch64-linux-gnu/libwayland-server.so.0"

QTI_SEPECIFIC_LINK[libwayland-cursor.so.0] = "/usr/lib/libwayland-cursor.so.0"
ALTERNATIVE_LINK_NAME[libwayland-cursor.so.0] = "/usr/lib/aarch64-linux-gnu/libwayland-cursor.so.0"

QTI_SEPECIFIC_LINK[libwayland-server.so.0.1.0] = "/usr/lib/libwayland-server.so.0.1.0"
ALTERNATIVE_LINK_NAME[libwayland-server.so.0.1.0] = "/usr/lib/aarch64-linux-gnu/libwayland-server.so.0.1.0"

ALTERNATIVE_LINK_NAME[wayland-scanner] = "/usr/bin/wayland-scanner"

QTI_SEPECIFIC_LINK[libwayland-client.so.0.3.0] = "/usr/lib/libwayland-client.so.0.3.0"
ALTERNATIVE_LINK_NAME[libwayland-client.so.0.3.0] = "/usr/lib/aarch64-linux-gnu/libwayland-client.so.0.3.0"

QTI_SEPECIFIC_LINK[libwayland-client.so.0] = "/usr/lib/libwayland-client.so.0"
ALTERNATIVE_LINK_NAME[libwayland-client.so.0] = "/usr/lib/aarch64-linux-gnu/libwayland-client.so.0"

# set FILES for "wayland" package
FILES_wayland += " /usr/lib/libwayland-cursor.so.0.0.0 /usr/lib/libwayland-server.so.0 /usr/lib/libwayland-cursor.so.0 /usr/lib/libwayland-server.so.0.1.0 /usr/bin/wayland-scanner /usr/lib/libwayland-client.so.0.3.0 /usr/lib/libwayland-client.so.0"

