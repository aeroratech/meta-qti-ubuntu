LICENSE = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libblkid1 = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libblkid-dev = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_uuid-dev = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libfdisk-dev = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libfdisk1 = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libmount-dev = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libmount1 = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libsmartcols-dev = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"
LICENSE_libsmartcols1 = "GPL-2.0+ & LGPL-2.1+ & BSD-3-clause & BSD-4-Clause & PD"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libblkid1_2.34-0.1ubuntu9_arm64.deb;name=libblkid1 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libblkid-dev_2.34-0.1ubuntu9_arm64.deb;name=libblkid-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/uuid-dev_2.34-0.1ubuntu9_arm64.deb;name=uuid-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libuuid1_2.34-0.1ubuntu9_arm64.deb;name=libuuid1 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libfdisk-dev_2.34-0.1ubuntu9_arm64.deb;name=libfdisk-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libfdisk1_2.34-0.1ubuntu9_arm64.deb;name=libfdisk1 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libmount-dev_2.34-0.1ubuntu9_arm64.deb;name=libmount-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libmount1_2.34-0.1ubuntu9_arm64.deb;name=libmount1 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libsmartcols-dev_2.34-0.1ubuntu9_arm64.deb;name=libsmartcols-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/u/util-linux/libsmartcols1_2.34-0.1ubuntu9_arm64.deb;name=libsmartcols1"

SRC_URI[libblkid1.md5sum] = "009404067390eb9ee74b700085e92cf5"
SRC_URI[libblkid-dev.md5sum] = "4ee6f9bd14c663156b11510f2f173838"
SRC_URI[uuid-dev.md5sum] = "3b9a2dab4d6aca9c33b5c411a84190f8"
SRC_URI[libuuid1.md5sum] = "9cc15f966a9a6f7659ca55dc3d627334"
SRC_URI[libfdisk-dev.md5sum] = "82db7f82339796d35c66f7fd3eabc5fb"
SRC_URI[libfdisk1.md5sum] = "fb410c9f5f664adfa531d5ab6f9dd1be"
SRC_URI[libmount-dev.md5sum] = "16cfac0766b139c37171a08e3d483982"
SRC_URI[libmount1.md5sum] = "c7247215eb6d41a5987f383c2b933a7e"
SRC_URI[libsmartcols-dev.md5sum] = "d6042b1ec86402b16ead6d5204add15e"
SRC_URI[libsmartcols1.md5sum] = "990da01180059c39aa388827a15cf1c1"

# other configs to feed compilation
FILES_${UPN} = "${base_libdir}/${UBUN_TARGET_SYS}/libuuid.so.* ${base_libdir}/${UBUN_TARGET_SYS}/libblkid.so.* ${base_libdir}/${UBUN_TARGET_SYS}/libmount.so.*"
PACKAGES += "${UPN}-bash-completion ${UPN}-swaponoff util-linux-sulogin util-linux-agetty util-linux-mount util-linux-umount util-linux-fsck"
RPROVIDES_${UPN} += "util-linux-sulogin util-linux-agetty util-linux-mount util-linux-umount util-linux-fsck"
PKG_${UPN} = "libblkid1"
DEPENDS += "libtool-cross virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libcap-ng ncurses virtual/crypt zlib bash-completion  libpam libselinux virtual/update-alternatives"