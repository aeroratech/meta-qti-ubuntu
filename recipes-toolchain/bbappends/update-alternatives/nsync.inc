# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "nsync" package
ALTERNATIVE_PRIORITY_nsync = "100"

# set update-alternatives register name for "nsync" package
ALTERNATIVE_nsync = " libnsync_cpp.so.1 libnsync.so.1"

# set update-alternatives symbolic link path or real target path for "nsync" package
ALTERNATIVE_LINK_NAME[libnsync_cpp.so.1] = "/usr/lib/aarch64-linux-gnu/libnsync_cpp.so.1"

ALTERNATIVE_LINK_NAME[libnsync.so.1] = "/usr/lib/aarch64-linux-gnu/libnsync.so.1"
