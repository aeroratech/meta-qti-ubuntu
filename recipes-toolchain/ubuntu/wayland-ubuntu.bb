inherit upkg_base

LICENSE = "X11"
LICENSE_libwayland-egl1 = "X11"
LICENSE_libwayland-client0 = "X11"
LICENSE_libwayland-server0 = "X11"
LICENSE_libwayland-cursor0 = "X11"
LICENSE_libwayland-dev = "X11"
LICENSE_libwayland-bin = "X11"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/w/wayland/libwayland-bin_1.18.0-1_arm64.deb;name=libwayland-bin"
SRC_URI[libwayland-bin.md5sum] = "131b8959d9df15fb01f903d32423be05"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/w/wayland/libwayland-dev_1.18.0-1_arm64.deb;name=libwayland-dev"
SRC_URI[libwayland-dev.md5sum] = "c9f3b55ad0fbca47f78fb003cb0a9327"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/w/wayland/libwayland-cursor0_1.18.0-1_arm64.deb;name=libwayland-cursor0"
SRC_URI[libwayland-cursor0.md5sum] = "8127c7219cf99a3a123712a3e544fd9c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/w/wayland/libwayland-server0_1.18.0-1_arm64.deb;name=libwayland-server0"
SRC_URI[libwayland-server0.md5sum] = "00fe80e82612ee246f6f07b063f79629"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/w/wayland/libwayland-client0_1.18.0-1_arm64.deb;name=libwayland-client0"
SRC_URI[libwayland-client0.md5sum] = "24eab1bf70c3a66d3f5232316c2a7965"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/w/wayland/libwayland-egl1_1.18.0-1_arm64.deb;name=libwayland-egl1"
SRC_URI[libwayland-egl1.md5sum] = "ddea0e5db76e33fa2ba61b77e7c69097"

# other configs to feed compilation
PKG_${UPN} = "libwayland-egl1"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libffi expat libxml2 "
PROVIDES += "wayland "

SYSROOT_DIRS_BLACKLIST_qrb5165 += " \
${libdir}/${UBUN_TARGET_SYS}/pkgconfig/wayland-egl.pc \
"

do_install_append_qrb5165(){
	rm -rf ${D}/${libdir}/${UBUN_TARGET_SYS}/libwayland-egl.so*
}
