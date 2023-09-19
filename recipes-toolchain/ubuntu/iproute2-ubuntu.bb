inherit upkg_base

LICENSE = "GPL-2"
LICENSE_iproute2 = "GPL-2"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/i/iproute2/iproute2_5.5.0-1ubuntu1_arm64.deb;name=iproute2"
SRC_URI[iproute2.md5sum] = "263b17093c6885b58512c4e150bd8c01"

# other configs to feed compilation
PKG_${UPN} = "iproute2"
