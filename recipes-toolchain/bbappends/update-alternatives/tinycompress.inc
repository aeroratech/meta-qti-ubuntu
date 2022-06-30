# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for tinycompress package
ALTERNATIVE_PRIORITY_tinycompress = "100"

# set update-alternatives register name for tinycompress package
ALTERNATIVE_tinycompress = " cplay "

# set update-alternatives symbolic link path and real target path for tinycompress package
ALTERNATIVE_LINK_NAME[cplay] = "/usr/bin/cplay"

