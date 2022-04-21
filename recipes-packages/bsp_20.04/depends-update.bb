inherit autotools systemd pkgconfig

DESCRIPTION = "Monitor and Modify dependency of oe packages when boot"
HOMEPAGE = "https://git.codelinaro.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\
${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

FILESEXTRAPATHS_prepend := "${WORKSPACE}/vendor/qcom/opensource/ubuntu-oss/:"
SRC_URI   = "file://depends-update"

S = "${WORKDIR}/depends-update"

do_compile[noexec]="1"

do_install_append() {
    install -m 0644 ${S}/etc/depends-update.service \
           -D ${D}${systemd_unitdir}/system/depends-update.service

    install -d ${D}${systemd_unitdir}/system/multi-user.target.wants/
    ln -sf ${systemd_unitdir}/system/depends-update.service \
           ${D}${systemd_unitdir}/system/multi-user.target.wants/depends-update.service
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} += "${systemd_unitdir}/system/"
