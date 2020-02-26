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


#ALLOW_EMPTY_${PN} = "1"
#ALLOW_EMPTY_${PN}-dev = "1"
#ALLOW_EMPTY_${PN}-staticdev = "1"
ALLOW_EMPTY_libgfortran-staticdev = "1"
ALLOW_EMPTY_libgcc-dbg = "1"
ALLOW_EMPTY_libgcc-dev = "1"
ALLOW_EMPTY_libgfortran-dev = "1"
ALLOW_EMPTY_libgfortran = "1"
ALLOW_EMPTY_libtsan-staticdev = "1"
ALLOW_EMPTY_libubsan-staticdev = "1"
ALLOW_EMPTY_liblsan-staticdev = "1"
ALLOW_EMPTY_libasan-staticdev = "1"
ALLOW_EMPTY_libtsan-dev = "1"
ALLOW_EMPTY_liblsan-dev = "1"
ALLOW_EMPTY_libubsan-dev = "1"
ALLOW_EMPTY_libasan-dev = "1"
ALLOW_EMPTY_libtsan = "1"
ALLOW_EMPTY_liblsan = "1"
ALLOW_EMPTY_libubsan = "1"
ALLOW_EMPTY_gcc-sanitizers-dev = "1"
ALLOW_EMPTY_glibc-extra-nss = "1"
ALLOW_EMPTY_libsotruss  = "1"
ALLOW_EMPTY_libsegfault  = "1"
ALLOW_EMPTY_libasan = "1"
ALLOW_EMPTY_gcc-sanitizers = "1"
ALLOW_EMPTY_libnss-db  = "1"
ALLOW_EMPTY_glibc-thread-db = "1"
ALLOW_EMPTY_libmemusage  = "1"
ALLOW_EMPTY_tzcode  = "1"
ALLOW_EMPTY_ldd  = "1"
ALLOW_EMPTY_libcidn = "1"
ALLOW_EMPTY_nscd = "1"
ALLOW_EMPTY_catchsegv = "1"
ALLOW_EMPTY_sln = "1"
ALLOW_EMPTY_libc-bin = "1"
ALLOW_EMPTY_libunistring2 = "1"
ALLOW_EMPTY_libitm-staticdev = "1"
ALLOW_EMPTY_libatomic-staticdev = "1"
ALLOW_EMPTY_libitm = "1"
ALLOW_EMPTY_libatomic-dev = "1"
ALLOW_EMPTY_libitm-dev = "1"
ALLOW_EMPTY_libgomp-staticdev = "1"
ALLOW_EMPTY_libatomic = "1"
ALLOW_EMPTY_libgomp = "1"
ALLOW_EMPTY_libxml2 = "1"
ALLOW_EMPTY_glib-2.0 = "1"
ALLOW_EMPTY_shadow = "1"
ALLOW_EMPTY_libnl = "1"
ALLOW_EMPTY_expat = "1"
ALLOW_EMPTY_libpam = "1"
ALLOW_EMPTY_libquadmath-staticdev = "1"
ALLOW_EMPTY_libmudflap-dev = "1"
ALLOW_EMPTY_libquadmath = "1"
ALLOW_EMPTY_libquadmath-dev = "1"
ALLOW_EMPTY_libmudflap = "1"
ALLOW_EMPTY_libmudflap-staticdev = "1"
ALLOW_EMPTY_libssp-staticdev = "1"
ALLOW_EMPTY_libssp-dev = "1"
ALLOW_EMPTY_libg2c = "1"
ALLOW_EMPTY_libg2c-dev = "1"
ALLOW_EMPTY_libssp = "1"
ALLOW_EMPTY_libstdc++-precompile-dev = "1"
ALLOW_EMPTY_libstdc++-staticdev = "1"
ALLOW_EMPTY_udev = "1"
ALLOW_EMPTY_systemd = "1"
ALLOW_EMPTY_systemd-dev = "1"
ALLOW_EMPTY_systemd-journal-remote = "1"
ALLOW_EMPTY_systemd-journal-gatewayd = "1"
ALLOW_EMPTY_systemd-journal-upload = "1"
ALLOW_EMPTY_systemd-compat-units = "1"
ALLOW_EMPTY_systemd-conf = "1"
ALLOW_EMPTY_systemd-serialgetty = "1"
ALLOW_EMPTY_systemd-vconsole-setup = "1"
ALLOW_EMPTY_systemd-initramfs = "1"
ALLOW_EMPTY_systemd-container = "1"
ALLOW_EMPTY_systemd-analyze = "1"
ALLOW_EMPTY_systemd-rpm-macros = "1"
ALLOW_EMPTY_systemd-xorg-xinitrc = "1"
ALLOW_EMPTY_systemd-kernel-install = "1"
ALLOW_EMPTY_systemd-zsh-completion = "1"
ALLOW_EMPTY_systemd-gui = "1"
ALLOW_EMPTY_systemd-binfmt = "1"

PV = "0"
BINV = "0"
TARGET_SYS = "${UBUN_TARGET_SYS}"

CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"
HOST_ARCH="x86_64-linux-gnu"
TARGET_ARCH="aarch64-linux-gnu"


