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
ALLOW_EMPTY_dbus = "1"
ALLOW_EMPTY_liblzma = "1"
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
ALLOW_EMPTY_libcap = "1"
ALLOW_EMPTY_libcap-dev = "1"
ALLOW_EMPTY_libatomic-ops = "1"
ALLOW_EMPTY_libffi = "1"
ALLOW_EMPTY_libvorbis = "1"
ALLOW_EMPTY_libvorbis-dev = "1"
ALLOW_EMPTY_speexdsp = "1"
ALLOW_EMPTY_libogg = "1"
ALLOW_EMPTY_libsamplerate0 = "1"
ALLOW_EMPTY_libsamplerate0-dev = "1"
ALLOW_EMPTY_libsndfile1 = "1"
ALLOW_EMPTY_libsndfile1-dev = "1"
ALLOW_EMPTY_flac = "1"
ALLOW_EMPTY_flac-dev = "1"
ALLOW_EMPTY_libflac = "1"
ALLOW_EMPTY_libflac-dev = "1"
ALLOW_EMPTY_libflac++ = "1"
ALLOW_EMPTY_libflac++-dev = "1"
ALLOW_EMPTY_liboggflac = "1"
ALLOW_EMPTY_liboggflac++ = "1"
ALLOW_EMPTY_libasound2-plugins = "1"
ALLOW_EMPTY_libevdev = "1"
ALLOW_EMPTY_libpciacess = "1"
ALLOW_EMPTY_libffi = "1"
ALLOW_EMPTY_libbsd = "1"
ALLOW_EMPTY_libpthread-stubs = "1"
ALLOW_EMPTY_pixman = "1"
ALLOW_EMPTY_libinput = "1"
ALLOW_EMPTY_libinput-dev = "1"
ALLOW_EMPTY_mtdev = "1"
ALLOW_EMPTY_mtdev-dev = "1"
ALLOW_EMPTY_tcp-wrappers = "1"
ALLOW_EMPTY_libwrap = "1"
ALLOW_EMPTY_libwrap-dev = "1"
ALLOW_EMPTY_liba52 = "1"
ALLOW_EMPTY_liba52-dev = "1"
ALLOW_EMPTY_libqhull = "1"
ALLOW_EMPTY_libqhull-dev = "1"
ALLOW_EMPTY_libcryptopp = "1"
ALLOW_EMPTY_libcrypto++ = "1"
ALLOW_EMPTY_libcrypto++-dev = "1"
ALLOW_EMPTY_libwacom = "1"
ALLOW_EMPTY_libwacom-dev = "1"
ALLOW_EMPTY_libcroco = "1"
ALLOW_EMPTY_libgudev = "1"
ALLOW_EMPTY_libid3tag = "1"
ALLOW_EMPTY_librsvg = "1"
ALLOW_EMPTY_libsoup-2.4 = "1"


ALLOW_EMPTY_libtheora = "1"
ALLOW_EMPTY_libtheora-dev = "1"
ALLOW_EMPTY_liburcu = "1"
ALLOW_EMPTY_liburcu-dev = "1"
ALLOW_EMPTY_libwebp = "1"
ALLOW_EMPTY_libwebp-dev = "1"
ALLOW_EMPTY_mpg123 = "1"
ALLOW_EMPTY_mpg123-dev = "1"
ALLOW_EMPTY_taglib = "1"
ALLOW_EMPTY_taglib-dev = "1"
ALLOW_EMPTY_json-c = "1"
ALLOW_EMPTY_json-c-dev = "1"
ALLOW_EMPTY_libssl1.0 = "1"
ALLOW_EMPTY_libssl1.0-dev = "1"
ALLOW_EMPTY_gdk-pixbuf = "1"

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
            e2fsprogs-native \
            nativesdk-libarchive \
            util-linux \
            lsbinitscripts \
            glib-2.0 \
            libffi \
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
            gstreamer1.0 \
            gstreamer1.0-plugins-ugly \
            gstreamer1.0-rtsp-server \
            gstreamer1.0-libav \
"


