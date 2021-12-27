inherit upkg_base

LICENSE = "GPL-2.0"
LICENSE_linux-libc-dev = "GPL-2.0"

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/linux/linux-libc-dev_5.4.0-26.30_arm64.deb;name=linux-libc-dev"
SRC_URI[linux-libc-dev.md5sum] = "60c39647497d89ffefd602faade68988"

DEPENDS += "linux-libc-dev-arm64-cross"