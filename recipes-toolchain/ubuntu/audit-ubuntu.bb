inherit upkg_base

LICENSE = "GPL-2.0+"
LICENSE_libaudit1 = "GPL-2.0+"
LICENSE_libauparse0 = "GPL-2.0+"
LICENSE_libauparse-dev = "GPL-2.0+"
LICENSE_libaudit-dev = "GPL-2.0+"
LICENSE_python3-audit = "GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/a/audit/python3-audit_2.8.5-2ubuntu6_arm64.deb;name=python3-audit"
SRC_URI[python3-audit.md5sum] = "0fb0bbf174922cb83632c02831cab6ea"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/audit/libaudit-dev_2.8.5-2ubuntu6_arm64.deb;name=libaudit-dev"
SRC_URI[libaudit-dev.md5sum] = "c50f2013907e4addf47e17aa22a9db0b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/audit/libauparse-dev_2.8.5-2ubuntu6_arm64.deb;name=libauparse-dev"
SRC_URI[libauparse-dev.md5sum] = "ede96d54c781f97e5dfceeab1e8df5d4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/audit/libauparse0_2.8.5-2ubuntu6_arm64.deb;name=libauparse0"
SRC_URI[libauparse0.md5sum] = "96cfe690b4bad77a3a9960d614ecac62"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/audit/libaudit1_2.8.5-2ubuntu6_arm64.deb;name=libaudit1"
SRC_URI[libaudit1.md5sum] = "7f0b1c0a50ab32de808d7bacec0fb12d"

# other configs to feed compilation
PKG_${UPN} = "libaudit1"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc libcap-ng "
#DPENDS += "python3 tcp-wrappers linux-libc-headers"
PROVIDES += "audit "
