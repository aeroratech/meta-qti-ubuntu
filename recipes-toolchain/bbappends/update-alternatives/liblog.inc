# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "liblog" package
ALTERNATIVE_PRIORITY_liblog = "100"

# set update-alternatives register name for "liblog" package
ALTERNATIVE_liblog = " liblog.so.0.0.0 liblog.so.0"

# set update-alternatives symbolic link path or real target path for "liblog" package
QTI_SEPECIFIC_LINK[liblog.so.0.0.0] = "/usr/lib/liblog.so.0.0.0"
ALTERNATIVE_LINK_NAME[liblog.so.0.0.0] = "/usr/aarch64-linux-gnu/lib/liblog.so.0.0.0"

QTI_SEPECIFIC_LINK[liblog.so.0.0.0] = "/usr/lib/liblog.so.0.0.0"
ALTERNATIVE_LINK_NAME[liblog.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/liblog.so.0.0.0"

QTI_SEPECIFIC_LINK[liblog.so.0] = "/usr/lib/liblog.so.0"
ALTERNATIVE_LINK_NAME[liblog.so.0] = "/usr/aarch64-linux-gnu/lib/liblog.so.0"

QTI_SEPECIFIC_LINK[liblog.so.0] = "/usr/lib/liblog.so.0"
ALTERNATIVE_LINK_NAME[liblog.so.0] = "/usr/lib/aarch64-linux-gnu/liblog.so.0"

# set FILES for "liblog" package
FILES_liblog += " /usr/lib/liblog.so.0.0.0 /usr/lib/liblog.so.0.0.0 /usr/lib/liblog.so.0 /usr/lib/liblog.so.0"

