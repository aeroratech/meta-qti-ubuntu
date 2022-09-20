inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libpcap0.8 = "BSD-3-Clause"
LICENSE_libpcap0.8-dev = "BSD-3-Clause"
LICENSE_libpcap-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpcap/libpcap-dev_1.9.1-3_arm64.deb;name=libpcap-dev"
SRC_URI[libpcap-dev.md5sum] = "8a070731c853bb7ebe87974e87825ff5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpcap/libpcap0.8-dev_1.9.1-3_arm64.deb;name=libpcap0.8-dev"
SRC_URI[libpcap0.8-dev.md5sum] = "4bdf7c132243b53acc926e508eb0bc36"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libp/libpcap/libpcap0.8_1.9.1-3_arm64.deb;name=libpcap0.8"
SRC_URI[libpcap0.8.md5sum] = "1eb6ac14424ba5e79bcc543da8df789c"

# other configs to feed compilation
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc"
PKG_${UPN} = "libpcap"
