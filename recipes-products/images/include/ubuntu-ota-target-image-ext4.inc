# To add OTA upgrade support on an emmc/ufs target,
# add the MACHINE name to this list.
# This is the "only" list that will control whether
# OTA upgrade will be supported on a target.
IS_OTA_SUPPORTED = "${@bb.utils.contains('COMBINED_FEATURES', 'qti-ab-boot', 'True', 'False', d)}"

RM_WORK_EXCLUDE_ITEMS += "rootfs rootfs-dbg"

IMAGE_SYSTEM_MOUNT_POINT = "/"

GNERATE_INCREMENT_OTA = " "

def emmc_set_vars_and_get_dependencies(d):
    if not d.getVar('IS_OTA_SUPPORTED', True) == 'True':
        d.setVar('GENERATE_AB_OTA_PACKAGE', "0")
        # Do not create machine-recovery-image or the OTA packages
        return ""

    if bb.utils.contains('COMBINED_FEATURES', 'qti-ab-boot', True, False, d):
        # if A/B support is supported, recovery image need not be generated.
        # only A/B target will be generated
        d.setVar('GENERATE_AB_OTA_PACKAGE', "1")
        return " releasetools-native zip-native fsconfig-native applypatch-native bc-native bsdiff-native"

# Add tasks to generate recovery image, OTA zip files
python __anonymous () {
    if bb.utils.contains('IMAGE_FSTYPES', 'ext4', True, False, d):
        d.appendVar('DEPENDS', emmc_set_vars_and_get_dependencies(d));
        if d.getVar('GENERATE_AB_OTA_PACKAGE', True) == '1':
                bb.build.addtask('do_recovery_ext4', 'do_build', 'do_image_complete', d)
                bb.build.addtask('do_deb', 'do_build', 'do_gen_ota_incremental_zip_ext4', d)
                bb.build.addtask('do_gen_ota_incremental_zip_ext4', 'do_build', 'do_recovery_ext4', d)
                bb.build.addtask('do_gen_ota_full_zip_ext4', 'do_build', 'do_gen_ota_incremental_zip_ext4', d) 
}

OTA_TARGET_IMAGE_ROOTFS_EXT4 = "${IMAGE_ROOTFS}/../${MACHINE}-ota-target-image-ext4"
MODULE_DEB = "${DEPLOY_DIR_IMAGE}/${MACHINE}-module-deb"
QTI_DEB = "${DEPLOY_DIR_IMAGE}/${MACHINE}-qti-deb"
OSS_DEB = "${DEPLOY_DIR_IMAGE}/OSS"
ALL_DEB = "${DEPLOY_DIR_IMAGE}/../../deb"

#Create directory structure for targetfiles.zip
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}"
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/BOOTABLE_IMAGES"
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/DATA"
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META"
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/OTA"
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY"
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/SYSTEM"
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/IMAGES"

#Create directory for module deb packages.
do_deb[cleandirs] += "${MODULE_DEB}"
do_deb[cleandirs] += "${MODULE_DEB}/DEBIAN"
do_deb[cleandirs] += "${QTI_DEB}"
do_deb[cleandirs] += "${OSS_DEB}"
do_deb[cleandirs] += "${QTI_DEB}/QTI"
do_deb[cleandirs] += "${QTI_DEB}/MODULE"

