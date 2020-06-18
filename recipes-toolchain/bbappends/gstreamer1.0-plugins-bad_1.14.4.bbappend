ALLOW_EMPTY_gstreamer1.0-plugins-bad-waylandsink = "1"
PACKAGES = "gstreamer1.0-plugins-bad-waylandsink"
PROVIDES = "gstreamer1.0-plugins-bad-waylandsink"
RPROVIDES_gstreamer1.0-plugins-bad-waylandsink = "gstreamer1.0-plugins-bad-waylandsink"
FILES_gstreamer1.0-plugins-bad-waylandsink = " ${libdir}/${UBUN_TARGET_SYS}/* "
PKG_gstreamer1.0-plugins-bad-waylandsink = "gstreamer1.0-plugins-bad-waylandsink"
PKGV_gstreamer1.0-plugins-bad-waylandsink = "1.14.4"
PKGR_gstreamer1.0-plugins-bad-waylandsink = "0"

EXTRA_OECONF_append = " --libdir=${libdir}/${UBUN_TARGET_SYS}"

PACKAGECONFIG  = " wayland "
DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'gbm', '', d)}"

do_install_append () {
    rm -rf ${D}${includedir}
    rm -rf ${D}${datadir}
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgsta*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstb*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstc*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgsti*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstm*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstp*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstu*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstwe*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/pkgconfig
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgsta*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstb*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstc*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstd*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstf*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstg*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgsti*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstj*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstl*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstm*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstn*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstp*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstr*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgsts*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstt*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgstv*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/libgsty*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/.debug/

}

do_package_qa[noexec] = "1"

# config update-alternatives for gstreamer1.0-plugins-bad
require update-alternatives/gstreamer1.0-plugins-bad.inc
