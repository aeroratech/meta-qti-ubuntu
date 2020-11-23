# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for xserver-xorg package
ALTERNATIVE_PRIORITY_xserver-xorg = "100"

# set update-alternatives register name for xserver-xorg package
ALTERNATIVE_xserver-xorg = "X Xorg cvt libfb.so libfbdevhw.so libglamoregl.so libshadow.so libshadowfb.so libvbe.so libvgahw.so protocol.txt 10-quirks.conf"

# set update-alternatives symbolic link path and real target path for xserver-xorg package
ALTERNATIVE_LINK_NAME[X] = "/usr/bin/X"

ALTERNATIVE_LINK_NAME[Xorg] = "/usr/bin/Xorg"

ALTERNATIVE_LINK_NAME[cvt] = "/usr/bin/cvt"

ALTERNATIVE_LINK_NAME[libfb.so] = "/usr/lib/xorg/modules/libfb.so"

ALTERNATIVE_LINK_NAME[libfbdevhw.so] = "/usr/lib/xorg/modules/libfbdevhw.so"

ALTERNATIVE_LINK_NAME[libglamoregl.so] = "/usr/lib/xorg/modules/libglamoregl.so"

ALTERNATIVE_LINK_NAME[libshadow.so] = "/usr/lib/xorg/modules/libshadow.so"

ALTERNATIVE_LINK_NAME[libshadowfb.so] = "/usr/lib/xorg/modules/libshadowfb.so"

ALTERNATIVE_LINK_NAME[libvbe.so] = "/usr/lib/xorg/modules/libvbe.so"

ALTERNATIVE_LINK_NAME[libvgahw.so] = "/usr/lib/xorg/modules/libvgahw.so"

ALTERNATIVE_LINK_NAME[protocol.txt] = "/usr/lib/xorg/protocol.txt"

ALTERNATIVE_LINK_NAME[10-quirks.conf] = "/usr/share/X11/xorg.conf.d/10-quirks.conf"

