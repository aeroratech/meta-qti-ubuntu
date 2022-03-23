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
require files-blacklist.inc
#require ubuntu-base-file-blacklist-alternative.inc
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
do_install_armmultilib[noexec] = "1"
do_package_qa[noexec] = "1"
PACKAGES_remove = "${PN}-dbg"

#ALLOW_EMPTY_${PN} = "1"
#ALLOW_EMPTY_${PN}-dev = "1"
#ALLOW_EMPTY_${PN}-staticdev = "1"
ALLOW_EMPTY_libgfortran-staticdev = "1"
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
ALLOW_EMPTY_libasan = "1"
ALLOW_EMPTY_gcc-sanitizers = "1"
ALLOW_EMPTY_libnss-db  = "1"
ALLOW_EMPTY_tzcode  = "1"
ALLOW_EMPTY_ldd  = "1"
ALLOW_EMPTY_libcidn = "1"
ALLOW_EMPTY_nscd = "1"
ALLOW_EMPTY_catchsegv = "1"
ALLOW_EMPTY_sln = "1"
ALLOW_EMPTY_libitm-staticdev = "1"
ALLOW_EMPTY_libatomic-staticdev = "1"
ALLOW_EMPTY_libitm = "1"
ALLOW_EMPTY_libatomic-dev = "1"
ALLOW_EMPTY_libitm-dev = "1"
ALLOW_EMPTY_libgomp-staticdev = "1"
ALLOW_EMPTY_libatomic = "1"
ALLOW_EMPTY_libgomp = "1"
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
ALLOW_EMPTY_libcap-ng = "1"
ALLOW_EMPTY_libcap-ng-dev = "1"
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
ALLOW_EMPTY_attr = "1"



PV = "0"
BINV = "0"
TARGET_SYS = "${UBUN_TARGET_SYS}"

CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"
HOST_ARCH="x86_64-linux-gnu"
#TARGET_ARCH="aarch64-linux-gnu"

PROVIDES += "\
            virtual/${TARGET_PREFIX}gcc \
            virtual/${TARGET_PREFIX}g++ \
            virtual/${TARGET_PREFIX}gcc-initial \
            virtual/${TARGET_PREFIX}binutils \
            binutils-cross-${TARGET_ARCH} \
            virtual/${TARGET_PREFIX}libc-for-gcc \
            virtual/${TARGET_PREFIX}compilerlibs \
            libarchive-native \
            e2fsprogs-native \
            nativesdk-libarchive \
            mtd-utils-native \
            gcc-runtime \
	    libpam \
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
            attr \
"



python do_fix_symlink(){
    ## Trick: change absolute path to relative path for all symlinks ##
    search_path = d.getVar('EXTERNAL_TOOLCHAIN')+"/deb"
    bb.warn(" search_path : %s " %search_path)
    for root,dirs,files in os.walk(search_path):
        for file in files:
            file_path = os.path.join(root, file)

            if not os.path.islink(file_path) or \
               not os.readlink(file_path).startswith(os.sep):
                continue

            # set to relative position
            src_abs_path = file_path
            abs_symlink = os.readlink(src_abs_path)
            dst_abs_path = os.path.join(search_path, abs_symlink.lstrip(os.sep))
            rel_symlink = os.path.relpath(dst_abs_path, os.path.dirname(src_abs_path))

            #bb.warn("create new symlink for file: " + src_abs_path + " -> " + rel_symlink)
            os.remove(src_abs_path)
            os.symlink(rel_symlink, src_abs_path)

        for dir in dirs:
            file_path = os.path.join(root, dir)

            if not os.path.islink(file_path) or \
               not os.readlink(file_path).startswith(os.sep):
                continue

            # set to relative position
            src_abs_path = file_path
            abs_symlink = os.readlink(src_abs_path)
            dst_abs_path = os.path.join(search_path, abs_symlink.lstrip(os.sep))
            rel_symlink = os.path.relpath(dst_abs_path, os.path.dirname(src_abs_path))

            bb.warn("create new symlink for dir: " + src_abs_path + " -> " + rel_symlink)
            os.remove(src_abs_path)
            os.symlink(rel_symlink, src_abs_path)
}
addtask fix_symlink after do_compile before do_install 

