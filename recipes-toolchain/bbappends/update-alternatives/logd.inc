# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "logd" package
ALTERNATIVE_PRIORITY_logd = "100"

# set update-alternatives register name for "logd" package
ALTERNATIVE_logd = " logd.service"

# set update-alternatives symbolic link path or real target path for "logd" package
ALTERNATIVE_LINK_NAME[logd.service] = "/lib/systemd/system/logd.service"
