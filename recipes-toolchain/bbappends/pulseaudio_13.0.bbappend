PKGV_libpulse = "1:13.100"
PKGR_libpulse = "1"
PKG_libpulse = "libpulse0"

RDEPENDS_pulseaudio-server_remove = "alsa-plugins-pulseaudio-conf"
RDEPENDS_pulseaudio-server += "libasound2-plugins"
RDEPENDS_pulseaudio-misc += "libpulse-simple"

SYSTEMD_SERVICE_${PN}-server_remove += "volatile-var-lib-pulse.service"

EXTRA_OECONF += "--disable-effect-trumpet"

PACKAGES_prepend = " \
            pulseaudio-lib-alsa-util pulseaudio-lib-cli pulseaudio-lib-protocol-cli pulseaudio-lib-protocol-native \
            pulseaudio-module-alsa-card pulseaudio-module-role-ducking pulseaudio-module-detect pulseaudio-module-augment-properties \
            pulseaudio-module-device-restore pulseaudio-module-cli-protocol-unix pulseaudio-module-position-event-sounds \
            pulseaudio-module-stream-restore pulseaudio-module-dbus-protocol pulseaudio-module-filter-heuristics \
            pulseaudio-module-null-source pulseaudio-module-combine-sink pulseaudio-module-native-protocol-unix \
            pulseaudio-module-switch-on-port-available pulseaudio-module-alsa-sink pulseaudio-module-loopback \
            pulseaudio-module-alsa-source pulseaudio-module-role-cork pulseaudio-module-card-restore pulseaudio-module-filter-apply \
            pulseaudio-module-default-device-restore pulseaudio-module-udev-detect pulseaudio-module-rescue-streams \
            pulseaudio-module-null-sink pulseaudio-module-intended-roles pulseaudio-module-suspend-on-idle pulseaudio-module-role-ignore \
            pulseaudio-module-role-exclusive pulseaudio-module-policy-voiceui pulseaudio-module-qsthw pulseaudio-module-always-sink \
            pulseaudio-module-qahw-card \
            "

do_package_qa[noexec] = "1"

# config update-alternatives for pulseaudio
#require update-alternatives/pulseaudio_13.0.inc

