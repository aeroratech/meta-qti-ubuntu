inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libilmbase24 = "BSD-3-clause"
LICENSE_libilmbase-dev = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/i/ilmbase/libilmbase-dev_2.3.0-6build1_arm64.deb;name=libilmbase-dev"
SRC_URI[libilmbase-dev.md5sum] = "11d8c5f0794b71d3556a3be742b4d655"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/i/ilmbase/libilmbase24_2.3.0-6build1_arm64.deb;name=libilmbase24"
SRC_URI[libilmbase24.md5sum] = "ac3000bf641b2d4d88462b09f4fce47e"

# other configs to feed compilation
PKG_${UPN} = "libilmbase24"
