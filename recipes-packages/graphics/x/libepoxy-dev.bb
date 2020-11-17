inherit deb-dl

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/libe/libepoxy/libepoxy-dev_1.4.3-1_arm64.deb'
DEB_NAME = 'libepoxy-dev_1.4.3-1_arm64.deb'

SRC_URI[md5sum] = "1fc58f5228b3c0acadefd58e58a50db2"
