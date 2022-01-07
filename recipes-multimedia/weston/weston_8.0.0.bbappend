#remove gdk-pixbuf dependency because ubuntu toolchain provided
DEPENDS_remove_qrb5165-rb5 = "gdk-pixbuf"
RDEPENDS_${PN}_remove_qrb5165-rb5 += "xkeyboard-config"
PACKAGES_remove = "${PN}-dbg"
do_package_qa[noexec] = "1"
