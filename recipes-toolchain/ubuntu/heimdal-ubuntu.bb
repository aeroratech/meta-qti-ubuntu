inherit upkg_base

LICENSE = "BSD-3-Clause & GPL-2.0+"
LICENSE_libwind0-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libasn1-8-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libgssapi3-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libhcrypto4-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libheimbase1-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libheimntlm0-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libhx509-5-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libkrb5-26-heimdal = "BSD-3-Clause & GPL-2.0+"
LICENSE_libroken18-heimdal = "BSD-3-Clause & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libasn1-8-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libasn1-8-heimdal"
SRC_URI[libasn1-8-heimdal.md5sum] = "07f4c83d6678b912e01e38c1d7ea9ce7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libgssapi3-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libgssapi3-heimdal"
SRC_URI[libgssapi3-heimdal.md5sum] = "6d40f88e5311df112f598816205a6bed"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libhcrypto4-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libhcrypto4-heimdal"
SRC_URI[libhcrypto4-heimdal.md5sum] ="c1f6411f9e156821e8de2dbbc483299c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libheimbase1-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libheimbase1-heimdal"
SRC_URI[libheimbase1-heimdal.md5sum]="1e294462d0573c4008d202a0a2b0f911"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libheimntlm0-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libheimntlm0-heimdal"
SRC_URI[libheimntlm0-heimdal.md5sum]="02439220c549e7fcdba43b4ba7185d79"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libhx509-5-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libhx509-5-heimdal"
SRC_URI[libhx509-5-heimdal.md5sum]="612079627ce8dda6d33bf5d13bbeb4d2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libkrb5-26-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libkrb5-26-heimdal"
SRC_URI[libkrb5-26-heimdal.md5sum]="2c3afcd5993f81e9a9a244bb8dbd2f72"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libroken18-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libroken18-heimdal"
SRC_URI[libroken18-heimdal.md5sum]="423022faea620f33f65a69290f961eae"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/heimdal/libwind0-heimdal_7.7.0+dfsg-1ubuntu1_arm64.deb;name=libwind0-heimdal"
SRC_URI[libwind0-heimdal.md5sum]="9527f7eca32d10e4f194c82f3ee010ac"



# other configs to feed compilation
PKG_${UPN} = "heimdal"
PROVIDES += "heimdal"

DEPENDS += "sqlite3 libx11 libxau ncurses"
