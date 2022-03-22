inherit upkg_base

LICENSE = "LGPL-2.1+ & CCO-1.0 & GPL-2.0+ & GPL-2.0-with-Linux-syscall-note-exception & MIT & PD"
LICENSE_libudev1 = "LGPL-2.1+ & CCO-1.0 & GPL-2.0+ & GPL-2.0-with-Linux-syscall-note-exception & MIT & PD"
LICENSE_udev = "LGPL-2.1+ & CCO-1.0 & GPL-2.0+ & GPL-2.0-with-Linux-syscall-note-exception & MIT & PD"
LICENSE_libsystemd0 = "LGPL-2.1+ & CCO-1.0 & GPL-2.0+ & GPL-2.0-with-Linux-syscall-note-exception & MIT & PD"
LICENSE_systemd = "LGPL-2.1+ & CCO-1.0 & GPL-2.0+ & GPL-2.0-with-Linux-syscall-note-exception & MIT & PD"
LICENSE_libudev-dev = "LGPL-2.1+ & CCO-1.0 & GPL-2.0+ & GPL-2.0-with-Linux-syscall-note-exception & MIT & PD"
LICENSE_libsystemd-dev = "LGPL-2.1+ & CCO-1.0 & GPL-2.0-with-Linux-syscall-note-exception & GPL-2.0+ & MIT"
LICENSE_systemd-sysv = "LGPL-2.1+ & CCO-1.0 & GPL-2.0+ & GPL-2.0-with-Linux-syscall-note-exception & MIT & PD"

ALLOW_EMPTY_libudev = "1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/systemd/libsystemd-dev_245.4-4ubuntu3_arm64.deb;name=libsystemd-dev"
SRC_URI[libsystemd-dev.md5sum] = "abe196acc033c16ea14546e777e02dfe"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/systemd/libudev-dev_245.4-4ubuntu3_arm64.deb;name=libudev-dev"
SRC_URI[libudev-dev.md5sum] = "ee33dd33ded669175f38dc0c5819eb21"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/systemd/systemd_245.4-4ubuntu3_arm64.deb;name=systemd"
SRC_URI[systemd.md5sum] = "c7751be82e38c95b3ef69ca3444f56a0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/systemd/libsystemd0_245.4-4ubuntu3_arm64.deb;name=libsystemd0"
SRC_URI[libsystemd0.md5sum] = "66ee9f17f0d934a37b2ff930e3bef563"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/systemd/udev_245.4-4ubuntu3_arm64.deb;name=udev"
SRC_URI[udev.md5sum] = "fead5a9b49b8542e6fb712d71efec019"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/systemd/libudev1_245.4-4ubuntu3_arm64.deb;name=libudev1"
SRC_URI[libudev1.md5sum] = "f750bc30c679345815aee5739232116d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/systemd/systemd-sysv_245.4-4ubuntu3_arm64.deb;name=systemd-sysv"
SRC_URI[systemd-sysv.md5sum] = "f99b837a47e6c73a384a2c23ebcdeb98"

# other configs to feed compilation
DEPENDS += "pkgconfig-native virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc gettext-minimal-native intltool-native gperf-native libcap util-linux perl-native base-files shadow-native shadow-sysroot shadow base-passwd python3-native  meson-native ninja-native bash-completion acl audit kmod libselinux xz virtual/update-alternatives systemd-systemctl-native"
DEPENDS += "    libtool-cross      gmp lz4"

#dependency for ubuntu
DEPENDS += "libgcrypt20 "

PROVIDES += " udev libudev libsystemd0 libudev-dev libsystemd-dev"


#libudev to libudev-dev

PACKAGES += "libudev"
RPROVIDES_libudev = "libudev"
PKG_libudev = "libudev-dev"
