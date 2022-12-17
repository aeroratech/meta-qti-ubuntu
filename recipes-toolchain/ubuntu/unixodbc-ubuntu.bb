inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libodbc1 = "LGPL-2.1+"
LICENSE_unixodbc-dev = "LGPL-2.1+"
LICENSE_odbcinst1debian2 = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/u/unixodbc/odbcinst1debian2_2.3.6-0.1build1_arm64.deb;name=odbcinst1debian2"
SRC_URI[odbcinst1debian2.md5sum] = "493790f406ebb87574981eb72013b0e5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/u/unixodbc/unixodbc-dev_2.3.6-0.1build1_arm64.deb;name=unixodbc-dev"
SRC_URI[unixodbc-dev.md5sum] = "940f68bffdaba5d290c926ae9100df03"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/u/unixodbc/libodbc1_2.3.6-0.1build1_arm64.deb;name=libodbc1"
SRC_URI[libodbc1.md5sum] = "47f80c13d9a1a66267fa678a3211f869"

# other configs to feed compilation
PKG_${UPN} = "libodbc1"

DEPENDS += "libltdl"
