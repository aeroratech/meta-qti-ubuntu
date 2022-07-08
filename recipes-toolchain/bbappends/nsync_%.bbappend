OECMAKE_C_COMPILER_aarch64 = "/usr/bin/${TARGET_ARCH}-linux-gnu-gcc"
OECMAKE_CXX_COMPILER_aarch64 = "/usr/bin/${TARGET_ARCH}-linux-gnu-g++"
TARGET_CFLAGS += "-I${STAGING_INCDIR}/c++"
TARGET_LDFLAGS_aarch64 += "-L${STAGING_LIBDIR}/${TARGET_ARCH}-linux-gnu"
