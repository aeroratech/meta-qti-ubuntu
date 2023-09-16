inherit sdk-compile-parameters-scripts

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}/../../../meta/:"

TARGET_SYS="aarch64-linux-gnu"

create_sdk_files_prepend(){
TARGET_SYS="aarch64-linux-gnu"
}

create_sdk_files_append () {
# This generates kernel-devsrc-setup script
	sdk_compile_parameters_scripts ${SDK_OUTPUT}/${SDKPATH}/environment-setup-${REAL_MULTIMACH_TARGET_SYS}
}
