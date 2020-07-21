#License applicable to the recipe file only,  not to the packages installed by this recipe.
LICENSE = "BSD-3-clause"

include ubuntu-base.inc

SRC_URI += "http://cdimage.ubuntu.com/ubuntu-base/releases/18.04/release/ubuntu-base-18.04.2-base-arm64.tar.gz"
SRC_URI[md5sum] = "fce1e4f9b98c85436f06aa27013279a5"
SRC_URI[sha256sum] = "62bd3b6df4340aa8e90d08229ced4f40aa8cbe84ed43f9f71791a46df5159f81"

INSANE_SKIP_${PN} += "already-stripped"
INSANE_SKIP_${PN} += "installed-vs-shipped"
DEPENDS += "fakechroot \
            fakeroot "

PACKAGE_NO_LOCALE = "1"
PACKAGES = "${PN}"

TMP_WKDIR = "${WORKDIR}/ubuntu_base_tmp"
DEB_CACHE_DIR  = "${WORKDIR}/deb_cache"
OTA_OSS  = "${DEPLOY_DIR_IMAGE}/OSS"

do_unpack[noexec] = "1"
do_install[noexec] = "1"
do_populate_lic[noexec] = "1"
do_package_qa[noexec] = "1"
do_ubuntu_install[dirs] += "${TMP_WKDIR} ${DEB_CACHE_DIR} ${OTA_OSS}"
do_ubuntu_install[postfuncs] = "restore_sourcelist fix_symlink ubuntu_post_install"

## In chroot environment, when creates a link pointing to a absolute path, the chroot
## directory is prepended to it.
## task do_install will get in chroot env and create symlink with abs path, thus, need
## to fix thoes symlink so that they will point to the correct path.
python fix_symlink() {
    work_dir = d.getVar("TMP_WKDIR").rstrip('/')

    if not work_dir :
        bb.fatal("TMP_WKDIR is null")
    for root, dirs, files in os.walk(work_dir) :
        # fix symlinks pointing to file
        for file_name in files :
            file = os.path.join(root, file_name)
            if not os.path.islink(file) :
                continue
            old_link = os.readlink(file)
            if not old_link.startswith(work_dir) :
                continue
            new_link = old_link.replace(work_dir, '')
            os.remove(file)
            os.symlink(new_link, file)

        # fix symlinks pointing to directory
        for dir_name in dirs :
            file = os.path.join(root, dir_name)
            if not os.path.islink(file) :
                continue
            old_link = os.readlink(file)
            if not old_link.startswith(work_dir) :
                continue
            new_link = old_link.replace(work_dir, '')
            os.remove(file)
            os.symlink(new_link, file)
}

ubuntu_post_install() {
	pushd ${TMP_WKDIR}
	fakeroot touch ./ubuntu-base-18.04.2-base-arm64.tar.gz
	fakeroot tar -cpzf ubuntu-base-18.04.2-base-arm64.tar.gz --exclude=./ubuntu-base-18.04.2-base-arm64.tar.gz --one-file-system ./
	popd
	mkdir -p ${EXTERNAL_TOOLCHAIN}/ubuntu-base.done
	cp ${TMP_WKDIR}/ubuntu-base-18.04.2-base-arm64.tar.gz ${EXTERNAL_TOOLCHAIN}/ubuntu-base.done/
}

restore_sourcelist() {
	mv ${TMP_WKDIR}/etc/apt/sources.list_backup ${TMP_WKDIR}/etc/apt/sources.list
	fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
}

