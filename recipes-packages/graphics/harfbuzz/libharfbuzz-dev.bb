inherit deb-dl

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/h/harfbuzz/libharfbuzz-dev_1.7.2-1ubuntu1_arm64.deb'
DEB_NAME = 'libharfbuzz-dev_1.7.2-1ubuntu1_arm64.deb'

SRC_URI[md5sum] = "eaae50e3200c090234068a2828e6cb67"
