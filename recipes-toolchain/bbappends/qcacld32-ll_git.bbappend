DEPENDS_remove = "rtsp-alg"

EXTRA_OEMAKE += "M=../../../work/${MACHINE_ARCH}-oe-linux/qcacld32-ll/git-r8/wlan/qcacld-3.0"

#solve LD argumelist too long
do_compile_prepend() {
    cp ${STAGING_KERNEL_DIR}/scripts/Kbuild.include ${STAGING_KERNEL_DIR}/scripts/Kbuild.include.bk
    #file = ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
    sed -i '224,225d' ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
    sed -i  224i'	$(cmd),@:)' ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
}

do_install_append() {
        mv ${STAGING_KERNEL_DIR}/scripts/Kbuild.include.bk  ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
}
