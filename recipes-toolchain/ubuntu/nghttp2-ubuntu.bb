inherit upkg_base

LICENSE = "MIT & BSD-2-clause & OFL-1.1"
LICENSE_libnghttp2-14 = "MIT & BSD-2-clause & OFL-1.1"
LICENSE_libnghttp2-dev = "MIT & BSD-2-clause & OFL-1.1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nghttp2/libnghttp2-dev_1.40.0-1build1_arm64.deb;name=libnghttp2-dev"
SRC_URI[libnghttp2-dev.md5sum] = "f04466d01b6fe4dad06962eec1cbe575"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/n/nghttp2/libnghttp2-14_1.40.0-1build1_arm64.deb;name=libnghttp2-14"
SRC_URI[libnghttp2-14.md5sum] = "485b152334f0fc07b8288027427781f4"

# other configs to feed compilation
PKG_${UPN} = "libnghttp2-14"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc c-ares cunit jansson libev libevent libxml2 openssl zlib "
PROVIDES += "nghttp2 "
