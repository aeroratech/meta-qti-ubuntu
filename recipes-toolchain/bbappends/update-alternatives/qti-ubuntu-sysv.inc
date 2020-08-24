# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for qti-ubuntu-sysv package
ALTERNATIVE_PRIORITY_qti-ubuntu-sysv = "100"

# set update-alternatives register name for qti-ubuntu-sysv package
ALTERNATIVE_qti-ubuntu-sysv = "reboot"

# set update-alternatives symbolic link path and real target path for qti-ubuntu-sysv package
ALTERNATIVE_LINK_NAME[reboot] = "/sbin/reboot"

