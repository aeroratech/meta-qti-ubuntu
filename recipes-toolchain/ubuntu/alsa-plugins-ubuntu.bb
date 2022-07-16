inherit upkg_base

LICENSE = "LGPL-2.1+"
LICENSE_libasound2-plugins = "LGPL-2.1+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/alsa-plugins/libasound2-plugins_1.2.2-1ubuntu1_arm64.deb;name=libasound2-plugins"
SRC_URI[libasound2-plugins.md5sum] = "653933a1fa2991da46ae3be958d2d500"

# other configs to feed compilation
PKG_${UPN} = "libasound2-plugins"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  alsa-lib pulseaudio libsamplerate0 speexdsp"
PROVIDES += "alsa-plugins libasound2-plugins"
RPROVIDES_libasound2-plugins += "libasound2-plugins"
