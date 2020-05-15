inherit uimage extrausers

#require ${META_QTI_BSP_IMAGE_PATH}/include/mdm-bootimg.inc
#DEPENDS += " mkbootimg-native "

#require ${META_QTI_BSP_IMAGE_PATH}/include/mdm-ota-target-image-ubi.inc
#require ${META_QTI_BSP_IMAGE_PATH}/include/mdm-ota-target-image-ext4.inc

#MULTILIBRE_ALLOW_REP =. "/usr/include/python2.7/*|${base_bindir}|${base_sbindir}|${bindir}|${sbindir}|${libexecdir}|${sysconfdir}|${nonarch_base_libdir}/udev|/lib/modules/[^/]*/modules.*|"

EXTRA_USERS_PARAMS = "usermod -P oelinux123 root;"
EXTRA_USERS_PARAMS += "usermod -g 3003 _apt;"

do_populate_lic_deploy[noexec] = "1"

DEPENDS += "ubuntu-base"

CORE_IMAGE_BASE_INSTALL = " \
            kernel-modules \
            systemd-machine-units \
            yavta \
            packagegroup-startup-scripts \
            packagegroup-android-utils \
            packagegroup-qti-core-prop \
            packagegroup-qti-dsp \
            packagegroup-qti-fastcv \
            packagegroup-qti-ss-mgr \
            "
#Install packages for wlan
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-wifi \
            "
#install drm
CORE_IMAGE_BASE_INSTALL += " \
            libdrm \
            libdrm-tests \
            libdrm-kms \
            "
#Install packages for graphic and display
CORE_IMAGE_BASE_INSTALL += " \
            adreno \
            weston \
            "
#Install packages for video
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-video \
            ${@bb.utils.contains_any("DISTRO", "qti-distro-ubuntu-fullstack-debug qti-distro-ubuntu-fullstack-perf",  "packagegroup-qti-gst", "", d)} \
            "
#Install packages for camera
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-camera \
            "
#Install packages for bluetooth
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-bluetooth \
"

UBUNTU_TAR_FILE="${EXTERNAL_TOOLCHAIN}/ubuntu-base-18.04.2-base-arm64.tar.gz"

do_ubuntu_rootfs(){
    tar -xf ${UBUNTU_TAR_FILE} --exclude=dev -C ${IMAGE_ROOTFS}
    install -m 0751 -d ${IMAGE_ROOTFS}/dev
    install -m 0777 -d ${IMAGE_ROOTFS}/tmp
    chown -R root:root ${IMAGE_ROOTFS}/bin/su 
    chmod a+s ${IMAGE_ROOTFS}/bin/su 
    #add firmware & dsp & bt_firmware
    mkdir -p ${IMAGE_ROOTFS}/firmware
    mkdir -p ${IMAGE_ROOTFS}/lib/firmware
    ln -sf /firmware/image ${IMAGE_ROOTFS}/lib/firmware/updates
    mkdir -p ${IMAGE_ROOTFS}/dsp
    mkdir -p ${IMAGE_ROOTFS}/bt_firmware
    ln -sf /bin/bash   ${IMAGE_ROOTFS}/bin/sh
#   replace the cpufreq governor ondemand with schedutil
    rm -rf ${IMAGE_ROOTFS}/etc/systemd/system/multi-user.target.wants/ondemand.service
#   ---- design to avoid do_rootfs status error ----
#    mv ${IMAGE_ROOTFS}/var/lib/dpkg/status ${IMAGE_ROOTFS}/var/lib/dpkg/status-ubuntu 
#    touch ${IMAGE_ROOTFS}/var/lib/dpkg/status
#
#   ---- fix error : unknown group 'messagebus' in statoverride file ----
#    rm ${IMAGE_ROOTFS}/var/lib/dpkg/statoverride
#    touch ${IMAGE_ROOTFS}/var/lib/dpkg/statoverride
#   ----------------------------------------------------------------------
#   ---- fix user conflicts ----
# 
#   ----------------------------------------------------------------------
}

do_deb_pre() {
    do_ubuntu_rootfs
}

do_fs_post() {
    #fix adbd launch command
    sed -i "s@start-stop-daemon -S -b -a /sbin/adbd@start-stop-daemon -S -b --exec /sbin/adbd@g" ${IMAGE_ROOTFS}/etc/launch_adbd

    #fix apt status version error
    sed -i "s@git-r@0-1@g" ${IMAGE_ROOTFS}/var/lib/dpkg/status
    sed -i "s@>= git@>= 0@g" ${IMAGE_ROOTFS}/var/lib/dpkg/status

#   ---- fix mesa/adreno file list conflicts ----
    if [ -e ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list ]; then
        sed -i '/usr\/include\/KHR/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/KHR\/khrplatform.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/EGL\/egl.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/EGL\/eglext.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/EGL\/eglplatform.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/GLES2\/gl2.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/GLES2\/gl2ext.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/GLES2\/gl2platform.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/GLES3\/gl3.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/GLES3\/gl31.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/GLES3\/gl32.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
        sed -i '/usr\/include\/GLES3\/gl3platform.h/d' ${IMAGE_ROOTFS}/var/lib/dpkg/info/adreno.list
    fi

    cat > ${IMAGE_ROOTFS}/etc/udev/rules.d/ion.rules << EOF
ACTION=="add" SUBSYSTEM=="misc", KERNEL=="ion", OWNER="system", GROUP="system", MODE="0664"
EOF
    cat > ${IMAGE_ROOTFS}/etc/udev/rules.d/kgsl.rules << EOF
KERNEL=="kgsl-3d0", MODE="0666"
EOF
    # fix issue that fails to reboot due to tty driver hangs
    rm -rf ${IMAGE_ROOTFS}/sbin/reboot
    cat > ${IMAGE_ROOTFS}/sbin/reboot << EOF
nohup /sbin/reboot.sh &>/dev/null &
EOF
    cat > ${IMAGE_ROOTFS}/sbin/reboot.sh << EOF
/bin/systemctl stop serial-getty@ttyMSM0
/bin/systemctl reboot
EOF
    chmod +x ${IMAGE_ROOTFS}/sbin/reboot
    chmod +x ${IMAGE_ROOTFS}/sbin/reboot.sh

    #recover package postinsts
    mv ${IMAGE_ROOTFS}/var/lib/dpkg/info/postinst/*.postinst ${IMAGE_ROOTFS}/var/lib/dpkg/info/
    rm -rf ${IMAGE_ROOTFS}/var/lib/dpkg/info/postinst
    mv ${IMAGE_ROOTFS}/var/lib/dpkg/info/preinst/*.preinst ${IMAGE_ROOTFS}/var/lib/dpkg/info/
    rm -rf ${IMAGE_ROOTFS}/var/lib/dpkg/info/preinst

}

#----------------------------------------------------------
#---- to record 4 useful Yocto process timing ----
DEB_PREPROCESS_COMMANDS = " do_deb_pre "
#DEB_POSTPROCESS_COMMANDS = " do_deb_post "
#ROOTFS_PREPROCESS_COMMAND += "do_fs_pre; "
ROOTFS_POSTPROCESS_COMMAND += "do_fs_post; "
#----------------------------------------------------------

#Install packages for audio
CORE_IMAGE_BASE_INSTALL += " \
            audiohal \
            audiodlkm \
            init-audio \
            tinyalsa \
            omx \
            encoders \
            qsthw-api \
            soundtrigger \
            acdbloader \
"

#addtask do_pm before do_rootfs
#addtask do_rec_pm after do_image_qa before do_image_complete
