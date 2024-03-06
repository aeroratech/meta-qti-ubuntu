#License applicable to the recipe file only,  not to the packages installed by this recipe.
LICENSE = "BSD-3-clause-clear"

include ubuntu-base_20.04.inc

SRC_URI += "http://cdimage.ubuntu.com/ubuntu-base/releases/20.04/release/${UBUNTU_BASE_TAR}"
SRC_URI[md5sum] = "b39023c9ed58323c2bb3c324569cff20"
SRC_URI[sha256sum] = "e54a49b3f5bc1a4242167a3270d0648cabfb9c02b9a59b7a28a860a9b721cde1"

INSANE_SKIP_${PN} += "already-stripped"
INSANE_SKIP_${PN} += "installed-vs-shipped"
DEPENDS += "fakechroot \
            fakeroot "

PACKAGE_NO_LOCALE = "1"
PACKAGES = "${PN}"

lsb_release = "focal"
arch_ubuntu = "arm64"

TMP_WKDIR = "${WORKDIR}/ubuntu_base_tmp"
DEB_CACHE_DIR  = "${WORKDIR}/deb_cache"
DEB_CACHE_TARBALL_DIR  = "${TOPDIR}/../deb_cache"

do_unpack[noexec] = "1"
do_populate_lic[noexec] = "1"
do_package_qa[noexec] = "1"
do_ubuntu_unpack[dirs] += "${TMP_WKDIR} ${DEB_CACHE_DIR} ${OTA_OSS}"
do_ubuntu_install[dirs] += "${TMP_WKDIR} ${DEB_CACHE_DIR} ${OTA_OSS}"
do_ubuntu_install[postfuncs] = "restore_sourcelist fix_symlink ubuntu_post_install"


UBUNTU_KEY_LINK := ""
UBUNTU_SOURCE_LIST := ""

do_add_source_key() {
if [ -n "${UBUNTU_KEY_LINK}" ]; then
    islink=1
    link=""
    for key in ${UBUNTU_KEY_LINK}
    do
        if [ $islink == 1 ]
        then
            bbwarn " ${key} islink"
            link="${key}"
            islink=0
        else
            path="${key}"
            if [ -e "${TMP_WKDIR}/${path}" ];then
                bbnote "${path} have exist remove it !"
                rm -rf "${TMP_WKDIR}/${path}"
            fi
            fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "curl -sSL ${link} -o ${path}"
            bbwarn "get ${link} to path ${path}"
            islink=1
        fi
    done
fi
}

do_add_sourcelist() {
if [ -n "${UBUNTU_SOURCE_LIST}" ]; then
    bbnote "add ${UBUNTU_SOURCE_LIST} into source.list.d/thrid_party.list"
    touch ${TMP_WKDIR}/etc/apt/sources.list.d/thrid_party.list
    fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "echo  '#########################thrid-patry sourcelist################################## ' > /etc/apt/sources.list.d/thrid_party.list"
    sed -i "1i${UBUNTU_SOURCE_LIST}" ${TMP_WKDIR}/etc/apt/sources.list.d/thrid_party.list
    do_add_source_key
    fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
    exitcode=$?
    if [ "$exitcode" != "0" ]; then
        bbwarn "source_list is invalid , remove it ,please check"
        rm -rf ${TMP_WKDIR}/etc/apt/sources.list.d/thrid_party.list
        fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
    fi

fi
}

do_tzdata_install() {
        set +e
        fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c " export DEBIAN_FRONTEND=noninteractive ; apt-get install tzdata -y ;"
        exitcode=$?
        flag=0
        while [[ "$exitcode" != "0" && "${flag}" -le "3" ]]; do
                echo "tzdata package install failed"
                echo "re-try count: ${flag}"
                ((flag++));
                fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get clean"
                fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
                fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "export DEBIAN_FRONTEND=noninteractive ; apt-get install tzdata -y ;"
                exitcode=$?
        done
        set -e

}

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
	fakeroot touch ./${UBUNTU_BASE_TAR}
	chmod 777 ./etc/ssh/ssh_import_id
	fakeroot tar -cpzf ${UBUNTU_BASE_TAR} --exclude=./${UBUNTU_BASE_TAR} --one-file-system ./
	popd
	mkdir -p ${EXTERNAL_TOOLCHAIN}/ubuntu-base.done
	cp ${TMP_WKDIR}/${UBUNTU_BASE_TAR} ${EXTERNAL_TOOLCHAIN}/ubuntu-base.done/
}

