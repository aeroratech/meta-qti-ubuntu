# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for iw package
ALTERNATIVE_PRIORITY_iw = "100"

# set update-alternatives register name for iw package
ALTERNATIVE_iw = "iw "

# set update-alternatives symbolic link path and real target path for iw package
ALTERNATIVE_LINK_NAME[iw] = "/sbin/iw"
QTI_SEPECIFIC_LINK[iw] = "/usr/sbin/iw"

