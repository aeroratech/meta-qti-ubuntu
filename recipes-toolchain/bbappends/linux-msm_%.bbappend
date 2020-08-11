SRC_URI += " file://virtualization.cfg file://virtualization_robomaker.cfg "


require recipes-toolchain/bbappends/linux-msm/modules_headers.inc

FILESEXTRAPATHS_prepend := "${COREBASE}/meta-qti-ubuntu/recipes-toolchain/bbappends/linux-msm/:"
SRC_URI += "file://lunch-make-scripts file://lunch-make-scripts.service"

CP_ARGS = "-Prfd --preserve=mode,timestamps --no-preserve=ownership"
H = "${WORKDIR}/header"

do_shared_workdir_append_qrb5165 () {
	mkdir -p ${H}
	make_header ${H} ${S} ${B}
	rm_host_arch_files ${H}
}

do_install_append_qrb5165 () {

	install -d ${D}/etc/
	install -d ${D}${systemd_unitdir}/system/multi-user.target.wants/

	install -m 0755 ${WORKDIR}/lunch-make-scripts -D ${D}/etc/lunch-make-scripts
	install -m 0644 ${WORKDIR}/lunch-make-scripts.service \
		-D ${D}${systemd_unitdir}/system/lunch-make-scripts.service

	ln -sf ${systemd_unitdir}/system/lunch-make-scripts.service \
		${D}${systemd_unitdir}/system/multi-user.target.wants/lunch-make-scripts.service

	install -d ${D}/usr/src/header
	cp ${CP_ARGS} ${H}/. ${D}/usr/src/header/
	rm -rf ${H}
}

PACKAGES += " \
	msm-header \
"
FILES_msm-header += " \
	/usr/src/header \
	/etc/lunch-make-scripts \
	${systemd_unitdir}/system/ \
"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
