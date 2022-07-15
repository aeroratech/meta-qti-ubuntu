# config update-alternatives for e2fsprogs
require update-alternatives/e2fsprogs.inc

ALLOW_EMPTY_e2fsprogs = "1"
PACKAGES = "e2fsprogs-tools e2fsprogs"
PROVIDES = "e2fsprogs-tools e2fsprogs"
RPROVIDES_e2fsprogs-tools = "e2fsprogs-tools"
PKG_${PN}-tools = "e2fsprogs-tools"
PKGV_e2fsprogs-tools = "1.45.7"
PKGR_e2fsprogs-tools = "0"
FILES_e2fsprogs-tools = "${bindir} ${sbindir} ${base_bindir} ${base_sbindir}  /lib/*  /etc/* /lib/libe2p.so.2 /lib/libe2p.so"


FILESEXTRAPATHS_append := "${THISDIR}:${THISDIR}/e2fsprogs:"

SRC_URI += "file://0001-e2fsprogs-Support-the-stable_inodes-feature.patch"

IMAGE_DIR = "${WORKDIR}/image"
base_etcdir = "${IMAGE_DIR}/etc"

RDEPENDS_e2fsprogs_remove += "e2fsprogs-badblocks e2fsprogs-dumpe2fs"
RRECOMMENDS_e2fsprogs_remove += "e2fsprogs-mke2fs e2fsprogs-e2fsck"
RRECOMMENDS_e2fsprogs-dev_remove = "attr-dev"

FILES_e2fsprogs_remove = "${libdir}/lib*${SOLIBS} ${base_libdir}/*${SOLIBS} \
                              ${libdir}/${BPN}/* ${libdir}/bonobo/servers"

PACKAGES_remove = "${PN}-doc e2fsprogs-e2fsck e2fsprogs-mke2fs e2fsprogs-tune2fs e2fsprogs-badblocks e2fsprogs-resize2fs"

do_package_qa[noexec] = "1"