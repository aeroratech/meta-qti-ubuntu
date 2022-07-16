inherit upkg_base

LICENSE = "MIT"
LICENSE_wayland-protocols = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/w/wayland-protocols/wayland-protocols_1.20-1_all.deb;name=wayland-protocols"
SRC_URI[wayland-protocols.md5sum] = "c3187b9e195114969dbc56a46765ee6d"

# other configs to feed compilation
PKG_${UPN} = "wayland-protocols"
