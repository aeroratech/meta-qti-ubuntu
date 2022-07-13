OECMAKE_C_COMPILER_aarch64 = "${bindir}/${TARGET_ARCH}-linux-gnu-gcc"
OECMAKE_CXX_COMPILER_aarch64 = "${bindir}/${TARGET_ARCH}-linux-gnu-gcc"
TARGET_CFLAGS += "-I${STAGING_INCDIR}/c++"
do_package_qa[noexec] = "1"
