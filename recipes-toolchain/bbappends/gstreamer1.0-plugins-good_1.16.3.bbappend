ALLOW_EMPTY_gstreamer1.0-plugins-good-pulse = "1"
ALLOW_EMPTY_gstreamer1.0-plugins-good-v4l2 = "1"
DEPENDS += "gstreamer1.0-plugins-base-audio orc"
PACKAGES = "gstreamer1.0-plugins-good-pulse gstreamer1.0-plugins-good-v4l2 gstreamer1.0-plugins-good"
PROVIDES = "gstreamer1.0-plugins-good-pulse gstreamer1.0-plugins-good-v4l2 gstreamer1.0-plugins-good"
DEPENDS += "gstreamer1.0-plugins-good-oss"
RPROVIDES_gstreamer1.0-plugins-good-pulse = "gstreamer1.0-plugins-good-pulse"
RPROVIDES_gstreamer1.0-plugins-good = "gstreamer1.0-plugins-good"
FILES_gstreamer1.0-plugins-good-pulse = " ${libdir}/gstreamer-1.0/libgstpulseaudio.so "
PKG_${PN} = "gstreamer1.0-plugins-good-pulse"
PKGV_gstreamer1.0-plugins-good-pulse = "1.16.3"
PKGR_gstreamer1.0-plugins-good-pulse = "0"
RDEPENDS_gstreamer1.0-plugins-good-pulse = "gstreamer1.0-plugins-base-audio"
RPROVIDES_gstreamer1.0-plugins-good-v4l2 = "gstreamer1.0-plugins-good-v4l2"
FILES_gstreamer1.0-plugins-good-v4l2 = " ${libdir}/gstreamer-1.0/libgstvideo4linux2.so "
PKG_gstreamer1.0-plugins-good-v4l2 = "gstreamer1.0-plugins-good-v4l2"
PKGV_gstreamer1.0-plugins-good-v4l2 = "1.16.3"
PKGR_gstreamer1.0-plugins-good-v4l2 = "0"

#PROVIDES_remove = "gstreamer1.0-plugins-good"
EXTRA_OECONF_append = " --libdir=${libdir}/${UBUN_TARGET_SYS}"

PACKAGECONFIG[v4l2] = "--enable-v4l2"
PACKAGECONFIG  = " pulseaudio "

do_install_append () {
    rm -rf ${D}${includedir}
    rm -rf ${D}${datadir}
    rm -rf ${D}${libdir}/pkgconfig
    rm -rf ${D}${libdir}/gstreamer-1.0/.debug
    rm -rf ${D}${libdir}/gstreamer-1.0/libgsta*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstc*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstd*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgste*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstf*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstg*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgsti*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstl*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstm*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstn*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgsto*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstr*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgsts*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstt*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstu*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstw*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgsty*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvo*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvu*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvm*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvp*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideof*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideos*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideop*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideot*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideom*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideob*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideor*
    rm -rf ${D}${libdir}/gstreamer-1.0/libgstvideoc*
}

#do_package_qa[noexec] = "1"

# config update-alternatives for gstreamer1.0-plugins-good
require update-alternatives/gstreamer1.0-plugins-good.inc