do_deb() {

   #Copy the ko module
   cd ${IMAGE_ROOTFS}/
   if [ -d "${IMAGE_ROOTFS}/lib/modules/5.4.161/extra" ];then
      cp --parents -vr lib/modules/5.4*/extra ${MODULE_DEB}/
   fi

   #Generate the control file which is used for DEBIAN
   touch ${MODULE_DEB}/DEBIAN/control
   chmod 0755 ${MODULE_DEB}/DEBIAN/control  
   echo Package: ${MACHINE}-module-deb.deb >> ${MODULE_DEB}/DEBIAN/control
   echo Version: 4.20-r0 >> ${MODULE_DEB}/DEBIAN/control
   echo Section: Software >> ${MODULE_DEB}/DEBIAN/control
   echo Priority: optional >> ${MODULE_DEB}/DEBIAN/control
   echo Architecture: arm64 >> ${MODULE_DEB}/DEBIAN/control
   echo Maintainer: OE-Core >> ${MODULE_DEB}/DEBIAN/control
   echo Description: ubuntu_module_debs >> ${MODULE_DEB}/DEBIAN/control
   echo  >> ${MODULE_DEB}/DEBIAN/control

   dpkg -b ${MODULE_DEB} ${QTI_DEB}/MODULE/${MACHINE}-module-deb.deb

   #Filter the QTI packages and copy to qti-deb

   cd ${QTI_DEB}/
   cp ${IMAGE_ROOTFS}/var/lib/dpkg/status status

   #Gain the QTI debs list
   cat status | grep -E "Package:|Maintainer:"  >  qti_deb
   sed -i '/Original-Maintainer:/d' qti_deb
   cat qti_deb | grep -B1 "Maintainer: OE-Core" | grep "Package:" > qti_deb_list
   sed -i 's/Package: //g' qti_deb_list

   cp qti_deb_list ${QTI_DEB}/QTI
   cp qti_deb_list ${IMAGE_ROOTFS}/var/lib/dpkg/qti_deb_list_device

   #Gain the OSS debs list
   cat qti_deb | grep "Package:" > all_deb_list
   sed -i 's/Package: //g' all_deb_list
   grep -wvf qti_deb_list all_deb_list > oss_deb_list

   cp oss_deb_list ${OSS_DEB}/
   cp oss_deb_list ${IMAGE_ROOTFS}/var/lib/dpkg/oss_deb_list_device

   #copy the QTI debs list according to the qti_deb_list
   for name in `cat qti_deb_list`
   do
    find ${ALL_DEB} -type f -name ${name}_* | xargs cp -t ${QTI_DEB}/QTI
   done

   rm -rf ${QTI_DEB}/QTI/*-dbg_*.deb
}

# Create this folder just for saving file_contexts(SElinux security context file),
# It will be used to generate OTA packages when selinux_fc is set.
do_recovery_ext4[cleandirs] += "${OTA_TARGET_IMAGE_ROOTFS_EXT4}/BOOT/RAMDISK"

# recovery rootfs is required for generating OTA files.
# Wait till all tasks of machine-recovery-image complete.

do_recovery_ext4() {

    # copy the boot\recovery images
    cp ${DEPLOY_DIR_IMAGE}/${BOOTIMAGE_TARGET} ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/BOOTABLE_IMAGES/boot.img
    #cp ${DEPLOY_DIR_IMAGE}/${BOOTIMAGE_TARGET} ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/BOOTABLE_IMAGES/recovery.img
    cp ${DEPLOY_DIR_IMAGE}/${BOOTIMAGE_TARGET}   ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/IMAGES/boot.img
    #cp ${DEPLOY_DIR_IMAGE}/${BOOTIMAGE_TARGET}   ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/IMAGES/recovery.img

    #cp ${DEPLOY_DIR_IMAGE}/${SYSTEMIMAGE_TARGET} ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/IMAGES/system.img
    cp ${DEPLOY_DIR_IMAGE}/system.map ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/IMAGES/system.map

    #cp ${DEPLOY_DIR_IMAGE}/${OVERLAYIMAGE_TARGET} ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/IMAGES/userdata.img
    #cp ${DEPLOY_DIR_IMAGE}/${OVERLAYIMAGE_MAP_TARGET} ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/IMAGES/userdata.map

    # copy the contents of system rootfs
    #cp -r ${IMAGE_ROOTFS}/. ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/SYSTEM/.
    #cd  ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/SYSTEM
    #rm -rf var/run
    #ln -snf ../run var/run

    # copy the contents of system overlayfs
    # cp -r ${IMAGE_ROOTFS}/overlay/. ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/DATA/.

    cp -r ${IMAGE_ROOTFS}/. ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY/.

    #generate recovery.fstab which is used by the updater-script
    echo #mount point fstype device [device2] >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY/recovery.fstab
    echo /boot     emmc  /dev/block/bootdevice/by-name/boot >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY/recovery.fstab
    # echo /overlay     ext4  /dev/block/bootdevice/by-name/userdata >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY/recovery.fstab
    echo ${IMAGE_SYSTEM_MOUNT_POINT}   ext4  /dev/block/bootdevice/by-name/system >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY/recovery.fstab

    #Getting content for OTA folder
    mkdir -p ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/OTA/bin
    cp   ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY/usr/bin/tmp/applypatch ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/OTA/bin/.

    cp   ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/RECOVERY/usr/bin/updater ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/OTA/bin/.

    # Pack releasetools.py into META folder itself.
    # This could also have been done by passing "--device_specific" to
    # ota_from_target_files.py but it would be hacky to find the absolute path there.
    cp ${STAGING_DIR_HOST}/usr/share/releasetools.py ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/.

    #cp and modify file_contexts to BOOT/RAMDISK folder
    #if [[ "${DISTRO_FEATURES}" =~ "selinux" ]]; then
    #    cp ${IMAGE_ROOTFS}/etc/selinux/mls/contexts/files/file_contexts ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/BOOT/RAMDISK/.
    #    sed -i 's#^/#/system/#g' ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/BOOT/RAMDISK/file_contexts
    #    #set selinux_fc
    #    echo selinux_fc=BOOT/RAMDISK/file_contexts >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt
    #    #set use_set_metadata to 1 so that updater-script
    #    #will have rules to apply selabels
    #    echo use_set_metadata=1 >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt
    #fi

    # copy contents of META folder
    #recovery_api_version is from recovery module
    echo recovery_api_version=3 >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    #blocksize = BOARD_FLASH_BLOCK_SIZE
    echo blocksize=131072 >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    export BOOT_SIZE=$(sed -r 's/.*label="boot_a".*size_in_kb="([0-9]+\.*[0-9]*).*/\1/;t;d' ${WORKDIR}/partition.xml)
    export SYSTEM_SIZE=$(sed -r 's/.*label="system_a".*size_in_kb="([0-9]+\.*[0-9]*).*/\1/;t;d' ${WORKDIR}/partition.xml)
    export USERDATA_SIZE=$(sed -r 's/.*label="userdata".*size_in_kb="([0-9]+\.*[0-9]*).*/\1/;t;d' ${WORKDIR}/partition.xml)

    # convert kb to bytes
    export BOOT_SIZE="$(expr $BOOT_SIZE \* 1024)"
    export SYSTEM_SIZE="$(expr $SYSTEM_SIZE \* 1024)"
    export USERDATA_SIZE="$(expr $USERDATA_SIZE \* 1024)"

    #boot_size: Size of boot partition from partition.xml
    echo "boot_size=0x$(echo "obase=16; $BOOT_SIZE" | bc)" >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    #system_size : Size of system partition from partition.xml
    echo "system_size=0x$(echo "obase=16; $SYSTEM_SIZE" | bc)" >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    #userdate_size : Size of data partition from partition.xml
    echo "userdate_size=0x$(echo "obase=16; $USERDATA_SIZE" | bc)" >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    #cache_size : Size of data partition from partition.xml
    echo "cache_size=0x$(echo "obase=16; $USERDATA_SIZE" | bc)" >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    #mkyaffs2_extra_flags : -c $(BOARD_KERNEL_PAGESIZE) -s $(BOARD_KERNEL_SPARESIZE)
    echo mkyaffs2_extra_flags=-c 4096 -s 16 >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    #extfs_sparse_flag : definition in build
    echo extfs_sparse_flags=-s >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    #default_system_dev_certificate : Dummy location
    echo default_system_dev_certificate=build/abcd >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    # set block img diff version to v3
    echo "blockimgdiff_versions=3" >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt

    # Targets that support A/B boot do not need recovery(fs)-updater
    echo le_target_supports_ab=1 >> ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/META/misc_info.txt
}

