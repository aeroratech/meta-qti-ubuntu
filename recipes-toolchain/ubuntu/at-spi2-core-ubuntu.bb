inherit upkg_base

LICENSE = "LGPL-2+"
LICENSE_libatspi2.0-0 = "LGPL-2+"
LICENSE_gir1.2-atspi-2.0 = "LGPL-2+"
LICENSE_libatspi2.0-dev = "LGPL-2+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/at-spi2-core/libatspi2.0-dev_2.36.0-2_arm64.deb;name=libatspi2.0-dev"
SRC_URI[libatspi2.0-dev.md5sum] = "12d7b9855aae55c0f0cd0443cd9f0e37"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/at-spi2-core/gir1.2-atspi-2.0_2.36.0-2_arm64.deb;name=gir1.2-atspi-2.0"
SRC_URI[gir1.2-atspi-2.0.md5sum] = "ad8834fb96b87c3595512082892b59c7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/at-spi2-core/libatspi2.0-0_2.36.0-2_arm64.deb;name=libatspi2.0-0"
SRC_URI[libatspi2.0-0.md5sum] = "5d8fc137479f1478cc8f9f38b921d58a"

# other configs to feed compilation
PKG_${UPN} = "libatspi2.0-0"

DEPENDS += "dbus glib-2.0 libxtst"
