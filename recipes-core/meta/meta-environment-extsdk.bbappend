inherit toolchain-scripts-llvm

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}/../../../meta/:"


TARGET_SYS="aarch64-linux-gnu"

create_sdk_files_prepend(){
TARGET_SYS="aarch64-linux-gnu"
}
