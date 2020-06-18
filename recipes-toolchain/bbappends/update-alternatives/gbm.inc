# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for gbm package
ALTERNATIVE_PRIORITY_gbm = "100"

# set update-alternatives register name for gbm package
ALTERNATIVE_gbm = " gbm.h libgbm.so gbm.pc "

# set update-alternatives symbolic link path and real target path for gbm package
ALTERNATIVE_LINK_NAME[gbm.h] = "/usr/include/gbm.h"

ALTERNATIVE_LINK_NAME[libgbm.so] = "/usr/lib/aarch64-linux-gnu/libgbm.so"
ALTERNATIVE_TARGET_gbm[libgbm.so] = "/usr/lib/libgbm.so"

ALTERNATIVE_LINK_NAME[gbm.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/gbm.pc"
ALTERNATIVE_TARGET_gbm[gbm.pc] = "/usr/lib/pkgconfig/gbm.pc"

