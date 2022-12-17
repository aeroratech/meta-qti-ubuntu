inherit upkg_base

LICENSE = "GPL-V2"
LICENSE_bash-completion = "GPL-V2"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/bash-completion/bash-completion_2.10-1ubuntu1_all.deb;name=bash-completion"
SRC_URI[bash-completion.md5sum] = "842ec86626f1e2c3c1096c48d78d2dc8"

# other configs to feed compilation
PKG_${UPN} = "bash-completion"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc "
PROVIDES += "bash-completion "
