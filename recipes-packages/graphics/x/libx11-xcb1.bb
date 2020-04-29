inherit deb-dl

LICENSE = "MIT & MIT-style & BSD"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"


FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libx11/libx11-xcb1_1.6.4-3_arm64.deb'
DEB_NAME = 'libx11-xcb1_1.6.4-3_arm64.deb'

SRC_URI[md5sum] = "3b0b30c6a8ec9406f55dba8e78fe4ec9"
