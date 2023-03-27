EXTRA_OECONF:append = " --libdir=${libdir}/${UBUN_TARGET_SYS}"
FILES:${PN}:append = " ${libdir}/${UBUN_TARGET_SYS}/*"
RDEPENDS:${PN} += " gstreamer1.0-plugins-base-audio "

do_install:append(){
    bbwarn "***************gstreamer1.0-omx-1.16.3 install debug *******************"
    install -d ${D}/${libdir}/${UBUN_TARGET_SYS}/
    mv ${D}${libdir}/gstreamer-1.0 ${D}/${libdir}/${UBUN_TARGET_SYS}/
}
