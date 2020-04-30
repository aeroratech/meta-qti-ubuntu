#This file is derived from https://git.linaro.org/openembedded/meta-linaro.git/tree/meta-linaro-toolchain/conf/distro/include/tcmode-external-linaro.inc

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

EXTERNAL_TOOLCHAIN ?= "${DL_DIR}"

TOOLCHAIN_PATH_ADD = "/usr/bin:"
PATH =. "${TOOLCHAIN_PATH_ADD}"

# MACROS below are for self-contained toolchain
#CFLAGS += " --sysroot=${STAGING_DIR_HOST}  -L/local/mnt/workspace/tq/src/ubuntu-toolchain/deb/usr/lib/gcc-cross/aarch64-linux-gnu/7   "
#TARGET_CPPFLAGS += " -I${STAGING_DIR_TARGET}${includedir}/c++ "
#LDFLAGS += " --sysroot=${STAGING_DIR_HOST} "
#LDDLFLAGS += " --sysroot=${STAGING_DIR_HOST} "
#export CXX = "aarch64-linux-gnu-wrapper ${CCACHE}${HOST_PREFIX}g++ ${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS}"
#export CPP = "aarch64-linux-gnu-wrapper ${HOST_PREFIX}gcc -E${TOOLCHAIN_OPTIONS} ${HOST_CC_ARCH}"
#export REAL_LD_FILE_NAME="${STAGING_BINDIR_NATIVE}/aarch64-linux-gnu-ld.bfd-real"

UBUN_TARGET_SYS_arm ?= "arm-linux-gnueabihf"
UBUN_TARGET_SYS_aarch64 ?= "aarch64-linux-gnu"
UBUN_TARGET_SYS = "${TARGET_SYS}"
TARGET_PREFIX = "${UBUN_TARGET_SYS}-"

UBUN_LIBDIR_arm = "lib32"
UBUN_LIBDIR_aarch64 = "lib"
BASE_LIB_tune-aarch64 = "lib"
BASE_LIB_tune-aarch64_be = "lib"

GCCMULTILIB_forcevariable = "--disable-multilib"
IMAGE_LINGUAS_forcevariable = ""

# Blacklist toolchain recipes as a belt-and-suspenders way to use the external toolchain
PNBLACKLIST[glibc] = "Using ubuntu toolchain"
PNBLACKLIST[libgcc] = "Using ubuntu toolchain"
PNBLACKLIST[gcc-cross] = "Using ubuntu toolchain"
PNBLACKLIST[gcc-runtime] = "Using ubuntu toolchain"

PREFERRED_PROVIDER_linux-libc-headers = "ubuntu-toolchain"
PREFERRED_PROVIDER_linux-libc-headers-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc-initial = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}g++ = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}binutils = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-for-gcc = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}compilerlibs = "ubuntu-toolchain"
PREFERRED_PROVIDER_alsa-lib = "ubuntu-toolchain"
PREFERRED_PROVIDER_glibc = "ubuntu-toolchain"
PREFERRED_PROVIDER_libgcc = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/libc = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/libc-locale = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/libintl = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/libiconv = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/crypt = "ubuntu-toolchain"
PREFERRED_PROVIDER_glibc-thread-db = "ubuntu-toolchain"
PREFERRED_PROVIDER_glibc-mtrace = "ubuntu-toolchain"
PREFERRED_PROVIDER_glibc-initial = "ubuntu-toolchain"
PREFERRED_PROVIDER_libc-mtrace = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/linux-libc-headers = "ubuntu-toolchain"
PREFERRED_PROVIDER_nativesdk-glibc-locale = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd = "ubuntu-toolchain"
PREFERRED_PROVIDER_apt = "ubuntu-toolchain"
PREFERRED_PROVIDER_util-linux = "ubuntu-toolchain"
PREFERRED_PROVIDER_glib-2.0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpam = "ubuntu-toolchain"
PREFERRED_PROVIDER_shadow = "ubuntu-toolchain"
PREFERRED_PROVIDER_libselinux = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsemanage = "ubuntu-toolchain"
PREFERRED_PROVIDER_libxml2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpcre = "ubuntu-toolchain"
PREFERRED_PROVIDER_libnl = "ubuntu-toolchain"
PREFERRED_PROVIDER_expat = "ubuntu-toolchain"
PREFERRED_PROVIDER_dbus = "ubuntu-toolchain"
PREFERRED_PROVIDER_dbus-lib = "ubuntu-toolchain"
PREFERRED_PROVIDER_liblzma = "ubuntu-toolchain"
PREFERRED_PROVIDER_xz = "ubuntu-toolchain"
PREFERRED_PROVIDER_zlib = "ubuntu-toolchain"
PREFERRED_PROVIDER_e2fsprogs = "ubuntu-toolchain"
PREFERRED_PROVIDER_e2fsprogs-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_mtd-utils-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_libarchive-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemu-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemu-helper-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemuwrapper-cross = "ubuntu-toolchain"
PREFERRED_PROVIDER_sqlite3 = "ubuntu-toolchain"
PREFERRED_PROVIDER_bzip2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_ncurses = "ubuntu-toolchain"
PREFERRED_PROVIDER_binutils-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd-compat-units = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd-conf = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd-serialgetty = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd-systemctl-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd-vconsole-setup = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_udev = "ubuntu-toolchain"
PREFERRED_PROVIDER_jpeg = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpng = "ubuntu-toolchain"
PREFERRED_PROVIDER_libxkbcommon = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-base = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-bad = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-good = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-ugly = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-rtsp-server = "ubuntu-toolchain"

