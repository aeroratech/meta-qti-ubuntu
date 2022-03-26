# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "gbm" package
ALTERNATIVE_PRIORITY_gbm = "100"

# set update-alternatives register name for "gbm" package
ALTERNATIVE_gbm = " gbm.pc libgbm.so gbm.h"

# set update-alternatives symbolic link path or real target path for "gbm" package
QTI_SEPECIFIC_LINK[libgbm.so] = "/usr/lib/libgbm.so"
ALTERNATIVE_LINK_NAME[libgbm.so] = "/usr/lib/aarch64-linux-gnu/libgbm.so"

QTI_SEPECIFIC_LINK[gbm.pc] = "/usr/lib/pkgconfig/gbm.pc"
ALTERNATIVE_LINK_NAME[gbm.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/gbm.pc"

ALTERNATIVE_LINK_NAME[gbm.h] = "/usr/include/gbm.h"

# set FILES for "gbm" package
FILES_gbm += " /usr/lib/libgbm.so /usr/lib/pkgconfig/gbm.pc /usr/include/gbm.h"

