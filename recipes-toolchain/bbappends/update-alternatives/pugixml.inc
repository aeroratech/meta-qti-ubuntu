# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "pugixml" package
ALTERNATIVE_PRIORITY_pugixml = "100"

# set update-alternatives register name for "pugixml" package
ALTERNATIVE_pugixml = " libpugixml.so.1"

# set update-alternatives symbolic link path or real target path for "pugixml" package
QTI_SEPECIFIC_LINK[libpugixml.so.1] = "/usr/lib/libpugixml.so.1"
ALTERNATIVE_LINK_NAME[libpugixml.so.1] = "/usr/lib/aarch64-linux-gnu/libpugixml.so.1"

