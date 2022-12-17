inherit upkg_base

LICENSE = "BSD-3-clause-alike-CREATIS"
LICENSE_libvtkgdcm-java = "BSD-3-clause-alike-CREATIS"
LICENSE_libgdcm-java = "BSD-3-clause-alike-CREATIS"
LICENSE_python3-vtkgdcm = "BSD-3-clause-alike-CREATIS"
LICENSE_libvtkgdcm-cil = "BSD-3-clause-alike-CREATIS"
LICENSE_libvtkgdcm-dev = "BSD-3-clause-alike-CREATIS"
LICENSE_libvtkgdcm3.0 = "BSD-3-clause-alike-CREATIS"
LICENSE_python3-gdcm = "BSD-3-clause-alike-CREATIS"
LICENSE_libgdcm-cil = "BSD-3-clause-alike-CREATIS"
LICENSE_libgdcm-dev = "BSD-3-clause-alike-CREATIS"
LICENSE_libgdcm3.0 = "BSD-3-clause-alike-CREATIS"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libgdcm3.0_3.0.5-1.1ubuntu2_arm64.deb;name=libgdcm3.0"
SRC_URI[libgdcm3.0.md5sum] = "5adde12013f128ed5b709e2f3cec6a33"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libgdcm-dev_3.0.5-1.1ubuntu2_arm64.deb;name=libgdcm-dev"
SRC_URI[libgdcm-dev.md5sum] = "121ff3785d8ce707d19b54b77ad022f5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libgdcm-cil_3.0.5-1.1ubuntu2_arm64.deb;name=libgdcm-cil"
SRC_URI[libgdcm-cil.md5sum] = "c240ba3e208525fa524a0a0fe175885c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/python3-gdcm_3.0.5-1.1ubuntu2_arm64.deb;name=python3-gdcm"
SRC_URI[python3-gdcm.md5sum] = "b5975b4a21bf8910f5940620a149888d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libvtkgdcm3.0_3.0.5-1.1ubuntu2_arm64.deb;name=libvtkgdcm3.0"
SRC_URI[libvtkgdcm3.0.md5sum] = "b20f428e19b73594edb3673557d9918f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libvtkgdcm-dev_3.0.5-1.1ubuntu2_arm64.deb;name=libvtkgdcm-dev"
SRC_URI[libvtkgdcm-dev.md5sum] = "b1f72e410057d9b006bc00ae4a794cd5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libvtkgdcm-cil_3.0.5-1.1ubuntu2_arm64.deb;name=libvtkgdcm-cil"
SRC_URI[libvtkgdcm-cil.md5sum] = "3d0d80a58de2e518d755e09be80fea66"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/python3-vtkgdcm_3.0.5-1.1ubuntu2_arm64.deb;name=python3-vtkgdcm"
SRC_URI[python3-vtkgdcm.md5sum] = "c6f56a358a76ffb9607e5e170813f32a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libgdcm-java_3.0.5-1.1ubuntu2_arm64.deb;name=libgdcm-java"
SRC_URI[libgdcm-java.md5sum] = "4d5258d3a73a51d73edf659917892e8a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdcm/libvtkgdcm-java_3.0.5-1.1ubuntu2_arm64.deb;name=libvtkgdcm-java"
SRC_URI[libvtkgdcm-java.md5sum] = "502bf6aba560bd59ebfd68eefab78fdc"

# other configs to feed compilation
PKG_${UPN} = "libgdcm3.0"

DEPENDS += "charls expat libgcc json-c openjpeg2 socket++ openssl zlib util-linux"
