LICENSE = "GPL-2.0+ | AFL-2.1"
LICENSE_libdbus-dev = "GPL-2.0+ | AFL-2.1"
LICENSE_libdbus = "GPL-2.0+ | AFL-2.1"
inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/d/dbus/libdbus-1-3_1.12.16-2ubuntu2_arm64.deb;name=libdbus \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/d/dbus/libdbus-1-dev_1.12.16-2ubuntu2_arm64.deb;name=libdbus-dev"

SRC_URI[libdbus-dev.md5sum] = "49d6b7c6c1ee535e6c7ebde6052d1fd2"
SRC_URI[libdbus.md5sum] = "9fde07fea7ff86f2030641bb69be011c"

# other configs to feed compilation
PKG_${UPN} = "libdbus"
