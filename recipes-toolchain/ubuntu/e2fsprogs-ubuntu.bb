inherit upkg_base

LICENSE = "LGPL-2.0 & GPL-2.0 & MIT-Style"
LICENSE_e2fsprogs = "GPL-2.0"
LICENSE_ss-dev = "MIT-Style"
LICENSE_libext2fs2 = "LGPL-2.0"
LICENSE_libext2fs-dev = "LGPL-2.0"
LICENSE_libss2 = "MIT-Style"
LICENSE_libcom-err2 = "GPL-2.0"
LICENSE_e2fslibs-dev = "GPL-2.0"
LICENSE_e2fslibs = "GPL-2.0"
LICENSE_e2fsck-static = "GPL-2.0"
LICENSE_comerr-dev = "GPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/comerr-dev_2.1-1.45.5-2ubuntu1_arm64.deb;name=comerr-dev"
SRC_URI[comerr-dev.md5sum] = "07d13943b9d24eae6a63f18cd55fc7ca"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/e/e2fsprogs/e2fsck-static_1.45.5-2ubuntu1_arm64.deb;name=e2fsck-static"
SRC_URI[e2fsck-static.md5sum] = "5ba2409bca41aa4fc8b10ad151df7a40"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/e2fslibs_1.45.5-2ubuntu1_arm64.deb;name=e2fslibs"
SRC_URI[e2fslibs.md5sum] = "7da81ce276af9e7c821f0b7870a4a490"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/e2fslibs-dev_1.45.5-2ubuntu1_all.deb;name=e2fslibs-dev"
SRC_URI[e2fslibs-dev.md5sum] = "a7b8256031895755c73c0a7aa9bf7eff"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/libcom-err2_1.45.5-2ubuntu1_arm64.deb;name=libcom-err2"
SRC_URI[libcom-err2.md5sum] = "aec59f841abdd13c97db2f6ef467434f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/libss2_1.45.5-2ubuntu1_arm64.deb;name=libss2"
SRC_URI[libss2.md5sum] = "68abe345cc8e5bbe7a65381e1b505112"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/libext2fs-dev_1.45.5-2ubuntu1_arm64.deb;name=libext2fs-dev"
SRC_URI[libext2fs-dev.md5sum] = "94593daa14863e87d01d75903e8d3f9e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/libext2fs2_1.45.5-2ubuntu1_arm64.deb;name=libext2fs2"
SRC_URI[libext2fs2.md5sum] = "06cfeaa9416b1a6a2c836c2ce908b5ff"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/ss-dev_2.0-1.45.5-2ubuntu1_arm64.deb;name=ss-dev"
SRC_URI[ss-dev.md5sum] = "cca9d41ae25045754d16a53ee99afbd0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/e/e2fsprogs/e2fsprogs_1.45.5-2ubuntu1_arm64.deb;name=e2fsprogs"
SRC_URI[e2fsprogs.md5sum] = "2caacd0a81cec14e622d3a0866418e31"

# other configs to feed compilation
PKG_${UPN} = "e2fsprogs"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc util-linux attr"
PROVIDES += "e2fsprogs "
