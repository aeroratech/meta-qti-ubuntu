TARGET_SYS = "${TARGET_ARCH}-linux-gnu"
TARGET_CFLAGS += "-I${STAGING_INCDIR}/c++"
TARGET_CFLAGS += "-I${STAGING_INCDIR}/c++/backward"
do_package_qa[noexec] = "1"
