# config update-alternatives for wayland
require update-alternatives/wayland.inc

SYSROOT_DIRS_BLACKLIST += "\
/usr/lib/libwayland-egl.so \
/usr/lib/libwayland-egl.so.1 \
"

