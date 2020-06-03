inherit deb-dl

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"


FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdrm/libdrm-freedreno1_2.4.99-1ubuntu1~18.04.2_arm64.deb'
DEB_NAME = 'libdrm-freedreno1_2.4.99-1ubuntu1~18.04.2_arm64.deb'

SRC_URI[md5sum] = "8cde1bc4c0483bffff431ef42b6ecb37"
