ALLOW_EMPTY_gstreamer1.0-plugins-base-audio = "1"
PACKAGES = "gstreamer1.0-plugins-base-audio gstreamer1.0-plugins-base"
PROVIDES = "gstreamer1.0-plugins-base-audio gstreamer1.0-plugins-base"
DEPENDS += "libxcb glib-2.0 gstreamer1.0-plugins-base-oss"
RPROVIDES_gstreamer1.0-plugins-base-audio = "gstreamer1.0-plugins-base-audio"
FILES_gstreamer1.0-plugins-base-audio = " ${libdir}/${UBUN_TARGET_SYS}/libgstaudio* "
PKG_${PN} = "gstreamer1.0-plugins-base-audio"
PKGV_gstreamer1.0-plugins-base-audio = "1.16.3"
PKGR_gstreamer1.0-plugins-base-audio = "0"

#PROVIDES_remove = "gstreamer1.0-plugins-base"

EXTRA_OECONF_append = " --libdir=${libdir}/${UBUN_TARGET_SYS}"
OECMAKE_C_FLAGS_append = " -I ${includedir}/harfbuzz/"
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
    rm -rf ${D}${libdir}/pkgconfig
    rm -rf ${D}${libdir}/gstreamer-1.0/
    rm -rf ${D}${libdir}/libgstp*
    rm -rf ${D}${libdir}/libgstt*
    rm -rf ${D}${libdir}/libgstr*
    rm -rf ${D}${libdir}/libgsts*
    rm -rf ${D}${libdir}/libgstf*
    rm -rf ${D}${libdir}/libgstv*
    rm -rf ${D}${libdir}/libgstal*
    rm -rf ${D}${libdir}/libgstap*
    rm -rf ${D}${bindir}
}

do_package_qa[noexec] = "1"

# config update-alternatives for gstreamer1.0-plugins-base
require update-alternatives/gstreamer1.0-plugins-base.inc
