#Copyright (c) 2022 Qualcomm Innovation Center, Inc. All rights reserved.
#SPDX-License-Identifier: BSD-3-Clause-Clear
#
# Base ubuntu package setting
#

# ANONYMOUS FUNCTION
python __anonymous (){
    d.setVar("DEBOUT", d.getVar('WORKDIR') + "/deb_out")
    usuffix = "-ubuntu"
    PNBK = d.getVar("PN")
    if PNBK.find(usuffix)  > 0:
        d.setVar("UPN", PNBK[:PNBK.find(usuffix)])
    else:
        bb.error ("%s: Wrong ubuntu recipe name." % UPN)
}

# RECIPE CONFIG
#PV = "0"
#PR = "0"

# PACKAGE CONFIG
UBUNTU_TARGET_ARCH = "aarch64-linux-gnu"
PROVIDES_prepend = "${UPN} "
PACKAGE_BEFORE_PN ?= ""
PACKAGES = "${UPN}-src ${UPN}-staticdev ${UPN}-dev ${UPN}-doc ${UPN}-locale ${PACKAGE_BEFORE_PN} ${UPN}"
PACKAGES_DYNAMIC = "^${UPN}-locale-.*"
FILES = ""

FILES_${UPN} = "${bindir}/* ${sbindir}/* ${libexecdir}/* ${libdir}/lib*${SOLIBS} \
            ${sysconfdir} ${sharedstatedir} ${localstatedir} \
            ${base_bindir}/* ${base_sbindir}/* \
            ${base_libdir}/*${SOLIBS} \
            ${base_prefix}/lib/udev ${prefix}/lib/udev \
            ${base_libdir}/udev ${libdir}/udev \
            ${datadir}/${BPN} ${libdir}/${BPN}/* \
            ${datadir}/pixmaps ${datadir}/applications \
            ${datadir}/idl ${datadir}/omf ${datadir}/sounds \
            ${libdir}/bonobo/servers \
            ${libdir}/${UBUNTU_TARGET_ARCH}/*"

FILES_${UPN}-bin = "${bindir}/* ${sbindir}/*"

FILES_${UPN}-doc = "${docdir} ${mandir} ${infodir} ${datadir}/gtk-doc \
            ${datadir}/gnome/help"
SECTION_${UPN}-doc = "doc"

FILES_SOLIBSDEV ?= "${base_libdir}/lib*${SOLIBSDEV} ${libdir}/lib*${SOLIBSDEV}"
FILES_${UPN}-dev = "${includedir} ${FILES_SOLIBSDEV} ${libdir}/*.la \
                ${libdir}/*.o ${libdir}/pkgconfig ${datadir}/pkgconfig \
                ${datadir}/aclocal ${base_libdir}/*.o \
                ${libdir}/${BPN}/*.la ${base_libdir}/*.la \
                ${libdir}/cmake ${datadir}/cmake"
SECTION_${UPN}-dev = "devel"
ALLOW_EMPTY_${UPN}-dev = "1"
RDEPENDS_${UPN}-dev = "${UPN} (= ${EXTENDPKGV})"

FILES_${UPN}-staticdev = "${libdir}/*.a ${base_libdir}/*.a ${libdir}/${BPN}/*.a"
SECTION_${UPN}-staticdev = "devel"
RDEPENDS_${UPN}-staticdev = "${UPN}-dev (= ${EXTENDPKGV})"

# TASK CONFIG
do_unpack[dirs] = "${DEBOUT}"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_prepare_recipe_sysroot[noexec] = "1"
do_populate_lic[noexec] = "1"
do_package_qa[noexec] = "1"

python do_unpack(){
    src_uri = (d.getVar('SRC_URI') or "").split()
    if len(src_uri) == 0:
        return

    try:
        fetcher = bb.fetch2.Fetch(src_uri, d)
        fetcher.unpack(d.getVar('DEBOUT'))
    except bb.fetch2.BBFetchException as e:
        bb.fatal(str(e))
}


do_install() {
    cp -r ${DEBOUT}/* ${D}/
}


