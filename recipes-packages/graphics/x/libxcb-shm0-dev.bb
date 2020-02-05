inherit deb-dl

LICENSE = "MIT-style"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
"

FULL_LINK = 'http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-shm0-dev_1.13-1_arm64.deb'
DEB_NAME = 'libxcb-shm0-dev_1.13-1_arm64.deb'

SRC_URI[md5sum] = "5f238ebe6a89df714e11c580205c6530"
