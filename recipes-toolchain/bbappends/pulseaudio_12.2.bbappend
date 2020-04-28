PKGV_libpulse = "1:12.2"
PKGR_libpulse = "1"
PKG_libpulse = "libpulse0"

RDEPENDS_pulseaudio-server_remove = "alsa-plugins-pulseaudio-conf"
RDEPENDS_pulseaudio-server += "libasound2-plugins"
RDEPENDS_pulseaudio-misc += "libpulse-simple"

EXTRA_OECONF += "--disable-effect-trumpet"
