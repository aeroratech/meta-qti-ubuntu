inherit deb-dl

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"


FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/libd/libdrm/libdrm2_2.4.99-1ubuntu1~18.04.2_arm64.deb'
DEB_NAME = 'libdrm2_2.4.99-1ubuntu1~18.04.2_arm64.deb'

SRC_URI[md5sum] = "2a95ae4b25fe0b633d10c08708b0ac2b"
