inherit upkg_base

LICENSE = "OpenLDAP"
LICENSE_libldap-2.4-2 = "OpenLDAP"
LICENSE_libldap2-dev = "OpenLDAP"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/openldap/libldap2-dev_2.4.49+dfsg-2ubuntu1_arm64.deb;name=libldap2-dev"
SRC_URI[libldap2-dev.md5sum] = "ed6b073e3f3ca1869f1b87f8e2ee11c1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/o/openldap/libldap-2.4-2_2.4.49+dfsg-2ubuntu1_arm64.deb;name=libldap-2.4-2"
SRC_URI[libldap-2.4-2.md5sum] = "bfb2e8e694c656d654b98656d6d2ecf3"

# other configs to feed compilation
PKG_${UPN} = "libldap-2.4-2"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc util-linux gnutls libgcrypt libtool"
PROVIDES += "openldap "

#dependency for ubuntu
DEPENDS += "cyrus-sasl heimdal"