get_rootfs_packages () {
	if \
	${@bb.utils.contains('DISTRO', 'qti-distro-ubuntu-debug', 'true', 'false', d)}; \
	then
		UBUN_ROOTFS_PACKAGE="${UBUN_BASIC_DEBUG_PACKAGES}"
	fi

	if \
	${@bb.utils.contains('DISTRO', 'qti-distro-ubuntu-perf', 'true', 'false', d)}; \
	then
		UBUN_ROOTFS_PACKAGE="${UBUN_BASIC_PERF_PACKAGES}"
	fi

	if \
	${@bb.utils.contains('DISTRO', 'qti-distro-ubuntu-fullstack-debug', 'true', 'false', d)}; \
	then
		UBUN_ROOTFS_PACKAGE="${UBUN_FULLSTACK_DEBUG_PACKAGES}"
	fi

	if \
	${@bb.utils.contains('DISTRO', 'qti-distro-ubuntu-fullstack-perf', 'true', 'false', d)}; \
	then
		UBUN_ROOTFS_PACKAGE="${UBUN_FULLSTACK_PERF_PACKAGES}"
	fi
	bbnote "packages: ${UBUN_ROOTFS_PACKAGE}"
}

# Go to persistent-storage.rules and create bootdevice/by-name symlinks with gpt
do_create_the_links() {
	sed -i 's/LABEL="persistent_storage_end"/# block\/bootdevice\/by-name links'"\n"'LABEL="persistent_storage_end"/g' \
		${TMP_WKDIR}/lib/udev/rules.d/60-persistent-storage.rules
	sed -i 's/LABEL="persistent_storage_end"/ENV{ID_PART_ENTRY_SCHEME}=="gpt", ENV{ID_PART_ENTRY_NAME}=="?*", SYMLINK+="block\/bootdevice\/by-name\/$env{ID_PART_ENTRY_NAME}"'"\n\n"'LABEL="persistent_storage_end"/g' \
		${TMP_WKDIR}/lib/udev/rules.d/60-persistent-storage.rules
}


humanity_theme_install() {
	set +e
	fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get install humanity-icon-theme -y"
	exitcode=$?
	flag=0
	while [[ "$exitcode" != "0" && "${flag}" -le "3" ]]; do
		echo "humanity-icon-theme package install failed"
		echo "re-try count: ${flag}"
		((flag++));
		fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get clean"
		fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
		fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get install humanity-icon-theme -y"
		exitcode=$?
	done
	set -e
}

apt_update() {
	echo "QCOM_TARGET_SOURCELIST: ${QCOM_TARGET_SOURCELIST}"
	cp ${TMP_WKDIR}/etc/apt/sources.list ${TMP_WKDIR}/etc/apt/sources.list_backup
	# If QCOM_TARGET_SOURCELIST is set, we prefer to use it as sourcelist
	if [ -n "${QCOM_TARGET_SOURCELIST}" ]; then
		echo "use QCOM_TARGET_SOURCELIST as sourcelist"
		sed -i "1i${QCOM_TARGET_SOURCELIST}" ${TMP_WKDIR}/etc/apt/sources.list
		set +e
		fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
		exitcode=$?
		if [ "$exitcode" != "0" ]; then
			echo "QCOM_TARGET_SOURCELIST is invalid"
			rm -rf ${TMP_WKDIR}/etc/apt/sources.list
			mv ${TMP_WKDIR}/etc/apt/sources.list_backup ${TMP_WKDIR}/etc/apt/sources.list
			fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
		fi
		set -e
	# If QCOM_TARGET_SOURCELIS not set. we use default sourcelist
	else
		echo "QCOM_TARGET_SOURCELIST not set"
		fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
	fi
}

