LICENSE = "MIT-Style & BSD-3-Clause"
LICENSE_libncurses6 = "MIT-Style & BSD-3-Clause"
LICENSE_libncursesw6 = "MIT-Style & BSD-3-Clause"
LICENSE_libncurses-dev = "MIT-Style & BSD-3-Clause"
LICENSE_libtinfo-dev = "MIT-Style & BSD-3-Clause"
LICENSE_libtinfo6 = "MIT-Style & BSD-3-Clause"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/ncurses/libncurses6_6.2-0ubuntu2_arm64.deb;name=libncurses6 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/n/ncurses/libncursesw6_6.2-0ubuntu2_arm64.deb;name=libncursesw6 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/n/ncurses/libncurses-dev_6.2-0ubuntu2_arm64.deb;name=libncurses-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/n/ncurses/libtinfo-dev_6.2-0ubuntu2_arm64.deb;name=libtinfo-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/n/ncurses/libtinfo6_6.2-0ubuntu2_arm64.deb;name=libtinfo6"

SRC_URI[libncurses6.md5sum] = "c6e05748821ea976283c8018a199433a"
SRC_URI[libncursesw6.md5sum] = "e623276621c0e4f11b3ea9071d1a10c5"
SRC_URI[libncurses-dev.md5sum] = "66c44f6899891067c4129bf666f513d9"
SRC_URI[libtinfo-dev.md5sum] = "d33ac4c91d7b24d7441b2816232ffaad"
SRC_URI[libtinfo6.md5sum] = "4948feed76533621b3b84275f1595f59"

# other configs to feed compilation
PKG_${UPN} = "libncurses6"
PACKAGES += "curses nativesdk-curses"
RPROVIDES_${UPN} += "curses nativesdk-curses"
DEPENDS += "libtool-cross virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc virtual/update-alternatives"
