inherit upkg_base

LICENSE = "BSD-4-clause & GPL-3.0+"
LICENSE_libsasl2-2 = "BSD-4-clause & GPL-3.0+"
LICENSE_libsasl2-modules = "BSD-4-clause & GPL-3.0+"
LICENSE_libsasl2-dev = "BSD-4-clause & GPL-3.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cyrus-sasl2/libsasl2-dev_2.1.27+dfsg-2_arm64.deb;name=libsasl2-dev"
SRC_URI[libsasl2-dev.md5sum] = "d3f2396ab22188c299d991591bf90952"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cyrus-sasl2/libsasl2-modules_2.1.27+dfsg-2_arm64.deb;name=libsasl2-modules"
SRC_URI[libsasl2-modules.md5sum] = "7fa9f417c0c9ceca7e1bacb5c887a465"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/cyrus-sasl2/libsasl2-2_2.1.27+dfsg-2_arm64.deb;name=libsasl2-2"
SRC_URI[libsasl2-2.md5sum] = "9b1c5813544e614d2c1fb01bcbd4e5e6"

# other configs to feed compilation
PKG_${UPN} = "libsasl2-2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc openssl db base-files shadow-sysroot shadow base-passwd"
PROVIDES += "cyrus-sasl "
