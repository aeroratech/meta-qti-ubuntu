LICENSE = "BSD-3-clause-clear"

inherit pkgconfig

export base_optdir = "${base_prefix}/opt"

DEPENDS += "ubuntu-toolchain"

create_the_links() {
    sed -i 's/LABEL="persistent_storage_end"/# block\/bootdevice\/by-name links'"\n"'LABEL="persistent_storage_end"/g' \
        ${D}/lib/udev/rules.d/60-persistent-storage.rules
    sed -i 's/LABEL="persistent_storage_end"/ENV{ID_PART_ENTRY_SCHEME}=="gpt", ENV{ID_PART_ENTRY_NAME}=="?*", SYMLINK+="block\/bootdevice\/by-name\/$env{ID_PART_ENTRY_NAME}"'"\n\n"'LABEL="persistent_storage_end"/g' \
        ${D}/lib/udev/rules.d/60-persistent-storage.rules
}

do_install() {
    install -d ${D}/lib/udev/rules.d
    install -d ${D}/opt/qti/update-alternatives

    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/lib/udev/rules.d/60-persistent-storage.rules  ${D}/lib/udev/rules.d
    touch ${D}/opt/qti/update-alternatives/qti-ubuntu-udev.conf

    echo "/lib/udev/rules.d/60-persistent-v4l.rules" >> ${D}/opt/qti/update-alternatives/qti-ubuntu-udev.conf
    echo "/lib/udev/v4l_id" >> ${D}/opt/qti/update-alternatives/qti-ubuntu-udev.conf

    # Go to persistent-storage.rules and create bootdevice/by-name symlinks
    create_the_links
}

package_remove = "${PN}-dbg ${PN}-staticdev ${PN}-dev"

FILES_${PN} += "${libdir}/udev/rules.d/60-persistent-storage.rules \
                ${base_optdir}/qti/update-alternatives/qti-ubuntu-udev.conf"
