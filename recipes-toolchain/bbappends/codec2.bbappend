HOST_LD = "/usr/bin/aarch64-linux-gnu-ld"

do_configure_prepend() {
	if [ -f ${HOST_LD} ];then
		cp ${HOST_LD} ${STAGING_DIR_NATIVE}/usr/bin/aarch64-oe-linux/aarch64-oe-linux-ld
	else
		bb.error "Please make sure your HOST have installed binutils-aarch64-linux-gnu."
	fi
}