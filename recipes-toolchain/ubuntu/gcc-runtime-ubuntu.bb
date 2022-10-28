inherit upkg_base

LICENSE = "LGPL-2+ & GPL-3.0-with-GCC-exception-3.1 & BSD-3-Clause & MIT"
LICENSE_libtsan0 = "BSD-3-Clause & MIT"
LICENSE_libiberty-dev = "LGPL-2+"
LICENSE_libstdc++6 = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_libstdc++-10-dev = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_liblsan0 = "BSD-3-Clause & MIT"
LICENSE_libitm1 = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_libgomp1 = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_libatomic1 = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_libgfortran5 = "GPL-3.0-with-GCC-exception-3.1"
LICENSE_libgfortran-10-dev = "GPL-3.0-with-GCC-exception-3.1"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gcc-10/libgfortran-10-dev_10-20200411-0ubuntu1_arm64.deb;name=libgfortran-10-dev"
SRC_URI[libgfortran-10-dev.md5sum] = "05b45f7439c983fa596bed26adb69d69"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10/libgfortran5_10-20200411-0ubuntu1_arm64.deb;name=libgfortran5"
SRC_URI[libgfortran5.md5sum] = "ab4e74f8c949ecb3a87a850aa27b76bd"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libi/libiberty/libiberty-dev_20200409-1_arm64.deb;name=libiberty-dev"
SRC_URI[libiberty-dev.md5sum] = "7afc973eb1f8741c2d28d166905ff4d6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libatomic1-arm64-cross_10.3.0-1ubuntu1~20.04cross1_all.deb;name=libatomic1-cross"
SRC_URI[libatomic1-cross.md5sum] = "2ba80c30506c0a71c4616ae874d15890"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libgomp1-arm64-cross_10.3.0-1ubuntu1~20.04cross1_all.deb;name=libgomp1"
SRC_URI[libgomp1.md5sum] = "1111231ea963836acf2fd81aa3b65bb9"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libitm1-arm64-cross_10.3.0-1ubuntu1~20.04cross1_all.deb;name=libitm1"
SRC_URI[libitm1.md5sum] = "53b978a4cccef7ead5f47dd31c72e2ca"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10/liblsan0_10-20200411-0ubuntu1_arm64.deb;name=liblsan0"
SRC_URI[liblsan0.md5sum] = "7d12b91f7f10490416452c73b87ccab7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gcc-10-cross/libstdc++-10-dev-arm64-cross_10.3.0-1ubuntu1~20.04cross1_all.deb;name=libstdc++-10-dev"
SRC_URI[libstdc++-10-dev.md5sum] = "8b9ee4dd04b8ecb92899266d6a2e935b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libstdc++6-arm64-cross_10.3.0-1ubuntu1~20.04cross1_all.deb;name=libstdc++6"
SRC_URI[libstdc++6.md5sum] = "ae7c080b8c2130d800aa15b060c32578"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libtsan0-arm64-cross_10.3.0-1ubuntu1~20.04cross1_all.deb;name=libtsan0"
SRC_URI[libtsan0.md5sum] = "7abe15b6536782c6cb6e8dc171db5480"

# other configs to feed compilation
PKG_${UPN} = "libstdc++-10-dev"
DEPENDS += "   virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-g++ libgcc virtual/libc"
PROVIDES += "libgfortran gcc-runtime virtual/aarch64-linux-gnu-compilerlibs libstdc++ libstdc++-dev"
RPROVIDES_{UPN} = "libstdc++ libstdc++-dev"
PKG_libstdc++ = "libstdc++6"

do_install_append(){
#	cp -rf ${D}/usr/lib/gcc/aarch64-linux-gnu/10/* ${D}/usr/lib/
#	cp -rf ${D}${includedir}/c++/10/* ${D}${includedir}/c++/
#	cp -rf -H ${D}/usr/${UBUN_TARGET_SYS}/lib/* ${D}${libdir}/${UBUN_TARGET_SYS}
#	cp -rf -H ${D}/usr/${UBUN_TARGET_SYS}/lib/*.o ${D}${base_libdir}
#	cp -rf -H ${D}${libdir}/${UBUN_TARGET_SYS}/*.o ${D}${base_libdir}
#	cp -rf -H ${D}/deb/usr/aarch64-linux-gnu/include/* ${D}${includedir}
#	cp -rf -H ${D}${includedir}/c++/10/* ${D}${includedir}/c++/
#	cp -rf -H ${D}${includedir}/c++/aarch64-linux-gnu/bits/* ${D}${includedir}/c++/bits

}

PACKAGES += "\
            libstdc++ \
            libstdc++-precompile-dev \
            libstdc++-dev \
            libstdc++-staticdev \
            libg2c \
            libg2c-dev \
            libssp \
            libssp-dev \
            libssp-staticdev \
            libmudflap \
            libmudflap-dev \
            libmudflap-staticdev \
            libquadmath \
            libquadmath-dev \
            libquadmath-staticdev \
            libgomp \
            libgomp-dev \
            libgomp-staticdev \
            libatomic \
            libatomic-dev \
            libatomic-staticdev \
            libitm \
            libitm-dev \
            libitm-staticdev \
            "

#  gcc-sanitizers
PACKAGES += " \
            gcc-sanitizers gcc-sanitizers-dev \
            libasan libubsan liblsan libtsan \
            libasan-dev libubsan-dev liblsan-dev libtsan-dev \
            libasan-staticdev libubsan-staticdev liblsan-staticdev libtsan-staticdev \
            "
