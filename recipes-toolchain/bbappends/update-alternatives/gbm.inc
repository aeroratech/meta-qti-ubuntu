# Use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for gbm package
ALTERNATIVE_PRIORITY_gbm = "100"

# set update-alternatives register name for libweston-3 package
ALTERNATIVE_gbm = "\
                 gbm.h gbm_priv.h color_metadata.h gbm.pc libgbm.so gbmtest \
                "
# set update-alternatives symbolic link path and real target path for gbm package
ALTERNATIVE_LINK_NAME[gbm.h] = "${includedir}/gbm.h"

ALTERNATIVE_LINK_NAME[gbm_priv.h] = "${includedir}/gbm_priv.h"

ALTERNATIVE_LINK_NAME[color_metadata.h] = "${includedir}/color_metadata.h"

ALTERNATIVE_LINK_NAME[gbm.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/gbm.pc"
ALTERNATIVE_TARGET_gbm[gbm.pc] = "${libdir}/pkgconfig/gbm.pc"

ALTERNATIVE_LINK_NAME[libgbm.so] = "/usr/lib/aarch64-linux-gnu/libgbm.so"
ALTERNATIVE_TARGET_gbm[libgbm.so] = "${libdir}/libgbm.so"

ALTERNATIVE_LINK_NAME[gbmtest] = "${bindir}/gbmtest"
