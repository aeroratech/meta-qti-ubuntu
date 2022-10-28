inherit upkg_base

LICENSE = "BSD-3-clause"
LICENSE_libhdf5-mpi-dev = "BSD-3-clause"
LICENSE_libhdf5-mpich-dev = "BSD-3-clause"
LICENSE_libhdf5-mpich-103 = "BSD-3-clause"
LICENSE_libhdf5-openmpi-dev = "BSD-3-clause"
LICENSE_libhdf5-openmpi-103 = "BSD-3-clause"
LICENSE_libhdf5-dev = "BSD-3-clause"
LICENSE_libhdf5-cpp-103 = "BSD-3-clause"
LICENSE_libhdf5-103 = "BSD-3-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-103_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-103"
SRC_URI[libhdf5-103.md5sum] = "680d91468d16585071b0ec868247af93"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-cpp-103_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-cpp-103"
SRC_URI[libhdf5-cpp-103.md5sum] = "f0149d11d0eb86b4d2cfab9f5ea5babc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-dev_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-dev"
SRC_URI[libhdf5-dev.md5sum] = "fa5b3c532a1e6e5c13770f2c0ecf97bc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-openmpi-103_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-openmpi-103"
SRC_URI[libhdf5-openmpi-103.md5sum] = "74dc965024c52e5316892a5f06bda439"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-openmpi-dev_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-openmpi-dev"
SRC_URI[libhdf5-openmpi-dev.md5sum] = "b4c22bd97899e8cb5d20f81154f8b763"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-mpich-103_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-mpich-103"
SRC_URI[libhdf5-mpich-103.md5sum] = "e2496e42d34ee6bf8f614b8c5b33237c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-mpich-dev_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-mpich-dev"
SRC_URI[libhdf5-mpich-dev.md5sum] = "fe6fc2f97e33ea2b6121828e06d4e953"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/h/hdf5/libhdf5-mpi-dev_1.10.4+repack-11ubuntu1_arm64.deb;name=libhdf5-mpi-dev"
SRC_URI[libhdf5-mpi-dev.md5sum] = "9788823a9d92c4609540cbaf6e6d6eda"

# other configs to feed compilation
PKG_${UPN} = "libhdf5-mpi-dev"

DEPENDS += "mpich zlib libjpeg8-empty libaec"
