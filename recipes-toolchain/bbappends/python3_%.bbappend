RDEPENDS_python3-unixadmin += "libtirpc"
do_package_qa[noexec] = "1"

RRECOMMENDS_nativesdk-python3-modules_remove += "nativesdk-python3-distutils-windows"
