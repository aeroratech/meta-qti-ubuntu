# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for wlan-conf package
ALTERNATIVE_PRIORITY_wlan-conf = "100"

# set update-alternatives register name for wlan-conf package
ALTERNATIVE_wlan-conf = " sysctl.conf "

# set update-alternatives symbolic link path and real target path for wlan-conf package
ALTERNATIVE_LINK_NAME[sysctl.conf] = "/etc/sysctl.conf"

