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
OECMAKE_EXTRA_ROOT_PATH += "/usr/bin"
PKG_CONFIG_LIBDIR .= ":${STAGING_DIR_TARGET}/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/"
PKG_CONFIG_PATH .= ":${STAGING_DIR_TARGET}/${libdir}/${UBUN_TARGET_SYS}/pkgconfig/"
LICENSE_FLAGS_WHITELIST = "commercial license"
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
PNBLACKLIST[libdrm-modetest] = "Using ubuntu toolchain"

PREFERRED_PROVIDER_mtdev = "mtdev-ubuntu"
PREFERRED_PROVIDER_libinput = "libinput-ubuntu"
PREFERRED_PROVIDER_tcp-wrappers = "tcp-wrappers-ubuntu"
PREFERRED_PROVIDER_liba52 = "liba52-ubuntu"
PREFERRED_PROVIDER_libidn2 = "libidn2-ubuntu"
PREFERRED_PROVIDER_libunistring = "libunistring-ubuntu"
PREFERRED_PROVIDER_libk5crypto3 = "krb5-ubuntu"
#libcom-err2 is provided by e2fsprogs
PREFERRED_PROVIDER_libcom-err2 = "ubuntu-toolchain"

PREFERRED_PROVIDER_speexdsp = "speex-ubuntu"
PREFERRED_PROVIDER_speex = "speex-ubuntu"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc-initial = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}g++ = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}binutils = "ubuntu-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-for-gcc = "ubuntu-toolchain"
#PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}compilerlibs = "ubuntu-toolchain"
PREFERRED_PROVIDER_glibc = "glibc-ubuntu"
PREFERRED_PROVIDER_libgcc = "libgcc-toolchain"
PREFERRED_PROVIDER_libgcc-initial = "libgcc-toolchain"
PREFERRED_PROVIDER_virtual/libc = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/libc-locale = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/libintl = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/libiconv = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/crypt = "libxcrypt-ubuntu"
PREFERRED_PROVIDER_glibc-mtrace = "glibc-ubuntu"
PREFERRED_PROVIDER_virtual/linux-libc-headers = "linux-libc-headers-ubuntu"
PREFERRED_PROVIDER_apt = "ubuntu-toolchain"
PREFERRED_PROVIDER_util-linux = "util-linux-ubuntu"
PREFERRED_PROVIDER_glib-2.0 = "glib-2.0-ubuntu"
PREFERRED_PROVIDER_libsemanage = "ubuntu-toolchain"
PREFERRED_PROVIDER_dbus = "dbus-ubuntu"
PREFERRED_PROVIDER_liblzma = "xz-toolchain"
PREFERRED_PROVIDER_zlib = "zlib-ubuntu"
PREFERRED_PROVIDER_e2fsprogs = "ubuntu-toolchain"
PREFERRED_PROVIDER_e2fsprogs-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_mtd-utils-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_libarchive-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemu-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemu-helper-native = "ubuntu-toolchain"
PREFERRED_PROVIDER_qemuwrapper-cross = "ubuntu-toolchain"
PREFERRED_PROVIDER_bzip2 = "bzip2-ubuntu"
PREFERRED_PROVIDER_ncurses = "ncurses-ubuntu"
PREFERRED_PROVIDER_binutils-native = "ubuntu-toolchain"
## udev is provided by systemd 
PREFERRED_PROVIDER_udev = "ubuntu-toolchain"
PREFERRED_PROVIDER_jpeg = "libjpeg-turbo-ubuntu"
PREFERRED_PROVIDER_libltdl = "ubuntu-toolchain"

