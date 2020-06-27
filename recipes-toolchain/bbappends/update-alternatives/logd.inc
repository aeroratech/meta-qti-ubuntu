# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for logd package
ALTERNATIVE_PRIORITY_logd = "100"

# set update-alternatives register name for logd package
ALTERNATIVE_logd = " logd.service logd "

# set update-alternatives symbolic link path and real target path for logd package
ALTERNATIVE_LINK_NAME[logd.service] = "/lib/systemd/system/logd.service"

ALTERNATIVE_LINK_NAME[logd] = "/etc/init.d/logd"
ALTERNATIVE_TARGET_logd[logd] = "/sbin/logd"

