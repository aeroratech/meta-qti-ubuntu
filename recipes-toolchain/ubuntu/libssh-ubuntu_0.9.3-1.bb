inherit upkg_base

LICENSE = "LGPL-2.1+-with-openssl-exception"
LICENSE_libssh-4 = "LGPL-2.1+-with-openssl-exception"
LICENSE_libssh-gcrypt-4 = "LGPL-2.1+-with-openssl-exception"
LICENSE_libssh-dev = "LGPL-2.1+-with-openssl-exception"
LICENSE_libssh-gcrypt-dev = "LGPL-2.1+-with-openssl-exception"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libssh/libssh-gcrypt-dev_0.9.3-2ubuntu2_arm64.deb;name=libssh-gcrypt-dev"
SRC_URI[libssh-gcrypt-dev.md5sum] = "96dbf6dedbf654edcbf9ff1966c71eb5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libssh/libssh-dev_0.9.3-2ubuntu2_arm64.deb;name=libssh-dev"
SRC_URI[libssh-dev.md5sum] = "7ef19d34ad999eb9d59e35aaf4378303"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libssh/libssh-gcrypt-4_0.9.3-2ubuntu2_arm64.deb;name=libssh-gcrypt-4"
SRC_URI[libssh-gcrypt-4.md5sum] = "84cdeb740715a8075335201a2cb6b01c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libs/libssh/libssh-4_0.9.3-2ubuntu2_arm64.deb;name=libssh-4"
SRC_URI[libssh-4.md5sum] = "8623cd32c731056539859089ab1fb683"

# other configs to feed compilation
PKG_${UPN} = "libssh-4"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc zlib openssl libgcrypt"
PROVIDES += "libssh "
