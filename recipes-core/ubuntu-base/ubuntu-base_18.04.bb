#License applicable to the recipe file only,  not to the packages installed by this recipe.
LICENSE = "BSD-3-clause"

include ubuntu-base.inc

SRC_URI += "http://cdimage.ubuntu.com/ubuntu-base/releases/18.04/release/ubuntu-base-18.04.2-base-arm64.tar.gz"

SRC_URI[md5sum] = "fce1e4f9b98c85436f06aa27013279a5"
SRC_URI[sha256sum] = "62bd3b6df4340aa8e90d08229ced4f40aa8cbe84ed43f9f71791a46df5159f81"


DEPENDS += "fakechroot \
            fakeroot "


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
}


do_unpack() {
         fakeroot tar xz --no-same-owner -f ${DL_DIR}/ubuntu-base-18.04.2-base-arm64.tar.gz -C ${S}
         cp -r ${DL_DIR}/ubuntu-base-18.04.2-base-arm64.tar.gz  ${WORKDIR}/
}


# Go to persistent-storage.rules and create bootdevice/by-name symlinks with gpt
do_create_the_links(){
	sed -i 's/LABEL="persistent_storage_end"/# block\/bootdevice\/by-name links'"\n"'LABEL="persistent_storage_end"/g' \
		${S}/lib/udev/rules.d/60-persistent-storage.rules
	sed -i 's/LABEL="persistent_storage_end"/ENV{ID_PART_ENTRY_SCHEME}=="gpt", ENV{ID_PART_ENTRY_NAME}=="?*", SYMLINK+="block\/bootdevice\/by-name\/$env{ID_PART_ENTRY_NAME}"'"\n\n"'LABEL="persistent_storage_end"/g' \
		${S}/lib/udev/rules.d/60-persistent-storage.rules
}

do_populate_lic[noexec] = "1"
do_package_qa[noexec] = "1"
do_install[fakeroot] = "1"

do_install() {

	get_rootfs_packages
	echo ${UBUN_ROOTFS_PACKAGE}
	cp  ${RECIPE_SYSROOT}/usr/lib/fakechroot/libfakechroot.so ${S}/usr/lib
	cp  ${RECIPE_SYSROOT}/usr/lib/libfakeroot-0.so ${S}/usr/lib/libfakeroot-sysv.so
	#cp  ${FILE_DIRNAME}/files/libfakeroot-sysv.so ${S}/usr/lib
	chmod 777 -R ${S}/var/cache/apt/archives/partial
	chmod 777 -R ${S}/var/lib/dpkg/
	fakechroot fakeroot  chroot ${S} /bin/bash -c "echo ${PATH}"
        fakechroot fakeroot  chroot ${S} /bin/bash -c "sed -i '1i /usr/lib' /etc/ld.so.conf.d/aarch64-linux-gnu.conf"
        fakechroot fakeroot  chroot ${S} /bin/bash -c "echo '/lib/systemd'>> /etc/ld.so.conf.d/aarch64-linux-gnu.conf"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "apt-get update"
	#set hostname and hosts
	fakechroot fakeroot  chroot ${S} /bin/bash -c "echo '${MACHINE}' > /etc/hostname"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "echo '127.0.0.1 localhost' > /etc/hosts"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "echo '127.0.1.1 ${MACHINE}' >> /etc/hosts"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "apt-get install --fix-broken humanity-icon-theme -y"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "apt-get install rsyslog -y"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "apt-get install ${UBUN_ROOTFS_PACKAGE} -y"
	rm -rf ${S}/sbin/init
	ln -sf ../lib/systemd/systemd sbin/init
        # Create socket directory for logd.service
        touch ${S}/usr/lib/tmpfiles.d/platform.conf
        fakechroot fakeroot  chroot ${S} /bin/bash -c "echo 'd /dev/socket 0777 - - - -' >> /usr/lib/tmpfiles.d/platform.conf"


	# WAR -- allow root user to login
	sed -i '/pam_securetty.so/d' ${S}/etc/pam.d/login

	#logind.conf -- Ignore PowerKey
	sed -i 's/#HandlePowerKey=poweroff/HandlePowerKey=ignore/' ${S}/etc/systemd/logind.conf

	# Go to persistent-storage.rules and create bootdevice/by-name symlinks
	do_create_the_links

	#Allow tty connect when agetty start
        fakechroot fakeroot  chroot ${S} /bin/bash -c "sed -i "s/TTYVHangup=yes'/TTYVHangup=no'/" /lib/systemd/system/serial-getty@.service"
	fakechroot fakeroot chroot ${S} /bin/bash -c "tar -cpzf ubuntu-base-18.04.2-base-arm64.tar.gz --exclude=/ubuntu-base-18.04.2-base-arm64.tar.gz --one-file-system /"
	cp ubuntu-base-18.04.2-base-arm64.tar.gz ${EXTERNAL_TOOLCHAIN}/
}


INSANE_SKIP_${PN} += "already-stripped"
INSANE_SKIP_${PN} += "installed-vs-shipped"

PACKAGE_NO_LOCALE = "1"
PACKAGES = "${PN}"
