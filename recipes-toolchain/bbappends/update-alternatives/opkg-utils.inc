# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for update-alternatives-opkg package
ALTERNATIVE_PRIORITY_update-alternatives-opkg = "100"

# set update-alternatives register name for update-alternatives-opkg package
ALTERNATIVE_update-alternatives-opkg = "update-alternatives"

# set update-alternatives symbolic link path and real target path for update-alternatives-opkg package
ALTERNATIVE_LINK_NAME[update-alternatives] = "/usr/bin/update-alternatives"

