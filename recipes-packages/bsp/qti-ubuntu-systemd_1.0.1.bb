LICENSE = "BSD-3-clause"

inherit pkgconfig

DEPENDS += "ubuntu-toolchain"

do_install() {
    install -d ${D}/etc/systemd
    install -d ${D}/lib/systemd/system

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/etc/systemd/logind.conf  ${D}/etc/systemd
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/systemd/system/serial-getty@.service  ${D}/lib/systemd/system

    #logind.conf -- Ignore PowerKey
    sed -i 's/#HandlePowerKey=poweroff/HandlePowerKey=ignore/' ${D}/etc/systemd/logind.conf

    # Allow tty connect when agetty start
    sed -i "s/TTYVHangup=yes'/TTYVHangup=no'/" ${D}/lib/systemd/system/serial-getty@.service
}

package_remove = "${PN}-dbg ${PN}-staticdev ${PN}-dev"

FILES_${PN} += "${sysconfdir}/systemd/logind.conf \
                ${base_libdir}/systemd/system/serial-getty@.service"
