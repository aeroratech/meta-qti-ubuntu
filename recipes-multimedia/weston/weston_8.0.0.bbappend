#remove gdk-pixbuf dependency because ubuntu toolchain provided
DEPENDS_remove_qrb5165-rb5 = "gdk-pixbuf"
RDEPENDS_${PN}_remove_qrb5165-rb5 += "xkeyboard-config"
DEPENDS += "util-linux "
PACKAGES_remove = "${PN}-dbg"
#PKG_CONFIG_DIR = ":${STAGING_DIR_TARGET}/${libdir}/${UBUN_TARGET_SYS}/pkgconfig:${STAGING_DIR_TARGET}/usr/share/pkgconfig"
PKG_CONFIG_LIBDIR += ":${STAGING_DIR_TARGET}/${libdir}/${UBUN_TARGET_SYS}/pkgconfig:${STAGING_DIR_TARGET}/usr/share/pkgconfig"
#export PKG_CONFIG_PATH = "
do_package_qa[noexec] = "1"
