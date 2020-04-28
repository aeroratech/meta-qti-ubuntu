#This file is derived from https://git.linaro.org/openembedded/meta-linaro.git/tree/meta-linaro-toolchain/recipes-devtools/external-linaro-toolchain/external-linaro-toolchain.bb

#Permission is hereby granted, free of charge, to any person obtaining a copy
#of this software and associated documentation files (the "Software"), to deal
#in the Software without restriction, including without limitation the rights
#to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
#copies of the Software, and to permit persons to whom the Software is
#furnished to do so, subject to the following conditions:

#The above copyright notice and this permission notice shall be included in
#all copies or substantial portions of the Software.

#THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
#IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
#FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
#AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
#LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
#OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
#THE SOFTWARE.


# License applies to this recipe code, not the toolchain itself
LICENSE = "BSD-3-Clause & MIT"


DEPENDS += "download-manager-native"

INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
do_install_armmultilib[noexec] = "1"
do_package_qa[noexec] = "1" 
TARGET_SYS = "${UBUN_TARGET_SYS}"

CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"
#CP_ARGS="-Prf --preserve=mode,timestamps --no-preserve=ownership"
#HOST_ARCH="x86_64-linux-gnu"
#TARGET_ARCH="aarch64-linux-gnu"

PROVIDES += "\
            virtual/${TARGET_PREFIX}gcc \
            virtual/${TARGET_PREFIX}g++ \
            virtual/${TARGET_PREFIX}gcc-initial \
            virtual/${TARGET_PREFIX}binutils \
            binutils-cross-${TARGET_ARCH} \
            virtual/${TARGET_PREFIX}libc-for-gcc \
            virtual/${TARGET_PREFIX}compilerlibs \
            virtual/libc \
            virtual/libintl \
            virtual/libiconv \
            virtual/crypt \
            virtual/libc-locale \
            libstdc++ \
            libstdc++-dev \
            libarchive-native \
            e2fsprogs-native \
            nativesdk-libarchive \
            util-linux \
            lsbinitscripts \
            glib-2.0 \
            mtd-utils-native \
            libpam \
            libxml2 \
            libunistring2 \
            libc-mtrace \
            gcc-runtime \
            libgcov-dev \
            libg2c \
            libg2c-dev \
            libssp \
            libssp-dev \
            libssp-staticdev \
            libgfortran \
            libgfortran-dev \
            libgfortran-staticdev \
            libmudflap \
            libmudflap-dev \
            libgomp \
            libgomp-dev \
            libgomp-staticdev \
            libitm \
            libitm-dev \
            libitm-staticdev \
            libquadmath \
            libquadmath-dev \
            libquadmath-staticdev \
            sqlite3 \
            bzip2 \
            ncurses \
            gstreamer1.0 \
            gstreamer1.0-plugins-base \
            gstreamer1.0-plugins-bad \
            binutils-native \
            jpeg \
            libgcc \
            libnl \
            libnl-dev \
            libnl-dbg \
            libnl-doc \
            libnl-xfrm \
            libnl-genl \
            libnl-nf \
            libnl-locale \
            libnl-staticdev \
            libnl-cli \
            libnl-route \
            libnl-idiag \
            expat \
            libssl \
            iw \
            libselinux \
            libselinux-native \
            libsemanage \
            libpcre \
            nativesdk-qemu \
            nativesdk-qemu-helper \
            nativesdk-qemuwrapper-cross \
            nativesdk-packagegroup-sdk-host \
            qemuwrapper-cross \
            qemu-helper-native \
            qemu-native \
            qemuwrapper-cross \
            qemuwrapper-cross-dev \
            qemuwrapper-cross-dbg \
            qemuwrapper-cross-staticdev \
            qemuwrapper-cross-locale \
            qemuwrapper-cross-doc \
            ubuntu-toolchain \
            udev systemd systemd-dev systemd-journal-remote systemd-journal-gatewayd \
            systemd-journal-upload systemd-compat-units systemd-conf systemd-serialgetty \
            systemd-systemctl-native \
            libpng \
            libxkbcommon \
            systemd-vconsole-setup \
            systemd-initramfs systemd-container systemd-analyze systemd-rpm-macros \
            systemd-xorg-xinitrc systemd-zsh-completion systemd-gui systemd-binfmt \
            "


