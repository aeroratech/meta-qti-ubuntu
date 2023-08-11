inherit upkg_base

LICENSE = "GPL-2.0+"
LICENSE_pkg-config = "GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pkg-config/pkg-config_0.29.1-0ubuntu4_arm64.deb;name=pkg-config"
SRC_URI[pkg-config.md5sum] = "fd74e9ad3365935fa06c19d0a3e8bb5a"

# other configs to feed compilation
PKG_${UPN} = "pkg-config"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  glib-2.0"
PACKAGES += "pkg-config \
"

PROVIDES += "pkgconfig"
RPROVIDES_${PN} += "pkgconfig"

ALLOW_EMPTY_pkgconfig = "1"
ALLOW_EMPTY_pkg-config = "1"
PKGV_pkg-config = "0.29.1"
