inherit upkg_base

LICENSE = "OpenSSL & SSLeay"
LICENSE_libssl1.1 = "OpenSSL & SSLeay"
LICENSE_libssl-dev = "OpenSSL & SSLeay"
LICENSE_openssl = "OpenSSL & SSLeay"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/openssl/openssl_1.1.1f-1ubuntu2_arm64.deb;name=openssl"
SRC_URI[openssl.md5sum] = "85c91bb06e8d96a8484245e24d47402a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/openssl/libssl-dev_1.1.1f-1ubuntu2_arm64.deb;name=libssl-dev"
SRC_URI[libssl-dev.md5sum] = "d695f6e53803f913e8d356dd6b49e2f3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/openssl/libssl1.1_1.1.1f-1ubuntu2_arm64.deb;name=libssl1.1"
SRC_URI[libssl1.1.md5sum] = "a038507108a3e8ee50853fedc2706c89"

# other configs to feed compilation
PKG_${UPN} = "openssl"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-oe-linux-compilerlibs virtual/libc"
PROVIDES += "openssl "
RPROVIDES_openssl += "openssl-bin"
