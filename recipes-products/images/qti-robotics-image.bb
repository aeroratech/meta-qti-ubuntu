inherit uimage extrausers

#require ${META_QTI_BSP_IMAGE_PATH}/include/mdm-bootimg.inc
#DEPENDS += " mkbootimg-native "

#require ${META_QTI_BSP_IMAGE_PATH}/include/mdm-ota-target-image-ubi.inc
#require ${META_QTI_BSP_IMAGE_PATH}/include/mdm-ota-target-image-ext4.inc

#MULTILIBRE_ALLOW_REP =. "/usr/include/python2.7/*|${base_bindir}|${base_sbindir}|${bindir}|${sbindir}|${libexecdir}|${sysconfdir}|${nonarch_base_libdir}/udev|/lib/modules/[^/]*/modules.*|"

EXTRA_USERS_PARAMS = "usermod -P oelinux123 root;"

do_populate_lic_deploy[noexec] = "1"

DEPENDS += "ubuntu-base"

CORE_IMAGE_BASE_INSTALL = " \
            edk2 \
            kernel-modules \
            adbd \
            binder \
            usb-composition \
            "
            
#            post-boot \
#            usb-composition \
#            qcacld30-ll \
#            cld80211-lib \
#            wpa-supplicant-qcacld-naples \
#            hostap-daemon-qcacld \
#           wlan-conf \
#            wireless-tools \
#            qmi-framework-vendor \
#            kmod \
#            libcap \
#"


DEB_PREPROCESS_COMMANDS += "do_ubuntu_rootfs;"

UBUNTU_TAR_FILE="${EXTERNAL_TOOLCHAIN}/ubuntu-base-18.04.2-base-arm64.tar.gz"


do_ubuntu_rootfs(){
    tar -xf ${UBUNTU_TAR_FILE} --exclude=dev -C ${IMAGE_ROOTFS}
    install -m 0751 -d ${IMAGE_ROOTFS}/dev
    install -m 0777 -d ${IMAGE_ROOTFS}/tmp
    chown -R root:root ${IMAGE_ROOTFS}/bin/su 
    chmod a+s ${IMAGE_ROOTFS}/bin/su 

#   ---- design to avoid do_rootfs status error ----
#    mv ${IMAGE_ROOTFS}/var/lib/dpkg/status ${IMAGE_ROOTFS}/var/lib/dpkg/status-ubuntu 
#    touch ${IMAGE_ROOTFS}/var/lib/dpkg/status
#
#   ---- fix error : unknown group 'messagebus' in statoverride file ----
    rm ${IMAGE_ROOTFS}/var/lib/dpkg/statoverride
    touch ${IMAGE_ROOTFS}/var/lib/dpkg/statoverride
#   ----------------------------------------------------------------------
#   ---- fix error : do_rootfs: Preinstall for package xxxx failed ----
    rm -rf ${IMAGE_ROOTFS}/var/lib/dpkg/info/*.postinst   
    rm -rf ${IMAGE_ROOTFS}/var/lib/dpkg/info/*.preinst   
#   ---- fix user conflicts ----
# 
#   ----------------------------------------------------------------------
}




# design this part to avoid python3 dpkg installation error
PMPY="${COREBASE}/meta/lib/oe/package_manager.py"
do_pm(){
    bbwarn " applying Ubuntu PM changes "
    sed -i 's/if m is not None:/if m is not None and not "python3.6" and not "util-linux\*":/g' ${PMPY}
}

do_rec_pm(){
    bbwarn " recovering Ubuntu PM changes "
    sed -i 's/if m is not None and not "python3.6" and not "util-linux\*":/if m is not None:/g' ${PMPY}
}


#addtask do_pm before do_rootfs
#addtask do_rec_pm after do_image_qa before do_image_complete

#----------------------------------------------------------
#----to record there are 2 useful Yocto process timing ----
#DEB_PREPROCESS_COMMANDS = " do_pm "
#DEB_POSTPROCESS_COMMANDS = " rec_pm "
#ROOTFS_POSTPROCESS_COMMAND += "do_fsconfig; "
#ROOTFS_PREPROCESS_COMMAND += "do_pm; "
#----------------------------------------------------------
