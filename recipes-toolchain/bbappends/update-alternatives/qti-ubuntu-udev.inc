# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for qti-ubuntu-udev package
ALTERNATIVE_PRIORITY_qti-ubuntu-udev = "100"

# set update-alternatives register name for qti-ubuntu-udev package
ALTERNATIVE_qti-ubuntu-udev = "60-persistent-storage.rules"

# set update-alternatives symbolic link path and real target path for qti-ubuntu-udev package
ALTERNATIVE_LINK_NAME[60-persistent-storage.rules] = "/lib/udev/rules.d/60-persistent-storage.rules"

