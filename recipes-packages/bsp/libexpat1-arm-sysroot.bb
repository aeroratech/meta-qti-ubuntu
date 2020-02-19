inherit deb-dl

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/e/expat/libexpat1_2.2.5-3_arm64.deb'
DEB_NAME = 'libexpat1_2.2.5-3_arm64.deb'

SRC_URI[md5sum] = "809eef6f84cce694f00aba5f56fd2bee"