restore_sourcelist() {
	if [ -e "${TMP_WKDIR}/etc/apt/sources.list_backup" ];then
	    mv ${TMP_WKDIR}/etc/apt/sources.list_backup ${TMP_WKDIR}/etc/apt/sources.list
#	    fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
	fi
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
	echo "QTI_TARGET_SOURCELIST: ${QTI_TARGET_SOURCELIST}"
	cp ${TMP_WKDIR}/etc/apt/sources.list ${TMP_WKDIR}/etc/apt/sources.list_backup
	# If QTI_TARGET_SOURCELIST is set, we prefer to use it as sourcelist
	if [ -n "${QTI_TARGET_SOURCELIST}" ]; then
		echo "use QTI_TARGET_SOURCELIST as sourcelist"
	        sed -i "3,$ d" ${TMP_WKDIR}/etc/apt/sources.list
		sed -i "2a${QTI_TARGET_SOURCELIST}" ${TMP_WKDIR}/etc/apt/sources.list
		set +e
		fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
		exitcode=$?
		if [ "$exitcode" != "0" ]; then
			echo "QTI_TARGET_SOURCELIST is invalid"
			rm -rf ${TMP_WKDIR}/etc/apt/sources.list
			mv ${TMP_WKDIR}/etc/apt/sources.list_backup ${TMP_WKDIR}/etc/apt/sources.list
			fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
		fi
		set -e
	# If QTI_TARGET_SOURCELIS not set. we use default sourcelist
	else
		echo "QTI_TARGET_SOURCELIST not set"
		fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get update"
	fi
}

do_ubuntu_unpack() {
        cache_avaliable=0
        ## copy deb_cahe from deb_cache in workspace ##
        if [ -e "${DEB_CACHE_TARBALL_DIR}" ] && [ ! -n "$(ls -A ${DEB_CACHE_DIR})" ]; then
                cp ${DEB_CACHE_TARBALL_DIR}/*.deb ${DEB_CACHE_DIR}
                cache_avaliable=1
        fi

        ## copy cache if exists to speed up apt install process ##
        if [ -e "${TMP_WKDIR}/var/cache/apt/archives" ]; then
                find ${TMP_WKDIR}/var/cache/apt/archives -maxdepth 1 -name "*.deb" | xargs -n10 -i cp {} ${DEB_CACHE_DIR}
                cache_avaliable=1
        fi
        rm -rf ${TMP_WKDIR}/*

        fakeroot tar xz --no-same-owner -f ${DL_DIR}/${UBUNTU_BASE_TAR} -C ${TMP_WKDIR}
        if [ ${cache_avaliable} -eq 1 ]; then
                find ${DEB_CACHE_DIR} -maxdepth 1 -name "*.deb" | xargs -n10 -i cp {} ${TMP_WKDIR}/var/cache/apt/archives/
        fi

        get_rootfs_packages
}

addtask do_ubuntu_unpack before do_ubuntu_basic_configure after do_unpack

do_ubuntu_basic_configure(){

        #set fakeroot and fakechroot
        bbnote "copy fakeroot and fakechroot lib to ubuntu-base"
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
        fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "apt-get install rsyslog curl -y"
        do_tzdata_install
        do_add_sourcelist

}
addtask do_ubuntu_basic_configure after do_compile before do_ubuntu_install

do_ubuntu_install() {
	#get packages list should be installed
        get_rootfs_packages
	# There has a low probability that downloaded broken humanity-icon-theme.
	# We will clean the cache and take a re-try to fix it
	humanity_theme_install
	fakechroot fakeroot  chroot ${TMP_WKDIR} /bin/bash -c "export DEBIAN_FRONTEND=noninteractive ; apt-get install ${UBUN_ROOTFS_PACKAGE} -y"

	rm -rf ${TMP_WKDIR}/sbin/init
	ln -sf ../lib/systemd/systemd ${TMP_WKDIR}/sbin/init

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

	#logind.conf -- PowerKey triggers suspend
	sed -i 's/#HandlePowerKey=poweroff/HandlePowerKey=suspend/' ${TMP_WKDIR}/etc/systemd/logind.conf

	# Go to persistent-storage.rules and create bootdevice/by-name symlinks
	do_create_the_links
}
addtask do_ubuntu_install after do_compile before do_install

do_install() {
	install -d ${D}${datadir}
	cp ${EXTERNAL_TOOLCHAIN}/ubuntu-base.done/${UBUNTU_BASE_TAR} ${D}${datadir}
}

do_ubuntu_install_append_qrb5165() {
	rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so
	ln -sf ../usr/lib/libwayland-egl.so.1  ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so
	rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so.1
	ln -sf ../usr/lib/libwayland-egl.so.1  ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/libwayland-egl.so.1

    # Remove s/w based encoders & decoders from gstreamer-plugins-base
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstvorbis.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstopus.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgsttheora.so

    # Remove s/w based encoders & decoders from gstreamer-plugins-good
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstalaw.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstwavenc.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstwavpack.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstrtp.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstflac.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstmulaw.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstjpeg.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstpng.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgsty4menc.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstmpg123.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstflxdec.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstdv.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstgdkpixbuf.so

    # Remove s/w based encoders & decoders from gstreamer-plugins-bad
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstvoaacenc.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstvoamrwbenc.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstgsm.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstsbc.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstspeex.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstmpeg2enc.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstpnm.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstwebp.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstfaad.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstdtsdec.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstvmnc.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstrsvg.so

    # Remove s/w based encoders & decoders from gstreamer-plugins-ugly
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgsta52dec.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstdvdlpcmdec.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstamrwbdec.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstamrnb.so
    rm -rf ${TMP_WKDIR}/usr/lib/aarch64-linux-gnu/gstreamer-1.0/libgstmpeg2dec.so
}
