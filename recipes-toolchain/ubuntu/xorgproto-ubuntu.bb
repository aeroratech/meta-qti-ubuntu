inherit upkg_base

LICENSE = "MIT & SGI-B-2.0"
LICENSE_x11proto-xinerama-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-xf86vidmode-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-xf86dri-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-xf86dga-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-xf86bigfont-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-xext-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-xcmisc-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-video-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-scrnsaver-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-resource-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-render-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-record-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-randr-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-present-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-kb-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-input-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-gl-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-fonts-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-fixes-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-dri3-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-dri2-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-dmx-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-damage-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-core-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-composite-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-bigreqs-dev = "MIT & SGI-B-2.0"
LICENSE_x11proto-dev = "MIT & SGI-B-2.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-dev_2019.2-1ubuntu1_all.deb;name=x11proto-dev"
SRC_URI[x11proto-dev.md5sum] = "14c605004f0a3597dc21fa10bfe4e129"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-bigreqs-dev_2019.2-1ubuntu1_all.deb;name=x11proto-bigreqs-dev"
SRC_URI[x11proto-bigreqs-dev.md5sum] = "1688c5443f303327bb1c5c60f947f97b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-composite-dev_2019.2-1ubuntu1_all.deb;name=x11proto-composite-dev"
SRC_URI[x11proto-composite-dev.md5sum] = "eaf6aa58ebfc3ca70ccce6300b944bee"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-core-dev_2019.2-1ubuntu1_all.deb;name=x11proto-core-dev"
SRC_URI[x11proto-core-dev.md5sum] = "c87f05bce99517e1b3e0fd24dcedf636"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-damage-dev_2019.2-1ubuntu1_all.deb;name=x11proto-damage-dev"
SRC_URI[x11proto-damage-dev.md5sum] = "23b98b6b3498aa2d8a11ad8b0d9472fb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-dmx-dev_2019.2-1ubuntu1_all.deb;name=x11proto-dmx-dev"
SRC_URI[x11proto-dmx-dev.md5sum] = "aac1c05f8cc64be919047061f0f75c69"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-dri2-dev_2019.2-1ubuntu1_all.deb;name=x11proto-dri2-dev"
SRC_URI[x11proto-dri2-dev.md5sum] = "a6268f40563b0feb040d5d125e6ae005"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-dri3-dev_2019.2-1ubuntu1_all.deb;name=x11proto-dri3-dev"
SRC_URI[x11proto-dri3-dev.md5sum] = "db3ed80f50062592e0bd9a921f844059"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-fixes-dev_2019.2-1ubuntu1_all.deb;name=x11proto-fixes-dev"
SRC_URI[x11proto-fixes-dev.md5sum] = "40d777f2bc6b32b7ba1727104b409890"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-fonts-dev_2019.2-1ubuntu1_all.deb;name=x11proto-fonts-dev"
SRC_URI[x11proto-fonts-dev.md5sum] = "58ca4e95157bdeab2a739b68f66b9c7f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-gl-dev_2019.2-1ubuntu1_all.deb;name=x11proto-gl-dev"
SRC_URI[x11proto-gl-dev.md5sum] = "776cea69e2bd20c74d04ae12edf85e96"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-input-dev_2019.2-1ubuntu1_all.deb;name=x11proto-input-dev"
SRC_URI[x11proto-input-dev.md5sum] = "e858ef5791ce3fee51f249710376640b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-kb-dev_2019.2-1ubuntu1_all.deb;name=x11proto-kb-dev"
SRC_URI[x11proto-kb-dev.md5sum] = "b90557cfa3bfe3d24b62f0de5af9b8e6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-present-dev_2019.2-1ubuntu1_all.deb;name=x11proto-present-dev"
SRC_URI[x11proto-present-dev.md5sum] = "9a75deaf7b4709489a0d0d00498dbdf1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-randr-dev_2019.2-1ubuntu1_all.deb;name=x11proto-randr-dev"
SRC_URI[x11proto-randr-dev.md5sum] = "d37307a232e760d47a898e2c1ad68312"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-record-dev_2019.2-1ubuntu1_all.deb;name=x11proto-record-dev"
SRC_URI[x11proto-record-dev.md5sum] = "66726b5642d90b2fb11b4911f3dc6ee2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-render-dev_2019.2-1ubuntu1_all.deb;name=x11proto-render-dev"
SRC_URI[x11proto-render-dev.md5sum] = "fc1b61167f53f199ca6db8129ebf8b67"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-resource-dev_2019.2-1ubuntu1_all.deb;name=x11proto-resource-dev"
SRC_URI[x11proto-resource-dev.md5sum] = "896bffb27eb09d406309919262e17bb2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-scrnsaver-dev_2019.2-1ubuntu1_all.deb;name=x11proto-scrnsaver-dev"
SRC_URI[x11proto-scrnsaver-dev.md5sum] = "677ebc6b5bf8e9bbed6eecc09d27ba63"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-video-dev_2019.2-1ubuntu1_all.deb;name=x11proto-video-dev"
SRC_URI[x11proto-video-dev.md5sum] = "3bf99e020b8cf2d91a60bcd6814b42e6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-xcmisc-dev_2019.2-1ubuntu1_all.deb;name=x11proto-xcmisc-dev"
SRC_URI[x11proto-xcmisc-dev.md5sum] = "afe35fd3ef7cfbdf7e8245b0021efecb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-xext-dev_2019.2-1ubuntu1_all.deb;name=x11proto-xext-dev"
SRC_URI[x11proto-xext-dev.md5sum] = "fd2611ca31614de934ba06cbace43962"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-xf86bigfont-dev_2019.2-1ubuntu1_all.deb;name=x11proto-xf86bigfont-dev"
SRC_URI[x11proto-xf86bigfont-dev.md5sum] = "2e1b97258ad94d58e8ee9ce4c27dfaba"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-xf86dga-dev_2019.2-1ubuntu1_all.deb;name=x11proto-xf86dga-dev"
SRC_URI[x11proto-xf86dga-dev.md5sum] = "7f2a478a3614c90b9435fd36899c21a7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-xf86dri-dev_2019.2-1ubuntu1_all.deb;name=x11proto-xf86dri-dev"
SRC_URI[x11proto-xf86dri-dev.md5sum] = "620162b00dc3eea61e116b2aac63babc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-xf86vidmode-dev_2019.2-1ubuntu1_all.deb;name=x11proto-xf86vidmode-dev"
SRC_URI[x11proto-xf86vidmode-dev.md5sum] = "868231057df6ecbb6478e40b3d3489fb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/x/xorgproto/x11proto-xinerama-dev_2019.2-1ubuntu1_all.deb;name=x11proto-xinerama-dev"
SRC_URI[x11proto-xinerama-dev.md5sum] = "0df6b2e48eb1ed7cb79d640e61997064"

# other configs to feed compilation
PKG_${UPN} = "x11proto-xinerama-dev"

DEPENDS += "xorg-sgml-doctools"
