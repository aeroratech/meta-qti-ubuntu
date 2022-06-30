# config update-alternatives for recovery-ab
require update-alternatives/recovery-ab.inc

do_install_append() {
        install -d ${D}/res/
        install -d ${D}/cache/recovery
        install -m 0755 ${WORKDIR}/fstab_AB -D ${D}/res/recovery_volume_config
	mkdir ${D}/usr/bin/tmp
        cp -rf ${D}/usr/bin/applypatch ${D}/usr/bin/tmp/
}
#DEPENDS_remove += "zib"
#RDEPENDS_remove += "zlib"

