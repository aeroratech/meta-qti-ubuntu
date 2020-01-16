inherit deb-dl

LICENSE = "MIT-style"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb1_1.13-1_arm64.deb'
DEB_NAME = 'libxcb1_1.13-1_arm64.deb'

SRC_URI[md5sum] = "355f6c9c1f2ebd15e30d08c21efc1290"