PACKAGES = "libc6 libunistring2 libc-bin catchsegv sln nscd ldd tzcode glibc-thread-db libcidn libmemusage libnss-db libsegfault libsotruss glibc-extra-nss "


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
            libarchive-native \
            util-linux-native \
            e2fsprogs-native \
            nativesdk-libarchive \
            util-linux \
            lsbinitscripts \
            glib-2.0 \
            glib-2.0-native \
            mtd-utils-native \
            libpam \
            shadow \
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
	install -d ${D}${libdir}/gcc/${HOST_ARCH}/7
	install -d ${D}${libdir}/${UBUN_TARGET_SYS}
	install -d ${D}/usr/share/pkgconfig/

#    usr/${UBUN_TARGET_SYS}/lib cannot be created
#    install -d ${D}/usr/${UBUN_TARGET_SYS}/lib/

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/${UBUN_TARGET_SYS}/lib/* ${D}${libdir}/${UBUN_TARGET_SYS}

    sed -i "s@/usr/aarch64-linux-gnu/lib/@./@g" ${D}${libdir}/${UBUN_TARGET_SYS}/libpthread.so

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/gcc-cross/${UBUN_TARGET_SYS}/7/*.o ${D}${base_libdir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/${UBUN_TARGET_SYS}/lib/*.o ${D}${base_libdir}
    cp ${CP_ARGS} -H ${D}${libdir}/${UBUN_TARGET_SYS}/*.o ${D}${base_libdir}

    sed -i "s@/usr/aarch64-linux-gnu/lib@./@g" ${D}/usr/lib/${UBUN_TARGET_SYS}/libc.so


    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/selinux ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/security ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/glib-2.0 ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/linux ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/* ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/sys ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/gnu ${D}${includedir}
    mv ${D}${includedir}/c++/7/* ${D}${includedir}/c++
    mv ${D}${includedir}/c++/aarch64-linux-gnu/bits/* ${D}${includedir}/c++/bits

    ln -sf ./libgcc_s.so.1 ${D}/${libdir}/aarch64-linux-gnu/libgcc_s.so

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libselinux.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/libselinux.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libselinux.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}
    ln -sf ./libselinux.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libselinux.so

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libsepol.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/libsepol.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libsepol.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}
    ln -sf ./libsepol.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libsepol.so
    
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libpcre.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/libpcre.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libpcre.so.3 ${D}${libdir}/${UBUN_TARGET_SYS}
    ln -sf ./libpcre.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libpcre.so
    
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libtermcap.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libtermcap.so ${D}${libdir}/${UBUN_TARGET_SYS}
    
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libtinfo.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/tinfo.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libtinfo.so.5 ${D}${libdir}/${UBUN_TARGET_SYS}
    ln -sf ./libtinfo.so.5 ${D}${libdir}/${UBUN_TARGET_SYS}/libtinfo.so

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libbz2.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libbz2.so.1.0.4 ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/bzlib.h ${D}${includedir}
    ln -sf ./libbz2.so.1.0.4 ${D}${libdir}/${UBUN_TARGET_SYS}/libbz2.so

    #udev
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/aarch64-linux-gnu/libudev.so.*  ${D}/lib/aarch64-linux-gnu/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/aarch64-linux-gnu/libudev.so  ${D}/lib/aarch64-linux-gnu/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/libudev.h  ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/libudev.pc  ${D}/${libdir}/pkgconfig/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/udev.pc ${D}/usr/share/pkgconfig/

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/bin/xml2-config  ${D}/usr/bin/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/libxml2/*  ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libxml-2.0.pc ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libxml2.so ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libxml2.so.2 ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libxml2.so.2.9.4 ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/xml2Conf.sh  ${D}${libdir}/${UBUN_TARGET_SYS}

    #FIX mount/blkid/uuid pkgconfig scripts links
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/drm  ${D}${includedir}
    rm -rf ${D}${includedir}/rpcsvc
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/libmount  ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/mount.pc ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libmount.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libmount.so.1.1.0 ${D}${libdir}/${UBUN_TARGET_SYS}/
    ln -sf ./libmount.so.1.1.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libmount.so
    ln -sf ./libmount.so.1.1.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libmount.so.1
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/blkid  ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/blkid.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libblkid.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libblkid.so.1.1.0 ${D}${libdir}/${UBUN_TARGET_SYS}/
    ln -sf ./libblkid.so.1.1.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libblkid.so
    ln -sf ./libblkid.so.1.1.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libblkid.so.1
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/uuid  ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/uuid.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libuuid.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libuuid.so.1.3.0 ${D}${libdir}/${UBUN_TARGET_SYS}/
    ln -sf ./libuuid.so.1.3.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libuuid.so
    ln -sf ./libuuid.so.1.3.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libuuid.so.1

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/unicode  ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/layout  ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libicu* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/* ${D}${libdir}/pkgconfig/

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libiberty.a ${D}${libdir}/${UBUN_TARGET_SYS}

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libpam.so.* ${D}${libdir}/${UBUN_TARGET_SYS}

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libaudit.so.* ${D}${libdir}/${UBUN_TARGET_SYS}

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libcap-ng.so.* ${D}${libdir}/${UBUN_TARGET_SYS}

    #FIX glib-2.0 pkgconfig/lib symbols
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libg*.so.*.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libg*.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/glib-2.0/include/*.h ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/g*.pc ${D}${libdir}/pkgconfig
    
    ln -s libgmodule-2.0.so.0.5600.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libgmodule-2.0.so.0
    ln -s libgio-2.0.so.0.5600.1     ${D}${libdir}/${UBUN_TARGET_SYS}/libgio-2.0.so.0
    ln -s libgobject-2.0.so.0.5600.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libgobject-2.0.so.0
    ln -s libglib-2.0.so.0.5600.1    ${D}${libdir}/${UBUN_TARGET_SYS}/libglib-2.0.so.0
    ln -s libgthread-2.0.so.0.5600.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libgthread-2.0.so.0
    
    ln -s libgmodule-2.0.so.0.5600.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libgmodule-2.0.so
    ln -s libgio-2.0.so.0.5600.1     ${D}${libdir}/${UBUN_TARGET_SYS}/libgio-2.0.so
    ln -s libgobject-2.0.so.0.5600.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libgobject-2.0.so
    ln -s libglib-2.0.so.0.5600.1    ${D}${libdir}/${UBUN_TARGET_SYS}/libglib-2.0.so
    ln -s libgthread-2.0.so.0.5600.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libgthread-2.0.so    

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/libnl*.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libnl* ${D}${base_libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/libnl3 ${D}${includedir}/${UBUN_TARGET_SYS}

    ## libexpat & libexpat-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libexpat*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libexpat.so* ${D}${base_libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/expat*.h ${D}${includedir}${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/expat*.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/expat*.pc ${D}${libdir}/pkgconfig
    ln -sf ../../..${base_libdir}/${UBUN_TARGET_SYS}/libexpat.so.1.6.7 ${D}${libdir}/${UBUN_TARGET_SYS}/libexpat.so

    #FIX symbol
    if [ -f ${D}${base_libdir}/libz.so.1 ];then
        rm -rf ${D}${base_libdir}/libz.so.*
    fi
    if [ -f ${D}${base_libdir}/libncursesw.so.5 ];then
        rm -rf ${D}${base_libdir}/libncurses*
        rm -rf ${D}${base_libdir}/libtinfo*
    fi
    if [ -f ${D}${base_libdir}/libsepol.so.1 ];then
        rm -rf ${D}${base_libdir}/libsepol.so.1
    fi
    if [ -f ${D}${base_libdir}/libselinux.so.1 ];then
        rm -rf ${D}${base_libdir}/libselinux.so.1
    fi
    if [ -f ${D}${base_libdir}/libpam.so.0 ];then
        rm -rf ${D}${base_libdir}/libpam*
        rm -rf ${D}${base_libdir}/security
    fi
    if [ -f ${D}${base_libdir}/libcap.so.2 ];then
        rm -rf ${D}${base_libdir}/libcap.so*
    fi
    if [ -f ${D}${base_libdir}/libattr.so.1 ];then
        rm -rf ${D}${base_libdir}/libattr.so*
    fi  
    if [ -f ${D}${base_libdir}/libmount.so.1 ];then
        rm -rf ${D}${base_libdir}/libmount.so*
    fi  
    if [ -f ${D}${base_libdir}/libaudit.so.1 ];then
        rm -rf ${D}${base_libdir}/libaudit.so*
    fi  
    if [ -f ${D}${base_libdir}/libsmartcols.so.1 ];then
        rm -rf ${D}${base_libdir}/libsmartcols.so*
    fi  
    if [ -f ${D}${base_libdir}/libuuid.so.1 ];then
        rm -rf ${D}${base_libdir}/libuuid.so*
    fi  
    if [ -f ${D}${base_libdir}/libfdisk.so.1 ];then
        rm -rf ${D}${base_libdir}/libfdisk.so*
    fi  
    if [ -f ${D}${base_libdir}/libblkid.so.1 ];then
        rm -rf ${D}${base_libdir}/libblkid.so*
    fi


    #FIX SYMBOL LINK
    ln -sf ld-${UBUN_VER_LIBC}.so ${D}${base_libdir}/${UBUN_TARGET_SYS}/ld-linux-aarch64.so.1
    ln -s ${UBUN_TARGET_SYS}/libanl-${UBUN_VER_LIBC}.so ${D}${libdir}/libanl.so 
    ln -s ${UBUN_TARGET_SYS}/libBrokenLocale-${UBUN_VER_LIBC}.so ${D}${libdir}/libBrokenLocale.so
    ln -s ${UBUN_TARGET_SYS}/libcidn-${UBUN_VER_LIBC}.so ${D}${libdir}/libcidn.so 
    ln -s ${UBUN_TARGET_SYS}/libcrypt.so.1 ${D}${libdir}/libcrypt.so 
    ln -s ${UBUN_TARGET_SYS}/libdl-${UBUN_VER_LIBC}.so ${D}${libdir}/libdl.so 
    ln -s ${UBUN_TARGET_SYS}/libm-${UBUN_VER_LIBC}.so ${D}${libdir}/libm.so 
    ln -s ${UBUN_TARGET_SYS}/libnss_compat-${UBUN_VER_LIBC}.so ${D}${libdir}/libnss_compat.so 
    ln -s ${UBUN_TARGET_SYS}/libnss_dns-${UBUN_VER_LIBC}.so ${D}${libdir}/libnss_dns.so 
    ln -s ${UBUN_TARGET_SYS}/libnss_files-${UBUN_VER_LIBC}.so ${D}${libdir}/libnss_files.so 
    ln -s ${UBUN_TARGET_SYS}/libnss_hesiod-${UBUN_VER_LIBC}.so ${D}${libdir}/libnss_hesiod.so 
    ln -s ${UBUN_TARGET_SYS}/libnss_nisplus-${UBUN_VER_LIBC}.so ${D}${libdir}/libnss_nisplus.so 
    ln -s ${UBUN_TARGET_SYS}/libnss_nis-${UBUN_VER_LIBC}.so ${D}${libdir}/libnss_nis.so 
    ln -s ${UBUN_TARGET_SYS}/libpng12.so.0 ${D}${libdir}/libpng12.so.0 
    ln -s ${UBUN_TARGET_SYS}/librt-${UBUN_VER_LIBC}.so ${D}${libdir}/librt.so 
    ln -s ${UBUN_TARGET_SYS}/libthread_db.so.1  ${D}${libdir}/libthread_db.so.1 
    ln -s ${UBUN_TARGET_SYS}/libutil-${UBUN_VER_LIBC}.so ${D}${libdir}/libutil.so  
    ln -s ${UBUN_TARGET_SYS}/libpam.so.0.83.1 ${D}${libdir}/libpam.so
    ln -s ${UBUN_TARGET_SYS}/libselinux.so.1 ${D}${libdir}/libselinux.so
    ln -s ${UBUN_TARGET_SYS}/libsepol.so.1 ${D}${libdir}/libsepol.so
  
}

PACKAGES += " \ 
			binutils-native \
			"
PROVIDES += " \ 
			binutils-native \
			"
RPROVIDES_cross-localedef-native = " cross-localedef-native "
RPROVIDES_binutils-native = " binutils-native "
RPROVIDES_prelink-native = " prelink-native "
RPROVIDES_prelink = " prelink "

PACKAGES += "\
            libstdc++ \
            libstdc++-precompile-dev \
            libstdc++-dev \
            libstdc++-staticdev \
            libg2c \
            libg2c-dev \
            libssp \
            libssp-dev \
            libssp-staticdev \
            libmudflap \
            libmudflap-dev \
            libmudflap-staticdev \
            libquadmath \
            libquadmath-dev \
            libquadmath-staticdev \
            libgomp \
            libgomp-dev \
            libgomp-staticdev \
            libatomic \
            libatomic-dev \
            libatomic-staticdev \
            libitm \
            libitm-dev \
            libitm-staticdev \
            "

#  gcc-sanitizers
PACKAGES += " \
            gcc-sanitizers gcc-sanitizers-dev \
            libasan libubsan liblsan libtsan \
            libasan-dev libubsan-dev liblsan-dev libtsan-dev \
            libasan-staticdev libubsan-staticdev liblsan-staticdev libtsan-staticdev \
            "

#  libgfortran
PACKAGES += "\
    libgfortran \
    libgfortran-dev \
    libgfortran-staticdev \
   "

#  libgcc
PACKAGES += "\
    libgcc \
    libgcc-dev \
    libgcc-dbg \
"
PROVIDES += " \
            libgcc \
            "
FILES_libgcc = "\
    ${libdir}/${UBUN_TARGET_SYS}/libgcc_s.so.1 \
    ${libdir}/${UBUN_TARGET_SYS}/libgcc_s.so \
"
FILES_libgcc-dev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libgcc*.so \
"
PKG_libgcc = "libgcc1"
PKGR = "0"
PKGV = "0"

#  libpam
PACKAGES += "libpam"
FILES_libpam += "${libdir}/dummy"
RPROVIDES_libpam = " \
                    libpam \
                    pam-plugin-group pam-plugin-motd pam-plugin-mail pam-plugin-shells pam-plugin-nologin pam-plugin-rootok pam-plugin-env \
                    pam-plugin-limits pam-plugin-faildelay pam-plugin-securetty libpam-runtime pam-plugin-lastlog \
                   "

PACKAGES += "shadow"
FILES_shadow += "${libdir}/dummy"
RPROVIDES_shadow = " \
                    shadow \
                    shadow-dbg \
                    shadow-locale \
                    shadow-staticdev \
                    shadow-base \
                    shadow-doc \
                    shadow-native \
                   "
PKG_shadow = "passwd"
PKGR_shadow = "0"
PKGV_shadow = "0"
                   
PACKAGES += "libnl"
FILES_libnl += "${base_libdir}/${UBUN_TARGET_SYS}/libnl-*.so.*"
PROVIDES += " \
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
            "
RPROVIDES_libnl = " \
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
                  "
PKGV_libnl = "3.2.28"
PKGR_libnl = "0"
PKG_libnl="libnl-3-dev"

PACKAGES += "expat"
FILES_expat += " \
        ${libdir}/${UBUN_TARGET_SYS}/libexpat*.so*  \
        ${base_libdir}/${UBUN_TARGET_SYS}/libexpat.so* \
               "

PROVIDES += " \
            expat \
            "
RPROVIDES_expat += " \
                expat \
                "
PKGV_expat = "2.2.5"
PKGR_expat = "3"
PKG_expat ="libexpat1"

PACKAGES += "libssl1.1"
FILES_libssl1.1 += "${libdir}/${UBUN_TARGET_SYS}/libssl.so.*"
PROVIDES += " \
            libssl \
            "
RPROVIDES_libssl1.1 += " \
                       libssl \
                       "
PKGV_libssl1.1 = "1.0"
PKGR_libssl1.1 = "0"

PACKAGES += "iw"
FILES_iw += "${libdir}/dummy"
PROVIDES += " \
            iw \
            "
RPROVIDES_iw += " \
                iw \
                "
PKGV_iw = "4.13"
PKGR_iw = "0"

PACKAGES += "glib-2.0"
FILES_glib-2.0 += "${libdir}/dummy"
RPROVIDES_glib-2.0 = " \
                    glib-2.0 glib-2.0-native \
                    glib-2.0-codegen glib-2.0-locale glib-2.0-dbg glib-2.0-staticdev glib-2.0-bash-completion glib-2.0-doc glib-2.0-utils glib-2.0-dev \
                   "
PKGV_glib-2.0 = "0"
PKGR_glib-2.0 = "0"
                   
PACKAGES += "libxml2"
FILES_libxml2 += "${libdir}/dummy"
RPROVIDES_libxml2 = " \
                    libxml2 \
                   "
PKGV_libxml2 = "2.8.4+dfsg1"
PKGR_libxml2 = "6.1ubuntu1.2"          


ALLOW_EMPTY_libselinux1 = "1"
PACKAGES += "libselinux1"
FILES_libselinux1 += "${libdir}/${UBUN_TARGET_SYS}/libselinux.so.* "
PROVIDES += " \
            libselinux \
            libselinux-native \
            libsemanage \
            "
RPROVIDES_libselinux1 = " \
                    libselinux \
                    libselinux-native \
                    libsemanage \
                   "
PKGV_libselinux1 = "2.6.9"

ALLOW_EMPTY_libpcre3 = "1"
PACKAGES += "libpcre3"
FILES_libpcre3 += "${libdir}/dummy"
PROVIDES += " \
            libpcre \
            "
RPROVIDES_libpcre3 = " \
                   libpcre \
                   "
PKGV_libpcre3 = "2:8.38"


PROVIDES += "\
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
            "

                   

#  libc6
PROVIDES += " libc6 "
RPROVIDES_libc6 = " \
                    eglibc rtld(GNU_HASH) libc6 virtual-libc apt libc-bin \
                    mtd-utils-native \
                    shared-mime-info shared-mime-info-native \
                    e2fsprogs-e2fsck\
                    lsbinitscripts lsbinitscripts-dev \
                    util-linux util-linux-native \
                    util-linux-sulogin  util-linux-agetty util-linux-mount util-linux-fsck \
                  "

libc_baselibs = " \
                ${libdir}/${UBUN_TARGET_SYS}/libc.so.* ${libdir}/${UBUN_TARGET_SYS}/libc-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libcrypt*.so.* ${libdir}/${UBUN_TARGET_SYS}/libcrypt-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libm*.so.* ${libdir}/${UBUN_TARGET_SYS}/libm-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libmvec-*.so ${libdir}/${UBUN_TARGET_SYS}/ld*.so.* \
                ${libdir}/${UBUN_TARGET_SYS}/ld-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libpthread*.so.* ${libdir}/${UBUN_TARGET_SYS}/libpthread-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libresolv*.so.* ${libdir}/${UBUN_TARGET_SYS}/libresolv-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/librt*.so.* ${libdir}/${UBUN_TARGET_SYS}/librt-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libutil*.so.* ${libdir}/${UBUN_TARGET_SYS}/libutil-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libnsl*.so.* ${libdir}/${UBUN_TARGET_SYS}/libnsl-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libnss_files*.so.* ${libdir}/${UBUN_TARGET_SYS}/libnss_files-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libnss_compat*.so.* ${libdir}/${UBUN_TARGET_SYS}/libnss_compat-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libnss_dns*.so.* ${libdir}/${UBUN_TARGET_SYS}/libnss_dns-*.so \
                ${libdir}/libdl*.so.* ${libdir}/${UBUN_TARGET_SYS}/libdl-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libanl*.so.* ${libdir}/${UBUN_TARGET_SYS}/libanl-*.so \
                ${libdir}/${UBUN_TARGET_SYS}/libBrokenLocale*.so.* ${libdir}/${UBUN_TARGET_SYS}/libBrokenLocale-*.so\
                ${libdir}/${UBUN_TARGET_SYS}/libtinfo.so.* \
				${libdir}/${UBUN_TARGET_SYS}/libbz2.so.* \
				${libdir}/${UBUN_TARGET_SYS}/libcrypt-*.so ${libdir}/${UBUN_TARGET_SYS}/libcrypt*.so.* \
                "
glib_libs = " \
            ${libdir}/${UBUN_TARGET_SYS}/libgio-2.0.so.* \
            ${libdir}/${UBUN_TARGET_SYS}/libglib-2.0.so.* \
            ${libdir}/${UBUN_TARGET_SYS}/libgmodule-2.0.so.* \
            ${libdir}/${UBUN_TARGET_SYS}/libgobject-2.0.so.* \
            ${libdir}/${UBUN_TARGET_SYS}/libgthread-2.0.so.* \
            "
other_libs = " \
            ${libdir}/${UBUN_TARGET_SYS}/libblkid.so.* \
            ${libdir}/${UBUN_TARGET_SYS}/libmount.so.* \
            ${libdir}/${UBUN_TARGET_SYS}/libuuid.so.* \
            "
FILES_libc6 = "${libc_baselibs} ${glib_libs} ${other_libs} DEBIAN/*"
FILES_libc6-dev = "${libdir}/${UBUN_TARGET_SYS}/*_nonshared.a ${libdir}/${UBUN_TARGET_SYS}/*_nonshared.a ${libdir}/${UBUN_TARGET_SYS}/*.o DEBIAN/*"
FILES_libc6-staticdev = "${libdir}/${UBUN_TARGET_SYS}/*.a ${libdir}/${UBUN_TARGET_SYS}/*.a DEBIAN/*"

# systemd
PACKAGES += "udev systemd systemd-dev systemd-journal-remote systemd-journal-gatewayd \
              systemd-journal-upload systemd-compat-units systemd-conf systemd-serialgetty \
              systemd-systemctl-native "
PROVIDES += "udev systemd systemd-dev systemd-journal-remote systemd-journal-gatewayd \
             systemd-journal-upload systemd-compat-units systemd-conf systemd-serialgetty \
             systemd-systemctl-native "
PACKAGES_DYNAMIC += "^lib(udev|systemd|nss).*"
PACKAGES_DYNAMIC += "^systemd-locale-.*"

RPROVIDES_udev = "udev udev-hwdb hotplug"
FILES_udev += "${libdir}/dummy"
PKGR_udev = "0"
PKGV_udev = "0"

RPROVIDES_systemd = "systemd libsystemd0 systemd-systemctl-native systemd-locale systemd-dbg \
                    systemd-bash-completion systemd-staticdev systemd-doc \
                    "
FILES_systemd += "${libdir}/dummy"
PKGR_systemd = "0"
PKGV_systemd = "0"

RPROVIDES_systemd-dev = "libsystemd-dev"
FILES_systemd-dev += "${libdir}/dummy"
PKGR_systemd-dev = "0"
PKGV_systemd-dev = "0"

RPROVIDES_systemd-journal-remote = "systemd-journal-remote"
FILES_systemd-journal-remote += "${libdir}/dummy"
PKGR_systemd-journal-remote = "0"
PKGV_systemd-journal-remote = "0"

RPROVIDES_systemd-journal-gatewayd = "systemd-journal-gatewayd"
FILES_systemd-journal-gatewayd += "${libdir}/dummy"
PKGR_systemd-journal-gatewayd = "0"
PKGV_systemd-journal-gatewayd = "0"

RPROVIDES_systemd-journal-upload = "systemd-journal-upload"
FILES_systemd-journal-upload += "${libdir}/dummy"
PKGR_systemd-journal-upload = "0"
PKGV_systemd-journal-upload = "0"

RPROVIDES_systemd-compat-units = "systemd-compat-units"
FILES_systemd-compat-units += "${libdir}/dummy"
PKGR_systemd-compat-units = "0"
PKGV_systemd-compat-units = "0"

RPROVIDES_systemd-conf = "systemd-conf"
FILES_systemd-conf += "${libdir}/dummy"
PKGR_systemd-conf = "0"
PKGV_systemd-conf = "0"

RPROVIDES_systemd-serialgetty = "systemd-serialgetty-locale systemd-serialgetty-dbg systemd-serialgetty-doc \
                     systemd-serialgetty-staticdev systemd-serialgetty-dev systemd-serialgetty \
                    "
FILES_systemd-serialgetty += "${libdir}/dummy"
PKGR_systemd-serialgetty = "0"
PKGV_systemd-serialgetty = "0"

PACKAGES += "systemd-vconsole-setup \
             systemd-initramfs systemd-container systemd-analyze systemd-rpm-macros \
             systemd-xorg-xinitrc  systemd-kernel-install \
             systemd-zsh-completion systemd-gui systemd-binfmt \
             "
PROVIDES += "systemd-vconsole-setup \
             systemd-initramfs systemd-container systemd-analyze systemd-rpm-macros \
             systemd-xorg-xinitrc systemd-zsh-completion systemd-gui systemd-binfmt \
             "
RPROVIDES_systemd-vconsole-setup = "systemd-vconsole-setup"
FILES_systemd-vconsole-setup += "${libdir}/dummy"
PKGR_systemd-vconsole-setup = "0"
PKGV_systemd-vconsole-setup = "0"

RPROVIDES_systemd-initramfs = "systemd-initramfs"
FILES_systemd-initramfs += "${libdir}/dummy"
PKGR_systemd-initramfs = "0"
PKGV_systemd-initramfs = "0"

RPROVIDES_systemd-container = "systemd-container"
FILES_systemd-container += "${libdir}/dummy"
PKGR_systemd-container = "0"
PKGV_systemd-container = "0"

RPROVIDES_systemd-analyze = "systemd-analyze"
FILES_systemd-analyze += "${libdir}/dummy"
PKGR_systemd-analyze = "0"
PKGV_systemd-analyze = "0"

RPROVIDES_systemd-rpm-macros = "systemd-rpm-macros"
FILES_systemd-rpm-macros += "${libdir}/dummy"
PKGR_systemd-rpm-macros = "0"
PKGV_systemd-rpm-macros = "0"

RPROVIDES_systemd-xorg-xinitrc = "systemd-xorg-xinitrc"
FILES_systemd-xorg-xinitrc += "${libdir}/dummy"
PKGR_systemd-xorg-xinitrc = "0"
PKGV_systemd-xorg-xinitrc = "0"

RPROVIDES_systemd-zsh-completion = "systemd-zsh-completion"
FILES_systemd-zsh-completion += "${libdir}/dummy"
PKGR_systemd-zsh-completion = "0"
PKGV_systemd-zsh-completion = "0"

RPROVIDES_systemd-gui = "systemd-gui"
FILES_systemd-gui += "${libdir}/dummy"
PKGR_systemd-gui = "0"
PKGV_systemd-gui = "0"

RPROVIDES_systemd-binfmt = "systemd-binfmt"
FILES_systemd-binfmt += "${libdir}/dummy"
PKGR_systemd-binfmt = "0"
PKGV_systemd-binfmt = "0"

#  version control
PKG_libc6 = "libc6"
PKGV_libc6 = "${UBUN_VER_LIBC}"
PKGR_libc6 = "0"

PKGV_libasan-dev = "${UBUN_VER_GCC}"
PKGV_libasan = "${UBUN_VER_GCC}"
PKGV_libasan-staticdev = "${UBUN_VER_GCC}"
PKGV_libatomic-dev = "${UBUN_VER_GCC}"
PKGV_libatomic = "${UBUN_VER_GCC}"
PKGV_libatomic-staticdev = "${UBUN_VER_GCC}"
PKGV_libg2c-dev = "0"
PKGV_libg2c = "0"
PKGV_libgcc-dev = "0"
PKGV_libgcc = "0"
PKGV_libgfortran-dev = "${UBUN_VER_GCC}"
PKGV_libgfortran = "${UBUN_VER_GCC}"
PKGV_libgfortran-staticdev = "${UBUN_VER_GCC}"
PKGV_libgomp-dev = "${UBUN_VER_GCC}"
PKGV_libgomp = "${UBUN_VER_GCC}"
PKGV_libgomp-staticdev = "${UBUN_VER_GCC}"
PKGV_libitm-dev = "${UBUN_VER_GCC}"
PKGV_libitm = "${UBUN_VER_GCC}"
PKGV_libitm-staticdev = "${UBUN_VER_GCC}"
PKGV_liblsan-dev = "${UBUN_VER_GCC}"
PKGV_liblsan = "${UBUN_VER_GCC}"
PKGV_liblsan-staticdev = "${UBUN_VER_GCC}"
PKGV_libmudflap-dev = "${UBUN_VER_GCC}"
PKGV_libmudflap = "${UBUN_VER_GCC}"
PKGV_libmudflap-staticdev = "${UBUN_VER_GCC}"
PKGV_libquadmath-dev = "${UBUN_VER_GCC}"
PKGV_libquadmath = "${UBUN_VER_GCC}"
PKGV_libquadmath-staticdev = "${UBUN_VER_GCC}"
PKGV_libssp-dev = "${UBUN_VER_GCC}"
PKGV_libssp = "${UBUN_VER_GCC}"
PKGV_libssp-staticdev = "${UBUN_VER_GCC}"
PKGV_libstdc++-dbg = "0"
PKGV_libstdc++-dev = "0"
PKGV_libstdc++ = "0"
PKGV_libstdc++-precompile-dev = "0"
PKGV_libstdc++-staticdev = "0"
PKGV_libtsan-dev = "${UBUN_VER_GCC}"
PKGV_libtsan = "${UBUN_VER_GCC}"
PKGV_libtsan-staticdev = "${UBUN_VER_GCC}"
PKGV_libubsan-dev = "${UBUN_VER_GCC}"
PKGV_libubsan = "${UBUN_VER_GCC}"
PKGV_libubsan-staticdev = "${UBUN_VER_GCC}"

PKG_libc-bin = "libc-bin"
PKGV_libc-bin = "${UBUN_VER_GCC}"
FILES_libc-bin = "${libdir}/dummy"

PKG_libunistring2 = "libunistring2"
PKGV_libunistring2 = "0.9.9"
FILES_libunistring2 = "${libdir}/dummy"


# From gcc-runtime.inc
FILES_libg2c = "${target_libdir}/libg2c.so.*"
SUMMARY_libg2c = "Companion runtime library for g77"
FILES_libg2c-dev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libg2c.so \
    ${libdir}/${UBUN_TARGET_SYS}/libg2c.a \
    ${libdir}/${UBUN_TARGET_SYS}/libfrtbegin.a \
"
SUMMARY_libg2c-dev = "Companion runtime library for g77 - development files"

# libstdc++
FILES_libstdc++ = "${libdir}/${UBUN_TARGET_SYS}/libstdc++.so.*"
SUMMARY_libstdc++ = "GNU standard C++ library"
FILES_libstdc++-dev = "\
    /include/c++ \
    ${includedir}/c++/ \
    ${libdir}/${UBUN_TARGET_SYS}/libstdc++.so \
    ${libdir}/${UBUN_TARGET_SYS}/libstdc++*.la \
    ${libdir}/${UBUN_TARGET_SYS}/libsupc++.la \
"
SUMMARY_libstdc++-dev = "GNU standard C++ library - development files"
FILES_libstdc++-staticdev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libstdc++*.a \
    ${libdir}/${UBUN_TARGET_SYS}/libsupc++.a \
"
SUMMARY_libstdc++-staticdev = "GNU standard C++ library - static development files"
FILES_libstdc++-precompile-dev = "${includedir}/c++/${TARGET_SYS}/bits/*.gch"
SUMMARY_libstdc++-precompile-dev = "GNU standard C++ library - precompiled header files"
PKG_libstdc++ = "libstdc++6"
PKGR_libstdc++ = "0"
PKGV_libstdc++ = "0"

FILES_libssp = "${libdir}/libssp.so.*"
SUMMARY_libssp = "GNU stack smashing protection library"
FILES_libssp-dev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libssp*_nonshared.a \
"
SUMMARY_libssp-dev = "GNU stack smashing protection library - development files"
FILES_libssp-staticdev = "${libdir}/libssp*.a"
SUMMARY_libssp-staticdev = "GNU stack smashing protection library - static development files"

FILES_libquadmath = "${libdir}/libquadmath*.so.*"
SUMMARY_libquadmath = "GNU quad-precision math library"
FILES_libquadmath-dev = "\
    ${libdir}/gcc/${TARGET_SYS}/${BINV}/include/quadmath* \
    ${libdir}/libquadmath*.so \
    ${libdir}/libquadmath.la \
"
SUMMARY_libquadmath-dev = "GNU quad-precision math library - development files"
FILES_libquadmath-staticdev = "${libdir}/libquadmath.a"
SUMMARY_libquadmath-staticdev = "GNU quad-precision math library - static development files"

# NOTE: mudflap has been removed as of gcc 4.9 and has been superseded by the address sanitiser
FILES_libmudflap = "${libdir}/libmudflap*.so.*"
SUMMARY_libmudflap = "Pointer debugging library for gcc"
FILES_libmudflap-dev = "\
    ${libdir}/libmudflap*.so \
    ${libdir}/libmudflap.la \
"
SUMMARY_libmudflap-dev = "Pointer debugging library for gcc - development files"
FILES_libmudflap-staticdev = "${libdir}/libmudflap.a"
SUMMARY_libmudflap-staticdev = "Pointer debugging library for gcc - static development files"

FILES_libgomp = "${libdir}/libgomp*${SOLIBS}"
SUMMARY_libgomp = "GNU OpenMP parallel programming library"
FILES_libgomp-dev = "\
    ${libdir}/libgomp*${SOLIBSDEV} \
    ${libdir}/libgomp*.la \
    ${libdir}/libgomp.spec \
    ${libdir}/gcc/${TARGET_SYS}/${BINV}/include/omp.h \
"
SUMMARY_libgomp-dev = "GNU OpenMP parallel programming library - development files"
FILES_libgomp-staticdev = "${libdir}/libgomp*.a"
SUMMARY_libgomp-staticdev = "GNU OpenMP parallel programming library - static development files"

FILES_libatomic = "${libdir}/libatomic.so.*"
SUMMARY_libatomic = "GNU C++11 atomics support library"
FILES_libatomic-dev = "\
    ${libdir}/libatomic.so \
    ${libdir}/libatomic.la \
"
SUMMARY_libatomic-dev = "GNU C++11 atomics support library - development files"
FILES_libatomic-staticdev = "${libdir}/libatomic.a"
SUMMARY_libatomic-staticdev = "GNU C++11 atomics support library - static development files"

FILES_libitm = "${libdir}/libitm.so.*"
SUMMARY_libitm = "GNU transactional memory support library"
FILES_libitm-dev = "\
    ${libdir}/libitm.so \
    ${libdir}/libitm.la \
    ${libdir}/libitm.spec \
"
SUMMARY_libitm-dev = "GNU transactional memory support library - development files"
FILES_libitm-staticdev = "${libdir}/libitm.a"
SUMMARY_libitm-staticdev = "GNU transactional memory support library - static development files"

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

#FIX .so should not include in non -dev issue
#INSANE_SKIP_${PN}-dev += "dev-elf"
INSANE_SKIP_${PN} += "installed-vs-shipped"
INSANE_SKIP_${PN}-utils += "ldflags"
INSANE_SKIP_libstdc++ += "ldflags"
INSANE_SKIP_libgfortran += "ldflags"
INSANE_SKIP_libgcc += "ldflags dev-deps"
INSANE_SKIP_libgfortran += "ldflags dev-deps"
INSANE_SKIP_libstdc++ += "ldflags dev-deps"
INSANE_SKIP_libatomic += "ldflags"
INSANE_SKIP_libasan += "ldflags"
INSANE_SKIP_libubsan += "ldflags"
INSANE_SKIP_libssp += "ldflags"
INSANE_SKIP_libgomp += "ldflags"
INSANE_SKIP_libitm += "ldflags"
INSANE_SKIP_gdbserver += "ldflags"
INSANE_SKIP_zlib += "file-rdeps"
