inherit upkg_base

LICENSE = "MIT"
LICENSE_libwacom2 = "MIT"
LICENSE_libwacom-dev = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libw/libwacom/libwacom-dev_1.3-2ubuntu1_arm64.deb;name=libwacom-dev"
SRC_URI[libwacom-dev.md5sum] = "bfbc50e917f2b30072873e312cb93184"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libw/libwacom/libwacom2_1.3-2ubuntu1_arm64.deb;name=libwacom2"
SRC_URI[libwacom2.md5sum] = "ba07c624b98d648fbb74d400d819199b"

# other configs to feed compilation
PKG_${UPN} = "libwacom2"
DEPENDS += "glib-2.0 libgudev"
PROVIDES += "libwacom"
