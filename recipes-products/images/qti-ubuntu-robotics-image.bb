inherit uimage extrausers

#require ${META_QTI_BSP_IMAGE_PATH}/include/mdm-bootimg.inc
#DEPENDS += " mkbootimg-native "

#require include/mdm-ota-target-image-ubi.inc
require include/ubuntu-ota-target-image-ext4.inc

#MULTILIBRE_ALLOW_REP =. "/usr/include/python2.7/*|${base_bindir}|${base_sbindir}|${bindir}|${sbindir}|${libexecdir}|${sysconfdir}|${nonarch_base_libdir}/udev|/lib/modules/[^/]*/modules.*|"

EXTRA_USERS_PARAMS = "usermod -P oelinux123 root;"
EXTRA_USERS_PARAMS += "usermod -g 3003 _apt;"
EXTRA_USERS_PARAMS += "usermod --gid pulse --append --groups audio,input,plugdev,diag pulse"

do_populate_lic_deploy[noexec] = "1"

DEPENDS += "ubuntu-base"

CORE_IMAGE_BASE_INSTALL = " \
            kernel-modules \
            msm-header \
            systemd-machine-units \
            update-alternatives-recovery \
            qti-ubuntu-udev \
            qti-ubuntu-systemd \
            qti-ubuntu-sysv \
            qti-ubuntu-login \
            yavta \
            depends-update \
            ota-upgrade \
            e2fsprogs \
            e2fsprogs-dev \
            packagegroup-startup-scripts \
            packagegroup-android-utils \
            packagegroup-qti-core-prop \
            packagegroup-qti-dsp \
            packagegroup-qti-fastcv \
            packagegroup-qti-cvp \
            packagegroup-qti-ss-mgr \
            packagegroup-qti-qmmf \
            "

#Install packages for debug
CORE_IMAGE_BASE_INSTALL += " \
            ${@bb.utils.contains('DISTRO', 'qti-distro-ubuntu-fullstack-debug', 'packagegroup-qti-ubuntu-debug-tools', '', d)} \
"

#Install packages for wlan
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-wifi \
            "
#install drm
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
#Install packages for OTA
CORE_IMAGE_BASE_INSTALL += " \
            recovery-ab \
            "
#Install packages for camera
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-camera \
            "
#Install packages for bluetooth
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-bluetooth \
"
#Install packages for gst-ros2
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-gst-ros2 \
            "
#Install packages for sensors
CORE_IMAGE_BASE_INSTALL += " \
            ${@bb.utils.contains('COMBINED_FEATURES', 'qti-sensors', 'packagegroup-qti-sensors-see', '', d)} \
"

#Install packages for vslam
CORE_IMAGE_BASE_INSTALL += " \
            librealsense2 \
            vslam \
            "

#Install packages for imu-ros2node
CORE_IMAGE_BASE_INSTALL += " \
            ${@bb.utils.contains('COMBINED_FEATURES', 'qti-sensors', 'imud', '', d)} \
            ${@bb.utils.contains('COMBINED_FEATURES', 'qti-sensors', 'imu-ros2node', '', d)} \
            ${@bb.utils.contains('COMBINED_FEATURES', 'qti-sensors', 'sensors-client', '', d)} \
"

UBUNTU_TAR_FILE="${EXTERNAL_TOOLCHAIN}/ubuntu-base.done/ubuntu-base-18.04.5-base-arm64.tar.gz"

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

do_fix_oe_depends() {
    i=0,j=0
    cat ${IMAGE_ROOTFS}/var/lib/dpkg/status | while read line
    do
      let i+=1
      if [[ "$line" == Depends:* && "$line" != "Depends: libc6 (>= 2.27)" ]];then
          j=$i
      elif [[ "$line" == Package:* ]];then
          j=0
      elif [[ "$line" == OE:* && "$j" != 0 ]];then
         sed -in "${j}c Depends: libc6 (>= 2.27)" ${IMAGE_ROOTFS}/var/lib/dpkg/status
      fi
    done
}

