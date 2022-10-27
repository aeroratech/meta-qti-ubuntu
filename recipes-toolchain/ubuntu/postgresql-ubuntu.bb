inherit upkg_base

LICENSE = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_postgresql-plperl-12 = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_postgresql-server-dev-12 = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_libpgtypes3 = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_libecpg-compat3 = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_libecpg-dev = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_libecpg6 = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_libpq5 = "BSD-3-Clause & MIT Variant & BSD-2-clause "
LICENSE_libpq-dev = "BSD-3-Clause & MIT Variant & BSD-2-clause "

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/postgresql-12/libpq-dev_12.2-4_arm64.deb;name=libpq-dev"
SRC_URI[libpq-dev.md5sum] = "d1fdf2aeae79c781e51f59af224b6ba1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/postgresql-12/libpq5_12.2-4_arm64.deb;name=libpq5"
SRC_URI[libpq5.md5sum] = "71ae69985136ae1cd278a9ade36f199e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/postgresql-12/libecpg6_12.2-4_arm64.deb;name=libecpg6"
SRC_URI[libecpg6.md5sum] = "fb4a242cab667374e69347fead9f1b0e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/postgresql-12/libecpg-dev_12.2-4_arm64.deb;name=libecpg-dev"
SRC_URI[libecpg-dev.md5sum] = "be8490c229563fa04cc7b0703b36bbe5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/postgresql-12/libecpg-compat3_12.2-4_arm64.deb;name=libecpg-compat3"
SRC_URI[libecpg-compat3.md5sum] = "6bafc03df2a85f005a47f4afe440cb36"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/p/postgresql-12/libpgtypes3_12.2-4_arm64.deb;name=libpgtypes3"
SRC_URI[libpgtypes3.md5sum] = "7e3fd07061703e5392a8c99a6b225c66"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/postgresql-12/postgresql-server-dev-12_12.2-4_arm64.deb;name=postgresql-server-dev-12"
SRC_URI[postgresql-server-dev-12.md5sum] = "22a1cf698b354db8e52a7b1e2276edaf"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/postgresql-12/postgresql-plperl-12_12.2-4_arm64.deb;name=postgresql-plperl-12"
SRC_URI[postgresql-plperl-12.md5sum] = "a40304dc5dad224359fbb6367ff353cd"

# other configs to feed compilation
PKG_${UPN} = "postgresql-plperl-12"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libnsl2 zlib readline perl  base-files shadow-sysroot shadow base-passwd libxml2 openssl libpam perl python3 tcl util-linux"
PROVIDES += "postgresql "
