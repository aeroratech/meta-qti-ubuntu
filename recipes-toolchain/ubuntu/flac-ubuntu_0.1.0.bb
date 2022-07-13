inherit upkg_base

LICENSE = "GFDL-1.1+ & BSD-3-Clause & GPL-2+ & LGPL-2.1+ & PD & ISC"
LICENSE_libflac++-dev = "GFDL-1.1+ & BSD-3-Clause & GPL-2+ & LGPL-2.1+ & PD & ISC"
LICENSE_libflac++6v5 = "GFDL-1.1+ & BSD-3-Clause & GPL-2+ & LGPL-2.1+ & PD & ISC"
LICENSE_libflac8 = "GFDL-1.1+ & BSD-3-Clause & GPL-2+ & LGPL-2.1+ & PD & ISC"
LICENSE_libflac-dev = "GFDL-1.1+ & BSD-3-Clause & GPL-2+ & LGPL-2.1+ & PD & ISC"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/flac/libflac-dev_1.3.3-1build1_arm64.deb;name=libflac-dev"
SRC_URI[libflac-dev.md5sum] = "594cfdf96b90704ad342e43ab2328234"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/flac/libflac8_1.3.3-1build1_arm64.deb;name=libflac8"
SRC_URI[libflac8.md5sum] = "d083b2c6b1eb5eba9a0475bc25550e8f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/flac/libflac++6v5_1.3.3-1build1_arm64.deb;name=libflac++6v5"
SRC_URI[libflac++6v5.md5sum] = "6fe6829a0b416c4bda02b720151c7021"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/f/flac/libflac++-dev_1.3.3-1build1_arm64.deb;name=libflac++-dev"
SRC_URI[libflac++-dev.md5sum] = "ce2a216ee96c1b6d12ec1b44747d4c0e"

# other configs to feed compilation
PKG_${UPN} = "libflac++-dev"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libogg"
PROVIDES += "flac "
