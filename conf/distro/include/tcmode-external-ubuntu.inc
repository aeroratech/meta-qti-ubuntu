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

#TOOLCHAIN_PATH_ADD = "/usr/bin:/usr/local/go/bin/:"
TOOLCHAIN_PATH_ADD = "/usr/bin:"
PATH =. "${TOOLCHAIN_PATH_ADD}"
OECMAKE_EXTRA_ROOT_PATH += "/usr/bin"
LICENSE_FLAGS_WHITELIST = "commercial license"
# MACROS below are for self-contained toolchain
#CFLAGS += " --sysroot=${STAGING_DIR_HOST}  -L/local/mnt/workspace/tq/src/ubuntu-toolchain/deb/usr/lib/gcc-cross/aarch64-linux-gnu/7   "
#TARGET_CPPFLAGS += " -I${STAGING_DIR_TARGET}${includedir}/c++ "
#LDFLAGS += " --sysroot=${STAGING_DIR_HOST} "
#LDDLFLAGS += " --sysroot=${STAGING_DIR_HOST} "
#export CXX = "aarch64-linux-gnu-wrapper ${CCACHE}${HOST_PREFIX}g++ ${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS}"
#export CPP = "aarch64-linux-gnu-wrapper ${HOST_PREFIX}gcc -E${TOOLCHAIN_OPTIONS} ${HOST_CC_ARCH}"
#export REAL_LD_FILE_NAME="${STAGING_BINDIR_NATIVE}/aarch64-linux-gnu-ld.bfd-real"
PKG_CONFIG_PATH_append = ":${STAGING_DIR_TARGET}/${libdir}/${UBUN_TARGET_SYS}/pkgconfig"
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
PREFERRED_PROVIDER_mtdev = "mtdev-ubuntu"
PREFERRED_PROVIDER_libinput = "libinput-ubuntu"
PREFERRED_PROVIDER_tcp-wrappers = "tcp-wrappers-ubuntu"
PREFERRED_PROVIDER_liba52 = "liba52-ubuntu"
PREFERRED_PROVIDER_libidn2 = "libidn2-ubuntu"
PREFERRED_PROVIDER_libunistring = "libunistring-ubuntu"
PREFERRED_PROVIDER_curl = "curl-ubuntu"
PREFERRED_PROVIDER_libnghttp2-14 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpsl5 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libk5crypto3 = "krb5-ubuntu"
PREFERRED_PROVIDER_libcom-err2 = "ubuntu-toolchain"


# Go
#PNBLACKLIST[go-cross] = "Using ubuntu toolchain"
#PNBLACKLIST[go-native] = "Using ubuntu toolchain"
#PNBLACKLIST[go-crosssdk] = "Using ubuntu toolchain"
#PNBLACKLIST[go-cross-aarch64] = "Using ubuntu toolchain"

#PREFERRED_PROVIDER_go-cross-${TARGET_ARCH} = "ubuntu-toolchain"
#PREFERRED_PROVIDER_go-native = "ubuntu-toolchain"
#PREFERRED_PROVIDER_go-crosssdk = "ubuntu-toolchain"

PREFERRED_PROVIDER_speexdsp = "speex-ubuntu"
PREFERRED_PROVIDER_speex = "speex-ubuntu"
PREFERRED_PROVIDER_libogg = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsamplerate0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsndfile1 = "ubuntu-toolchain"
PREFERRED_PROVIDER_flac = "ubuntu-toolchain"
PREFERRED_PROVIDER_alsa-plugins = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc-initial = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}g++ = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}binutils = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-for-gcc = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}compilerlibs = "ubuntu-toolchain"
PREFERRED_PROVIDER_alsa-lib = "ubuntu-toolchain"
PREFERRED_PROVIDER_glibc = "glibc-ubuntu"
PREFERRED_PROVIDER_libgcc = "libgcc-toolchain"
PREFERRED_PROVIDER_libgcc-initial = "libgcc-toolchain"
PREFERRED_PROVIDER_virtual/libc = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/libc-locale = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/libintl = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/libiconv = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/crypt = "libxcrypt-ubuntu"
PREFERRED_PROVIDER_glibc-mtrace = "glibc-ubuntu"
PREFERRED_PROVIDER_libc-mtrace = "ubuntu-toolchain"
PREFERRED_PROVIDER_nativesdk-glibc-locale = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/linux-libc-headers = "linux-libc-headers-ubuntu"
PREFERRED_PROVIDER_apt = "ubuntu-toolchain"
PREFERRED_PROVIDER_util-linux = "util-linux-ubuntu"
PREFERRED_PROVIDER_glib-2.0 = "glib-2.0-ubuntu"
PREFERRED_PROVIDER_libffi = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpam = "ubuntu-toolchain"
PREFERRED_PROVIDER_shadow = "ubuntu-toolchain"
PREFERRED_PROVIDER_libselinux = "ubuntu-toolchain"
PREFERRED_PROVIDER_libsemanage = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpcre = "ubuntu-toolchain"
PREFERRED_PROVIDER_libnl = "ubuntu-toolchain"
PREFERRED_PROVIDER_dbus = "dbus-ubuntu"
PREFERRED_PROVIDER_liblzma = "ubuntu-toolchain"
PREFERRED_PROVIDER_xz = "ubuntu-toolchain"
PREFERRED_PROVIDER_zlib = "zlib-ubuntu"
PREFERRED_PROVIDER_e2fsprogs = "ubuntu-toolchain"
PREFERRED_PROVIDER_e2fsprogs-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_mtd-utils-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_libarchive-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemu-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemu-helper-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemuwrapper-cross = "ubuntu-toolchain"
PREFERRED_PROVIDER_sqlite3 = "ubuntu-toolchain"
PREFERRED_PROVIDER_bzip2 = "bzip2-ubuntu"
PREFERRED_PROVIDER_ncurses = "ncurses-ubuntu"
PREFERRED_PROVIDER_binutils-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_udev = "ubuntu-toolchain"
PREFERRED_PROVIDER_jpeg = "ubuntu-toolchain"
#PREFERRED_PROVIDER_libdrm = "ubuntu-toolchain"
#PREFERRED_PROVIDER_libdrm2 = "ubuntu-toolchain"
#PREFERRED_PROVIDER_libdrm-dev = "ubuntu-toolchain"
#PREFERRED_PROVIDER_libdrm-freedreno = "ubuntu-toolchain"
PREFERRED_PROVIDER_libxkbcommon = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0 = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-base = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-bad = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-good = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-plugins-ugly = "ubuntu-toolchain"
PREFERRED_PROVIDER_gstreamer1.0-rtsp-server = "gstreamer1.0-rtsp-server-ubuntu"
PREFERRED_PROVIDER_libssl1.1 = "ubuntu-toolchain"
PREFERRED_PROVIDER_openssl = "ubuntu-toolchain"
PREFERRED_PROVIDER_libevdev = "ubuntu-toolchain"
PREFERRED_PROVIDER_libffi = "ubuntu-toolchain"
PREFERRED_PROVIDER_libpciaccess = "ubuntu-toolchain"
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
PREFERRED_PROVIDER_jsoncpp = "ubuntu-toolchain"
PREFERRED_PROVIDER_libltdl = "ubuntu-toolchain"

