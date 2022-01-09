# config update-alternatives for e2fsprogs
#require update-alternatives/e2fsprogs.inc

FILESEXTRAPATHS_append := "${THISDIR}:${THISDIR}/e2fsprogs:"
SRC_URI += "file://0001-e2fsprogs-Support-the-stable_inodes-feature.patch"

IMAGE_DIR = "${WORKDIR}/image"
base_etcdir = "${IMAGE_DIR}/etc"

RDEPENDS_e2fsprogs_remove += "e2fsprogs-badblocks e2fsprogs-dumpe2fs"
RRECOMMENDS_e2fsprogs_remove += "e2fsprogs-mke2fs e2fsprogs-e2fsck"
RRECOMMENDS_e2fsprogs-dev_remove = "attr-dev"

#bash-dev libcomerr-dev libe2p-dev libss-dev update-alternatives-opkg-dev util-linux-dev"

FILES_e2fsprogs_remove = "${libdir}/lib*${SOLIBS} ${base_libdir}/*${SOLIBS} \
                              ${libdir}/${BPN}/* ${libdir}/bonobo/servers"

PACKAGES_remove = "${PN}-doc e2fsprogs-e2fsck e2fsprogs-mke2fs e2fsprogs-tune2fs e2fsprogs-badblocks e2fsprogs-resize2fs"