do_install (){
    install -d ${D}${base_libdir}
    install -d ${D}${base_libdir}/${UBUN_TARGET_SYS}
    install -d ${D}${bindir}
    install -d ${D}${sbindir}
    install -d ${D}${libexecdir}
    install -d ${D}${datadir}
    install -d ${D}${includedir}
    install -d ${D}${includedir}/${UBUN_TARGET_SYS}
    install -d ${D}/DEBIAN
    install -d ${D}${libdir}
    install -d ${D}${libdir}/pkgconfig
    install -d ${D}${libdir}/gcc/${HOST_ARCH}/7
    install -d ${D}${libdir}/${UBUN_TARGET_SYS}
    install -d ${D}/usr/share/pkgconfig/
    install -d ${D}/usr/share/aclocal/
    install -d ${D}/usr/lib/aarch64-linux-gnu/gdk-pixbuf-2.0/
    install -d ${D}/usr/include/gdk-pixbuf-2.0/
    install -d ${D}${libdir}/${UBUN_TARGET_SYS}/pkgconfig/
    install -d ${D}/usr/share/thumbnailers/

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
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/${UBUN_TARGET_SYS}/ffi*.h ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/gstreamer-1.0 ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/include/gst ${D}${includedir}
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/audio/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/linux ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/* ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/sys ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/gnu ${D}${includedir}
    mv ${D}${includedir}/c++/7/* ${D}${includedir}/c++
    mv ${D}${includedir}/c++/aarch64-linux-gnu/bits/* ${D}${includedir}/c++/bits
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/gcc-cross/${UBUN_TARGET_SYS}/7/libgcc*.a ${D}${libdir}/${UBUN_TARGET_SYS}
    ln -sf ./libgcc_s.so.1 ${D}/${libdir}/aarch64-linux-gnu/libgcc_s.so
    ln -sf ./libstdc++.so.6.0.25 ${D}/${libdir}/aarch64-linux-gnu/libstdc++.so
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/gcc-cross/${UBUN_TARGET_SYS}/7/libatomic.* ${D}${libdir}/${UBUN_TARGET_SYS}
    ln -sf ./libatomic.so.1.2.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libatomic.so
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

    #libcap & libcap-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libcap*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libcap* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/include/sys/capability.h ${D}/usr/include/sys/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/libcap.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libcap.so.2.25 ${D}${libdir}/${UBUN_TARGET_SYS}/libcap.so

    #libsndfile1 & libsndfile1-dev
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libsndfile.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/sndfile.* ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/sndfile.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libsndfile.so.1.0.28 ${D}${libdir}/${UBUN_TARGET_SYS}/libsndfile.so

    #libogg & libogg-dev
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libogg.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/ogg ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/ogg.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libogg.so.0.8.2 ${D}${libdir}/${UBUN_TARGET_SYS}/libogg.so

    #libflac8 & libflac-dev & libflac++6v5 & libflac++-dev
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libFLAC*.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libFLAC*.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/FLAC ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/flac.pc ${D}/usr/share/pkgconfig/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/flac++.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libFLAC.so.8.3.0  ${D}${libdir}/${UBUN_TARGET_SYS}/libFLAC.so
    ln -sf ./libFLAC++.so.6.3.0  ${D}${libdir}/${UBUN_TARGET_SYS}/libFLAC++.so

    #libvorbis & libvorbis-dev & libvorbisenc2 & libvorbisfile3
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libvorbis*.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/vorbis ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/vorbis*.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libvorbis.so.0.4.8  ${D}${libdir}/${UBUN_TARGET_SYS}/libvorbis.so
    ln -sf ./libvorbisenc.so.2.0.11  ${D}${libdir}/${UBUN_TARGET_SYS}/libvorbisenc.so
    ln -sf ./libvorbisfile.so.3.3.7  ${D}${libdir}/${UBUN_TARGET_SYS}/libvorbisfile.so

    #libatomic1 & libatomic1-ops-dev
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libatomic*.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/atomic_ops*.h ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/atomic_ops ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/atomic_ops.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libatomic.so.1.2.0  ${D}${libdir}/${UBUN_TARGET_SYS}/libatomic.so.1

    #libsamplerate0  & libsamplerate0-dev
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libsamplerate*.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/samplerate*.h ${D}/usr/include/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/samplerate.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libsamplerate.so.0.1.8  ${D}${libdir}/${UBUN_TARGET_SYS}/libsamplerate.so

    #speexdsp  & speexdsp-dev & libspeex1  &libspeex-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libspeexdsp*.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libspeex.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/include/speex ${D}/usr/include/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/speexdsp.pc ${D}/usr/share/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/speex.pc ${D}/usr/share/pkgconfig/
    ln -sf ./libspeexdsp.so.1.5.0  ${D}${libdir}/${UBUN_TARGET_SYS}/libspeexdsp.so
    ln -sf ./libspeex.so.1.5.0  ${D}${libdir}/${UBUN_TARGET_SYS}/libspeex.so

    #alsa-plugins->libasound2-plugins
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/alsa-lib ${D}${libdir}/${UBUN_TARGET_SYS}/
    ln -sf ./libasound_module_rate_samplerate.so  ${D}${libdir}/${UBUN_TARGET_SYS}/alsa-lib/libasound_module_rate_samplerate_best.so
    ln -sf ./libasound_module_rate_samplerate.so  ${D}${libdir}/${UBUN_TARGET_SYS}/alsa-lib/libasound_module_rate_samplerate_linear.so
    ln -sf ./libasound_module_rate_samplerate.so  ${D}${libdir}/${UBUN_TARGET_SYS}/alsa-lib/libasound_module_rate_samplerate_medium.so
    ln -sf ./libasound_module_rate_samplerate.so  ${D}${libdir}/${UBUN_TARGET_SYS}/alsa-lib/libasound_module_rate_samplerate_order.so
    ln -sf ./libasound_module_rate_speexrate.so  ${D}${libdir}/${UBUN_TARGET_SYS}/alsa-lib/libasound_module_rate_speexrate_best.so
    ln -sf ./libasound_module_rate_speexrate.so  ${D}${libdir}/${UBUN_TARGET_SYS}/alsa-lib/libasound_module_rate_speexrate_medium.so

    # libinput10 & libinput-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libinput.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libinput.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libinput.h  ${D}${includedir}/
    ln -sf ./libinput.so.10.13.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libinput.so

    # libmtdev1 & libmtdev-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libmtdev.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/mtdev.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/mtdev-mapping.h  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/mtdev-plumbing.h  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/mtdev.h  ${D}${includedir}/
    ln -sf ./libmtdev.so.1.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libmtdev.so

    # libwrap0 & libwrap0-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwrap.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/tcpd.h  ${D}${includedir}/
    ln -sf ./libwrap.so.0.7.6 ${D}${libdir}/${UBUN_TARGET_SYS}/libwrap.so

    # liba52 & liba52-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/liba52*.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/a52dec ${D}${includedir}/
    ln -sf ./liba52-0.7.4.so ${D}${libdir}/${UBUN_TARGET_SYS}/liba52.so

    # libqhull7 & libqhull-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libqhull*.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libqhull  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libqhullcpp  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/qhull  ${D}${includedir}/
    ln -sf ./libqhull.so.7.2.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libqhull.so

    # libcrypto++ & libcrypto++-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libcryptopp.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libcrypto++.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libcrypto++.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/crypto++  ${D}${includedir}/
    #cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/cryptopp  ${D}${includedir}/
    ln -sf ./libcrypto++.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libcrypto++.so
    ln -sf ./libcrypto++.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libcrypto++.so.6
    ln -sf ./libcrypto++.a ${D}${libdir}/${UBUN_TARGET_SYS}/libcryptopp.a
    ln -sf ./libcrypto++.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libcryptopp.so
    ln -sf ./libcrypto++.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libcrypto++.so

    # libwacom2 & libwacom-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwacom.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libwacom.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libwacom-1.0  ${D}${includedir}/
    ln -sf ./libwacom.so.2.6.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libwacom.so

    # libcroco3 & libcroco3-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libcroco-0.6.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libcroco-0.6.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libcroco-0.6  ${D}${includedir}/
    ln -sf ./libcroco-0.6.so.3.0.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libcroco-0.6.so

    # libgudev-1.0-0 & libgudev-1.0-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libgudev-1.0.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/gudev-1.0.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/gudev-1.0  ${D}${includedir}/
    ln -sf ./libgudev-1.0.so.0.2.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libgudev-1.0.so

    # libid3tag0 & libid3tag0-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libid3tag.so* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/id3tag.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/id3tag.h  ${D}${includedir}/
    ln -sf ./libid3tag.so.0.3.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libid3tag.so

    # librsvg2-2 & librsvg2-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/librsvg-2.so* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/librsvg-2.0.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/librsvg-2.0  ${D}${includedir}/
    ln -sf ./librsvg-2.so.2.40.20 ${D}${libdir}/${UBUN_TARGET_SYS}/librsvg-2.so

    # libsoup2.4-1 & libsoup2.4-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libsoup-2.4.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libsoup-2.4.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libsoup-2.4  ${D}${includedir}/
    ln -sf ./libsoup-2.4.so.1.8.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libsoup-2.4.so

    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/include/libdrm/ ${D}/usr/include/
    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/include/freedreno/ ${D}/usr/include/
    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/include/libsync.h ${D}/usr/include/libsync.h
    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/include/xf86drm.h ${D}/usr/include/xf86drm.h
    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/include/xf86drmMode.h ${D}/usr/include/xf86drmMode.h
    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libdrm.so*   ${D}/usr/lib/aarch64-linux-gnu/
    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libdrm_free*   ${D}/usr/lib/aarch64-linux-gnu/
    cp ${CP_ARGS}  ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/libdrm* ${D}${libdir}/pkgconfig
    ln -sf ./libdrm.so.2.4.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libdrm.so

    # liborc-0.4-0 & liborc-0.4-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/liborc-0.4.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/liborc-test-0.4.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/orc-0.4.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/orc-0.4  ${D}${includedir}/
    ln -sf ./liborc-0.4.so.0.25.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liborc-0.4.so
    ln -sf ./liborc-test-0.4.so.0.25.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liborc-test-0.4.so

    #udev
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/aarch64-linux-gnu/libudev.so.*  ${D}/${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/aarch64-linux-gnu/libudev.so  ${D}/${libdir}/${UBUN_TARGET_SYS}
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

    #copied all pkgconfig files here
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/* ${D}${libdir}/pkgconfig/
    #clean wayland pkgconfig files here
    rm -rf ${D}${libdir}/pkgconfig/wayland-*.pc

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libiberty.a ${D}${libdir}/${UBUN_TARGET_SYS}

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libpam.so.* ${D}${libdir}/${UBUN_TARGET_SYS}

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libaudit.so.* ${D}${libdir}/${UBUN_TARGET_SYS}

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libcap-ng.so.* ${D}${libdir}/${UBUN_TARGET_SYS}

    #FIX glib-2.0 pkgconfig/lib symbols
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libg*.so.*.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libg*.a ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/glib-2.0/include/*.h ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/g*.pc ${D}${libdir}/pkgconfig
    #copy libffi libraries
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libffi.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libffi*.a ${D}${libdir}/${UBUN_TARGET_SYS}
    #copy gstreamer libraries
    cp ${CP_ARGS}    ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libg*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstwayland*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstwaylandsink*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstaudio*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstpulseaudio*
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/gstreamer*.pc ${D}${libdir}/pkgconfig/

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/libnl*.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libnl* ${D}${base_libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libnl* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/libnl3 ${D}${includedir}/

    ## gdk-pixbuf
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/gdk-pixbuf-2.0/* ${D}${libdir}/${UBUN_TARGET_SYS}/gdk-pixbuf-2.0
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libgdk_pixbuf-2.0.so.0.3611.0 ${D}${libdir}/${UBUN_TARGET_SYS}/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/bin/gdk-pixbuf* ${D}/usr/bin/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/gdk-pixbuf-2.0/*  ${D}/usr/include/gdk-pixbuf-2.0/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libgdk_pixbuf_xlib-2.0.so.0.3611.0  ${D}${libdir}/${UBUN_TARGET_SYS}/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/pkgconfig/gdk-pixbuf*.pc  ${D}${libdir}/${UBUN_TARGET_SYS}/pkgconfig/
   cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/share/thumbnailers/* ${D}/usr/share/thumbnailers/
   ln -sf ./libgdk_pixbuf-2.0.so.0.3611.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libgdk_pixbuf-2.0.so
   ln -sf ./libgdk_pixbuf-2.0.so.0.3611.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libgdk_pixbuf-2.0.so.0
   ln -sf ./libgdk_pixbuf_xlib-2.0.so.0.3611.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libgdk_pixbuf_xlib-2.0.so
   ln -sf ./libgdk_pixbuf_xlib-2.0.so.0.3611.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libgdk_pixbuf_xlib-2.0.so.0

    ## libexpat & libexpat-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libexpat*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libexpat.so* ${D}${base_libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/expat*.h ${D}${includedir}${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/expat*.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/expat*.pc ${D}${libdir}/pkgconfig
    ln -sf ../../..${base_libdir}/${UBUN_TARGET_SYS}/libexpat.so.1.6.7 ${D}${libdir}/${UBUN_TARGET_SYS}/libexpat.so

    #libjpeg jpeg
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libjpeg.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/j*.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/j*.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libjpeg.pc ${D}${libdir}/pkgconfig
    ln -s ./libjpeg-turbo.so.0.0.0 ${D}/lib/aarch64-linux-gnu/libjpeg.so.8.1.2

    ## libpng
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libpng* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libpng ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libpng16 ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/png.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/pngconf.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/pnglibconf.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libpng*.pc ${D}${libdir}/pkgconfig

    ## libxkbcommon
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/pkgconfig/xkbcommon.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/xkbcommon ${D}${includedir}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libxkbcommon.so.0.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/${UBUN_TARGET_SYS}/libxkbcommon.a ${D}${libdir}/${UBUN_TARGET_SYS}/
    ln -sf ./libxkbcommon.so.0.0.0 ${D}/usr/lib/${UBUN_TARGET_SYS}/libxkbcommon.so
    ln -sf ./libxkbcommon.so.0.0.0 ${D}/usr/lib/${UBUN_TARGET_SYS}/libxkbcommon.so.0

    # libdbus-1 & libdbus-1-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libdbus*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    install -d ${D}${libdir}/${UBUN_TARGET_SYS}/dbus-1.0/include/dbus/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/dbus-1.0/include/dbus/dbus-arch-deps.h ${D}${libdir}/${UBUN_TARGET_SYS}/dbus-1.0/include/dbus/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libdbus*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/dbus-1.0 ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/dbus*.pc ${D}${libdir}/pkgconfig
    ln -sf ./libdbus-1.so.3.19.4 ${D}${libdir}/${UBUN_TARGET_SYS}/libdbus-1.so

    ## xz & liblzma & liblzma-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/liblzma*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/liblzma*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/lzma.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/lzma ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/liblzma*.pc ${D}${libdir}/pkgconfig
    ln -sf ./liblzma.so.5.2.2 ${D}${libdir}/${UBUN_TARGET_SYS}/liblzma.so

    ## zlib1g & zlib1g-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libz.* ${D}${base_libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libz.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/zlib.pc ${D}${libdir}/pkgconfig
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/zlib.h ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/zconf.h ${D}${includedir}
    ln -sf ./../../../${base_libdir}/${UBUN_TARGET_SYS}/libz.so.1.2.11 ${D}${libdir}/${UBUN_TARGET_SYS}/libz.so
    ln -sf ./libz.so.1.2.11 ${D}${base_libdir}/${UBUN_TARGET_SYS}/libz.so.1

    ## libsystemd & libsystemd-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libsystemd*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/systemd ${D}${includedir}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libsystemd*.pc ${D}${libdir}/pkgconfig
    ln -sf ./libsystemd.so.0.21.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libsystemd.so

    ## ligcrypt & libgcrypt-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libgcrypt*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/gcrypt.h ${D}${includedir}
    ln -sf ./libgcrypt.so.20.2.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libgcrypt.so

    ## liglz4 & liblz4-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/liblz4*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/lz4*.h ${D}${includedir}
    ln -sf ./liblz4.so.1.7.1 ${D}${libdir}/${UBUN_TARGET_SYS}/liblz4.so

    ## libgpg-error & libgpg-error-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libgpg-error*.so* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/gpg*.h ${D}${includedir}/${UBUN_TARGET_SYS}
    ln -sf ./libgpg-error.so.0.20.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libgpg-error.so

    ## libasound2
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libasound.so* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/alsa.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/alsa  ${D}${includedir}/

    ## libssl &libssl-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/openssl/  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/openssl/  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libssl* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libcrypto* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libssl.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig//libcrypto.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/openssl.pc  ${D}${libdir}/pkgconfig/

    ## libevdev2 & libevdev-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libevdev.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/libevdev-1.0/libevdev  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libevdev.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/alsa  ${D}${includedir}/
    ln -sf ./libevdev.so.2.1.20 ${D}${libdir}/${UBUN_TARGET_SYS}/libevdev.so.2
    ln -sf ./libevdev.so.2.1.20 ${D}${libdir}/${UBUN_TARGET_SYS}/libevdev.so

    ## libpciaccess & libpciaccess-dev & xorg-macros
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libpciaccess.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/pciaccess.h  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/pciaccess.pc  ${D}${libdir}/pkgconfig/
    ln -sf ./libpciaccess.so.0.11.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libpciaccess.so.0
    ln -sf ./libpciaccess.so.0.11.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libpciaccess.so
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/share/pkgconfig/xorg-macros.pc  ${D}/usr/share/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/usr/share/aclocal/xorg-macros.m4  ${D}/usr/share/aclocal/

    ## libbsd0 & libbsd-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${base_libdir}/${UBUN_TARGET_SYS}/libbsd.so.* ${D}${libdir}/${UBUN_TARGET_SYS}
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libbsd*.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/bsd  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libbsd*.pc  ${D}${libdir}/pkgconfig/
    ln -sf ./libbsd.so.0.8.7 ${D}${libdir}/${UBUN_TARGET_SYS}/libbsd.so.0
    ln -sf ./libbsd.so.0.8.7 ${D}${libdir}/${UBUN_TARGET_SYS}/libbsd.so

    ##  libpthread-stubs0-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/pthread-stubs.pc  ${D}${libdir}/pkgconfig/

    # libpixman-1-0 & libpixman-1-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libpixman-1.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/pixman-1.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/pixman-1  ${D}${includedir}/
    ln -sf ./libpixman-1.so.0.34.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libpixman-1.so

    ## libjsoncpp1 & libjsoncpp-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/jsoncpp/json/  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libjsoncpp.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/jsoncpp.pc  ${D}${libdir}/pkgconfig/
    ln -sf ./libjsoncpp.so.1.7.4 ${D}${libdir}/${UBUN_TARGET_SYS}/libjsoncpp.so
    ln -sf ./libjsoncpp.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libjsoncpp.so

    # libtheora0 & libtheora-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libtheora.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libtheoradec.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/theoradec.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/theoraenc.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/theora  ${D}${includedir}/
    ln -sf ./libtheora.so.0.3.10 ${D}${libdir}/${UBUN_TARGET_SYS}/libtheora.so
    ln -sf ./libtheoraenc.so.1.1.2 ${D}${libdir}/${UBUN_TARGET_SYS}/libtheoraenc.so
    ln -sf ./libtheoradec.so.1.1.4 ${D}${libdir}/${UBUN_TARGET_SYS}/libtheoradec.so

    # liburcu6 & liburcu-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/liburcu*.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/liburcu*.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/urcu  ${D}${includedir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/urcu.h  ${D}${includedir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/${UBUN_TARGET_SYS}/urcu-*.h  ${D}${includedir}/${UBUN_TARGET_SYS}/
    ln -sf ./liburcu-bp.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liburcu-bp.so
    ln -sf ./liburcu-cds.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liburcu-cds.so
    ln -sf ./liburcu-common.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liburcu-common.so
    ln -sf ./liburcu-mb.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liburcu-mb.so
    ln -sf ./liburcu-qsbr.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liburcu-qsbr.so
    ln -sf ./liburcu-signal.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liburcu-signal.so
    ln -sf ./liburcu.so.6.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/liburcu.so2

    # libwebp6 & libwebpdemux2 & libwebpmux3 & libwebp-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwebp.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwebpdemux.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libwebpmux.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libwebp.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libwebpdemux.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libwebpmux.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/webp  ${D}${includedir}/
    ln -sf ./libwebp.so.6.0.2 ${D}${libdir}/${UBUN_TARGET_SYS}/libwebp.so
    ln -sf ./libwebpmux.so.3.0.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libwebpmux.so
    ln -sf ./libwebpdemux.so.2.0.3 ${D}${libdir}/${UBUN_TARGET_SYS}/libwebpdemux.so

    # libmpg123-0 & libout123-0 & libmpg123-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libmpg123.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libout123.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libmpg123.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/libout123.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/fmt123.h  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/mpg123.h  ${D}${includedir}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/out123.h  ${D}${includedir}/
    ln -sf ./libmpg123.so.0.44.8 ${D}${libdir}/${UBUN_TARGET_SYS}/libmpg123.so
    ln -sf ./libout123.so.0.2.2 ${D}${libdir}/${UBUN_TARGET_SYS}/libout123.so

    # libtag1v5-vanilla & libtagc0 & libtagc0-dev & libtag1-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libtag.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libtag_c.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/taglib.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/taglib_c.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/taglib  ${D}${includedir}/
    ln -sf ./libtag.so.1.17.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libtag.so
    ln -sf ./libtag_c.so.0.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libtag_c.so

    # libjson-c3 & libjson-c-dev
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libjson-c.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/json-c.pc  ${D}${libdir}/pkgconfig/
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${includedir}/json-c  ${D}${includedir}/
    ln -sf ./libjson-c.so.3.0.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libjson-c.so

    ## libltdl
    cp ${CP_ARGS} ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/libltdl.* ${D}${libdir}/${UBUN_TARGET_SYS}/
    ln -sf ./libltdl.so.7.3.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libltdl.so
    ln -sf ./libltdl.so.7 ${D}${libdir}/${UBUN_TARGET_SYS}/libltdl.so

    #FIX symbol
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
#libltdl7 and libltdl-dev

PKG_libltdl = "libltdl7"

PACKAGES += "libltdl"
PROVIDES += "libltdl"
RPROVIDES_libltdl += "libltdl"
FILES_libltdl += "\
        ${libdir}/${UBUN_TARGET_SYS}/libltdl* \
"

PKGR_libltdl = "0"
PKGV_libltdl = "0"
#  libjpeg-turbo
PKG_jpeg = "libjpeg-turbo8"
PACKAGES += "jpeg"
PROVIDES += "jpeg"

RPROVIDES_jpeg = "jpeg"
FILES_jpeg += "${libdir}/${UBUN_TARGET_SYS}/libjpeg.so*"
PKGR_jpeg = "0"
PKGV_jpeg = "0"

#orc
PACKAGES += "liborc-0.4 liborc-test-0.4 orc orc-dev"
PROVIDES += "liborc-0.4 liborc-test-0.4 orc orc-dev "
RPROVIDES_orc += " liborc-0.4 liborc-test-0.4 orc orc-dev "
FILES_orc += " \
    ${libdir}/${UBUN_TARGET_SYS}/liborc-0.4.* \
	${libdir}/${UBUN_TARGET_SYS}/liborc-test-0.4.* \
"
PKG_orc ="liborc-0.4-0"
PKGV_orc = "0"
PKGR_orc = "0"
#  libjsoncpp libjsoncpp-dev
PKG_jsoncpp = "libjsoncpp1"
PKGR_jsoncpp = "0"
PKGV_jsoncpp = "0"
PACKAGES += "\
            jsoncpp \
            jsoncpp-dev \
            libjsoncpp-dev \
"
PROVIDES += "\
            jsoncpp \
            jsoncpp-dev \
            libjsoncpp \
            libjsoncpp-dev \
"
RPROVIDES_jsoncpp += "\
            jsoncpp \
            jsoncpp-dev \
            libjsoncpp \
            libjsoncpp-dev \
"
FILES_jsoncpp += " \
         ${libdir}/${UBUN_TARGET_SYS}/libjsoncpp.so.* \
         ${libdir}/${UBUN_TARGET_SYS}/libjsoncpp.a \
"
#  libcap
PACKAGES += "\
            libcap \
            libcap-dev \
"
FILES_libcap += " \
         ${libdir}/${UBUN_TARGET_SYS}/libcap.so.*  \
         ${libdir}/${UBUN_TARGET_SYS}/libcap.a  \
"
PROVIDES += "libcap"
RPROVIDES_libcap += "libcap"
PKG_libcap = "libcap2"
PKGR_libcap = "0"
PKGV_libcap = "0"

#libpixman-1
PACKAGES += "pixman  pixman-dev"
PROVIDES += "pixman pixman-dev"
RPROVIDES_pixman += " \
                pixman \
                "
FILES_pixman += " \
    ${libdir}/${UBUN_TARGET_SYS}/libpixman-1.* \
"
PKG_pixman ="libpixman-1-0"
PKGV_pixman = "0"
PKGR_pixman = "0"

# libpthread-stubs

PKG_libpthread-stubs = "libpthread-stubs0-dev"
PKGR_libpthread-stubs = "0"
PKGV_libpthread-stubs = "0"

PACKAGES += " libpthread-stubs "
PROVIDES += " libpthread-stubs "

FILES_libpthread-stubs = "${libdir}/dummy"

#libbsd

PKG_libbsd = "libbsd0"
PKGR_libbsd = "0"
PKGV_libbsd = "0"
PACKAGES += "\
    libbsd \
    libbsd-dev \
"
PROVIDES += "\
    libbsd \
    libbsd-dev \
"
RPROVIDES_libbsd += " \
    libbsd \
    libbsd-dev \
    "

FILES_libbsd = "\
    ${libdir}/${UBUN_TARGET_SYS}/libbsd.so.0 \
    ${libdir}/${UBUN_TARGET_SYS}/libbsd.so.0.8.7 \
"
FILES_libbsd-dev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libbsd-ctor.a \
    ${libdir}/${UBUN_TARGET_SYS}/libbsd.a \
    ${libdir}/${UBUN_TARGET_SYS}/libbsd.so \
    ${includedir}/bsd \
"
# libpciaccess
PKG_libpciaccess = "libpciaccess0"
PKGR_libpciaccess = "0"
PKGV_libpciaccess = "0"
PACKAGES += "\
    libpciaccess \
    libpciaccess-dev \
"
PROVIDES += "\
    libpciaccess \
    libpciaccess-dev \
    xorg-macros \
"
FILES_libpciaccess  = "\
    ${libdir}/${UBUN_TARGET_SYS}/libpciaccess.so.0 \
    ${libdir}/${UBUN_TARGET_SYS}/libpciaccess.so.0.11.1 \
"
FILES_libpciacess-dev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libpciaccess.a \
    ${libdir}/${UBUN_TARGET_SYS}/libpciaccess.so \
    ${includedir}/pciaccess.h \
"

# libevdev
PKG_libevdev = "libevdev2"
PKGR_libevdev = "0"
PKGV_libevdev = "0"
PACKAGES += "\
    libevdev \
"
PROVIDES +="\
    libevdev \
    libevdev-dev \
"
RPROVIDES_libevdev +="\
    libevdev \
    libevdev-dev \
"
FILES_libevdev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libevdev.so.2 \
    ${libdir}/${UBUN_TARGET_SYS}/libevdev.so.2.1.20 \
"
FILES_libevdev-dev = "\
    ${libdir}/${UBUN_TARGET_SYS}/libevdev.a \
    ${libdir}/${UBUN_TARGET_SYS}/libevdev.so \
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
    ${libdir}/${UBUN_TARGET_SYS}/libgcc*.a \
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

PACKAGES += "libnl-route"
FILES_libnl += "${libdir}/${UBUN_TARGET_SYS}/libnl-*.so.*"
PROVIDES += " \
            libnl-route \
            "
RPROVIDES_libnl = " \
                  libnl-route \
                  "
PKGV_libnl = "3.2.29"
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

#  libsndfile1
PACKAGES += "libsndfile1 libsndfile1-dev"
PROVIDES += " libsndfile1 "
RPROVIDES_libsndfile1 += " \
		libsndfile1 \
		"
FILES_libsndfile1 += " \
    ${libdir}/${UBUN_TARGET_SYS}/libsndfile.* \
    ${includedir}/sndfile.* \
"
PKG_libsndfile1 ="libsndfile1"
PKGV_libsndfile1 = "0"
PKGR_libsndfile1 = "0"

#  libogg
PACKAGES += "libogg libogg-dev"
PROVIDES += " libogg "
RPROVIDES_libogg += " \
                libogg \
                "
FILES_libogg += " \
    ${libdir}/${UBUN_TARGET_SYS}/libogg.* \
"
PKG_libogg ="libogg0"
PKGV_libogg = "0"
PKGR_libogg = "0"

#  flac
PACKAGES += "flac"
PROVIDES += "flac libflac libflac++"
RPROVIDES_flac += "flac libflac libflac++"
FILES_flac += " \
    ${libdir}/${UBUN_TARGET_SYS}/libFLAC*.* \
"
PKG_flac ="libflac8"
PKGV_flac = "0"
PKGR_flac = "0"

#  libvorbis
PACKAGES += "libvorbis"
PROVIDES += "libvorbis"
RPROVIDES_libvorbis += "libvorbis"
FILES_libvorbis += " \
    ${libdir}/${UBUN_TARGET_SYS}/libvorbis.so.* \
"
PKG_libvorbis ="libvorbis0a"
PKGV_libvorbis = "0"
PKGR_libvorbis = "0"

#  libvorbisenc2
PACKAGES += "libvorbisenc2"
PROVIDES += "libvorbisenc2"
RPROVIDES_libvorbisenc2 += "libvorbisenc2"
FILES_libvorbisenc2 += " \
    ${libdir}/${UBUN_TARGET_SYS}/libvorbisenc.so.* \
"
PKG_libvorbisenc2 = "libvorbisenc2"
PKGV_libvorbisenc2 = "0"
PKGR_libvorbisenc2 = "0"

#  libvorbisfile3
PACKAGES += "libvorbisfile3"
PROVIDES += "libvorbisfile3"
RPROVIDES_libvorbisfile3 += "libvorbisfile3"
FILES_libvorbisfile3 += " \
    ${libdir}/${UBUN_TARGET_SYS}/libvorbisfile.so.* \
"
PKG_libvorbisfile3 = "libvorbisfile3"
PKGV_libvorbisfile3 = "0"
PKGR_libvorbisfile3 = "0"

#  libatomic-ops
PACKAGES += "libatomic-ops"
PROVIDES += " libatomic-ops "
RPROVIDES_libatomic-ops += " \
                libatomic-ops \
                "
FILES_libatomic-ops += " \
    ${libdir}/${UBUN_TARGET_SYS}/libatomic-ops.* \
"
PKG_libatomic-ops ="libatomic1"
PKGV_libatomic-ops = "0"
PKGR_libatomic-ops = "0"

#  speexdsp
PACKAGES += "speexdsp"
PROVIDES += "speexdsp"
RPROVIDES_speexdsp += "speexdsp"
FILES_speexdsp += " \
    ${libdir}/${UBUN_TARGET_SYS}/libspeexdsp*.* \
    ${libdir}/${UBUN_TARGET_SYS}/libspeex*.* \
"
PKG_speexdsp ="libspeexdsp1"
PKGV_speexdsp = "0"
PKGR_speexdsp = "0"

#  libsamplerate0
PACKAGES += "libsamplerate0"
PROVIDES += "libsamplerate0"
RPROVIDES_libatomic-ops += "libsamplerate0"
FILES_libsamplerate0 += " \
    ${libdir}/${UBUN_TARGET_SYS}/libsamplerate0.* \
"
PKG_libsamplerate0 ="libsamplerate0"
PKGV_libsamplerate0 = "0"
PKGR_libsamplerate0 = "0"

#  aulsa-plugins -> libasound2-plugins
PACKAGES += "libasound2-plugins"
PROVIDES += "libasound2-plugins"
RPROVIDES_libasound2-plugins += "libasound2-plugins"
FILES_libasound2-plugins += " \
    ${libdir}/${UBUN_TARGET_SYS}/alsa-lib/libasound_module* \
"
PKG_libasound2-plugins ="libasound2-plugins"
PKGV_libasound2-plugins = "0"
PKGR_libasound2-plugins = "0"

PACKAGES += "zlib"
FILES_zlib += " \
             ${libdir}/${UBUN_TARGET_SYS}/libz.* \
             ${base_libdir}/${UBUN_TARGET_SYS}/libz.so* \
             ${includedir}/zlib.h \
             ${includedir}/zconf.h \
"
PROVIDES += "zlib"
RPROVIDES_zlib += "zlib"
PKGV_zlib = "0"
PKGR_zlib = "0"
PKG_zlib ="zlib1g"

PACKAGES += "dbus dbus-lib"
FILES_dbus += " \
        ${libdir}/${UBUN_TARGET_SYS}/libdbus*.so*  \
               "

PROVIDES += " \
            dbus \
            dbus-lib \
            "
RPROVIDES_dbus += " \
                dbus \
                "
PKGV_dbus = "1.12.2"
PKGR_dbus = "0"
PKG_dbus ="libdbus-1-3"

PACKAGES += "liblzma"
FILES_liblzma += " \
        ${libdir}/${UBUN_TARGET_SYS}/liblzma*.so*  \
               "

PROVIDES += " \
            liblzma \
            xz \
            xz-dev \
            "
RPROVIDES_liblzma += " \
                liblzma \
                xz \
                xz-dev \
                "
PKGV_liblzma = "5.2.2"
PKGR_liblzma = "1"
PKG_liblzma ="liblzma5"

PKGV_xz = "5.2.2"
PKGR_xz = "1"
PKG_xz ="xz"

#libcroco
PACKAGES += "libcroco  libcroco-dev"
PROVIDES += " libcroco libcroco-dev "
RPROVIDES_libcroco += " \
                libcroco \
                libcroco-dev \
                "
FILES_libcroco += " \
    ${libdir}/${UBUN_TARGET_SYS}/libcroco-0.6.* \
"
PKG_libcroco ="libcroco3"
PKGV_libcroco = "0"
PKGR_libcroco = "0"

#libgudev
PACKAGES += "libgudev libgudev-dev"
PROVIDES += "libgudev libgudev-dev "
RPROVIDES_libgudev += " \
                libgudev \
                libgudev-dev \
                "
FILES_libgudev += " \
    ${libdir}/${UBUN_TARGET_SYS}/libgudev-1.0.* \
"
PKG_libgudev ="libgudev-1.0-0"
PKGV_libgudev = "0"
PKGR_libgudev = "0"

#libid3tag
PACKAGES += "libid3tag libid3tag-dev"
PROVIDES += " libid3tag libid3tag-dev "
RPROVIDES_libid3tag += " \
                libid3tag \
                libid3tag-dev \
                "
FILES_libid3tag += " \
    ${libdir}/${UBUN_TARGET_SYS}/libid3tag.so* \
"
PKG_libid3tag ="libid3tag0"
PKGV_libid3tag = "0"
PKGR_libid3tag = "0"

#librsvg
PACKAGES += "librsvg  librsvg-dev"
PROVIDES += " librsvg librsvg-dev "
RPROVIDES_librsvg += " \
                librsvg \
                librsvg-dev \
                "
FILES_librsvg += " \
    ${libdir}/${UBUN_TARGET_SYS}/librsvg-2.so* \
"
PKG_librsvg ="librsvg2-2"
PKGV_librsvg = "0"
PKGR_librsvg = "0"

#libsoup-2.4
PACKAGES += "libsoup-2.4 libsoup-2.4-dev"
PROVIDES += "libsoup-2.4 libsoup-2.4-dev "
RPROVIDES_libsoup-2.4 += " \
                libsoup-2.4 \
                libsoup-2.4-dev \
                "
FILES_libsoup-2.4 += " \
    ${libdir}/${UBUN_TARGET_SYS}/libsoup-2.4.* \
"
PKG_libsoup-2.4 ="libsoup2.4-1"
PKGV_libsoup-2.4 = "0"
PKGR_libsoup-2.4 = "0"

##libssl & openssl & libssl-dev

PACKAGES += "openssl"
PROVIDES += "openssl"
RPROVIDES_openssl = "openssl"
PKG_openssl = "openssl"
PKGR_openssl = "0"
PKGV_openssl = "0"

PACKAGES += "libssl1.1 libssl-dev"
PROVIDES += "libssl1.1 libssl-dev"
PROVIDES_libssl1.1 = "libssl1.1 libssl-dev"
FILES_libssl1.1 = "${libdir}/${UBUN_TARGET_SYS}/libssl*.so.*"
PKG_libssl1.1 = "libssl1.1"

PKGR_libssl1.1 = "0"
PKGV_libssl1.1 = "0"

PACKAGES += "glib-2.0"
FILES_glib-2.0 += "${libdir}/dummy"
RPROVIDES_glib-2.0 = " \
                    glib-2.0 \
                    glib-2.0-codegen glib-2.0-locale glib-2.0-dbg glib-2.0-staticdev glib-2.0-bash-completion glib-2.0-doc glib-2.0-utils glib-2.0-dev \
                   "
PKG_glib-2.0 = "libglib2.0-0"
PKGV_glib-2.0 = "0"
PKGR_glib-2.0 = "0"
                   
PACKAGES += "libxml2"
FILES_libxml2 += "${libdir}/${UBUN_TARGET_SYS}/libxml2.so.2*"
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
            libsemanage \
            "
RPROVIDES_libselinux1 = " \
                    libselinux \
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
                    util-linux \
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
            ${libdir}/${UBUN_TARGET_SYS}/libgio-2.0.so* \
            ${libdir}/${UBUN_TARGET_SYS}/libglib-2.0.so* \
            ${libdir}/${UBUN_TARGET_SYS}/libgmodule-2.0.so* \
            ${libdir}/${UBUN_TARGET_SYS}/libgobject-2.0.so* \
            ${libdir}/${UBUN_TARGET_SYS}/libgthread-2.0.so* \
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
              "
PROVIDES += "udev systemd systemd-dev systemd-journal-remote systemd-journal-gatewayd \
             systemd-journal-upload systemd-compat-units systemd-conf systemd-serialgetty \
              "
PACKAGES_DYNAMIC += "^lib(udev|systemd|nss).*"
PACKAGES_DYNAMIC += "^systemd-locale-.*"

#libinput
PACKAGES += "libinput  libinput-dev"
PROVIDES += " libinput libinput-dev "

RPROVIDES_libinput += " \
                libinput \
                libinput-dev \
                "
FILES_libinput += " \
    ${libdir}/${UBUN_TARGET_SYS}/libinput.* \
"
PKG_libinput ="libinput10"
PKGV_libinput = "0"
PKGR_libinput = "0"

#libwacom
PACKAGES += "libwacom libwacom-dev"
PROVIDES += "libwacom libwacom-dev"
RPROVIDES_libwacom += " \
                libwacom \
                libwacom-dev \
                "
FILES_libwacom += " \
    ${libdir}/${UBUN_TARGET_SYS}/libwacom.* \
"
PKG_libwacom ="libwacom2"
PKGV_libwacom = "0"
PKGR_libwacom = "0"

#mtdev
PACKAGES += "mtdev  mtdev-dev"
PROVIDES += " mtdev mtdev-dev "
RPROVIDES_mtdev += " \
                mtdev \
                mtdev-dev \
                "
FILES_mtdev += " \
    ${libdir}/${UBUN_TARGET_SYS}/libmtdev.* \
"
PKG_mtdev ="libmtdev1"
PKGV_mtdev = "0"
PKGR_mtdev = "0"

#tcp-wrap
PACKAGES += "tcp-wrappers libwrap libwrap-dev "
PROVIDES += "tcp-wrappers libwrap libwrap-dev"
RPROVIDES_tcp-wrappers += " \
                tcp-wrappers \
                libwrap \
                libwrap-dev \
                "
FILES_tcp-wrappers += " \
    ${libdir}/${UBUN_TARGET_SYS}/libwrap.* \
"
PKG_tcp-wrappers ="libwrap0"
PKGV_tcp-wrappers = "0"
PKGR_tcp-wrappers = "0"

#libwrap
#PACKAGES += "libwrap  libwrap-dev"
#PROVIDES += "libwrap  libwrap-dev "
#RPROVIDES_libwrap += " \
#                libwrap \
#                libwrap-dev \
#                "
#FILES_libwrap += " \
#    ${libdir}/${UBUN_TARGET_SYS}/libwrap.* \
#"
#PKG_libwrap ="libwrap0"
#PKGV_libwrap = "0"
#PKGR_libwrap = "0"





#liba52
PACKAGES += "liba52 liba52-dev "
PROVIDES += "liba52 liba52-dev "
RPROVIDES_liba52 += " \
                liba52 \
                liba52-dev \
                "
FILES_liba52 += " \
    ${libdir}/${UBUN_TARGET_SYS}/liba52*.* \
"
PKG_liba52 ="liba52-0.7.4"
PKGV_liba52 = "0"
PKGR_liba52 = "0"

#libqhull
PACKAGES += "libqhull libqhull-dev "
PROVIDES += "libqhull libqhull-dev "
RPROVIDES_libqhull += " \
                libqhull \
                libqhull-dev \
                "
FILES_libqhull += " \
    ${libdir}/${UBUN_TARGET_SYS}/libqhull*.* \
"
PKG_libqhull ="libqhull7"
PKGV_libqhull = "0"
PKGR_libqhull = "0"

#libcryptopp
PACKAGES += "libcryptopp libcrypto++  libcrypto++-dev"
PROVIDES += "libcryptopp libcrypto++  libcrypto++-dev "
RPROVIDES_libcryptopp += " \
                libcrypto++ \
                libcrypto++-dev \
                libcryptopp \
                "
FILES_libcryptopp += " \
    ${libdir}/${UBUN_TARGET_SYS}/libcrypto++.* \
	${libdir}/${UBUN_TARGET_SYS}/libcryptopp.* \
"
PKG_libcryptopp ="libcrypto++6"
PKGV_libcryptopp = "0"
PKGR_libcryptopp = "0"

# libasound
PACKAGES += "alsa-lib"
PROVIDES += "alsa-lib"
FILES_alsa-lib = " \
    ${libdir}/${UBUN_TARGET_SYS}/libasound.so* \
    ${includedir}/alsa \
"
RPROVIDES_alsa-lib += " \
    libasound \
"
PKGV_alsa-lib = "0"
PKGR_alsa-lib = "0"
PKG_alsa-lib = "libasound2"

#libtheora
PACKAGES += "libtheora libtheora-dev"
PROVIDES += "libtheora libtheora-dev "
RPROVIDES_libtheora += " \
                libtheora \
                libtheora-dev \
                "
FILES_libtheora += " \
    ${libdir}/${UBUN_TARGET_SYS}/libtheora.* \
    ${libdir}/${UBUN_TARGET_SYS}/libtheoradec.* \
"
PKG_libtheora ="libtheora0"
PKGV_libtheora = "0"
PKGR_libtheora = "0"

#liburcu
PACKAGES += "liburcu liburcu-dev"
PROVIDES += "liburcu liburcu-dev "
RPROVIDES_liburcu += " \
                liburcu \
                liburcu-dev \
                "
FILES_liburcu += " \
    ${libdir}/${UBUN_TARGET_SYS}/liburcu*.* \
"
PKG_libgudev ="liburcu6"
PKGV_libgudev = "0"
PKGR_libgudev = "0"

#libwebp
PACKAGES += "libwebp libwebp-dev"
PROVIDES += "libwebp libwebp-dev "
RPROVIDES_libwebp += " \
                libwebp \
                libwebp-dev \
                "
FILES_libwebp += " \
    ${libdir}/${UBUN_TARGET_SYS}/libwebp.* \
    ${libdir}/${UBUN_TARGET_SYS}/libwebpdemux.* \
    ${libdir}/${UBUN_TARGET_SYS}/libwebpmux.* \
"
PKG_libwebp ="libwebp6"
PKGV_libwebp = "0"
PKGR_libwebp = "0"

#mpg123
PACKAGES += "mpg123 mpg123-dev"
PROVIDES += "mpg123 mpg123-dev "
RPROVIDES_mpg123 += " \
                mpg123 \
                mpg123-dev \
                "
FILES_mpg123 += " \
    ${libdir}/${UBUN_TARGET_SYS}/libmpg123.* \
    ${libdir}/${UBUN_TARGET_SYS}/libout123.* \
"
PKG_mpg123 ="libmpg123-0"
PKGV_mpg123 = "0"
PKGR_mpg123 = "0"

#taglib
PACKAGES += "taglib taglib-dev"
PROVIDES += "taglib taglib-dev "
RPROVIDES_taglib += " \
                taglib \
                taglib-dev \
                "
FILES_taglib += " \
    ${libdir}/${UBUN_TARGET_SYS}/libtag.* \
    ${libdir}/${UBUN_TARGET_SYS}/libtag_c.* \
"
PKG_taglib ="libtag1v5-vanilla"
PKGV_taglib = "0"
PKGR_taglib = "0"

#json-c
PACKAGES += "json-c json-c-dev"
PROVIDES += "json-c json-c-dev "
RPROVIDES_sbc += " \
                json-c \
                json-c-dev \
                "
FILES_json-c += " \
    ${libdir}/${UBUN_TARGET_SYS}/libjson-c.* \
"
PKG_json-c ="libjson-c3"
PKGV_json-c = "0"
PKGR_json-c = "0"

RPROVIDES_udev = "udev udev-hwdb hotplug"
FILES_udev += "${libdir}/${UBUN_TARGET_SYS}/libudev.so*"
PKGR_udev = "0"
PKGV_udev = "0"

PROVIDES += "libpng"
RPROVIDES_libpng = "libpng"
FILES_libpng += "${libdir}/dummy"
PKGR_libpng = "0"
PKGV_libpng = "0"

PROVIDES += "libxkbcommon"
RPROVIDES_libxkbcommon = "libxkbcommon"
FILES_libxkbcommon += "${libdir}/dummy"
PKGR_libxkbcommon = "0"
PKGV_libxkbcommon = "0"

RPROVIDES_systemd = "systemd libsystemd0 systemd-locale systemd-dbg \
                    systemd-bash-completion systemd-staticdev systemd-doc \
                    "
FILES_systemd += "${libdir}/${UBUN_TARGET_SYS}/libsystemd*.so*"
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

PACKAGES += "gstreamer1.0"
FILES_gstreamer1.0 = "\
    ${libdir}/${UBUN_TARGET_SYS}/libgstbase-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstcheck-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstcontroller-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstnet-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstreamer-1.0.so.0* \
"
SUMMARY_gstreamer1.0 = "Core GStreamer libraries and elements"
RPROVIDES_gstreamer1.0 = "gstreamer1.0"
PKG_gstreamer1.0 = "libgstreamer1.0-0"
PKGV_gstreamer1.0 = "1.14.4"
PKGR_gstreamer1.0 = "0"

PACKAGES += "gstreamer1.0-plugins-base"
FILES_gstreamer1.0-plugins-base = "\
    ${libdir}/${UBUN_TARGET_SYS}/libgstfft-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstrtsp-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstapp-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstvideo-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstpbutils-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstallocators-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstrtp-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstsdp-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgsttag-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstriff-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstgl-1.0.so.0* \
"
SUMMARY_gstreamer1.0 = "Plugins base for the GStreamer multimedia framework 1.x"
RPROVIDES_gstreamer1.0 = "gstreamer1.0-plugins-base"
PKG_gstreamer1.0 = "libgstreamer-plugins-base1.0-0"
PKGV_gstreamer1.0 = "1.14.4"
PKGR_gstreamer1.0 = "0"

PACKAGES += "gstreamer1.0-plugins-bad"
FILES_gstreamer1.0-plugins-bad = "\
    ${libdir}/${UBUN_TARGET_SYS}/libgstadaptivedemux-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstbadaudio-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstbadvideo-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstcodecparsers-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstinsertbin-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstisoff-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstmpegts-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstplayer-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgsturidownloader-1.0.so.0* \
    ${libdir}/${UBUN_TARGET_SYS}/libgstwebrtc-1.0.so.0* \
"
SUMMARY_gstreamer1.0 = "Plugins bad for the GStreamer multimedia framework 1.x"
RPROVIDES_gstreamer1.0 = "gstreamer1.0-plugins-bad"
PKG_gstreamer1.0 = "libgstreamer-plugins-bad1.0-0"
PKGV_gstreamer1.0 = "1.14.4"
PKGR_gstreamer1.0 = "0"

PACKAGES += "gstreamer1.0-plugins-good"
RPROVIDES_gstreamer1.0-plugins-good = "gstreamer1.0-plugins-good gstreamer1.0-plugins-good-apps gstreamer1.0-plugins-good-doc gstreamer1.0-plugins-good-dbg gstreamer1.0-plugins-good-locale gstreamer1.0-plugins-good-staticdev gstreamer1.0-plugins-good-meta gstreamer1.0-plugins-good-glib gstreamer1.0-plugins-good-dev"
PKG_gstreamer1.0-plugins-good = "libgstreamer-plugins-good1.0-0"
PKGV_gstreamer1.0-plugins-good = "1.14.4"
PKGR_gstreamer1.0-plugins-good = "0"

PACKAGES += "gstreamer1.0-plugins-ugly"
RPROVIDES_gstreamer1.0-plugins-ugly = "gstreamer1.0-plugins-ugly gstreamer1.0-plugins-ugly-apps gstreamer1.0-plugins-ugly-glib gstreamer1.0-plugins-ugly-doc gstreamer1.0-plugins-ugly-dbg gstreamer1.0-plugins-ugly-locale gstreamer1.0-plugins-ugly-meta gstreamer1.0-plugins-ugly-dev gstreamer1.0-plugins-ugly-staticdev"

PACKAGES += "gstreamer1.0-rtsp-server"
RPROVIDES_gstreamer1.0-rtsp-server = "gstreamer1.0-rtsp-server-glib gstreamer1.0-rtsp-server-staticdev gstreamer1.0-rtsp-server-locale gstreamer1.0-rtsp-server-meta gstreamer1.0-rtsp-server-dev gstreamer1.0-rtsp-server-dbg gstreamer1.0-rtsp-server gstreamer1.0-rtsp-server-doc gstreamer1.0-rtsp-server-apps"
PKG_gstreamer1.0-rtsp-server = "libgstrtspserver-1.0-0"
PKGV_gstreamer1.0-rtsp-server = "0"
PKGR_gstreamer1.0-rtsp-server = "0"
FILES_gstreamer1.0-rtsp-server += "\
    ${libdir}/${UBUN_TARGET_SYS}/libgstrtspserver* \
"

PACKAGES += "gstreamer1.0-libav"
RPROVIDES_gstreamer1.0-libav = "gstreamer1.0-libav-locale gstreamer1.0-libav-dbg gstreamer1.0-libav-dev gstreamer1.0-libav-doc gstreamer1.0-libav-staticdev gstreamer1.0-libav"
PKGV_gstreamer1.0-libav = "0"
PKGR_gstreamer1.0-libav = "0"

PACKAGES += "libffi"
RPROVIDES_libffi = "libffi-staticdev libffi-doc libffi-dbg libffi-dev libffi-locale"
FILES_libffi = "${libdir}/${UBUN_TARGET_SYS}/libffi.so"
PKG_libffi = "libffi6"
PKGV_libffi = "3.2.1"
PKGR_libffi = "8"

#libdrm
PACKAGES += "libdrm libdrm2 libdrm-dev libdrm-freedreno"
PROVIDES += "libdrm libdrm2 libdrm-dev libdrm-freedreno drm"
FILES_libdrm += " \
${libdir}/${UBUN_TARGET_SYS}/libdrm* \
             "
PKG_libdrm = "libdrm2"
PKGV_libdrm = "0"
PKGR_libdrm = "0"

DEPENDS_libdrm += " \
libdrm2 \
libdrm-dev \
libdrm-freedreno \
libpthread-stubs \
libpciaccess \
"

#gdk-pixbuf
ALLOW_EMPTY_gdk-pixbuf-bin = "1"
ALLOW_EMPTY_gdk-pixbuf-xlib = "1"
ALLOW_EMPTY_gdk-pixbuf-dev = "1"
PACKAGES += "gdk-pixbuf"
FILES_gdk-pixbuf += " \
        ${libdir}/${UBUN_TARGET_SYS}/gdk-pixbuf-2.0/* \
        ${libdir}/${UBUN_TARGET_SYS}/libgdk_pixbuf* \
        ${bindir}/gdk-pixbuf* \
        "
FILES_gdk-pixbuf-bin += " \
        ${datadir}/thumbnailers/gdk-pixbuf-thumbnailer.thumbnailer \
        "
FILES_gdk-pixbuf-xlib += "${libdir}/${UBUN_TARGET_SYS}/libgdk_pixbuf_xlib*"
FILES_gdk-pixbuf-dev += "${libdir}/dummy"

PROVIDES += " \
                gdk-pixbuf \
            "

RPROVIDES_gdk-pixbuf += " \
            gdk-pixbuf \
            gdk-pixbuf-doc \
            gdk-pixbuf-staticdev \
            gdk-pixbuf-locale \
            gdk-pixbuf-dbg \
            gdk-pixbuf-dev \
            gdk-pixbuf-bin \
            gdk-pixbuf-xlib \
          "
PKGV_gdk-pixbuf = "2.36.11"
PKGR_gdk-pixbuf = "2"
PKG_gdk-pixbuf ="libgdk-pixbuf2.0-0"

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
