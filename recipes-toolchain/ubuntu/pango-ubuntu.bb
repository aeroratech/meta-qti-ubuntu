inherit upkg_base

LICENSE = "LGPL-2.0+"
LICENSE_gir1.2-pango-1.0 = "LGPL-2.0+"
LICENSE_libpango1.0-dev = "LGPL-2.0+"
LICENSE_libpangoft2-1.0-0 = "LGPL-2.0+"
LICENSE_libpangoxft-1.0-0 = "LGPL-2.0+"
LICENSE_libpangocairo-1.0-0 = "LGPL-2.0+"
LICENSE_libpango-1.0-0 = "LGPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pango1.0/libpango-1.0-0_1.44.7-2ubuntu4_arm64.deb;name=libpango-1.0-0"
SRC_URI[libpango-1.0-0.md5sum] = "02196c3ff090cb5c2df93e35e82f6a10"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pango1.0/libpangocairo-1.0-0_1.44.7-2ubuntu4_arm64.deb;name=libpangocairo-1.0-0"
SRC_URI[libpangocairo-1.0-0.md5sum] = "01b15a11930a464d7b62ec349533af0d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pango1.0/libpangoxft-1.0-0_1.44.7-2ubuntu4_arm64.deb;name=libpangoxft-1.0-0"
SRC_URI[libpangoxft-1.0-0.md5sum] = "a0a4abe52e40a016e5a04b98d1d77064"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pango1.0/libpangoft2-1.0-0_1.44.7-2ubuntu4_arm64.deb;name=libpangoft2-1.0-0"
SRC_URI[libpangoft2-1.0-0.md5sum] = "0430dd6ba2143c99760d80966720119f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pango1.0/libpango1.0-dev_1.44.7-2ubuntu4_arm64.deb;name=libpango1.0-dev"
SRC_URI[libpango1.0-dev.md5sum] = "e9bcb5013ba5beac73c9ce9e7607b3c0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/pango1.0/gir1.2-pango-1.0_1.44.7-2ubuntu4_arm64.deb;name=gir1.2-pango-1.0"
SRC_URI[gir1.2-pango-1.0.md5sum] = "40a0456736b5d94202adc975e33202e8"

# other configs to feed compilation
PKG_${UPN} = "libpango-1.0-0"

DEPENDS += "fontconfig cairo freetype glib-2.0 fribidi harfbuzz libx11 libthai xft libxrender"
