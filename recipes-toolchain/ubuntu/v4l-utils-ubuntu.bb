inherit upkg_base

LICENSE = "GPL-2 & LGPL-2.1+"
LICENSE_v4l-utils = "GPL-2 & LGPL-2.1+"
LICENSE_ir-keytable = "GPL-2 & LGPL-2.1+"
LICENSE_qv4l2 = "GPL-2 & LGPL-2.1+"
LICENSE_dvb-tools = "GPL-2 & LGPL-2.1+"
LICENSE_libdvbv5-dev = "GPL-2 & LGPL-2.1+"
LICENSE_libdvbv5-0 = "GPL-2 & LGPL-2.1+"
LICENSE_libv4l-dev = "GPL-2 & LGPL-2.1+"
LICENSE_libv4l2rds0 = "GPL-2 & LGPL-2.1+"
LICENSE_libv4lconvert0 = "GPL-2 & LGPL-2.1+"
LICENSE_libv4l-0 = "GPL-2 & LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/v/v4l-utils/libv4l-0_1.18.0-2build1_arm64.deb;name=libv4l-0"
SRC_URI[libv4l-0.md5sum] = "2d8698b7a17a965690c8e43f878e39ed"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/v/v4l-utils/libv4lconvert0_1.18.0-2build1_arm64.deb;name=libv4lconvert0"
SRC_URI[libv4lconvert0.md5sum] = "6d1ca6876fad576fba6108ce633c2026"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/v/v4l-utils/libv4l2rds0_1.18.0-2build1_arm64.deb;name=libv4l2rds0"
SRC_URI[libv4l2rds0.md5sum] = "806004f0dfede879fbb24b1854b64172"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/v/v4l-utils/libv4l-dev_1.18.0-2build1_arm64.deb;name=libv4l-dev"
SRC_URI[libv4l-dev.md5sum] = "39355840b3a447663de308aeb6e58dad"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/v/v4l-utils/libdvbv5-0_1.18.0-2build1_arm64.deb;name=libdvbv5-0"
SRC_URI[libdvbv5-0.md5sum] = "c80edaf19a1c4e820461f49c232efb34"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/v/v4l-utils/libdvbv5-dev_1.18.0-2build1_arm64.deb;name=libdvbv5-dev"
SRC_URI[libdvbv5-dev.md5sum] = "113dfeac3cd514b05494104082422a26"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/v/v4l-utils/dvb-tools_1.18.0-2build1_arm64.deb;name=dvb-tools"
SRC_URI[dvb-tools.md5sum] = "60649574a87a5d324efd790a631160f0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/v/v4l-utils/qv4l2_1.18.0-2build1_arm64.deb;name=qv4l2"
SRC_URI[qv4l2.md5sum] = "93f1041ddb0d6e8f98dc6028a1c283c0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/v/v4l-utils/ir-keytable_1.18.0-2build1_arm64.deb;name=ir-keytable"
SRC_URI[ir-keytable.md5sum] = "0c7c9af8bcf698fba61a3a8f7d5e090f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/v/v4l-utils/v4l-utils_1.18.0-2build1_arm64.deb;name=v4l-utils"
SRC_URI[v4l-utils.md5sum] = "9d30c29f93c7a531640b06ada9f8b4e6"

# other configs to feed compilation
PKG_${UPN} = "v4l-utils"

PROVIDES += "media-ctl ir-keytable rc-keymaps libv4l libv4l-dev"