do_ubuntu_install() {
	cache_avaliable=0
	## copy cache if exists to speed up apt install process ##
	if [ -e "${TMP_WKDIR}/var/cache/apt/archives" ]; then
		find ${TMP_WKDIR}/var/cache/apt/archives -maxdepth 1 -name "*.deb" | xargs -n10 -i cp {} ${DEB_CACHE_DIR}
		cache_avaliable=1
	fi
	rm -rf ${TMP_WKDIR}/*

	fakeroot tar xz --no-same-owner -f ${DL_DIR}/ubuntu-base-18.04.2-base-arm64.tar.gz -C ${TMP_WKDIR}
	if [ ${cache_avaliable} -eq 1 ]; then
		find ${DEB_CACHE_DIR} -maxdepth 1 -name "*.deb" | xargs -n10 -i cp {} ${TMP_WKDIR}/var/cache/apt/archives/
	fi

	get_rootfs_packages
	cp  ${RECIPE_SYSROOT}/usr/lib/fakechroot/libfakechroot.so ${TMP_WKDIR}/usr/lib/libfakechroot.so
	cp  ${RECIPE_SYSROOT}/usr/lib/libfakeroot-0.so ${TMP_WKDIR}/usr/lib/libfakeroot-sysv.so
	chmod 777 -R ${TMP_WKDIR}/var/cache/apt/archives/partial
	chmod 777 -R ${TMP_WKDIR}/var/lib/dpkg/

	sed -i '1i /usr/lib' ${TMP_WKDIR}/etc/ld.so.conf.d/aarch64-linux-gnu.conf
	echo '/lib/systemd'>> ${TMP_WKDIR}/etc/ld.so.conf.d/aarch64-linux-gnu.conf
	fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "cd /var; rm run; ln -s ../run run"
	apt_update
	#set hostname and hosts
	echo '${MACHINE}' > ${TMP_WKDIR}/etc/hostname
	echo '127.0.0.1 localhost' > ${TMP_WKDIR}/etc/hosts
	echo '127.0.1.1 ${MACHINE}' >> ${TMP_WKDIR}/etc/hosts

	# There has a low probability that downloaded broken humanity-icon-theme.
	# We will clean the cache and take a re-try to fix it
	humanity_theme_install
	fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get install rsyslog -y"
	fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "export DEBIAN_FRONTEND=noninteractive; apt-get install ${UBUN_ROOTFS_PACKAGE} -y"

	rm -rf ${TMP_WKDIR}/sbin/init
	ln -sf ../lib/systemd/systemd ${TMP_WKDIR}/sbin/init
	rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so
	ln -sf ../usr/lib/libwayland-egl.so.1  ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so
	rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so.1
	ln -sf ../usr/lib/libwayland-egl.so.1  ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so.1
	# Create socket directory for logd.service
	touch ${TMP_WKDIR}/usr/lib/tmpfiles.d/platform.conf
	echo 'd /dev/socket 0777 - - - -' >> ${TMP_WKDIR}/usr/lib/tmpfiles.d/platform.conf
	rm ${TMP_WKDIR}/lib/udev/rules.d/60-persistent-v4l.rules
	rm ${TMP_WKDIR}/lib/udev/v4l_id

	#fix pre_postinsts
	mkdir -p ${TMP_WKDIR}/var/lib/dpkg/info/postinst
	mv ${TMP_WKDIR}/var/lib/dpkg/info/*.postinst ${TMP_WKDIR}/var/lib/dpkg/info/postinst
	mkdir -p ${TMP_WKDIR}/var/lib/dpkg/info/preinst
	mv ${TMP_WKDIR}/var/lib/dpkg/info/*.preinst ${TMP_WKDIR}/var/lib/dpkg/info/preinst

	# PAM: allow login as root
	sed -i '/pam_securetty.so/d' ${TMP_WKDIR}/etc/pam.d/login

	#logind.conf -- Ignore PowerKey
	sed -i 's/#HandlePowerKey=poweroff/HandlePowerKey=ignore/' ${TMP_WKDIR}/etc/systemd/logind.conf

	# Go to persistent-storage.rules and create bootdevice/by-name symlinks
	do_create_the_links

	#Allow tty connect when agetty start
	sed -i "s/TTYVHangup=yes'/TTYVHangup=no'/" ${TMP_WKDIR}/lib/systemd/system/serial-getty@.service

	#Copy the OSS package for installing when OTA
	cp ${TMP_WKDIR}/var/cache/apt/archives ${OTA_OSS}/ -rf
}

addtask do_ubuntu_install after do_install before do_package