PREFERRED_VERSION_cairo = "1.15.10"
PREFERRED_VERSION_gdk-pixbuf = "2.36.12"
PREFERRED_VERSION_harfbuzz = "1.7.2"
PREFERRED_VERSION_pango = "1.40.14"
PREFERRED_VERSION_libx11 = "1.6.4"
PREFERRED_VERSION_libxcb = "1.14"
PREFERRED_VERSION_gobject-introspection = "1.56.1"
PREFERRED_VERSION_dbus = "1.12.2"
PREFERRED_VERSION_dbus-native = "1.12.2"

TOOLCHAIN_OPTIONS = " --sysroot=${STAGING_DIR_HOST} "

DISTRO_FEATURES_LIBC = "ipv4 ipv6 libc-backtrace libc-big-macros libc-bsd libc-cxx-tests libc-catgets libc-crypt \
			libc-crypt-ufc libc-db-aliases libc-envz libc-fcvt libc-fmtmsg libc-fstab libc-ftraverse \
			libc-getlogin libc-idn libc-inet-anl libc-libm libc-libm-big \
			libc-locales libc-locale-code libc-charsets \
			libc-memusage libc-nis libc-nsswitch libc-rcmd libc-rtld-debug libc-spawn libc-streams libc-sunrpc \
			libc-utmp libc-utmpx libc-wordexp libc-posix-clang-wchar libc-posix-regexp libc-posix-regexp-glibc \
			libc-posix-wchar-io"

ENABLE_BINARY_LOCALE_GENERATION = "0"
GLIBC_INTERNAL_USE_BINARY_LOCALE = "precompiled"
LIBCOVERRIDE = ":libc-glibc"

ERROR_QA[type] ?= "list"
python toolchain_metadata_setup () {
    import subprocess
    if not isinstance(e, bb.event.ConfigParsed):
        return

    d = e.data
    l = d.createCopy()
    l.finalize()
    oe_import(l)

    external_toolchain = l.getVar('EXTERNAL_TOOLCHAIN', True)
    if not external_toolchain or external_toolchain == 'UNDEFINED':
        bb.fatal("Error: EXTERNAL_TOOLCHAIN must be set to the path to your ubuntu toolchain")

    subprocess.check_output( ["mkdir", "-p" , external_toolchain], stderr=subprocess.STDOUT)
    if not os.path.exists(external_toolchain):
        bb.fatal("Error: EXTERNAL_TOOLCHAIN path '%s' does not exist" % external_toolchain)
 
    # The external toolchain may not have been built with the oe-core preferred
    # gnu hash setting, so ensure that the corresponding sanity check is not an error.
    error_qa = oe.data.typed_value('ERROR_QA', l)
    if 'ldflags' in error_qa:
        error_qa.remove('ldflags')
        d.setVar('ERROR_QA', ' '.join(error_qa))
}
addhandler toolchain_metadata_setup

UBUN_VER_MAIN = '7.4.0'
UBUN_VER_GCC = '7.4.0'
UBUN_VER_LIBC = '2.27'
UBUN_VER_KERNEL = '4.19'
