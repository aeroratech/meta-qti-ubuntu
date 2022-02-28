EXTRA_OECONF_append_qrb5165 = " --libdir=${libdir}/${UBUN_TARGET_SYS}"
FILES_${PN}_append_qrb5165 = " ${libdir}/${UBUN_TARGET_SYS}/*"
RDEPENDS_${PN} += " gstreamer1.0-plugins-base-audio "

do_install_append(){
    bbwarn "***************gstreamer1.0-omx-1.16.3 install debug *******************"
    install -d ${D}/${libdir}/${UBUN_TARGET_SYS}/
    mv ${D}${libdir}/gstreamer-1.0 ${D}/${libdir}/${UBUN_TARGET_SYS}/
}
