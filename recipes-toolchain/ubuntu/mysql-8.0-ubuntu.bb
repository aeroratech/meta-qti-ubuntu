inherit upkg_base

LICENSE = "Universal FOSS Exception, Version 1.0 & GPL-2.0"
LICENSE_libmysqlclient-dev = "Universal FOSS Exception, Version 1.0 & GPL-2.0"
LICENSE_libmysqlclient21 = "Universal FOSS Exception, Version 1.0 & GPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/m/mysql-8.0/libmysqlclient21_8.0.19-0ubuntu5_arm64.deb;name=libmysqlclient21"
SRC_URI[libmysqlclient21.md5sum] = "8105c5004b7ae4bd07fd5e89c51507e9"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/m/mysql-8.0/libmysqlclient-dev_8.0.19-0ubuntu5_arm64.deb;name=libmysqlclient-dev"
SRC_URI[libmysqlclient-dev.md5sum] = "9fa1e06c36876ea2e5e43bd25f716744"

# other configs to feed compilation
PKG_${UPN} = "libmysqlclient-dev"

DEPENDS += "zlib libgcc openssl"
