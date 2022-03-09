inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxext6 = "MIT-Style"
LICENSE_libxext6-dbg = "MIT-Style"
LICENSE_libxext-dev = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxext/libxext-dev_1.3.4-0ubuntu1_arm64.deb;name=libxext-dev"
SRC_URI[libxext-dev.md5sum] = "bab998d667bcfa394dabdf6b5caddc1a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxext/libxext6-dbg_1.3.4-0ubuntu1_arm64.deb;name=libxext6-dbg"
SRC_URI[libxext6-dbg.md5sum] = "e581eb284f6ba3dccbc8d933dd7698d5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxext/libxext6_1.3.4-0ubuntu1_arm64.deb;name=libxext6"
SRC_URI[libxext6.md5sum] = "300f94cc48e2bef0c26682031a354e97"

# other configs to feed compilation
PKG_${UPN} = "libxext6"
