inherit deb-dl

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/e/expat/libexpat1-dev_2.2.5-3ubuntu0.2_arm64.deb'
DEB_NAME = 'libexpat1-dev_2.2.5-3ubuntu0.2_arm64.deb'

SRC_URI[md5sum] = "931f149a17b49494f2f37bcdc0444eaf"
