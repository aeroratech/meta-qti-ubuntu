inherit upkg_base

LICENSE = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-3-200 = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-cli-3-200 = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-utils = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-genl-3-200 = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-idiag-3-200 = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-nf-3-200 = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-route-3-200 = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-xfrm-3-200 = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-3-dev = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-cli-3-dev = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-genl-3-dev = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-idiag-3-dev = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-nf-3-dev = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-route-3-dev = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"
LICENSE_libnl-xfrm-3-dev = "GPL-2.0 & LGPL-2.1 & BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-xfrm-3-dev_3.4.0-1_arm64.deb;name=libnl-xfrm-3-dev"
SRC_URI[libnl-xfrm-3-dev.md5sum] = "c1ab891faae23a23ce22b2c8f0cf3046"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-route-3-dev_3.4.0-1_arm64.deb;name=libnl-route-3-dev"
SRC_URI[libnl-route-3-dev.md5sum] = "60c1f0f9a6c8861120465cdb38d7911d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-nf-3-dev_3.4.0-1_arm64.deb;name=libnl-nf-3-dev"
SRC_URI[libnl-nf-3-dev.md5sum] = "fd9dbd700b6289091d6489ffd840ebcd"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-idiag-3-dev_3.4.0-1_arm64.deb;name=libnl-idiag-3-dev"
SRC_URI[libnl-idiag-3-dev.md5sum] = "81de1149bf8bafc5e07106a4b384c288"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-genl-3-dev_3.4.0-1_arm64.deb;name=libnl-genl-3-dev"
SRC_URI[libnl-genl-3-dev.md5sum] = "8150926fd7b82fdcc9232e85af2f3c9a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-cli-3-dev_3.4.0-1_arm64.deb;name=libnl-cli-3-dev"
SRC_URI[libnl-cli-3-dev.md5sum] = "da2475297d2e875a12fc72a57329b8f0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-3-dev_3.4.0-1_arm64.deb;name=libnl-3-dev"
SRC_URI[libnl-3-dev.md5sum] = "365309a5e05c429c70f9b03cc359b99e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-xfrm-3-200_3.4.0-1_arm64.deb;name=libnl-xfrm-3-200"
SRC_URI[libnl-xfrm-3-200.md5sum] = "3863e1f0bad67f6d32dd259559dd5495"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-route-3-200_3.4.0-1_arm64.deb;name=libnl-route-3-200"
SRC_URI[libnl-route-3-200.md5sum] = "0d20116656fc6fe161d4b81a4641aa60"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-nf-3-200_3.4.0-1_arm64.deb;name=libnl-nf-3-200"
SRC_URI[libnl-nf-3-200.md5sum] = "2f06ed8de653aabd98f45ca01ac20462"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-idiag-3-200_3.4.0-1_arm64.deb;name=libnl-idiag-3-200"
SRC_URI[libnl-idiag-3-200.md5sum] = "9abb286856e005722634e05a09862a20"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-genl-3-200_3.4.0-1_arm64.deb;name=libnl-genl-3-200"
SRC_URI[libnl-genl-3-200.md5sum] = "88283cf761b4d25ede27c25d5a3968ec"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/libn/libnl3/libnl-utils_3.4.0-1_arm64.deb;name=libnl-utils"
SRC_URI[libnl-utils.md5sum] = "e37d77a309b85da1d67d309667a645f3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-cli-3-200_3.4.0-1_arm64.deb;name=libnl-cli-3-200"
SRC_URI[libnl-cli-3-200.md5sum] = "1aa878d2444357a687ec022a61ccadb8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libn/libnl3/libnl-3-200_3.4.0-1_arm64.deb;name=libnl-3-200"
SRC_URI[libnl-3-200.md5sum] = "f714ea0df4d60d649c1ad90763b3279e"

# other configs to feed compilation
PKG_${UPN} = "libnl-3-200"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
PROVIDES += "libnl "
