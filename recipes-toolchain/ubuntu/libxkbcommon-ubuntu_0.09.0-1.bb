inherit upkg_base

LICENSE = "MIT-style"
LICENSE_libxkbcommon0 = "MIT-style"
LICENSE_libxkbcommon-x11-dev = "MIT-style"
LICENSE_libxkbcommon-x11-0 = "MIT-style"
LICENSE_libxkbcommon-dev = "MIT-style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxkbcommon/libxkbcommon-dev_0.10.0-1_arm64.deb;name=libxkbcommon-dev"
SRC_URI[libxkbcommon-dev.md5sum] = "f6032e6420c206e8db71412ae47c859a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxkbcommon/libxkbcommon-x11-0_0.10.0-1_arm64.deb;name=libxkbcommon-x11-0"
SRC_URI[libxkbcommon-x11-0.md5sum] = "84ecc0ab6f97eb961f72d5f2e8342d46"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxkbcommon/libxkbcommon-x11-dev_0.10.0-1_arm64.deb;name=libxkbcommon-x11-dev"
SRC_URI[libxkbcommon-x11-dev.md5sum] = "42fec771e8b44fbfe2fba419eeae4666"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxkbcommon/libxkbcommon0_0.10.0-1_arm64.deb;name=libxkbcommon0"
SRC_URI[libxkbcommon0.md5sum] = "ee3fb47cda03ac28702d90cdaf78d84d"

# other configs to feed compilation
PKG_${UPN} = "libxkbcommon0"
PROVIDES += "libxkbcommon "
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc util-macros  wayland wayland-protocols"
