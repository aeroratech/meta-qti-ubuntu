do_install_append_qrb5165-rb5 () {
	sed -i '/ExecStop/d' ${D}${systemd_unitdir}/system/init_audio.service
}
