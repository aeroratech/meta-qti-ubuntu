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

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libatomic1-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libatomic1-cross"
SRC_URI[libatomic1-cross.md5sum] = "d2591ed91fb07c5e5eacbfbedc1c0c7c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libgomp1-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libgomp1"
SRC_URI[libgomp1.md5sum] = "c101061b33447e757f53c6d62f6fbffe"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libitm1-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libitm1"
SRC_URI[libitm1.md5sum] = "321341e4ee398a9ae10864b0e35186e4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10/liblsan0_10-20200411-0ubuntu1_arm64.deb;name=liblsan0"
SRC_URI[liblsan0.md5sum] = "7d12b91f7f10490416452c73b87ccab7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gcc-10-cross/libstdc++-10-dev-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libstdc++-10-dev"
SRC_URI[libstdc++-10-dev.md5sum] = "a9a23bdb107b6d73c5ea5f55e1e87d96"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libstdc++6-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libstdc++6"
SRC_URI[libstdc++6.md5sum] = "a2ea55fa1ae6ce018b9375b6b70f8c70"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/g/gcc-10-cross/libtsan0-arm64-cross_10.5.0-1ubuntu1~20.04cross1_all.deb;name=libtsan0"
SRC_URI[libtsan0.md5sum] = "45c1faadc5646083e3b06d132da464a6"

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

ALLOW_EMPTY_libatomic = "1"
ALLOW_EMPTY_libatomic-dev = "1"
ALLOW_EMPTY_libstdc++ = "1"
ALLOW_EMPTY_libstdc++-dev = "1"

#  gcc-sanitizers
PACKAGES += " \
            gcc-sanitizers gcc-sanitizers-dev \
            libasan libubsan liblsan libtsan \
            libasan-dev libubsan-dev liblsan-dev libtsan-dev \
            libasan-staticdev libubsan-staticdev liblsan-staticdev libtsan-staticdev \
            "
