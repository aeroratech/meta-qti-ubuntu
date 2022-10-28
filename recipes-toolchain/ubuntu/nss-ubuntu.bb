inherit upkg_base

LICENSE = "MPL-2.0"
LICENSE_libnss3 = "MPL-2.0"
LICENSE_libnss3-dev = "MPL-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nss/libnss3-dev_3.49.1-1ubuntu1_arm64.deb;name=libnss3-dev"
SRC_URI[libnss3-dev.md5sum] = "69dfb0a5024e9349c967a155e4d0d220"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nss/libnss3_3.49.1-1ubuntu1_arm64.deb;name=libnss3"
SRC_URI[libnss3.md5sum] = "d8249e4f338137303519b1d68d5c121f"

# other configs to feed compilation
PKG_${UPN} = "libnss3"

DEPENDS += "nspr sqlite3"
