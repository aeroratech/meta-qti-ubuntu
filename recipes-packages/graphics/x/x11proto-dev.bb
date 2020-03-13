inherit deb-dl

LICENSE = "MIT-style"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-dev_2018.4-4_all.deb'
DEB_NAME = 'x11proto-dev_2018.4-4_all.deb'

SRC_URI[md5sum] = "1ae702d30ee651a034046af3cb70465b"