do_fs_post() {
    #fix adbd launch command
    sed -i "s@start-stop-daemon -S -b -a /sbin/adbd@start-stop-daemon -S -b --exec /sbin/adbd@g" ${IMAGE_ROOTFS}/sbin/launch_adbd

    #fix apt status of OE package Depends
    do_fix_oe_depends

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

do_post_install() {
    sed -i "/Config-Version/d" ${IMAGE_ROOTFS}/var/lib/dpkg/status
}

do_enable_coredump() {
    sed -i -e 's/#DefaultLimitCORE=/DefaultLimitCORE=infinity/' ${IMAGE_ROOTFS}/etc/systemd/system.conf
    echo "#Coredump configurations" > ${IMAGE_ROOTFS}/etc/sysctl.d/sysctl-coredump.conf
    echo "kernel.core_pattern = /data/coredump/core.%e.%p.%t" >> ${IMAGE_ROOTFS}/etc/sysctl.d/sysctl-coredump.conf
    echo "fs.suid_dumpable = 2" >>  ${IMAGE_ROOTFS}/etc/sysctl.d/sysctl-coredump.conf
    mkdir -p ${IMAGE_ROOTFS}/data/coredump
}

do_enable_adb_root() {
    echo "service.adb.root=1" >> ${IMAGE_ROOTFS}/build.prop
}

#install debug symbol
IMAGE_FEATURES_append = "\
            ${@bb.utils.contains('DISTRO', 'qti-distro-ubuntu-fullstack-debug', ' dbg-pkgs', '', d)} \
"
#----------------------------------------------------------
#---- to record 4 useful Yocto process timing ----
DEB_PREPROCESS_COMMANDS = " do_deb_pre "
#DEB_POSTPROCESS_COMMANDS = " do_deb_post "
#ROOTFS_PREPROCESS_COMMAND += "do_fs_pre; "
ROOTFS_POSTPROCESS_COMMAND += "do_fs_post; "
ROOTFS_POSTINSTALL_COMMAND += "do_post_install; do_deb; do_enable_adb_root; "
ROOTFS_POSTPROCESS_COMMAND += "\
            ${@bb.utils.contains('DISTRO', 'qti-distro-ubuntu-fullstack-debug', 'do_enable_coredump; ', '', d)} \
"
#----------------------------------------------------------

#Install packages for audio
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-audio \
            omx \
            soundtrigger \
            pa-qti-soundtrigger \
"

CORE_IMAGE_BASE_INSTALL += " \
	packagegroup-qti-ml \
"

#Install packages for pulseaudio
CORE_IMAGE_BASE_INSTALL += " \
            packagegroup-qti-pulseaudio \
"

CORE_IMAGE_BASE_INSTALL += " \
    mesa \
    xserver-xorg \
"

#Install packages for securemsm
CORE_IMAGE_BASE_INSTALL += " \
	${@bb.utils.contains('COMBINED_FEATURES', 'qti-security', 'packagegroup-qti-securemsm', '', d)} \
"

#addtask do_pm before do_rootfs
#addtask do_rec_pm after do_image_qa before do_image_complete

def check_packages(d) :
    import re, json, os
    dep_chain = []
    buildtime_pkg_list = {} ## packages that needed in build time, i.e., should be installed
    rootfs_pkg_dict = {}    ## packages that installed into rootfs indeed

    def get_installed_pkgs() :
        ''' Description:
                Get infos of all packages installed in rootfs through status file.

                Packages with property 'OE:' means that it's from Yocto.
            Return:
                A dict that contains info of all packages installed into rootfs
        '''
        status_file = oe.path.join(d.getVar('IMAGE_ROOTFS'), "/var/lib/dpkg/status")
        pkg_dict = {}

        with open(status_file, 'r') as fd:
            pkg_name = ''
            pkg_info = {}
            is_parsing = False
            keys = ["OE", "Depends", "Version", "Pre-Depends"]
            for line in fd :
                if line.startswith("Package: ") :
                    if is_parsing :
                        bb.fatal("Invalid content, don't expect to get two \"Package:\" line within one package block")

                    ''' begin of one pkg info '''
                    is_parsing = True
                    pkg_name = re.match("^Package: (.*)", line).group(1)
                    pkg_info = {}

                elif line.isspace() :
                    if is_parsing is False :
                        bb.warn(" don't expect to get an empty line while not in parsing state, ignore")
                        continue

                    ''' end of one pkg info '''
                    is_parsing = False
                    pkg_dict[pkg_name] = pkg_info

                elif is_parsing :
                    for key in keys:
                        keyword = key + ": "
                        if line.startswith(keyword):
                            pkg_info[key] = re.match("^%s(.*)" % keyword, line).group(1)
                            break

            ''' Maybe the last pkg info is end without empty line '''
            if is_parsing :
                is_parsing = False
                pkg_dict[pkg_name] = pkg_info

        return pkg_dict


    def check_runtime_dependency(d, pkg) :
        ''' Description:
                Travelsal dependencyies for a given package. All packages inside that dependency chain
                will be stored in gloabl var buildtime_pkg_list

                Directory PKGDATA_DIR contains all package info including RDepends/RPROVIDES/...,
                these packages are built by Yocto.
        '''
        nonlocal dep_chain
        nonlocal buildtime_pkg_list
        nonlocal rootfs_pkg_dict
        pkgdata_dir = d.getVar('PKGDATA_DIR')

        dep_chain.append(pkg)
        if pkg in buildtime_pkg_list :
            dep_chain = dep_chain[:-1]
            ''' dep-chain already checked, skip '''
            bb.note(" --> ".join(dep_chain) + " --> {}(*) ".format(pkg))
            return

        pkg_rt_file = ''
        if os.path.exists(pkgdata_dir + '/runtime-reverse/%s' % pkg) :
            pkg_rt_file = pkgdata_dir + '/runtime-reverse/%s' % pkg
        elif os.path.exists(pkgdata_dir + '/runtime/%s' % pkg) :
            pkg_rt_file = pkgdata_dir + '/runtime/%s' % pkg

        if not pkg_rt_file:
            dep_chain = dep_chain[:-1]
            bb.note(" --> ".join(dep_chain) + " --> {}(?) ".format(pkg))
            return

        bb.note(" --> ".join(dep_chain)) # print stack

        with open(pkg_rt_file, "r") as fd :
            deb_name = ''
            rdep_list = ''
            pn = ''
            buildtime_pkg_list[pkg] = {}

            for line in fd :
                pkg_regex = pkg.replace('+', '\+')
                if deb_name and rdep_list and pn :
                    break
                elif line.startswith("PN: ") :
                    pn = re.match("PN: (.*)", line).group(1)
                    buildtime_pkg_list[pkg]["PN"] = pn

                elif line.startswith("PKG_{}".format(pkg)) :
                    deb_name = re.match("PKG_{}: (.*)".format(pkg_regex), line).group(1)
                    buildtime_pkg_list[pkg]["deb_name"] = deb_name

                elif line.startswith("RDEPENDS_{}".format(pkg)) :
                    rdep_string = re.match("RDEPENDS_{}: (.*)".format(pkg_regex), line).group(1)
                    rdep_list = re.sub(r"\(.*?\)", "", rdep_string).split()
                    buildtime_pkg_list[pkg]["rdep_list"] = rdep_list

        if "rdep_list" not in buildtime_pkg_list[pkg] :
            ''' this pacakge does not depends on anything, i.e., it is at the buttom of the dependency chain '''
            dep_stack = dep_chain[:-1]
            return

        for sub_pkg in buildtime_pkg_list[pkg]["rdep_list"] :
            check_runtime_dependency(d, sub_pkg)

        dep_chain = dep_chain[:-1]
        return

    ## begin of the function ##
    rootfs_pkg_dict = get_installed_pkgs()
    pkgs_to_install = d.getVar('IMAGE_INSTALL').split()
    for pkg in pkgs_to_install :
        check_runtime_dependency(d, pkg)


    mismatch_list = []
    missed_list = []

    for pkg in buildtime_pkg_list :
        if "deb_name" not in buildtime_pkg_list[pkg]:
            continue

        deb_name = buildtime_pkg_list[pkg]["deb_name"]

        if deb_name in rootfs_pkg_dict :
            '''
            A package with specific deb-name does be installed into rootfs, but still need check
            if that package is provided by Yocto but not from ubuntu.

            An exception: package from ubuntu-toolchain is just used at compile-time, not for runtime
            '''
            if 'OE' not in rootfs_pkg_dict[deb_name] and "ubuntu-toolchain" != buildtime_pkg_list[pkg]["PN"]:
                mismatch_list.append(deb_name)
        else :
            skipval = "-locale-|^locale-base-|-dev$|-doc$|-dbg$|-staticdev$|^kernel-module-"
            skipregex = re.compile(skipval)
            if skipregex.search(pkg):
                bb.note("skip: {}".format(pkg))
            else:
                missed_list.append(deb_name)

    if len(mismatch_list) != 0:
        bb.warn("\n\n\n"
                "###################################\n"
                "#### Package Mismatch Detected ####\n"
                "###################################\n"
                "Package listed below is built by Yocto and is used in build time as a dependency, but the\n"
                "ubuntu version package is installed instead. i.e., build-time packages and runtime packages mismatch\n"
                "This may be because ubuntu-base has already installed those packages with a higher version.\n"
                "please check if it's expected.\n"
                "{}\n\n".format(mismatch_list))

    if len(missed_list) != 0:
        bb.warn("\n\n\n"
                "#################################\n"
                "#### Package Missed Detected ####\n"
                "#################################\n"
                "Package listed should've been installed, but no such package info is found in rootfs/var/lib/dpkg/status,\n"
                "i.e., they are not installed into rootfs.\n"
                "{}\n\n"
                "This might caused by reason below, please check\n"
                "1. package conflicts\n"
                "2. PKG name defined in ubuntu-toolchain is not consistent with the oss package name\n\n".format(missed_list))


do_check_packages[nostamp] = "1"
python do_check_packages () {
    check_packages(d)
}
addtask do_check_packages after do_rootfs before do_makesystem
