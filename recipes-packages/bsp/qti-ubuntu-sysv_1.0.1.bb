LICENSE = "BSD-3-clause"

DEPENDS += "ubuntu-toolchain"

do_install() {
    install -m 0755 -d ${D}/sbin

    touch ${D}/sbin/reboot
    touch ${D}/sbin/reboot.sh

    chmod u+x ${D}/sbin/reboot
    chmod u+x ${D}/sbin/reboot.sh

    echo "nohup /sbin/reboot.sh &>/dev/null &" >> ${D}/sbin/reboot
    echo "/bin/systemctl stop serial-getty@ttyMSM0" > ${D}/sbin/reboot.sh
    echo "/bin/systemctl reboot" >> ${D}/sbin/reboot.sh
}

package_remove = "${PN}-dbg ${PN}-staticdev ${PN}-dev"

FILES_${PN} += "${base_sbindir}/reboot ${base_sbindir}/reboot.sh"
