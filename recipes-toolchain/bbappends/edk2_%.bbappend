FILESEXTRAPATHS_append := "${THISDIR}:${THISDIR}/edk2:"
  
SRC_URI += "file://strcnpy_error_with_ubuntu.patch"

PARALLEL_MAKE += "-j 1"

CLANG_PREFIX_ubuntu = "${TARGET_PREFIX}"
ENABLED_BOOT_WITH_FS = "${@bb.utils.contains('DISTRO_FEATURES', 'boot_with_fs', '1', '', d)}"

EXTRA_OEMAKE_append += " \
    'RW_ROOTFS=1'\
    'UBUNTU_AB_OTA=1'\
    'ENABLE_SYSTEMD_BOOTSLOT=${SYSTEMD_BOOTSLOT_ENABLED}'\
    'BOOT_WITH_FS=${ENABLED_BOOT_WITH_FS}'\
"
