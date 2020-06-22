ALLOW_EMPTY_gstreamer1.0-plugins-base-audio = "1"
PACKAGES = "gstreamer1.0-plugins-base-audio"
PROVIDES = "gstreamer1.0-plugins-base-audio"
RPROVIDES_gstreamer1.0-plugins-base-audio = "gstreamer1.0-plugins-base-audio"
FILES_gstreamer1.0-plugins-base-audio = " ${libdir}/${UBUN_TARGET_SYS}/libgstaudio* "
PKG_gstreamer1.0-plugins-base-audio = "gstreamer1.0-plugins-base-audio"
PKGV_gstreamer1.0-plugins-base-audio = "1.14.4"
PKGR_gstreamer1.0-plugins-base-audio = "0"

EXTRA_OECONF_append = " --libdir=${libdir}/${UBUN_TARGET_SYS}"

PACKAGECONFIG = " "

do_install_append () {
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/al*
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/ap*
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/f*
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/p*
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/r*
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/s*
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/t*
    rm -rf ${D}${includedir}/gstreamer-1.0/gst/v*
    rm -rf ${D}${datadir}
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/pkgconfig
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/gstreamer-1.0/
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstp*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstt*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstr*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgsts*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstf*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstv*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstal*
    rm -rf ${D}${libdir}/${UBUN_TARGET_SYS}/libgstap*
    rm -rf ${D}${bindir}
}

do_package_qa[noexec] = "1"
