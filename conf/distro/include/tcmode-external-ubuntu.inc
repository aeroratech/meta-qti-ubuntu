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
#Add meta pn_block
require recipes-pn-block.inc

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

#meta-qti-bsp
PNBLACKLIST[jsoncpp] = "Using ubuntu toolchain"
PNBLACKLIST[libdrm-modetest] = "Using ubuntu toolchain"

PREFERRED_PROVIDER_iso-codes = "ubuntu-toolchain"
PREFERRED_PROVIDER_libinput = "ubuntu-toolchain"
PREFERRED_PROVIDER_libinput-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_mtdev = "ubuntu-toolchain"
PREFERRED_PROVIDER_mtdev-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_tcp-wrappers = "ubuntu-toolchain"
PREFERRED_PROVIDER_libwrap = "ubuntu-toolchain"
PREFERRED_PROVIDER_libwrap-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_liba52 = "ubuntu-toolchain"
PREFERRED_PROVIDER_liba52-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libqhull = "ubuntu-toolchain"
PREFERRED_PROVIDER_libqhull-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libcryptopp = "ubuntu-toolchain"
PREFERRED_PROVIDER_libcrypto++ = "ubuntu-toolchain"
PREFERRED_PROVIDER_libcrypto++-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_curl = "ubuntu-toolchain"
PREFERRED_PROVIDER_libcurl = "ubuntu-toolchain"
PREFERRED_PROVIDER_curl-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libidn2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libidn2-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libunistring = "ubuntu-toolchain"
PREFERRED_PROVIDER_libunistring-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libnghttp2-14 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpsl5 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libgssapi-krb5-2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libldap-2.4-2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_librtmp1 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libkrb5-3 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libk5crypto3 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libcom-err2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libkrb5support0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsasl2-2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libgssapi3-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libgnutls30 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libnettle6 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libgmp10 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libp11-kit0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libtasn1-6 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libkeyutils1 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libheimntlm0-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libkrb5-26-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libasn1-8-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libhcrypto4-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libroken18-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libwind0-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libheimbase1-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libhx509-5-heimdal = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsqlite3-0 = "ubuntu-toolchain"


PREFERRED_PROVIDER_libcap = "ubuntu-toolchain"
PREFERRED_PROVIDER_libatomic-ops = "ubuntu-toolchain"
PREFERRED_PROVIDER_libvorbis = "ubuntu-toolchain"
PREFERRED_PROVIDER_speexdsp = "ubuntu-toolchain"
PREFERRED_PROVIDER_libogg = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsamplerate0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsndfile1 = "ubuntu-toolchain"
PREFERRED_PROVIDER_flac = "ubuntu-toolchain"
PREFERRED_PROVIDER_alsa-plugins = "ubuntu-toolchain"
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
PREFERRED_PROVIDER_libffi = "ubuntu-toolchain"
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
PREFERRED_PROVIDER_systemd-vconsole-setup = "ubuntu-toolchain"
PREFERRED_PROVIDER_systemd-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_udev = "ubuntu-toolchain"
PREFERRED_PROVIDER_jpeg = "ubuntu-toolchain"
PREFERRED_PROVIDER_libdrm = "ubuntu-toolchain"
PREFERRED_PROVIDER_libdrm2 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libdrm-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libdrm-freedreno = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpng = "ubuntu-toolchain"
PREFERRED_PROVIDER_libxkbcommon = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-base = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-bad = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-good = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-ugly = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-rtsp-server = "ubuntu-toolchain"
PREFERRED_PROVIDER_libssl1.1 = "ubuntu-toolchain"
PREFERRED_PROVIDER_openssl = "ubuntu-toolchain"
PREFERRED_PROVIDER_libevdev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libbsd = "ubuntu-toolchain"
PREFERRED_PROVIDER_libffi = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpciaccess = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpthread-stubs = "ubuntu-toolchain"
PREFERRED_PROVIDER_pixman = "ubuntu-toolchain"
PREFERRED_PROVIDER_libcroco = "ubuntu-toolchain"
PREFERRED_PROVIDER_libgudev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libid3tag = "ubuntu-toolchain"
PREFERRED_PROVIDER_librsvg = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsoup-2.4 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libtheora = "ubuntu-toolchain"
PREFERRED_PROVIDER_libtheora-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_liburcu = "ubuntu-toolchain"
PREFERRED_PROVIDER_liburcu-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libwebp = "ubuntu-toolchain"
PREFERRED_PROVIDER_libwebp-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_mpg123 = "ubuntu-toolchain"
PREFERRED_PROVIDER_mpg123-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_taglib = "ubuntu-toolchain"
PREFERRED_PROVIDER_taglib-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_json-c = "ubuntu-toolchain"
PREFERRED_PROVIDER_json-c-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libssl1.0.0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libssl1.0.0-dev = "ubuntu-toolchain"
PREFERRED_PROVIDER_gdk-pixbuf = "ubuntu-toolchain"
PREFERRED_PROVIDER_jsoncpp = "ubuntu-toolchain"
PREFERRED_PROVIDER_libltdl = "ubuntu-toolchain"

PREFERRED_VERSION_cairo = "1.15.10"
PREFERRED_VERSION_gdk-pixbuf = "2.36.12"
PREFERRED_VERSION_harfbuzz = "1.7.2"
PREFERRED_VERSION_pango = "1.40.14"
PREFERRED_VERSION_libx11 = "1.6.4"
PREFERRED_VERSION_libxcb = "1.14"
PREFERRED_VERSION_gobject-introspection = "1.56.1"
PREFERRED_VERSION_dbus = "1.12.2"
PREFERRED_VERSION_dbus-native = "1.12.2"
PREFERRED_VERSION_wayland = "1.14.1"
PREFERRED_VERSION_libhardware = "1.0"
PREFERRED_VERSION_camera-metadata = "1.1"
PREFERRED_VERSION_orc = "1.1"
PREFERRED_VERSION_orc-dev = "1.1"

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
