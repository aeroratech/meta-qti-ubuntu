# config update-alternatives for e2fsprogs
require update-alternatives/e2fsprogs.inc

FILESEXTRAPATHS_append := "${THISDIR}:${THISDIR}/e2fsprogs:"
SRC_URI += "file://0001-e2fsprogs-Support-the-stable_inodes-feature.patch"

IMAGE_DIR = "${WORKDIR}/image"
base_etcdir = "${IMAGE_DIR}/etc"

do_install_append () {
install -d ${IMAGE_DIR}/lib/aarch64-linux-gnu/

    cp ${IMAGE_DIR}/lib/libcom_err.so.2.1 ${IMAGE_DIR}${base_libdir}/aarch64-linux-gnu/
    cp ${IMAGE_DIR}/lib/libe2p.so.2.3 ${IMAGE_DIR}${base_libdir}/aarch64-linux-gnu/
    cp ${IMAGE_DIR}/lib/libext2fs.so.2.4 ${IMAGE_DIR}${base_libdir}/aarch64-linux-gnu/
    cp ${IMAGE_DIR}/lib/libss.so.2.0 ${IMAGE_DIR}${base_libdir}/aarch64-linux-gnu/

    ln -sf libcom_err.so.2.1 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libcom_err.so.2
    ln -sf libcom_err.so.2 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libcom_err.so
    ln -sf libe2p.so.2.3 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libe2p.so.2
    ln -sf libe2p.so.2 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libe2p.so
    ln -sf libext2fs.so.2.4 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libext2fs.so.2
    ln -sf libext2fs.so.2 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libext2fs.so
    ln -sf libss.so.2.0 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libss.so.2
    ln -sf libss.so.2 ${IMAGE_DIR}/lib/aarch64-linux-gnu/libss.so

# e2initrd_helper and the pkgconfig files belong in libdir
    if [ ! ${D}${libdir} -ef ${D}${base_libdir} ]; then
        install -d ${D}${libdir}/aarch64-linux-gnu/
        cp -rf ${D}${libdir}/e2initrd_helper ${D}${libdir}/aarch64-linux-gnu/e2initrd_helper
        cp -rf ${D}${libdir}/pkgconfig ${D}${libdir}/aarch64-linux-gnu/pkgconfig
    fi

    mv ${D}${base_bindir}/chattr.e2fsprogs ${D}${bindir}/chattr
}

do_install_append_class-target() {
    mv ${D}${base_sbindir}/mke2fs.e2fsprogs ${D}${base_sbindir}/mke2fs
    mv ${D}${base_sbindir}/mkfs.ext2.e2fsprogs ${D}${base_sbindir}/mkfs.ext2
    mv ${D}${base_sbindir}/tune2fs.e2fsprogs ${D}${base_sbindir}/tune2fs
}

RDEPENDS_e2fsprogs_remove = "e2fsprogs-badblocks"
RRECOMMENDS_e2fsprogs_remove = "e2fsprogs-mke2fs e2fsprogs-e2fsck"

FILES_e2fsprogs_remove = "${libdir}/lib*${SOLIBS} ${base_libdir}/*${SOLIBS} \
                              ${libdir}/${BPN}/* ${libdir}/bonobo/servers"

PACKAGES_remove = "${PN}-doc e2fsprogs-e2fsck e2fsprogs-mke2fs e2fsprogs-tune2fs e2fsprogs-badblocks e2fsprogs-resize2fs"

FILES_libcomerr = "${base_libdir}/aarch64-linux-gnu/libcom_err.so.* \
                   ${libdir}/aarch64-linux-gnu/pkgconfig/com_err.pc "
FILES_libss = "${base_libdir}/aarch64-linux-gnu/libss.so.* \
                   ${libdir}/aarch64-linux-gnu/pkgconfig/ss.pc"
FILES_libe2p = "${base_libdir}/aarch64-linux-gnu/libe2p.so.* \
                   ${libdir}/aarch64-linux-gnu/pkgconfig/e2p.pc"
FILES_libext2fs = "${base_libdir}/aarch64-linux-gnu/libext2fs.so.* \
                   ${libdir}/aarch64-linux-gnu/pkgconfig/ext2fs.pc"

