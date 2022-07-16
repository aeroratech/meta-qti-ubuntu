inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_iso-codes = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/i/iso-codes/iso-codes_4.4-1_all.deb;name=iso-codes"
SRC_URI[iso-codes.md5sum] = "61b89768a199c297cd8f34da8415f7a5"

# other configs to feed compilation
PKG_${UPN} = "iso-codes"
DEPENDS += " "
PROVIDES += "iso-codes "
