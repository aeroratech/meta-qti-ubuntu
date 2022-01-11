do_install_append(){

    for entry in ${MACHINE_MNT_POINTS}; do
        mountname="${entry:1}"
        if [[ "$mountname" == "firmware" || "$mountname" == "bt_firmware" || "$mountname" == "dsp" ]] && \
           [[ "${IMAGETYPE}" == "ubi" || "${COMBINED_FEATURES}" =~ .*qti-ab-boot.* ]] ; then
	    rm -f ${D}${systemd_unitdir}/system/${mountname}-mount-${IMAGETYPE}.service
            install -m 0644 ${S}/${mountname}-mount.service ${D}${systemd_unitdir}/system/${mountname}-mount.service
        else
            rm -f ${D}${systemd_unitdir}/system/${mountname}-mount-${IMAGETYPE}.servic
            install -m 0644 ${S}/${mountname}.mount ${D}${systemd_unitdir}/system/${mountname}.mount
        fi
    done

}
