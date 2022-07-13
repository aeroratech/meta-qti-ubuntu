inherit upkg_base

LICENSE = "Various licenses"
LICENSE_libx11-xcb-dev = "Various licenses"
LICENSE_libx11-xcb1 = "Various licenses"
LICENSE_libx11-dev = "Various licenses"
LICENSE_libx11-6 = "Various licenses"
LIC_FILES_CHKSUM = "\
	file://https://changelogs.ubuntu.com/changelogs/pool/main/libx/libx11/libx11_1.6.9-2ubuntu1.2/copyright;md5=6121e1d103eb0c51500be21cdd73e4b4\
"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libx11/libx11-6_1.6.9-2ubuntu1_arm64.deb;name=libx11-6"
SRC_URI[libx11-6.md5sum] = "b8fe5ed89115e7493cfc73e4d2066a70"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libx11/libx11-dev_1.6.9-2ubuntu1_arm64.deb;name=libx11-dev"
SRC_URI[libx11-dev.md5sum] = "61bb41bd8832976d1f89f96ca16402e6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libx11/libx11-xcb1_1.6.9-2ubuntu1_arm64.deb;name=libx11-xcb1"
SRC_URI[libx11-xcb1.md5sum] = "b04e56f5b8ddef3d0d304c5df4ca5b37"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libx11/libx11-xcb-dev_1.6.9-2ubuntu1_arm64.deb;name=libx11-xcb-dev"
SRC_URI[libx11-xcb-dev.md5sum] = "e2af74dbd815037b6ec1b960301c91ef"

# other configs to feed compilation
PKG_${UPN} = "libx11-6"

DEPENDS += "libxau libxcb libxdmcp xorgproto"
