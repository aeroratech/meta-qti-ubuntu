LICENSE = "BSD-3-clause"

inherit pkgconfig

DEPENDS += "ubuntu-toolchain"

do_install() {
    install -d ${D}/etc/pam.d

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/etc/pam.d/login  ${D}/etc/pam.d

    # PAM: allow login as root
    sed -i '/pam_securetty.so/d' ${D}/etc/pam.d/login
}

package_remove = "${PN}-dbg ${PN}-staticdev ${PN}-dev"

FILES_${PN} += "${sysconfdir}/pam.d/login"
