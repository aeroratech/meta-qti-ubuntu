DESCRIPTION = "update-alternatives recovery when boot"
HOMEPAGE = "https://git.codelinaro.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\	
${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI   = "file://ota-upgrade.sh"
SRC_URI   += "file://ufs-bsg.rules"
SRC_URI   += "file://public_key.pem"

do_config[noexec]="1"
do_compile[noexec]="1"

do_install_append() {
	install -m 0744 ${WORKDIR}/ota-upgrade.sh \
		   -D ${D}${bindir}/ota-upgrade.sh
	install -m 0555 ${WORKDIR}/public_key.pem \
		   -D ${D}${sysconfdir}/ssl/certs/public_key.pem
	install -m 0755 ${WORKDIR}/ufs-bsg.rules \
		   -D ${D}${sysconfdir}/udev/rules.d/ufs-bsg.rules
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} += "ota-upgrade.sh"