PREFERRED_VERSION_gobject-introspection = "1.56.1"
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

UBUN_VER_MAIN = '9.3.0'
UBUN_VER_GCC = '9.3.0'
UBUN_VER_LIBC = '2.31'
UBUN_VER_KERNEL = '4.19'
PREFERRED_PROVIDER_iso-codes = "iso-codes-ubuntu"
PREFERRED_PROVIDER_libcap = "libcap-ubuntu"
PREFERRED_PROVIDER_gnutls = "gnutls-ubuntu"
PREFERRED_PROVIDER_gmp = "gmp-ubuntu"
PREFERRED_PROVIDER_nettle = "nettle-ubuntu"
PREFERRED_PROVIDER_cyrus-sasl = "cyrus-sasl-ubuntu"
PREFERRED_PROVIDER_rtmpdump = "rtmpdump-ubuntu"
PREFERRED_PROVIDER_openldap = "openldap-ubuntu"
PREFERRED_PROVIDER_libgcrypt = "libgcrypt-ubuntu"
PREFERRED_PROVIDER_libgpg-error = "libgpg-error-ubuntu"
PREFERRED_PROVIDER_keyutils = "keyutils-ubuntu"
PREFERRED_PROVIDER_krb5 = "krb5-ubuntu"
PREFERRED_PROVIDER_curl = "curl-ubuntu"
PREFERRED_PROVIDER_libtasn1 = "libtasn1-ubuntu"
PREFERRED_PROVIDER_p11-kit = "p11-kit-ubuntu"
PREFERRED_PROVIDER_systemd = "systemd-ubuntu"
PREFERRED_PROVIDER_acl = "acl-ubuntu"
PREFERRED_PROVIDER_libinput = "libinput-ubuntu"
PREFERRED_PROVIDER_cairo = "cairo-ubuntu"
PREFERRED_PROVIDER_freetype = "freetype-ubuntu"
PREFERRED_PROVIDER_fontconfig = "fontconfig-ubuntu"
PREFERRED_PROVIDER_pixman = "pixman-ubuntu"
PREFERRED_PROVIDER_harfbuzz = "harfbuzz-ubuntu"
PREFERRED_PROVIDER_graphite2 = "graphite2-ubuntu"
PREFERRED_PROVIDER_icu = "icu-ubuntu"
PREFERRED_PROVIDER_libxml2 = "libxml2-ubuntu"
PREFERRED_PROVIDER_wayland = "wayland-ubuntu"
PREFERRED_PROVIDER_pango = "pango-ubuntu"
PREFERRED_PROVIDER_libx11 = "libx11-ubuntu"
PREFERRED_PROVIDER_fribidi = "fribidi-ubuntu"
PREFERRED_PROVIDER_libxau = "libxau-ubuntu"
PREFERRED_PROVIDER_xorgproto = "xorgproto-ubuntu"
PREFERRED_PROVIDER_xorg-sgml-doctools = "xorg-sgml-doctools-ubuntu"
PREFERRED_PROVIDER_libxcb = "libxcb-ubuntu"
PREFERRED_PROVIDER_libpthread-stubs = "libpthread-stubs-ubuntu"
PREFERRED_PROVIDER_libxdmcp = "libxdmcp-ubuntu"
PREFERRED_PROVIDER_expat = "expat-ubuntu"
PREFERRED_PROVIDER_libpng = "libpng-ubuntu"
PREFERRED_PROVIDER_libthai = "libthai-ubuntu"
PREFERRED_PROVIDER_libdatrie = "libdatrie-ubuntu"
PREFERRED_PROVIDER_libxft = "libxft-ubuntu"
PREFERRED_PROVIDER_libxrender = "libxrender-ubuntu"
PREFERRED_PROVIDER_libbsd = "libbsd-ubuntu"
PREFERRED_PROVIDER_gdk-pixbuf = "gdk-pixbuf-ubuntu"
#PREFERRED_PROVIDER_wayland-protocols = "wayland-protocols-ubuntu"
PREFERRED_PROVIDER_libxext = "libxext-ubuntu"
