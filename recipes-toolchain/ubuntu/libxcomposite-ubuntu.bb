inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxcomposite-dev = "MIT-Style"
LICENSE_libxcomposite1 = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcomposite/libxcomposite1_0.4.5-1_arm64.deb;name=libxcomposite1"
SRC_URI[libxcomposite1.md5sum] = "070d44b640cf1416d70a41bc8dd7a4d1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcomposite/libxcomposite-dev_0.4.5-1_arm64.deb;name=libxcomposite-dev"
SRC_URI[libxcomposite-dev.md5sum] = "eb1dcba7eed00d0e557214ae74baaaf9"

# other configs to feed compilation
PKG_${UPN} = "libxcomposite-dev"

DEPENDS += "libx11 libxfixes libxext xorgproto"
