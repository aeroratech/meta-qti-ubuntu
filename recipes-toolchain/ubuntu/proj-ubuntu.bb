inherit upkg_base

LICENSE = "Expat"
LICENSE_libproj15 = "Expat"
LICENSE_libproj-dev = "Expat"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/proj/libproj-dev_6.3.1-1_arm64.deb;name=libproj-dev"
SRC_URI[libproj-dev.md5sum] = "0db6484761e206e7ce804495e9e59059"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/proj/libproj15_6.3.1-1_arm64.deb;name=libproj15"
SRC_URI[libproj15.md5sum] = "d6cdaf625395fc4695ffd91e33aadb3f"

# other configs to feed compilation
PKG_${UPN} = "libproj15"
