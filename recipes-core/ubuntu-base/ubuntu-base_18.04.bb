#License applicable to the recipe file only,  not to the packages installed by this recipe.
LICENSE = "BSD-3-clause"

include ubuntu-base.inc

SRC_URI += "http://cdimage.ubuntu.com/ubuntu-base/releases/18.04/release/ubuntu-base-18.04.2-base-arm64.tar.gz"

SRC_URI[md5sum] = "fce1e4f9b98c85436f06aa27013279a5"
SRC_URI[sha256sum] = "62bd3b6df4340aa8e90d08229ced4f40aa8cbe84ed43f9f71791a46df5159f81"


DEPENDS += "fakechroot \
            fakeroot "


do_unpack() {
         fakeroot tar xz --no-same-owner -f ${DL_DIR}/ubuntu-base-18.04.2-base-arm64.tar.gz -C ${S}
         cp -r ${DL_DIR}/ubuntu-base-18.04.2-base-arm64.tar.gz  ${WORKDIR}/
}

do_populate_lic[noexec] = "1"
do_package_qa[noexec] = "1"
do_install[fakeroot] = "1"

do_install() {


	cp  ${RECIPE_SYSROOT}/usr/lib/fakechroot/libfakechroot.so ${S}/usr/lib
	cp  ${RECIPE_SYSROOT}/usr/lib/libfakeroot-0.so ${S}/usr/lib/libfakeroot-sysv.so
	#cp  ${FILE_DIRNAME}/files/libfakeroot-sysv.so ${S}/usr/lib
	chmod 777 -R ${S}/var/cache/apt/archives/partial
	chmod 777 -R ${S}/var/lib/dpkg/
	fakechroot fakeroot  chroot ${S} /bin/bash -c "echo ${PATH}"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "sed -i '/$/a /lib/systemd' /etc/ld.so.conf.d/aarch64-linux-gnu.conf"
	fakechroot fakeroot  chroot ${S} /bin/bash -c "apt-get update"

	# add package you need to install here
	fakechroot fakeroot  chroot ${S} /bin/bash -c "apt-get install systemd udev -y"

	rm -rf ${S}/sbin/init
	ln -sf ../lib/systemd/systemd sbin/init

	# WAR -- allow root user to login
	sed -i '/pam_securetty.so/d' ${S}/etc/pam.d/login

	#Allow tty connect when agetty start
        fakechroot fakeroot  chroot ${S} /bin/bash -c "sed -i "s/TTYVHangup=yes'/TTYVHangup=no'/" /lib/systemd/system/serial-getty@.service"
	tar -czf ${EXTERNAL_TOOLCHAIN}/ubuntu-base-18.04.2-base-arm64.tar.gz ./*
}


INSANE_SKIP_${PN} += "already-stripped"
INSANE_SKIP_${PN} += "installed-vs-shipped"

PACKAGE_NO_LOCALE = "1"
PACKAGES = "${PN}"
