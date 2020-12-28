# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for cairo package
ALTERNATIVE_PRIORITY_cairo = "100"

# set update-alternatives register name for cairo package
ALTERNATIVE_cairo = "libcairo-gobject.a libcairo-gobject.so libcairo-gobject.so.2 libcairo-gobject.so.2.11510.0 libcairo-script-interpreter.a libcairo-script-interpreter.so libcairo-script-interpreter.so.2 libcairo-script-interpreter.so.2.11510.0 libcairo.a libcairo.so libcairo.so.2 libcairo.so.2.11510.0"

# set update-alternatives symbolic link path and real target path for cairo package
ALTERNATIVE_LINK_NAME[libcairo-gobject.a] = "/usr/lib/aarch64-linux-gnu/libcairo-gobject.a"

ALTERNATIVE_LINK_NAME[libcairo-gobject.so] = "/usr/lib/aarch64-linux-gnu/libcairo-gobject.so"

ALTERNATIVE_LINK_NAME[libcairo-gobject.so.2] = "/usr/lib/aarch64-linux-gnu/libcairo-gobject.so.2"

ALTERNATIVE_LINK_NAME[libcairo-gobject.so.2.11510.0] = "/usr/lib/aarch64-linux-gnu/libcairo-gobject.so.2.11510.0"

ALTERNATIVE_LINK_NAME[libcairo-script-interpreter.a] = "/usr/lib/aarch64-linux-gnu/libcairo-script-interpreter.a"

ALTERNATIVE_LINK_NAME[libcairo-script-interpreter.so] = "/usr/lib/aarch64-linux-gnu/libcairo-script-interpreter.so"

ALTERNATIVE_LINK_NAME[libcairo-script-interpreter.so.2] = "/usr/lib/aarch64-linux-gnu/libcairo-script-interpreter.so.2"

ALTERNATIVE_LINK_NAME[libcairo-script-interpreter.so.2.11510.0] = "/usr/lib/aarch64-linux-gnu/libcairo-script-interpreter.so.2.11510.0"

ALTERNATIVE_LINK_NAME[libcairo.a] = "/usr/lib/aarch64-linux-gnu/libcairo.a"

ALTERNATIVE_LINK_NAME[libcairo.so] = "/usr/lib/aarch64-linux-gnu/libcairo.so"

ALTERNATIVE_LINK_NAME[libcairo.so.2] = "/usr/lib/aarch64-linux-gnu/libcairo.so.2"

ALTERNATIVE_LINK_NAME[libcairo.so.2.11510.0] = "/usr/lib/aarch64-linux-gnu/libcairo.so.2.11510.0"

