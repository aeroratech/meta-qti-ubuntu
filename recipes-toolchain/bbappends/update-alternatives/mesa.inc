# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for mesa-megadriver package
ALTERNATIVE_PRIORITY_mesa-megadriver = "100"

# set update-alternatives register name for mesa-megadriver package
ALTERNATIVE_mesa-megadriver = "00-mesa-defaults.conf kms_swrast_dri.so swrast_dri.so virtio_gpu_dri.so"

# set update-alternatives symbolic link path and real target path for mesa-megadriver package
ALTERNATIVE_LINK_NAME[00-mesa-defaults.conf] = "/usr/share/drirc.d/00-mesa-defaults.conf"

ALTERNATIVE_LINK_NAME[kms_swrast_dri.so] = "/usr/lib/aarch64-linux-gnu/dri/kms_swrast_dri.so"
ALTERNATIVE_TARGET_mesa-megadriver[kms_swrast_dri.so] = "/usr/lib/dri/kms_swrast_dri.so"

ALTERNATIVE_LINK_NAME[swrast_dri.so] = "/usr/lib/aarch64-linux-gnu/dri/swrast_dri.so"
ALTERNATIVE_TARGET_mesa-megadriver[swrast_dri.so] = "/usr/lib/dri/swrast_dri.so"

ALTERNATIVE_LINK_NAME[virtio_gpu_dri.so] = "/usr/lib/aarch64-linux-gnu/dri/virtio_gpu_dri.so"
ALTERNATIVE_TARGET_mesa-megadriver[virtio_gpu_dri.so] = "/usr/lib/dri/virtio_gpu_dri.so"

