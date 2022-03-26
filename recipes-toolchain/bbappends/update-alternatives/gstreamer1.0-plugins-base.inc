# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "libgstaudio-1.0" package
ALTERNATIVE_PRIORITY_libgstaudio-1.0 = "100"

# set update-alternatives register name for "libgstaudio-1.0" package
ALTERNATIVE_libgstaudio-1.0 = " libgstaudio-1.0.so.0 libgstaudio-1.0.so"

# set update-alternatives symbolic link path or real target path for "libgstaudio-1.0" package
QTI_SEPECIFIC_LINK[libgstaudio-1.0.so.0] = "/usr/lib/libgstaudio-1.0.so.0"
ALTERNATIVE_LINK_NAME[libgstaudio-1.0.so.0] = "/usr/lib/aarch64-linux-gnu/libgstaudio-1.0.so.0"

QTI_SEPECIFIC_LINK[libgstaudio-1.0.so] = "/usr/lib/libgstaudio-1.0.so"
ALTERNATIVE_LINK_NAME[libgstaudio-1.0.so] = "/usr/lib/aarch64-linux-gnu/libgstaudio-1.0.so"

# set FILES for "libgstaudio-1.0" package
FILES_libgstaudio-1.0 += " /usr/lib/libgstaudio-1.0.so.0 /usr/lib/libgstaudio-1.0.so"

