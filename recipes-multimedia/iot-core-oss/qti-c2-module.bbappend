OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"
EXTRA_OECMAKE += "-DIOT_CORE_OSS_INSTALL_LIBDIR=${libdir}/${UBUN_TARGET_SYS}"
EXTRA_OECMAKE += "-DSYSROOT_LIBDIR=${STAGING_LIBDIR}/${UBUN_TARGET_SYS}"