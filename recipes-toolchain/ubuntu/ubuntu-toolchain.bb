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
            libarchive-native \
            e2fsprogs-native \
            nativesdk-libarchive \
            mtd-utils-native \
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

#     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/${UBUN_TARGET_SYS}/lib/* ${D}${libdir}/${UBUN_TARGET_SYS}

#     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/${UBUN_TARGET_SYS}/lib/*.o ${D}${base_libdir}
#     cp ${CP_ARGS} -H ${D}${libdir}/${UBUN_TARGET_SYS}/*.o ${D}${base_libdir}

     #cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/selinux ${D}${includedir}
     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/gstreamer-1.0 ${D}${includedir}
     #cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/security ${D}${includedir}
     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/include/gst ${D}${includedir}
     rm -rf ${D}${includedir}/gstreamer-1.0/gst/audio/
#     cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/aarch64-linux-gnu/include/* ${D}${includedir}
#     cp ${CP_ARGS} -H ${D}${includedir}/c++/10/* ${D}${includedir}/c++/
#     cp ${CP_ARGS} -H ${D}${includedir}/c++/aarch64-linux-gnu/bits/* ${D}${includedir}/c++/bits
#     ln -sf ./libstdc++.so.6.0.28 ${D}/${libdir}/aarch64-linux-gnu/libstdc++.so
#     ln -sf ./libatomic.so.1.2.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libatomic.so
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
#  gcc-sanitizers
#PACKAGES += " \
#            gcc-sanitizers gcc-sanitizers-dev \
#"
#            libasan libubsan liblsan libtsan \
#            libasan-dev libubsan-dev liblsan-dev libtsan-dev \
#            libasan-staticdev libubsan-staticdev liblsan-staticdev libtsan-staticdev \
#            "

#libltdl7 and libltdl-dev

PKG_libltdl = "libltdl7"

PACKAGES += "libltdl"
PROVIDES += "libltdl"
RPROVIDES_libltdl += "libltdl"
FILES_libltdl += "dummy"

PKGR_libltdl = "0"
PKGV_libltdl = "0"

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
