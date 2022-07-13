inherit upkg_base

LICENSE = "Various licenses"
LICENSE_libwrap0 = "Various licenses"
LICENSE_libwrap0-dev = "Various licenses"
LIC_FILES_CHKSUM = "\
    file://https://changelogs.ubuntu.com/changelogs/pool/main/t/tcp-wrappers/tcp-wrappers_7.6.q-30/copyright;md5=aebfac90929f6a69f2aa763213476b7d \
"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tcp-wrappers/libwrap0-dev_7.6.q-30_arm64.deb;name=libwrap0-dev"
SRC_URI[libwrap0-dev.md5sum] = "b5a890cee8bb33d2619c9e73e62b0571"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/t/tcp-wrappers/libwrap0_7.6.q-30_arm64.deb;name=libwrap0"
SRC_URI[libwrap0.md5sum] = "03743e521b067cbdc32febe24d93422c"

# other configs to feed compilation
PKG_${UPN} = "libwrap0"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  libnsl2"
PROVIDES += "tcp-wrappers "
