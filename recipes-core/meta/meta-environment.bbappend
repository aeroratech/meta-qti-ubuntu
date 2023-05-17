inherit sdk-compile-parameters-scripts

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}/../../../meta/:"

create_sdk_files_append () {
# This generates kernel-devsrc-setup script
	sdk_compile_parameters_scripts ${SDK_OUTPUT}/${SDKPATH}/environment-setup-${REAL_MULTIMACH_TARGET_SYS}
}
