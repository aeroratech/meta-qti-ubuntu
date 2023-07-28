inherit upkg_base

LICENSE = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_ffmpeg = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavfilter7 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavfilter-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libpostproc55 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libpostproc-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavutil56 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavutil-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavresample4 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavresample-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavformat-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavformat58 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavdevice58 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavdevice-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavcodec58 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libavcodec-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libswresample3 = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"
LICENSE_libswresample-dev = "LGPL-2.1+ & GPL-2.0+ & GPL-3.0+ & MIT & BSD"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/ffmpeg_4.2.2-1ubuntu1_arm64.deb;name=ffmpeg"
SRC_URI[ffmpeg.md5sum] = "70bb3dbddc7b66bd7f0243131cd2c107"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavfilter7_4.2.2-1ubuntu1_arm64.deb;name=libavfilter7"
SRC_URI[libavfilter7.md5sum] = "d6be250c21d9a52cf0de279f1deab920"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavfilter-dev_4.2.2-1ubuntu1_arm64.deb;name=libavfilter-dev"
SRC_URI[libavfilter-dev.md5sum] = "71033cbfba328a06239286a014fb39f2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libpostproc55_4.2.2-1ubuntu1_arm64.deb;name=libpostproc55"
SRC_URI[libpostproc55.md5sum] = "09081320fd5beb8b5ce904e3f97efbf5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libpostproc-dev_4.2.2-1ubuntu1_arm64.deb;name=libpostproc-dev"
SRC_URI[libpostproc-dev.md5sum] = "dd123e60ed44cb414f5b6074941ee40d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavutil56_4.2.2-1ubuntu1_arm64.deb;name=libavutil56"
SRC_URI[libavutil56.md5sum] = "ceabcc7cf3556b0e0626cabc8f677fdd"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavutil-dev_4.2.2-1ubuntu1_arm64.deb;name=libavutil-dev"
SRC_URI[libavutil-dev.md5sum] = "52c698b6664629237cf0666c931d2c6f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavresample4_4.2.2-1ubuntu1_arm64.deb;name=libavresample4"
SRC_URI[libavresample4.md5sum] = "bedc3c344151d4587ff930434709e290"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavresample-dev_4.2.2-1ubuntu1_arm64.deb;name=libavresample-dev"
SRC_URI[libavresample-dev.md5sum] = "c6b436fa2a92074868fa275c656eadf2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavformat58_4.2.2-1ubuntu1_arm64.deb;name=libavformat58"
SRC_URI[libavformat58.md5sum] = "9731903935b31f50800d80be0ebc0e8a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavformat-dev_4.2.2-1ubuntu1_arm64.deb;name=libavformat-dev"
SRC_URI[libavformat-dev.md5sum] = "085c1a13875529c1829b12063021112f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libswscale5_4.2.2-1ubuntu1_arm64.deb;name=libswscale5"
SRC_URI[libswscale5.md5sum] = "5dda97ce610bacca785ae4f25355d4d2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libswscale-dev_4.2.2-1ubuntu1_arm64.deb;name=libswscale-dev"
SRC_URI[libswscale-dev.md5sum] = "44b77b61275849ce5bbe533b89307c40"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavdevice58_4.2.2-1ubuntu1_arm64.deb;name=libavdevice58"
SRC_URI[libavdevice58.md5sum] = "621f1ed2f3d80db94dc2c9db3a59b85b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavdevice-dev_4.2.2-1ubuntu1_arm64.deb;name=libavdevice-dev"
SRC_URI[libavdevice-dev.md5sum] = "b483b3253f45199cbb63947d43d81048"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavcodec58_4.2.2-1ubuntu1_arm64.deb;name=libavcodec58"
SRC_URI[libavcodec58.md5sum] = "35ea85af9debed7f1491873b2e785e9e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libavcodec-dev_4.2.2-1ubuntu1_arm64.deb;name=libavcodec-dev"
SRC_URI[libavcodec-dev.md5sum] = "30b8e65de754b694367ab2a6fd16e13c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libswresample-dev_4.2.2-1ubuntu1_arm64.deb;name=libswresample-dev"
SRC_URI[libswresample-dev.md5sum] = "95a55154b78297b8deb293ad4abed2ff"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/f/ffmpeg/libswresample3_4.2.2-1ubuntu1_arm64.deb;name=libswresample3"
SRC_URI[libswresample3.md5sum] = "e7b501ebf86fdc4261ae6bf8be997658"

# other configs to feed compilation
PKG_${UPN} = "ffmpeg"
DEPENDS += "libtool-cross virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc bzip2 libtheora libogg"
PROVIDES += "ffmpeg libav libpostproc libavfilter libswscale libavcodec libavdevice libavformat libavresample libavutil libpostproc"
