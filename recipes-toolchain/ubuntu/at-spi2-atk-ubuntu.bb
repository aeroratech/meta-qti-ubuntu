inherit upkg_base

LICENSE = "LGPL-2+"
LICENSE_libatk-bridge2.0-0 = "LGPL-2+"
LICENSE_libatk-adaptor = "LGPL-2+"
LICENSE_libatk-bridge2.0-dev = "LGPL-2+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/at-spi2-atk/libatk-bridge2.0-dev_2.34.1-3_arm64.deb;name=libatk-bridge2.0-dev"
SRC_URI[libatk-bridge2.0-dev.md5sum] = "91eb621f2bc439ab98e7f9b106e7ffbd"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/at-spi2-atk/libatk-adaptor_2.34.1-3_arm64.deb;name=libatk-adaptor"
SRC_URI[libatk-adaptor.md5sum] = "4c669ed995b3cd367fd834fb67e972d8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/at-spi2-atk/libatk-bridge2.0-0_2.34.1-3_arm64.deb;name=libatk-bridge2.0-0"
SRC_URI[libatk-bridge2.0-0.md5sum] = "93962938bd66ff391a72dd3fda2e95da"

# other configs to feed compilation
PKG_${UPN} = "libatk-bridge2.0-0"

DEPENDS += "dbus atk at-spi2-core glib-2.0 libxml2 libx11"
