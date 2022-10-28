inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_liblapack64-dev = "BSD-3-clause"
LICENSE_liblapack-dev = "BSD-3-clause"
LICENSE_libtmglib64-dev = "BSD-3-clause"
LICENSE_libtmglib-dev = "BSD-3-clause"
LICENSE_libtmglib64-3 = "BSD-3-clause"
LICENSE_libtmglib3 = "BSD-3-clause"
LICENSE_liblapacke64-dev = "BSD-3-clause"
LICENSE_liblapacke-dev = "BSD-3-clause"
LICENSE_liblapacke64 = "BSD-3-clause"
LICENSE_liblapacke = "BSD-3-clause"
LICENSE_liblapack64-3 = "BSD-3-clause"
LICENSE_liblapack3 = "BSD-3-clause"
LICENSE_libblas64-dev = "BSD-3-clause"
LICENSE_libblas-dev = "BSD-3-clause"
LICENSE_libblas64-3 = "BSD-3-clause"
LICENSE_libblas3 = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapack3_3.9.0-1build1_arm64.deb;name=liblapack3"
SRC_URI[liblapack3.md5sum] = "0bcd62dafece215164b3e1cb2a108929"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapack64-3_3.9.0-1build1_arm64.deb;name=liblapack64-3"
SRC_URI[liblapack64-3.md5sum] = "de4a7f2c918671dd59c9aada40a0afc2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapacke_3.9.0-1build1_arm64.deb;name=liblapacke"
SRC_URI[liblapacke.md5sum] = "dccd1a384beb8a73bd968fcb6843825f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapacke64_3.9.0-1build1_arm64.deb;name=liblapacke64"
SRC_URI[liblapacke64.md5sum] = "c6c08d0a35b2af5f591005ea4a2d9e10"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapacke-dev_3.9.0-1build1_arm64.deb;name=liblapacke-dev"
SRC_URI[liblapacke-dev.md5sum] = "2d55cb389ce8777419f39f0b3a18d7b0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapacke64-dev_3.9.0-1build1_arm64.deb;name=liblapacke64-dev"
SRC_URI[liblapacke64-dev.md5sum] = "abd08069d70510ab1678b22e0bedd700"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libtmglib3_3.9.0-1build1_arm64.deb;name=libtmglib3"
SRC_URI[libtmglib3.md5sum] = "12bd018dd591dc7c9d27636d8203acd7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libtmglib64-3_3.9.0-1build1_arm64.deb;name=libtmglib64-3"
SRC_URI[libtmglib64-3.md5sum] = "4451957c6bb1b10b5e63f806d8f72e14"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libtmglib-dev_3.9.0-1build1_arm64.deb;name=libtmglib-dev"
SRC_URI[libtmglib-dev.md5sum] = "0b2fb047426ba5f2ef3003cb69759813"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libtmglib64-dev_3.9.0-1build1_arm64.deb;name=libtmglib64-dev"
SRC_URI[libtmglib64-dev.md5sum] = "c99bfd7899a0ee1c67e532e7092949b8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapack-dev_3.9.0-1build1_arm64.deb;name=liblapack-dev"
SRC_URI[liblapack-dev.md5sum] = "bd5497488e601c44c2aaa19aa81a0991"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/liblapack64-dev_3.9.0-1build1_arm64.deb;name=liblapack64-dev"
SRC_URI[liblapack64-dev.md5sum] = "83761decc3e482fe6f869ff6c8829944"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libblas3_3.9.0-1build1_arm64.deb;name=libblas3"
SRC_URI[libblas3.md5sum] = "c2cb5b0278f519100b864a2936448de2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libblas64-3_3.9.0-1build1_arm64.deb;name=libblas64-3"
SRC_URI[libblas64-3.md5sum] = "0b5d8c790c8b31229ef1ac37570ecdd6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libblas-dev_3.9.0-1build1_arm64.deb;name=libblas-dev"
SRC_URI[libblas-dev.md5sum] = "7750557bbb8756decd56411c43ebb6d6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/l/lapack/libblas64-dev_3.9.0-1build1_arm64.deb;name=libblas64-dev"
SRC_URI[libblas64-dev.md5sum] = "f4067a4d6b0dfa628d636cf2af1650a4"

# other configs to feed compilation
PKG_${UPN} = "libblas64-dev"

DEPENDS += "gcc-runtime libgcc "

do_install_append(){

	mv ${D}/usr/lib/aarch64-linux-gnu/blas/* ${D}/usr/lib/aarch64-linux-gnu/
	mv ${D}/usr/lib/aarch64-linux-gnu/lapack/* ${D}/usr/lib/aarch64-linux-gnu/
}
