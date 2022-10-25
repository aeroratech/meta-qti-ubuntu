inherit upkg_base

LICENSE = "GPL-V2"
LICENSE_libtool = "GPL-V2"
LICENSE_libtool-bin = "GPL-V2"
LICENSE_libltdl7 = "GPL-V2"
LICENSE_libltdl-dev = "GPL-V2"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtool/libltdl-dev_2.4.6-14_arm64.deb;name=libltdl-dev"
SRC_URI[libltdl-dev.md5sum] = "946f5a7c5687559a073548960105dedd"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtool/libltdl7_2.4.6-14_arm64.deb;name=libltdl7"
SRC_URI[libltdl7.md5sum] = "13e8e3afac4e54656026df8c879901b8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtool/libtool-bin_2.4.6-14_arm64.deb;name=libtool-bin"
SRC_URI[libtool-bin.md5sum] = "643310e36c18af9687dbd496ca66a71e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libt/libtool/libtool_2.4.6-14_all.deb;name=libtool"
SRC_URI[libtool.md5sum] = "ea5d8a9918b4c2a4b3600559a5531526"

# other configs to feed compilation
PKG_${UPN} = "libtool"
DEPENDS += " virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
PROVIDES += "libtool libltdl libtool-cross"
FILES_${UPN} += " /usr/lib/libltdl.* "

do_install_append(){
    mv ${D}/usr/lib/aarch64-linux-gnu/libltdl* ${D}/usr/lib/
}
