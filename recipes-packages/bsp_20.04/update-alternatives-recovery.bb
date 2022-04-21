inherit autotools systemd pkgconfig

DESCRIPTION = "update-alternatives recovery when boot"
HOMEPAGE = "https://git.codelinaro.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\
${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

FILESEXTRAPATHS_prepend := "${WORKSPACE}/vendor/qcom/opensource/ubuntu-oss/:"
SRC_URI   = "file://update-alternatives"

BBCLASSEXTEND = "native"

S = "${WORKDIR}/update-alternatives"

do_compile[noexec]="1"

do_install_append() {
    install -m 0644 ${S}/etc/update-alternatives-recovery.service \
           -D ${D}${systemd_unitdir}/system/update-alternatives-recovery.service

    install -d ${D}${systemd_unitdir}/system/sysinit.target.wants/
    ln -sf ${systemd_unitdir}/system/update-alternatives-recovery.service \
           ${D}${systemd_unitdir}/system/sysinit.target.wants/update-alternatives-recovery.service
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} += "${systemd_unitdir}/system/"
