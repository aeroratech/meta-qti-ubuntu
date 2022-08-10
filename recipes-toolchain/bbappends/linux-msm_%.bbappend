SRC_URI += " file://virtualization.cfg file://virtualization_robomaker.cfg "


require recipes-toolchain/bbappends/linux-msm/modules_headers.inc

FILESEXTRAPATHS_prepend := "${COREBASE}/meta-qti-ubuntu/recipes-toolchain/bbappends/linux-msm/:"
SRC_URI += "file://lunch-make-scripts file://lunch-make-scripts.service"

CP_ARGS = "-Prfd --preserve=mode,timestamps --no-preserve=ownership"
H = "${WORKDIR}/header"

DEPENDS_remove = "llvm-arm-toolchain-native clang-native"
TOOLCHAIN = "gcc"
RUNTIME = ''
KERNEL_CC = "${CCACHE}${HOST_PREFIX}gcc ${TARGET_CC_ARCH}${TOOLCHAIN_OPTIONS}"

do_generate_defconfig () {
        ARCH=${ARCH} CROSS_COMPILE=${CROSS_COMPILE} REAL_CC="${CCACHE}${HOST_PREFIX}gcc ${TARGET_CC_ARCH}${TOOLCHAIN_OPTIONS}"
        LD=${CCACHE}${HOST_PREFIX}ld KERN_OUT=${STAGING_KERNEL_BUILDDIR} \
        ${STAGING_KERNEL_DIR}/scripts/gki/generate_defconfig.sh ${KERNEL_CONFIG}
}
do_configure[prefuncs] += "${@oe.utils.conditional('DYNAMIC_DEFCONFIG', 'True', 'do_generate_defconfig', '', d)}"

do_symlink_devicetree () {
	if [ ! -L "${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor" ]; then
		ln -sfr ${STAGING_KERNEL_DIR}/vendor/qcom/proprietary/devicetree ${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor
	fi

	if [ ! -L "${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor/qcom/camera" ]; then
		ln -sfr ${STAGING_KERNEL_DIR}/vendor/qcom/proprietary/camera-devicetree ${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor/qcom/camera
	fi

	if [ ! -L "${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor/qcom/display" ]; then
		ln -sfr ${STAGING_KERNEL_DIR}/vendor/qcom/proprietary/display-devicetree/display ${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor/qcom/display
	fi

	if [ ! -L "${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor/bindings/display/qcom" ]; then
		ln -sfr ${STAGING_KERNEL_DIR}/vendor/qcom/proprietary/display-devicetree/bindings ${STAGING_KERNEL_DIR}/arch/arm64/boot/dts/vendor/bindings/display/qcom
	fi
}
addtask do_symlink_devicetree before do_configure after do_symlink_kernsrc


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
