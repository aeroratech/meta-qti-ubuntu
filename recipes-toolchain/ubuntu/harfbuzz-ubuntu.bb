inherit upkg_base

LICENSE = "MIT"
LICENSE_libharfbuzz-dev = "MIT"
LICENSE_libharfbuzz0b = "MIT"
LICENSE_libharfbuzz-icu0 = "MIT"
LICENSE_libharfbuzz-gobject0 = "MIT"
LICENSE_gir1.2-harfbuzz-0.0 = "MIT"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/harfbuzz/gir1.2-harfbuzz-0.0_2.6.4-1ubuntu4_arm64.deb;name=gir1.2-harfbuzz-0.0"
SRC_URI[gir1.2-harfbuzz-0.0.md5sum] = "3c08d7266e3b0624d205ec6535838150"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/harfbuzz/libharfbuzz-gobject0_2.6.4-1ubuntu4_arm64.deb;name=libharfbuzz-gobject0"
SRC_URI[libharfbuzz-gobject0.md5sum] = "2ea80a78fa42b7706be1be907f8e7d24"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/harfbuzz/libharfbuzz-icu0_2.6.4-1ubuntu4_arm64.deb;name=libharfbuzz-icu0"
SRC_URI[libharfbuzz-icu0.md5sum] = "ccc36873cf11209e0a30dfb4acd4929a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/harfbuzz/libharfbuzz0b_2.6.4-1ubuntu4_arm64.deb;name=libharfbuzz0b"
SRC_URI[libharfbuzz0b.md5sum] = "9d7334b496bd8e141934e032cb789c0b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/h/harfbuzz/libharfbuzz-dev_2.6.4-1ubuntu4_arm64.deb;name=libharfbuzz-dev"
SRC_URI[libharfbuzz-dev.md5sum] = "63432e248c79540ad89f876089a0e709"

# other configs to feed compilation
PKG_${UPN} = "libharfbuzz0b"

DEPENDS += "icu graphite2 glib-2.0"