do_install (){
	install -d ${D}${base_libdir}
	install -d ${D}${base_libdir}/${UBUN_TARGET_SYS}
	install -d ${D}${bindir}
	install -d ${D}${sbindir}
	install -d ${D}${libexecdir}
	install -d ${D}${datadir}
	install -d ${D}${includedir}
	install -d ${D}/DEBIAN
	install -d ${D}${libdir}
	install -d ${D}${libdir}/pkgconfig
	install -d ${D}${libdir}/${UBUN_TARGET_SYS}
	install -d ${D}${libdir}/gcc/${UBUN_TARGET_SYS}/7
	install -d ${D}/usr/share/pkgconfig/

#    usr/${UBUN_TARGET_SYS}/lib cannot be created
#    install -d ${D}/usr/${UBUN_TARGET_SYS}/lib/
	rm -rf ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libelf.so
	rm -rf ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libgstgl-1.0.so
	rm -rf ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libgstopencv-1.0.so
	rm -rf ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libpcre16.so
	rm -rf ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libpcre32.so
	rm -rf ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libpcrecpp.so
	rm -rf ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/gcc/aarch64-linux-gnu/7/libubsan.so

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/gcc/${UBUN_TARGET_SYS}/7/* ${D}${libdir}/gcc/${UBUN_TARGET_SYS}/7/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/* ${D}${base_libdir}/${UBUN_TARGET_SYS}

    sed -i "s@/usr/aarch64-linux-gnu/lib/@./@g" ${D}${libdir}/${UBUN_TARGET_SYS}/libpthread.so
    sed -i "s@/usr/aarch64-linux-gnu/lib@./@g" ${D}/usr/lib/${UBUN_TARGET_SYS}/libc.so


    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/* ${D}${includedir}

	cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/* ${D}/usr/share/pkgconfig
	cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/* ${D}${libdir}/pkgconfig
    

    mv ${D}${includedir}/${UBUN_TARGET_SYS}/sys ${D}${includedir}

    mv ${D}${includedir}/${UBUN_TARGET_SYS}/gnu ${D}${includedir}


    cp ${CP_ARGS} -H ${D}${includedir}/c++/7/* ${D}${includedir}/c++/
    cp ${CP_ARGS} -H ${D}${includedir}/${UBUN_TARGET_SYS}/c++/7/bits/* ${D}${includedir}/c++/bits
    mv ${D}${libdir}/${UBUN_TARGET_SYS}/glib-2.0/include/* ${D}${includedir}

}

PACKAGES += "shadow"
PROVIDES += "shadow shadow-sysroot shadow-securetty"
RPOVIDES_shadow = "shadow shadow-sysroot shadow-securetty"
ALLOW_EMPTY_shadow = "1"
PKGV_shadow = "0"
PKGR_shadow = "0"

RPROVIDES_${PN} += " \
                    libgcc \
                    libatomic \
                    libgcc-dev \
                    libstdc++ \
                    libatomic-dev \
                    libstdc++-dev \
                    eglibc rtld(GNU_HASH) virtual-libc apt libc-bin \
                    mtd-utils-native \
                    shared-mime-info shared-mime-info-native \
                    e2fsprogs-e2fsck\
                    lsbinitscripts lsbinitscripts-dev \
                    util-linux \
                    util-linux-sulogin  util-linux-agetty util-linux-mount util-linux-fsck \
                    cross-localedef-native \
                    binutils-native \
                    prelink-native \
                    prelink \
                    jpeg\
                    udev udev-hwdb hotplug\
                    libpng\
                    libxkbcommon\
                    systemd libsystemd0 systemd-systemctl-native systemd-locale systemd-dbg \
                    systemd-bash-completion systemd-staticdev systemd-doc \
                    libsystemd-dev\
                    systemd-journal-remote\
                    systemd-journal-gatewayd\
                    systemd-journal-upload\
                    systemd-compat-units\
                    systemd-conf\
                    systemd-serialgetty-locale systemd-serialgetty-dbg systemd-serialgetty-doc \
                    systemd-vconsole-setup\
                    systemd-initramfs\
                    systemd-container\
                    systemd-analyze\
                    systemd-rpm-macros\
                    systemd-xorg-xinitrc\
                    systemd-zsh-completion\
                    systemd-gui\
                    systemd-binfmt\
                    libpam \
                    pam-plugin-group pam-plugin-motd pam-plugin-mail pam-plugin-shells pam-plugin-nologin pam-plugin-rootok pam-plugin-env \
                    pam-plugin-limits pam-plugin-faildelay pam-plugin-securetty libpam-runtime pam-plugin-lastlog \
                    shadow-dbg \
                    shadow-locale \
                    shadow-staticdev \
                    shadow-base \
                    shadow-doc \
                    libnl \
                    libnl-dev \
                    libnl-dbg \
                    libnl-doc \
                    libnl-xfrm \
                    libnl-genl \
                    libnl-nf \
                    libnl-locale \
                    libnl-staticdev \
                    libnl-cli \
                    libnl-route \
                    libnl-idiag \
                    expat \
                    libssl \
                    iw \
                    glib-2.0 \
                    glib-2.0-codegen glib-2.0-locale glib-2.0-dbg glib-2.0-staticdev glib-2.0-bash-completion glib-2.0-doc glib-2.0-utils glib-2.0-dev \
                    libxml2 \
                    libselinux \
                    libselinux-native \
                    libsemanage \
                    libpcre \
                  "

FILES_${PN} = " \
                            /usr/lib/aarch64-linux-gnu/*.so\
                            /usr/lib/aarch64-linux-gnu/*.so.* \
                            /lib/aarch64-linux-gnu/*.so\
                            /lib/aarch64-linux-gnu/*.so.* \
                            "
FILES_${PN}-dev = " \
                     ${base_libdir}/${UBUN_TARGET_SYS}/*_nonshared.a \
                     ${base_libdir}/${UBUN_TARGET_SYS}/*.o \
                     ${libdir}/${UBUN_TARGET_SYS}/*_nonshared.a \
                     ${libdir}/${UBUN_TARGET_SYS}/*.o \
                     DEBIAN/* \
                     "
 
FILES_${PN}-staticdev = " \
                        ${libdir}/${UBUN_TARGET_SYS}/*.a \
                        ${libdir}/${UBUN_TARGET_SYS}/*.a \
                        DEBIAN/* \
                        "


#  version control
PKG_${PN} = "libc6"
PKGV_${PN} = "0"
PKGR_${PN} = "0"

UBUN_VER_MAIN ??= ""

python () {
    if not d.getVar("UBUN_VER_MAIN", False):
        raise bb.parse.SkipPackage("External Ubuntu toolchain not configured (UBUN_VER_MAIN not set).")
    import re
    notglibc = (re.match('.*uclibc$', d.getVar('TARGET_OS', True)) != None) or (re.match('.*musl$', d.getVar('TARGET_OS', True)) != None)
    if notglibc:
        raise bb.parse.SkipPackage("incompatible with target %s" %
                                   d.getVar('TARGET_OS', True))
}
