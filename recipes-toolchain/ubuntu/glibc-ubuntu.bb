LICENSE = "EPL-1.0"
LICENSE_libc6-dev-arm64-cross = "EPL-1.0"
LICENSE_libc6-arm64-cross = "EPL-1.0"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cross-toolchain-base/libc6-dev-arm64-cross_2.31-0ubuntu7cross1_all.deb;name=libc6-dev-arm64-cross \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cross-toolchain-base/libc6-arm64-cross_2.31-0ubuntu7cross1_all.deb;name=libc6-arm64-cross"

SRC_URI[libc6-dev-arm64-cross.md5sum] = "ccae284e372d127341260f6967bdbc18"
SRC_URI[libc6-arm64-cross.md5sum] = "faa39c8bc40fdd78c570f21e22331f93"

# other configs to feed compilation
PACKAGES += "glibc-thread-db  libmemusage libsegfault ${UPN}-pcprofile apt ldconfig"
PROVIDES += "virtual/libc virtual/libintl virtual/libiconv libnsl2 ldconfig"
DEPENDS += "virtual/aarch64-linux-gnu-gcc linux-libc-headers libgcc"
# DEPENDS += "libgcc-initial"

FILES_${UPN} = "${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libc.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libc-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libcrypt*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libcrypt-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libm*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libm-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libmvec-*.so ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/ld*.so.* \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/ld-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libpthread*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libpthread-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libresolv*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libresolv-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/librt*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/librt-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libutil*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libutil-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnsl*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnsl-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnss_files*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnss_files-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnss_compat*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnss_compat-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnss_dns*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libnss_dns-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libdl*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libdl-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libanl*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libanl-*.so \
               ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libBrokenLocale*.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libBrokenLocale-*.so\
               "

FILES_libsegfault = "${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libSegFault*"
FILES_libmemusage = "${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libmemusage.so"
FILES_${UPN}-dev += "${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/*_nonshared.a ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/*.o"
FILES_${UPN}-pcprofile = "${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libpcprofile.so"
FILES_glibc-thread-db = "${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libthread_db.so.* ${exec_prefix}/${UBUNTU_TARGET_ARCH}/lib/libthread_db-*.so"

RPROVIDES_${UPN}-dev += "libc-dev libc-staticdev apt ldconfig"
PKG_${UPN}-dev = "libc6-dev-arm64-cross"

do_install() {
    cp -r ${DEBOUT}/* ${D}/
    if [ -d ${D}/${exec_prefix}/${UBUN_TARGET_SYS}/include ];then
        rm -rf ${D}/${exec_prefix}/${UBUN_TARGET_SYS}/include
        install -d ${D}${includedir}
        cp -r ${DEBOUT}${exec_prefix}/${UBUN_TARGET_SYS}/include/* ${D}${includedir}
    fi
}