PREFERRED_VERSION_gobject-introspection = "1.56.1"
PREFERRED_VERSION_libhardware = "1.0"
PREFERRED_VERSION_camera-metadata = "1.1"
#PREFERRED_VERSION_orc = "1.1"
#PREFERRED_VERSION_orc-dev = "1.1"

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
PREFERRED_PROVIDER_wayland = "wayland-ubuntu"
PREFERRED_PROVIDER_pango = "pango-ubuntu"
PREFERRED_PROVIDER_libx11 = "libx11-ubuntu"
PREFERRED_PROVIDER_virtual/libx11 = "libx11-ubuntu"
PREFERRED_PROVIDER_fribidi = "fribidi-ubuntu"
PREFERRED_PROVIDER_libxau = "libxau-ubuntu"
PREFERRED_PROVIDER_xorgproto = "xorgproto-ubuntu"
PREFERRED_PROVIDER_xorg-sgml-doctools = "xorg-sgml-doctools-ubuntu"
PREFERRED_PROVIDER_libxcb = "libxcb-ubuntu"
PREFERRED_PROVIDER_libxdmcp = "libxdmcp-ubuntu"
PREFERRED_PROVIDER_expat = "expat-ubuntu"
PREFERRED_PROVIDER_libpng = "libpng-ubuntu"
PREFERRED_PROVIDER_libthai = "libthai-ubuntu"
PREFERRED_PROVIDER_libdatrie = "libdatrie-ubuntu"
PREFERRED_PROVIDER_libxft = "libxft-ubuntu"
PREFERRED_PROVIDER_libbsd = "libbsd-ubuntu"
PREFERRED_PROVIDER_gdk-pixbuf = "gdk-pixbuf-ubuntu"
#PREFERRED_PROVIDER_wayland-protocols = "wayland-protocols-ubuntu"
PREFERRED_PROVIDER_libxext = "libxext-ubuntu"
PREFERRED_PROVIDER_opencv = "opencv-ubuntu"
PREFERRED_PROVIDER_sqlite3 = "sqlite3-ubuntu"
PREFERRED_PROVIDER_libjpeg-turbo = "libjpeg-turbo-ubuntu"
PREFERRED_PROVIDER_libxkbcommon = "libxkbcommon-ubuntu"
PREFERRED_PROVIDER_libevdev = "libevdev-ubuntu"
PREFERRED_PROVIDER_openssl = "openssl-ubuntu"
PREFERRED_PROVIDER_util-macros = "util-macros-ubuntu"
PREFERRED_PROVIDER_libpciaccess = "libpciaccess-ubuntu"
PREFERRED_PROVIDER_libpthread-stubs = "libpthread-stubs-ubuntu"
PREFERRED_PROVIDER_libffi = "libffi-ubuntu"
PREFERRED_PROVIDER_gstreamer1.0 = "gstreamer1.0-ubuntu"
PREFERRED_PROVIDER_libcroco = "libcroco-ubuntu"
PREFERRED_PROVIDER_libgudev = "libgudev-ubuntu"
PREFERRED_PROVIDER_libid3tag = "libid3tag-ubuntu"
PREFERRED_PROVIDER_librsvg = "librsvg-ubuntu"
PREFERRED_PROVIDER_libsoup-2.4 = "libsoup-2.4-ubuntu"
PREFERRED_PROVIDER_libtheora = "libtheora-ubuntu"
PREFERRED_PROVIDER_liburcu = "liburcu-ubuntu"
PREFERRED_PROVIDER_libwebp = "libwebp-ubuntu"
PREFERRED_PROVIDER_mpg123 = "mpg123-ubuntu"
PREFERRED_PROVIDER_taglib = "taglib-ubuntu"
PREFERRED_PROVIDER_json-c = "json-c-ubuntu"
PREFERRED_PROVIDER_jsoncpp = "jsoncpp-ubuntu"
PREFERRED_PROVIDER_shadow = "shadow-ubuntu"
PREFERRED_PROVIDER_libxml2 = "libxml2-ubuntu"
PREFERRED_PROVIDER_libpam = "libpam-ubuntu"
PREFERRED_PROVIDER_cracklib = "cracklib-ubuntu"
PREFERRED_PROVIDER_libwacom = "libwacom-ubuntu"
PREFERRED_PROVIDER_nghttp2 = "nghttp2-ubuntu"
PREFERRED_PROVIDER_libpsl = "libpsl-ubuntu"
PREFERRED_PROVIDER_libnl = "libnl-ubuntu"
PREFERRED_PROVIDER_xz = "xz-ubuntu"
PREFERRED_PROVIDER_libpcre2 = "libpcre2-ubuntu"
PREFERRED_PROVIDER_libpcre = "libpcre-ubuntu"
PREFERRED_PROVIDER_libselinux = "libselinux-ubuntu"
PREFERRED_PROVIDER_libogg = "libogg-ubuntu"
PREFERRED_PROVIDER_flac = "flac-ubuntu"
PREFERRED_PROVIDER_libvorbis = "libvorbis-ubuntu"
PREFERRED_PROVIDER_libsndfile1 = "libsndfile1-ubuntu"
PREFERRED_PROVIDER_libsamplerate0 = "libsamplerate0-ubuntu"
PREFERRED_PROVIDER_libsepol = "libsepol-ubuntu"
PREFERRED_PROVIDER_alsa-lib = "alsa-lib-ubuntu"
PREFERRED_PROVIDER_alsa-plugins = "alsa-plugins-ubuntu"
PREFERRED_PROVIDER_sbc = "sbc-ubuntu"
PREFERRED_PROVIDER_alsa-utils = "alsa-utils-ubuntu"
PREFERRED_PROVIDER_libcap-ng = "libcap-ng-ubuntu"
PREFERRED_PROVIDER_orc = "orc-ubuntu"
PREFERRED_PROVIDER_kmod = "kmod-ubuntu"
PREFERRED_PROVIDER_brotli = "brotli-ubuntu"
PREFERRED_PROVIDER_libssh = "libssh-ubuntu"
PREFERRED_PROVIDER_console-bridge = "console-bridge-ubuntu"
PREFERRED_PROVIDER_lz4 = "lz4-ubuntu"
PREFERRED_PROVIDER_libtirpc = "libtirpc-ubuntu"
PREFERRED_PROVIDER_audit = "audit-ubuntu"
PREFERRED_PROVIDER_tbb = "tbb-ubuntu"
PREFERRED_PROVIDER_libatomic-ops = "libatomic-ops-ubuntu"
PREFERRED_PROVIDER_gcc-runtime = "gcc-runtime-ubuntu"
PREFERRED_PROVIDER_gobject-introspection = "gobject-introspection-ubuntu"
#PREFERRED_PROVIDER_libdrm = "libdrm-ubuntu"
PREFERRED_PROVIDER_gstreamer1.0-plugins-bad = "gstreamer1.0-plugins-bad-ubuntu"
PREFERRED_PROVIDER_gstreamer1.0-plugins-good = "gstreamer1.0-plugins-good-ubuntu"
PREFERRED_PROVIDER_gstreamer1.0-plugins-ugly = "gstreamer1.0-plugins-ugly-ubuntu"
PREFERRED_PROVIDER_gstreamer1.0-plugins-base = "gstreamer1.0-plugins-base-ubuntu"
PREFERRED_PROVIDER_gstreamer1.0-libav = "gstreamer1.0-libav-ubuntu"
PREFERRED_PROVIDER_spdlog = "spdlog-ubuntu"
PREFERRED_PROVIDER_poco = "poco-ubuntu"
PREFERRED_PROVIDER_libpcap = "libpcap-ubuntu"
PREFERRED_PROVIDER_libdaemon = "libdaemon-ubuntu"
PREFERRED_PROVIDER_json-glib = "json-glib-ubuntu"
PREFERRED_PROVIDER_bash-completion = "bash-completion-ubuntu"
PREFERRED_PROVIDER_libtool = "libtool-ubuntu"
PREFERRED_PROVIDER_tiff = "tiff-ubuntu"
PREFERRED_PROVIDER_python3-numpy = "python3-numpy-ubuntu"
PREFERRED_PROVIDER_libexif = "libexif-ubuntu"
PREFERRED_PROVIDER_python3-nose = "python3-nose-ubuntu"
PREFERRED_PROVIDER_v4l-utils = "v4l-utils-ubuntu"
PREFERRED_PROVIDER_gtk+3 = "gtk+3-ubuntu"
PREFERRED_PROVIDER_atk = "atk-ubuntu"
PREFERRED_PROVIDER_libepoxy = "libepoxy-ubuntu"
PREFERRED_PROVIDER_netcdf = "netcdf-ubuntu"
PREFERRED_PROVIDER_ogdi-dfsg = "ogdi-dfsg-ubuntu"
PREFERRED_PROVIDER_pcre3 = "pcre3-ubuntu"
PREFERRED_PROVIDER_proj = "proj-ubuntu"
PREFERRED_PROVIDER_spatialite = "spatialite-ubuntu"
PREFERRED_PROVIDER_uriparser = "uriparser-ubuntu"
PREFERRED_PROVIDER_xerces-c = "xerces-c-ubuntu"
PREFERRED_PROVIDER_zstd = "zstd-ubuntu"
PREFERRED_PROVIDER_openjpeg = "openjpeg-ubuntu"
PREFERRED_PROVIDER_poppler = "poppler-ubuntu"
PREFERRED_PROVIDER_postgresql = "postgresql-ubuntu"
PREFERRED_PROVIDER_geos = "geos-ubuntu"
PREFERRED_PROVIDER_giflib = "giflib-ubuntu"
PREFERRED_PROVIDER_libaec = "libaec-ubuntu"
PREFERRED_PROVIDER_superlu = "superlu-ubuntu"
PREFERRED_PROVIDER_arpack = "arpack-ubuntu"
PREFERRED_PROVIDER_lapack = "lapack-ubuntu"
PREFERRED_PROVIDER_pth = "pth-ubuntu"
PREFERRED_PROVIDER_minizip = "minizip-ubuntu"
PREFERRED_PROVIDER_tcl = "tcl-ubuntu"
PREFERRED_PROVIDER_nspr = "nspr-ubuntu"
PREFERRED_PROVIDER_openexr = "openexr-ubuntu"
PREFERRED_PROVIDER_gdcm = "gdcm-ubuntu"
PREFERRED_PROVIDER_jbigkit = "jbigkit-ubuntu"
PREFERRED_PROVIDER_unixodbc = "unixodbc-ubuntu"
PREFERRED_PROVIDER_ilmbase = "ilmbase-ubuntu"
PREFERRED_PROVIDER_socket++ = "socket++-ubuntu"
PREFERRED_PROVIDER_curl = "curl-ubuntu"
PREFERRED_PROVIDER_libxrandr = "libxrandr-ubuntu"
PREFERRED_PROVIDER_libxrender = "libxrender-ubuntu"
PREFERRED_PROVIDER_at-spi2-atk = "at-spi2-atk-ubuntu"
PREFERRED_PROVIDER_at-spi2-core = "at-spi2-core-ubuntu"
PREFERRED_PROVIDER_npth = "npth-ubuntu"
PREFERRED_PROVIDER_nss = "nss-ubuntu"
PREFERRED_PROVIDER_libxcomposite = "libxcomposite-ubuntu"
PREFERRED_PROVIDER_libxcursor = "libxcursor-ubuntu"
PREFERRED_PROVIDER_libxdamage = "libxdamage-ubuntu"
PREFERRED_PROVIDER_libxfixes = "libxfixes-ubuntu"
PREFERRED_PROVIDER_libxi = "libxi-ubuntu"
PREFERRED_PROVIDER_libxinerama = "libxinerama-ubuntu"
PREFERRED_PROVIDER_libxtst = "libxtst-ubuntu"
PREFERRED_PROVIDER_boost = "boost-ubuntu"
PREFERRED_PROVIDER_libcrypto++ = "libcrypto++-ubuntu"
