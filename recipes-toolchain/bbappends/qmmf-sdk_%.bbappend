FILESEXTRAPATHS_append := "${THISDIR}:${THISDIR}/qmmf-sdk:"

SRC_URI += "file://fix_links_missing.patch"
TARGET_SYS = "${TARGET_ARCH}-linux-gnu"
TARGET_CFLAGS += "-I${STAGING_INCDIR}/c++"
TARGET_CFLAGS += "-I${STAGING_INCDIR}/c++/backward"

