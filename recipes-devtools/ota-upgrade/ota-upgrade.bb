DESCRIPTION = "update-alternatives recovery when boot"
HOMEPAGE = "https://git.codelinaro.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/\	
${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI   = "file://ota-upgrade.sh"

do_config[noexec]="1"
do_compile[noexec]="1"

do_install_append() {
	install -m 0744 ${WORKDIR}/ota-upgrade.sh \
		   -D ${D}${bindir}/ota-upgrade.sh
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} += "ota-upgrade.sh"
