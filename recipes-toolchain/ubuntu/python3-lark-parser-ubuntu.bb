inherit upkg_base

LICENSE = "MIT & GPL-2.0+"
LICENSE_python3-lark = "MIT & GPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/p/python-lark/python3-lark_0.8.1-1_all.deb;name=python3-lark"
SRC_URI[python3-lark.md5sum] = "86fefff9db13d23f0427bcc5b64265e5"

# other configs to feed compilation
PKG_${UPN} = "python3-lark"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  python3  python3"
PROVIDES += "python3-lark-parser "
