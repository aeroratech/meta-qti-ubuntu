inherit upkg_base

LICENSE = "BSD-3-Clause & GPL-2.0 & more"
LICENSE_passwd = "BSD-3-Clause & GPL-2.0 & more"
LICENSE_login = "BSD-3-Clause & GPL-2.0 & more"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/shadow/login_4.8.1-1ubuntu5_arm64.deb;name=login"
SRC_URI[login.md5sum] = "5dec7dceae0785240d7b2af3d4b9689d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/s/shadow/passwd_4.8.1-1ubuntu5_arm64.deb;name=passwd"
SRC_URI[passwd.md5sum] = "645cac2cfac0779c733c00798cfd7829"

# other configs to feed compilation
PKG_${UPN} = "passwd"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc virtual/crypt attr audit libpam libselinux libsemanage"
PROVIDES += "shadow"
