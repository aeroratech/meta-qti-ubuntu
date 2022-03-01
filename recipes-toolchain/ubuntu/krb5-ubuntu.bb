inherit upkg_base

LICENSE = "MIT & BSD-3-Clause & more"
LICENSE_libkrb5support0 = "MIT & BSD-3-Clause & more"
LICENSE_libkrb5-3 = "MIT & BSD-3-Clause & more"
LICENSE_libgssapi-krb5-2 = "MIT & BSD-3-Clause & more"
LICENSE_libkrb5-dev = "MIT & BSD-3-Clause & more"
LICENSE_krb5-multidev = "MIT & BSD-3-Clause & more"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/krb5/krb5-multidev_1.17-6ubuntu4_arm64.deb;name=krb5-multidev"
SRC_URI[krb5-multidev.md5sum] = "ed3a452a28d6beee5cd619a1fc16add5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/krb5/libkrb5-dev_1.17-6ubuntu4_arm64.deb;name=libkrb5-dev"
SRC_URI[libkrb5-dev.md5sum] = "e2d792a23833ef8d16ce9044253088bb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/krb5/libgssapi-krb5-2_1.17-6ubuntu4_arm64.deb;name=libgssapi-krb5-2"
SRC_URI[libgssapi-krb5-2.md5sum] = "89974c47de698deaaf6c78d0d66a9757"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/krb5/libkrb5-3_1.17-6ubuntu4_arm64.deb;name=libkrb5-3"
SRC_URI[libkrb5-3.md5sum] = "2bd8c06e3ee2e229f601d345fc830bdb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/krb5/libkrb5support0_1.17-6ubuntu4_arm64.deb;name=libkrb5support0"
SRC_URI[libkrb5support0.md5sum] = "bf3cc4a52fca46d2b0fbc2e47cdd9373"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/k/krb5/libk5crypto3_1.17-6ubuntu4_arm64.deb;name=libk5crypto3"
SRC_URI[libk5crypto3.md5sum] = "6318718f89cbcf1000d63bf3002d4a00"

# other configs to feed compilation
PKG_${UPN} = "libkrb5support0"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc ncurses util-linux e2fsprogs openssl"

#Dependcy for ubuntu
DEPENDS += "keyutils"

PROVIDES += "krb5 "
