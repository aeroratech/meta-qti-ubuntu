inherit upkg_base

LICENSE = "GPL-2.0+ & MIT"
LICENSE_libinput10 = "GPL-2.0+ & MIT"
LICENSE_libinput-dev = "GPL-2.0+ & MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libi/libinput/libinput-dev_1.15.5-1_arm64.deb;name=libinput-dev"
SRC_URI[libinput-dev.md5sum] = "8cd1c4541f6c1fe41c4402beedab204c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libi/libinput/libinput10_1.15.5-1_arm64.deb;name=libinput10"
SRC_URI[libinput10.md5sum] = "098e4f972b3e87d3380952d9a31852c6"

# other configs to feed compilation
PKG_${UPN} = "libinput10"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libevdev udev mtdev "
PROVIDES += "libinput libinput-bin "
RPROVIDES_libinput += "libinput-bin"
