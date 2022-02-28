LICENSE = "BSD-3-clause-clear"

inherit pkgconfig

DEPENDS += "ubuntu-toolchain"

do_install() {
    install -d ${D}/etc/systemd

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/etc/systemd/logind.conf  ${D}/etc/systemd

    #logind.conf -- Ignore PowerKey
    sed -i 's/#HandlePowerKey=poweroff/HandlePowerKey=ignore/' ${D}/etc/systemd/logind.conf
}

package_remove = "${PN}-dbg ${PN}-staticdev ${PN}-dev"

FILES_${PN} += "${sysconfdir}/systemd/logind.conf"
