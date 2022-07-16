inherit upkg_base

LICENSE = "BSD-3-Clause"
LICENSE_libvorbisfile3 = "BSD-3-Clause"
LICENSE_libvorbisenc2 = "BSD-3-Clause"
LICENSE_libvorbis0a = "BSD-3-Clause"
LICENSE_libvorbis-dev = "BSD-3-Clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libv/libvorbis/libvorbis-dev_1.3.6-2ubuntu1_arm64.deb;name=libvorbis-dev"
SRC_URI[libvorbis-dev.md5sum] = "13e1288ac8be64eb1e3b38fdeb01c687"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libv/libvorbis/libvorbis0a_1.3.6-2ubuntu1_arm64.deb;name=libvorbis0a"
SRC_URI[libvorbis0a.md5sum] = "a238e44dc233734cc707d08110b927d0"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libv/libvorbis/libvorbisenc2_1.3.6-2ubuntu1_arm64.deb;name=libvorbisenc2"
SRC_URI[libvorbisenc2.md5sum] = "796269c96505922d859df3841172e3e2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libv/libvorbis/libvorbisfile3_1.3.6-2ubuntu1_arm64.deb;name=libvorbisfile3"
SRC_URI[libvorbisfile3.md5sum] = "9c1382f25b33719247d47a090636d128"

# other configs to feed compilation
PKG_${UPN} = "libvorbisfile3"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libogg"
PROVIDES += "libvorbis "
