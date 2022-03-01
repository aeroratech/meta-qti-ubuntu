DEPENDS_remove = "rtsp-alg"

#solve LD argumelist too long
do_compile_prepend() {
    cp ${STAGING_KERNEL_DIR}/scripts/Kbuild.include ${STAGING_KERNEL_DIR}/scripts/Kbuild.include.bk
    #file = ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
    sed -i '260,263d' ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
    sed -i  260i'if_changed = $(if $(strip $(any-prereq) $(arg-check)),  @set -e; $(echo-cmd) $(cmd_$(1))) ' ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
}

do_install_append() {
        mv ${STAGING_KERNEL_DIR}/scripts/Kbuild.include.bk  ${STAGING_KERNEL_DIR}/scripts/Kbuild.include
}