do_install(){
     install -d ${D}
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
     install -d ${D}/usr/include/aarch64-linux-gnu/
     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/* ${D}

     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/${UBUN_TARGET_SYS}/lib/* ${D}${libdir}/${UBUN_TARGET_SYS}

     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/${UBUN_TARGET_SYS}/lib/*.o ${D}${base_libdir}
     cp ${CP_ARGS} -H ${D}${libdir}/${UBUN_TARGET_SYS}/*.o ${D}${base_libdir}

     #cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/selinux ${D}${includedir}
     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/gstreamer-1.0 ${D}${includedir}
     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/security ${D}${includedir}
     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/include/gst ${D}${includedir}
     rm -rf ${D}${includedir}/gstreamer-1.0/gst/audio/
     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/* ${D}${includedir}
     cp ${CP_ARGS} -H ${D}${includedir}/c++/10/* ${D}${includedir}/c++/
     cp ${CP_ARGS} -H ${D}${includedir}/c++/aarch64-linux-gnu/bits/* ${D}${includedir}/c++/bits
     ln -sf ./libstdc++.so.6.0.28 ${D}/${libdir}/aarch64-linux-gnu/libstdc++.so
     ln -sf ./libatomic.so.1.2.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libatomic.so
     #cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/${UBUN_TARGET_SYS}/libselinux.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}
     #ln -sf ./libselinux.so.1 ${D}${libdir}/${UBUN_TARGET_SYS}/libselinux.so


    cp ${WORKSPACE}/OTA/device/qcom/common/releasetools.py ${D}${datadir}/

    if [ -f ${D}${libdir}/libanl.so ];then
        rm -rf ${D}${libdir}/libanl.so
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
    if [ -f ${D}${base_libdir}/libaudit.so.1 ];then
        rm -rf ${D}${base_libdir}/libaudit.so*
    fi  
}

PACKAGES += " \ 
			binutils-native \
			binutils \
			"
PROVIDES += " \ 
			binutils-native \
			binutils \
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
FILES_libltdl += "dummy"

PKGR_libltdl = "0"
PKGV_libltdl = "0"
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
#  libcap-ng
PACKAGES += "\
            libcap-ng \
            libcap-ng-dev \
"
FILES_libcap-ng += " \
         ${libdir}/${UBUN_TARGET_SYS}/libcap-ng.so.*  \
         ${libdir}/${UBUN_TARGET_SYS}/libcap-ng.a  \
"
PROVIDES += "libcap-ng libcap-ng-dev"
RPROVIDES_libcap-ng = "libcap-ng libcap-ng-dev"
PKG_libcap-ng = "libcap-ng0"
PKGR_libcap-ng = "0"
PKGV_libcap-ng = "0"
FILES_libcap-ng += " \
         ${includedir}/aarch64-linux-gnu/asm \
		 ${includedir}/asm-generic \
		 ${includedir}/drm \
		 ${includedir}/linux \
		 ${includedir}/misc \
		 ${includedir}/mtd \
		 ${includedir}/rdma \
		 ${includedir}/scsi \
		 ${includedir}/sound \
		 ${includedir}/video \
		 ${includedir}/xen \
"

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

#alsa-utils
PACKAGES += "alsa-utils"
PROVIDES += " \
alsa-utils-alsabat    \
alsa-utils-alsatplg   \
alsa-utils-aplay      \
alsa-utils-amixer     \
alsa-utils-alsamixer  \
alsa-utils-speakertest\
alsa-utils-midi       \
alsa-utils-aconnect   \
alsa-utils-aseqnet    \
alsa-utils-iecset     \
alsa-utils-alsactl    \
alsa-utils-aseqdump   \
alsa-utils-alsaloop   \
alsa-utils-alsaucm    \
"
RPROVIDES_alsa-utils += " \
alsa-utils-alsabat    \
alsa-utils-alsatplg   \
alsa-utils-aplay      \
alsa-utils-amixer     \
alsa-utils-alsamixer  \
alsa-utils-speakertest\
alsa-utils-midi       \
alsa-utils-aconnect   \
alsa-utils-aseqnet    \
alsa-utils-iecset     \
alsa-utils-alsactl    \
alsa-utils-aseqdump   \
alsa-utils-alsaloop   \
alsa-utils-alsaucm    \
alsa-utils-scripts \
"
FILES_alsa-utils += " "
PKG_alsa-utils = "alsa-utils"
PKGR_alsa-utils = "0"
PKGV_alsa-utils = "0"


#sbc
PACKAGES += "libsbc1 libsbc-dev sbc"
PROVIDES += "libsbc1 libsbc-dev sbc"
RPROVIDES_sbc += " \
                libsbc1 \
		libsbc-dev \
"
FILES_sbc += "\
/usr/include/sbc/sbc.h \
/usr/lib/aarch64-linux-gnu/libsbc.a \
/usr/lib/aarch64-linux-gnu/libsbc.so \
/usr/lib/aarch64-linux-gnu/pkgconfig/sbc.pc \
/usr/lib/aarch64-linux-gnu/libsbc.so.1 \
/usr/lib/aarch64-linux-gnu/libsbc.so.1.2.2 \
"
PKG_sbc = "libsbc-dev"
PKGR_sbc = "0"
PKGV_sbc = "0"

#  version control
PKGV_libasan-dev = "${UBUN_VER_GCC}"
PKGV_libasan = "${UBUN_VER_GCC}"
PKGV_libasan-staticdev = "${UBUN_VER_GCC}"
PKGV_libatomic-dev = "${UBUN_VER_GCC}"
PKGV_libatomic = "${UBUN_VER_GCC}"
PKGV_libatomic-staticdev = "${UBUN_VER_GCC}"
PKGV_libg2c-dev = "0"
PKGV_libg2c = "0"
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

PACKAGES += "libconsole-bridge libconsole-bridge-dev"
PROVIDES += "libconsole-bridge libconsole-bridge-dev"

PKG_libconsole-bridge = "libconsole-bridge0.4"
PKGR_libconsole-bridge = "0.4.4"
PKGV_libconsole-bridge = "0"
ALLOW_EMPTY_libconsole-bridge = "1"

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
SUMMARY_gstreamer1.0-plugins-base = "Plugins base for the GStreamer multimedia framework 1.x"
RPROVIDES_gstreamer1.0-plugins-base = "gstreamer1.0-plugins-base"
PKG_gstreamer1.0-plugins-base = "libgstreamer-plugins-base1.0-0"
PKGV_gstreamer1.0-plugins-base = "1.16.2"
PKGR_gstreamer1.0-plugins-base = "0"

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
SUMMARY_gstreamer1.0-plugins-bad = "Plugins bad for the GStreamer multimedia framework 1.x"
RPROVIDES_gstreamer1.0-plugins-bad = "gstreamer1.0-plugins-bad"
PKG_gstreamer1.0-plugins-bad = "libgstreamer-plugins-bad1.0-0"
PKGV_gstreamer1.0-plugins-bad = "1.16.2"
PKGR_gstreamer1.0-plugins-bad = "0"

PACKAGES += "gstreamer1.0-plugins-good"
RPROVIDES_gstreamer1.0-plugins-good = "gstreamer1.0-plugins-good gstreamer1.0-plugins-good-apps gstreamer1.0-plugins-good-doc gstreamer1.0-plugins-good-dbg gstreamer1.0-plugins-good-locale gstreamer1.0-plugins-good-staticdev gstreamer1.0-plugins-good-meta gstreamer1.0-plugins-good-glib gstreamer1.0-plugins-good-dev"
PKG_gstreamer1.0-plugins-good = "libgstreamer-plugins-good1.0-0"
PKGV_gstreamer1.0-plugins-good = "1.16.2"
PKGR_gstreamer1.0-plugins-good = "0"

PACKAGES += "gstreamer1.0-plugins-ugly"
PROVIDES += "gstreamer1.0-plugins-ugly"
RPROVIDES_gstreamer1.0-plugins-ugly = "gstreamer1.0-plugins-ugly gstreamer1.0-plugins-ugly-apps gstreamer1.0-plugins-ugly-glib gstreamer1.0-plugins-ugly-doc gstreamer1.0-plugins-ugly-dbg gstreamer1.0-plugins-ugly-locale gstreamer1.0-plugins-ugly-meta gstreamer1.0-plugins-ugly-dev gstreamer1.0-plugins-ugly-staticdev"

PACKAGES += "gstreamer1.0-libav"
PROVIDES += "gstreamer1.0-libav"
RPROVIDES_gstreamer1.0-libav = "gstreamer1.0-libav-locale gstreamer1.0-libav-dbg gstreamer1.0-libav-dev gstreamer1.0-libav-doc gstreamer1.0-libav-staticdev gstreamer1.0-libav"
PKGV_gstreamer1.0-libav = "0"
PKGR_gstreamer1.0-libav = "0"

#libtirpc
PACKAGES += "libtirpc libtirpc-dev libtirpc3"
PROVIDES += "libtirpc libtirpc-dev libtirpc3"
RPROVIDES_libtirpc += "libtirpc libtirpc-dev libtirpc3"
FILES_libtirpc += " \
/usr/lib/aarch64-linux-gnu/libtirpc.so* \
/lib/aarch64-linux-gnu/libtirpc.so* \
" 

PKG_libtirpc = "libtirpc3"
PKGR_libtirpc = "0"
PKGV_libtirpc = "0"

#libssh-4
PACKAGES += "libssh-4"
PROVIDES += "libssh-4"
RPROVIDES_libssh-4 += "libssh-4"
FILES_libssh-4 += " \
/usr/lib/aarch64-linux-gnu/libssh.so* \
"
PKG_libssh-4 = "libssh-4"
PKGR_libssh-4 = "0"
PKGV_libssh-4 = "0"

#libbrotli1
PACKAGES += "libbrotli1"
PROVIDES += "libbrotli1"
RPROVIDES_libbrotli1 += "libbrotli1"
FILES_libbrotli1 += " \
/usr/lib/aarch64-linux-gnu/libbrotl*.so* \
"
PKG_libbrotli1 = "libbrotli1"
PKGR_libbrotli1 = "0"
PKGV_libbrotli1 = "0"

#update-rc.d
PACKAGES += "update-rc.d"
PROVIDES += "update-rc.d"
RPROVIDES_update-rc.d += "iupdate-rc.d"
FILES_update-rc.d += " \
/usr/sbin/update-rc.d \
"
PKG_update-rc.d = "init-system-helpers"
PKGR_update-rc.d = "0"
PKGV_update-rc.d = "0"

#kmod
PACKAGES += "kmod"
PROVIDES += "kmod"
RPROVIDES_kmod += " \
          kmod \
         " 
FILES_kmod += " \
        ${libdir}/${UBUN_TARGET_SYS}/libkmod* \
        "
PKG_kmod = "libkmod-dev"
PKGR_kmod = "0"
PKGV_kmod = "0"


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
INSANE_SKIP_libgfortran += "ldflags dev-deps"
INSANE_SKIP_libstdc++ += "ldflags dev-deps"
INSANE_SKIP_libatomic += "ldflags"
INSANE_SKIP_libasan += "ldflags"
INSANE_SKIP_libubsan += "ldflags"
INSANE_SKIP_libssp += "ldflags"
INSANE_SKIP_libgomp += "ldflags"
INSANE_SKIP_libitm += "ldflags"
INSANE_SKIP_gdbserver += "ldflags"
