# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for wayland-dev package
ALTERNATIVE_PRIORITY_wayland-dev = "100"

# set update-alternatives register name for wayland-dev package
ALTERNATIVE_wayland-dev = "wayland-client-core.h wayland-client-protocol.h wayland-client.h wayland-cursor.h wayland-egl-core.h wayland-egl.h wayland-server-core.h wayland-server-protocol.h wayland-server.h wayland-util.h wayland-egl-backend.h wayland-egl-backend.pc wayland-version.h libwayland-client.so libwayland-cursor.so libwayland-server.so"

# set update-alternatives symbolic link path and real target path for wayland-dev package
ALTERNATIVE_LINK_NAME[wayland-client-core.h] = "/usr/include/wayland-client-core.h"

ALTERNATIVE_LINK_NAME[wayland-client-protocol.h] = "/usr/include/wayland-client-protocol.h"

ALTERNATIVE_LINK_NAME[wayland-client.h] = "/usr/include/wayland-client.h"

ALTERNATIVE_LINK_NAME[wayland-cursor.h] = "/usr/include/wayland-cursor.h"

ALTERNATIVE_LINK_NAME[wayland-egl-core.h] = "/usr/include/wayland-egl-core.h"

ALTERNATIVE_LINK_NAME[wayland-egl.h] = "/usr/include/wayland-egl.h"

ALTERNATIVE_LINK_NAME[wayland-server-core.h] = "/usr/include/wayland-server-core.h"

ALTERNATIVE_LINK_NAME[wayland-server-protocol.h] = "/usr/include/wayland-server-protocol.h"

ALTERNATIVE_LINK_NAME[wayland-server.h] = "/usr/include/wayland-server.h"

ALTERNATIVE_LINK_NAME[wayland-util.h] = "/usr/include/wayland-util.h"

ALTERNATIVE_LINK_NAME[wayland-egl-backend.h] = "/usr/include/wayland-egl-backend.h"

ALTERNATIVE_LINK_NAME[wayland-egl-backend.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/wayland-egl-backend.pc"
ALTERNATIVE_TARGET_wayland-dev[wayland-egl-backend.pc] = "/usr/lib/pkgconfig/wayland-egl-backend.pc"

ALTERNATIVE_LINK_NAME[wayland-version.h] = "/usr/include/wayland-version.h"

ALTERNATIVE_LINK_NAME[libwayland-client.so] = "/usr/lib/aarch64-linux-gnu/libwayland-client.so"
ALTERNATIVE_TARGET_wayland-dev[libwayland-client.so] = "/usr/lib/libwayland-client.so"

ALTERNATIVE_LINK_NAME[libwayland-cursor.so] = "/usr/lib/aarch64-linux-gnu/libwayland-cursor.so"
ALTERNATIVE_TARGET_wayland-dev[libwayland-cursor.so] = "/usr/lib/libwayland-cursor.so"

ALTERNATIVE_LINK_NAME[libwayland-server.so] = "/usr/lib/aarch64-linux-gnu/libwayland-server.so"
ALTERNATIVE_TARGET_wayland-dev[libwayland-server.so] = "/usr/lib/libwayland-server.so"
