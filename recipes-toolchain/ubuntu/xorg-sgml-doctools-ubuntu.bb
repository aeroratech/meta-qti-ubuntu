inherit upkg_base

LICENSE = "MIT & MIT-Style"
LICENSE_xorg-sgml-doctools = "MIT & MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorg-sgml-doctools/xorg-sgml-doctools_1.11-1_all.deb;name=xorg-sgml-doctools"
SRC_URI[xorg-sgml-doctools.md5sum] = "50af86828f27de21901ac305fcbcd97a"

# other configs to feed compilation
PKG_${UPN} = "xorg-sgml-doctools"
