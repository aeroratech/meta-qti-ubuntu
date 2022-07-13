inherit upkg_base

LICENSE = "GPL-2.0 & LGPL-2.0+"
LICENSE_alsa-utils = "GPL-2.0 & LGPL-2.0+"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/a/alsa-utils/alsa-utils_1.2.2-1ubuntu1_arm64.deb;name=alsa-utils"
SRC_URI[alsa-utils.md5sum] = "5daedeb56e51bf8bf515c85afc7aee5e"

# other configs to feed compilation
PKG_${UPN} = "alsa-utils"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc alsa-lib ncurses libsamplerate0 udev"
PROVIDES += "alsa-utils "

PROVIDES += " \
alsa-utils-alsabat    \
alsa-utils-alsatplg   \
alsa-utils-aplay      \
alsa-utils-amixer     \
alsa-utils-alsamixer  \
alsa-utils-speakertest\
alsa-utils-midi       \
alsa-utils-aconnect   \
alsa-utils-aseqnet    \
alsa-utils-iecset     \
alsa-utils-alsactl    \
alsa-utils-aseqdump   \
alsa-utils-alsaloop   \
alsa-utils-alsaucm    \
"
RPROVIDES_alsa-utils += " \
alsa-utils-alsabat    \
alsa-utils-alsatplg   \
alsa-utils-aplay      \
alsa-utils-amixer     \
alsa-utils-alsamixer  \
alsa-utils-speakertest\
alsa-utils-midi       \
alsa-utils-aconnect   \
alsa-utils-aseqnet    \
alsa-utils-iecset     \
alsa-utils-alsactl    \
alsa-utils-aseqdump   \
alsa-utils-alsaloop   \
alsa-utils-alsaucm    \
alsa-utils-scripts \
"
