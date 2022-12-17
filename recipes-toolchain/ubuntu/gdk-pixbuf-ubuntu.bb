inherit upkg_base

LICENSE = "LGPL-2.0+ & GPL-2.0+"
LICENSE_libgdk-pixbuf2.0-0 = "LGPL-2.0+ & GPL-2.0+"
LICENSE_gir1.2-gdkpixbuf-2.0 = "LGPL-2.0+ & GPL-2.0+"
LICENSE_libgdk-pixbuf2.0-doc = "LGPL-2.0+ & GPL-2.0+"
LICENSE_libgdk-pixbuf2.0-dev = "LGPL-2.0+ & GPL-2.0+"
LICENSE_libgdk-pixbuf2.0-common = "LGPL-2.0+ & GPL-2.0+"
LICENSE_libgdk-pixbuf2.0-bin = "LGPL-2.0+ & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gdk-pixbuf/libgdk-pixbuf2.0-bin_2.40.0+dfsg-3_arm64.deb;name=libgdk-pixbuf2.0-bin"
SRC_URI[libgdk-pixbuf2.0-bin.md5sum] = "b5ca1579f96d182140387f4fb8b5d064"

#SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gdk-pixbuf/libgdk-pixbuf2.0-common_2.40.0+dfsg-3ubuntu0.2_all.deb;name=libgdk-pixbuf2.0-common"
#SRC_URI[libgdk-pixbuf2.0-common.md5sum] = "security.ubuntu.com"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gdk-pixbuf/libgdk-pixbuf2.0-dev_2.40.0+dfsg-3_arm64.deb;name=libgdk-pixbuf2.0-dev"
SRC_URI[libgdk-pixbuf2.0-dev.md5sum] = "cf1900702db06372adbc044e4afee0b4"

#SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gdk-pixbuf/libgdk-pixbuf2.0-doc_2.40.0+dfsg-3ubuntu0.2_all.deb;name=libgdk-pixbuf2.0-doc"
#SRC_URI[libgdk-pixbuf2.0-doc.md5sum] = "security.ubuntu.com"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gdk-pixbuf/gir1.2-gdkpixbuf-2.0_2.40.0+dfsg-3_arm64.deb;name=gir1.2-gdkpixbuf-2.0"
SRC_URI[gir1.2-gdkpixbuf-2.0.md5sum] = "06d315b019127625e8c8cfc89b529400"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gdk-pixbuf/libgdk-pixbuf2.0-0_2.40.0+dfsg-3_arm64.deb;name=libgdk-pixbuf2.0-0"
SRC_URI[libgdk-pixbuf2.0-0.md5sum] = "7b76e401725983ce498514e4d83698ef"

# other configs to feed compilation
PKG_${UPN} = "libgdk-pixbuf2.0-0"

DEPENDS += "glib-2.0 libpng  libxcursor libx11 libxinerama libxrandr libxcomposite libxdamage"