do_gen_ota_incremental_zip_ext4() {
    if [ -f "${DEPLOY_DIR_IMAGE}/target-files-ext4.zip" -a "${GNERATE_INCREMENT_OTA}" = "true" ]; then
        # Clean up any existing target-files*.zip as this can lead to incorrect content getting packed in the zip.
        rm -f ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/../target-files-ext4.zip

        cd ${OTA_TARGET_IMAGE_ROOTFS_EXT4} && zip -qry ../target-files-ext4.zip *

        cd ${STAGING_DIR_NATIVE}/usr/bin/releasetools && ./incremental_ota.sh ${DEPLOY_DIR_IMAGE}/target-files-ext4.zip ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/../target-files-ext4.zip ${IMAGE_ROOTFS} ext4 --block --system_path ${IMAGE_SYSTEM_MOUNT_POINT}

        cp ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/../target-files-ext4.zip ${DEPLOY_DIR_IMAGE}
        cp ${STAGING_DIR_NATIVE}/usr/bin/releasetools/update_incr_ext4.zip ${DEPLOY_DIR_IMAGE}/incremental_update_ext4.zip
    else
        return 0
    fi
}

# Generate OTA zip files
do_gen_ota_full_zip_ext4() { 
    # Clean up any existing target-files*.zip as this can lead to incorrect content getting packed in the zip.
    rm -f ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/../target-files-ext4.zip
    cd ${OTA_TARGET_IMAGE_ROOTFS_EXT4} && zip -qry ../target-files-ext4.zip *

    cd ${STAGING_DIR_NATIVE}/usr/bin/releasetools && ./full_ota.sh ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/../target-files-ext4.zip ${IMAGE_ROOTFS} ext4 --block --ubuntu --system_path ${IMAGE_SYSTEM_MOUNT_POINT}

    cp ${OTA_TARGET_IMAGE_ROOTFS_EXT4}/../target-files-ext4.zip ${DEPLOY_DIR_IMAGE}
    cp ${STAGING_DIR_NATIVE}/usr/bin/releasetools/update_ext4.zip ${DEPLOY_DIR_IMAGE}/full_update_ext4.zip
}
