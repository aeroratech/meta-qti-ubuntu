# Use update-alternatives mechanism
inherit update-alternatives-ubuntu

# 1. set update-alternatives priority for libpulse package
ALTERNATIVE_PRIORITY_libpulse = "100"

# set update-alternatives register name for libpulse package
ALTERNATIVE_libpulse = "\
                 client.conf libpulse.so.0 libpulse.so.0.20.3 \
                "
# set update-alternatives symbolic link path and real target path for gbm package
ALTERNATIVE_LINK_NAME[client.conf] = "/etc/pulse/client.conf"

ALTERNATIVE_LINK_NAME[libpulse.so.0] = "/usr/lib/aarch64-linux-gnu/libpulse.so.0"
ALTERNATIVE_TARGET_libpulse[libpulse.so.0] = "${libdir}/libpulse.so.0"

ALTERNATIVE_LINK_NAME[libpulse.so.0.20.3] = "/usr/lib/libpulse.so.0.20.3"

# 2. set update-alternatives priority for libpulse-simple package
ALTERNATIVE_PRIORITY_libpulse-simple = "100"

# set update-alternatives register name for libpulse-simple package
ALTERNATIVE_libpulse-simple = "\
                 libpulse-simple.so.0.1.1 libpulse-simple.so.0 \
                "

# set update-alternatives symbolic link path and real target path for libpulse-simple package
ALTERNATIVE_LINK_NAME[libpulse-simple.so.0.1.1] = "/usr/lib/aarch64-linux-gnu/libpulse-simple.so.0.1.1"
ALTERNATIVE_TARGET_libpulse-simple[libpulse-simple.so.0.1.1] = "/usr/lib/libpulse-simple.so.0.1.1"

ALTERNATIVE_LINK_NAME[libpulse-simple.so.0] = "/usr/lib/aarch64-linux-gnu/libpulse-simple.so.0"
ALTERNATIVE_TARGET_libpulse-simple[libpulse-simple.so.0] = "/usr/lib/libpulse-simple.so.0"

# 3. set update-alternatives priority for libpulsecommon package
ALTERNATIVE_PRIORITY_libpulsecommon = "100"

# set update-alternatives register name for libpulsecommon package
ALTERNATIVE_libpulsecommon = "\
                 libpulsecommon-12.2.so \
                "

# set update-alternatives symbolic link path and real target path for libpulsecommon package
ALTERNATIVE_LINK_NAME[libpulsecommon-12.2.so] = "/usr/lib/aarch64-linux-gnu/pulseaudio/libpulsecommon-11.1.so"
ALTERNATIVE_TARGET_libpulsecommon[libpulsecommon-12.2.so] = "/usr/lib/pulseaudio/libpulsecommon-12.2.so"

# 4. set update-alternatives priority for pulseaudio-server package
ALTERNATIVE_PRIORITY_pulseaudio-server = "100"

# set update-alternatives register name for pulseaudio-server package
ALTERNATIVE_pulseaudio-server = "\
                 pactl pulseaudio-system.conf volatiles.04_pulse volatile-var-lib-pulse.service \
                 90-pulseaudio.rules pulseaudio user-pulseaudio.service pulseaudio.socket \
                 daemon.conf default.pa system.pa pulseaudio.service \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-server package
ALTERNATIVE_LINK_NAME[pactl] = "/usr/bin/pactl"

ALTERNATIVE_LINK_NAME[pulseaudio-system.conf] = "/etc/dbus-1/system.d/pulseaudio-system.conf"

ALTERNATIVE_LINK_NAME[volatiles.04_pulse] = "/etc/default/volatiles/volatiles.04_pulse"

ALTERNATIVE_LINK_NAME[volatile-var-lib-pulse.service] = "/lib/systemd/system/volatile-var-lib-pulse.service"

ALTERNATIVE_LINK_NAME[90-pulseaudio.rules] = "/lib/udev/rules.d/90-pulseaudio.rules"

ALTERNATIVE_LINK_NAME[pulseaudio] = "/usr/bin/pulseaudio"

ALTERNATIVE_LINK_NAME[user-pulseaudio.service] = "/usr/lib/systemd/user/pulseaudio.service"

ALTERNATIVE_LINK_NAME[pulseaudio.socket] = "/usr/lib/systemd/user/pulseaudio.socket"

ALTERNATIVE_LINK_NAME[daemon.conf] = "/etc/pulse/daemon.conf"

ALTERNATIVE_LINK_NAME[default.pa] = "/etc/pulse/default.pa"

ALTERNATIVE_LINK_NAME[system.pa] = "/etc/pulse/system.pa"

ALTERNATIVE_LINK_NAME[pulseaudio.service] = "/lib/systemd/system/pulseaudio.service"

# 5. set update-alternatives priority for libpulsecore package
ALTERNATIVE_PRIORITY_libpulsecore = "100"

# set update-alternatives register name for libpulsecore package
ALTERNATIVE_libpulsecore = "\
                 libpulsecore-12.2.so \
                "

# set update-alternatives symbolic link path and real target path for libpulsecore package
ALTERNATIVE_LINK_NAME[libpulsecore-12.2.so] = "/usr/lib/aarch64-linux-gnu/pulseaudio/libpulsecore-11.1.so"
ALTERNATIVE_TARGET_libpulsecore[libpulsecore-12.2.so] = "/usr/lib/pulseaudio/libpulsecore-12.2.so"

# 6. set update-alternatives priority for pulseaudio-lib-alsa-util package
ALTERNATIVE_PRIORITY_pulseaudio-lib-alsa-util = "100"

# set update-alternatives register name for pulseaudio-lib-alsa-util package
ALTERNATIVE_pulseaudio-lib-alsa-util = "\
                 libalsa-util.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-lib-alsa-util package
ALTERNATIVE_LINK_NAME[libalsa-util.so] = "/usr/lib/pulse-11.1/modules/libalsa-util.so"
ALTERNATIVE_TARGET_pulseaudio-lib-alsa-util[libalsa-util.so] = "/usr/lib/pulse-12.2/modules/libalsa-util.so"

# 7. set update-alternatives priority for pulseaudio-lib-cli package
ALTERNATIVE_PRIORITY_pulseaudio-lib-cli = "100"

# set update-alternatives register name for pulseaudio-lib-cli package
ALTERNATIVE_pulseaudio-lib-cli = "\
                 libcli.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-lib-cli package
ALTERNATIVE_LINK_NAME[libcli.so] = "/usr/lib/pulse-11.1/modules/libcli.so"
ALTERNATIVE_TARGET_pulseaudio-lib-cli[libcli.so] = "/usr/lib/pulse-12.2/modules/libcli.so"

# 8. set update-alternatives priority for pulseaudio-lib-protocol-cli package
ALTERNATIVE_PRIORITY_pulseaudio-lib-protocol-cli = "100"

# set update-alternatives register name for pulseaudio-lib-protocol-cli package
ALTERNATIVE_pulseaudio-lib-protocol-cli = "\
                 libprotocol-cli.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-lib-protocol-cli package
ALTERNATIVE_LINK_NAME[libprotocol-cli.so] = "/usr/lib/pulse-11.1/modules/libprotocol-cli.so"
ALTERNATIVE_TARGET_pulseaudio-lib-protocol-cli[libprotocol-cli.so] = "/usr/lib/pulse-12.2/modules/libprotocol-cli.so"

# 9. set update-alternatives priority for pulseaudio-lib-protocol-native package
ALTERNATIVE_PRIORITY_pulseaudio-lib-protocol-native = "100"

# set update-alternatives register name for pulseaudio-lib-protocol-native package
ALTERNATIVE_pulseaudio-lib-protocol-native = "\
                 libprotocol-native.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-lib-protocol-native package
ALTERNATIVE_LINK_NAME[libprotocol-native.so] = "/usr/lib/pulse-11.1/modules/libprotocol-native.so"
ALTERNATIVE_TARGET_pulseaudio-lib-protocol-native[libprotocol-native.so] = "/usr/lib/pulse-12.2/modules/libprotocol-native.so"

# 10. set update-alternatives priority for pulseaudio-misc package
ALTERNATIVE_PRIORITY_pulseaudio-misc = "100"

# set update-alternatives register name for pulseaudio-misc package
ALTERNATIVE_pulseaudio-misc = "\
                 pacat pacmd padsp pasuspender pamon paplay parec parecord \
                 esdcompat libpulsedsp.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-misc package
ALTERNATIVE_LINK_NAME[pacat] = "/usr/bin/pacat"

ALTERNATIVE_LINK_NAME[pacmd] = "/usr/bin/pacmd"

ALTERNATIVE_LINK_NAME[padsp] = "/usr/bin/padsp"

ALTERNATIVE_LINK_NAME[pasuspender] = "/usr/bin/pasuspender"

ALTERNATIVE_LINK_NAME[pamon] = "/usr/bin/pamon"

ALTERNATIVE_LINK_NAME[paplay] = "/usr/bin/paplay"

ALTERNATIVE_LINK_NAME[parec] = "/usr/bin/parec"

ALTERNATIVE_LINK_NAME[parecord] = "/usr/bin/parecord"

ALTERNATIVE_LINK_NAME[esdcompat] = "/usr/bin/esdcompat"

ALTERNATIVE_LINK_NAME[libpulsedsp.so] = "/usr/lib/pulseaudio/libpulsedsp.so"

# 11. set update-alternatives priority for pulseaudio-module-alsa-card package
ALTERNATIVE_PRIORITY_pulseaudio-module-alsa-card = "100"

# set update-alternatives register name for pulseaudio-module-alsa-card package
ALTERNATIVE_pulseaudio-module-alsa-card = "\
                 module-alsa-card.so analog-input-aux.conf analog-input-dock-mic.conf analog-input-fm.conf \
                 analog-input-front-mic.conf analog-input-headphone-mic.conf analog-input-headset-mic.conf \
                 analog-input-internal-mic-always.conf analog-input-internal-mic.conf analog-input-linein.conf \
                 analog-input-mic-line.conf analog-input-mic.conf analog-input-mic.conf.common analog-input-rear-mic.conf \
                 analog-input-tvtuner.conf analog-input-video.conf analog-input.conf analog-input.conf.common  \
                 analog-output-headphones-2.conf analog-output-headphones.conf analog-output-lineout.conf analog-output-mono.conf \
                 analog-output-speaker-always.conf analog-output-speaker.conf analog-output.conf analog-output.conf.common  \
                 hdmi-output-0.conf hdmi-output-1.conf hdmi-output-2.conf hdmi-output-3.conf hdmi-output-4.conf hdmi-output-5.conf \
                 hdmi-output-6.conf hdmi-output-7.conf iec958-stereo-input.conf iec958-stereo-output.conf steelseries-arctis-input.conf \
                 steelseries-arctis-output-mono.conf steelseries-arctis-output-stereo.conf default.conf dell-dock-tb16-usb-audio.conf \
                 force-speaker-and-int-mic.conf force-speaker.conf kinect-audio.conf maudio-fasttrack-pro.conf native-instruments-audio4dj.conf \
                 native-instruments-audio8dj.conf native-instruments-korecontroller.conf native-instruments-traktor-audio10.conf \
                 native-instruments-traktor-audio2.conf native-instruments-traktor-audio6.conf native-instruments-traktorkontrol-s4.conf \
                 sb-omni-surround-5.1.conf steelseries-arctis-usb-audio.conf \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-alsa-card package
ALTERNATIVE_LINK_NAME[module-alsa-card.so] = "/usr/lib/pulse-11.1/modules/module-alsa-card.so"
ALTERNATIVE_TARGET_pulseaudio-module-alsa-card[module-alsa-card.so] = "/usr/lib/pulse-12.2/modules/module-alsa-card.so"

ALTERNATIVE_LINK_NAME[analog-input-aux.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-aux.conf"

ALTERNATIVE_LINK_NAME[analog-input-dock-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-dock-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-fm.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-fm.conf"

ALTERNATIVE_LINK_NAME[analog-input-front-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-front-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-headphone-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-headphone-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-headset-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-headset-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-internal-mic-always.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-internal-mic-always.conf"

ALTERNATIVE_LINK_NAME[analog-input-internal-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-internal-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-linein.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-linein.conf"

ALTERNATIVE_LINK_NAME[analog-input-mic-line.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-mic-line.conf"

ALTERNATIVE_LINK_NAME[analog-input-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-mic.conf.common] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-mic.conf.common"

ALTERNATIVE_LINK_NAME[analog-input-rear-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-rear-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-tvtuner.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-tvtuner.conf"

ALTERNATIVE_LINK_NAME[analog-input-video.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-video.conf"

ALTERNATIVE_LINK_NAME[analog-input.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input.conf"

ALTERNATIVE_LINK_NAME[analog-input.conf.common] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input.conf.common"

ALTERNATIVE_LINK_NAME[analog-output-headphones-2.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-headphones-2.conf"

ALTERNATIVE_LINK_NAME[analog-output-headphones.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-headphones.conf"

ALTERNATIVE_LINK_NAME[analog-output-lineout.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-lineout.conf"

ALTERNATIVE_LINK_NAME[analog-output-mono.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-mono.conf"

ALTERNATIVE_LINK_NAME[analog-output-speaker-always.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-speaker-always.conf"

ALTERNATIVE_LINK_NAME[analog-output-speaker.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-speaker.conf"

ALTERNATIVE_LINK_NAME[analog-output.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output.conf"

ALTERNATIVE_LINK_NAME[analog-output.conf.common] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output.conf.common"

ALTERNATIVE_LINK_NAME[hdmi-output-0.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-0.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-1.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-1.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-2.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-2.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-3.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-3.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-4.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-4.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-5.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-5.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-6.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-6.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-7.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-7.conf"

ALTERNATIVE_LINK_NAME[iec958-stereo-input.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/iec958-stereo-input.conf"

ALTERNATIVE_LINK_NAME[iec958-stereo-output.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/iec958-stereo-output.conf"

ALTERNATIVE_LINK_NAME[steelseries-arctis-input.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/steelseries-arctis-input.conf"

ALTERNATIVE_LINK_NAME[steelseries-arctis-output-mono.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/steelseries-arctis-output-mono.conf"

ALTERNATIVE_LINK_NAME[steelseries-arctis-output-stereo.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/steelseries-arctis-output-stereo.conf"

ALTERNATIVE_LINK_NAME[default.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/default.conf"

ALTERNATIVE_LINK_NAME[dell-dock-tb16-usb-audio.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/dell-dock-tb16-usb-audio.conf"

ALTERNATIVE_LINK_NAME[force-speaker-and-int-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/force-speaker-and-int-mic.conf"

ALTERNATIVE_LINK_NAME[force-speaker.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/force-speaker.conf"

ALTERNATIVE_LINK_NAME[kinect-audio.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/kinect-audio.conf"

ALTERNATIVE_LINK_NAME[maudio-fasttrack-pro.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/maudio-fasttrack-pro.conf"

ALTERNATIVE_LINK_NAME[native-instruments-audio4dj.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-audio4dj.conf"

ALTERNATIVE_LINK_NAME[native-instruments-audio8dj.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-audio8dj.conf"

ALTERNATIVE_LINK_NAME[native-instruments-korecontroller.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-korecontroller.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktor-audio10.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktor-audio10.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktor-audio2.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktor-audio2.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktor-audio6.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktor-audio6.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktorkontrol-s4.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktorkontrol-s4.conf"

ALTERNATIVE_LINK_NAME[sb-omni-surround-5.1.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/sb-omni-surround-5.1.conf"

ALTERNATIVE_LINK_NAME[steelseries-arctis-usb-audio.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/steelseries-arctis-usb-audio.conf"

# 12. set update-alternatives priority for pulseaudio-module-role-ducking package
ALTERNATIVE_PRIORITY_pulseaudio-module-role-ducking = "100"

# set update-alternatives register name for pulseaudio-module-role-ducking package
ALTERNATIVE_pulseaudio-module-role-ducking = "\
                 module-role-ducking.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-role-ducking package
ALTERNATIVE_LINK_NAME[module-role-ducking.so] = "/usr/lib/pulse-11.1/modules/module-role-ducking.so"
ALTERNATIVE_TARGET_pulseaudio-module-role-ducking[module-role-ducking.so] = "/usr/lib/pulse-12.2/modules/module-role-ducking.so"

# 13. set update-alternatives priority for pulseaudio-module-detect package
ALTERNATIVE_PRIORITY_pulseaudio-module-detect = "100"

# set update-alternatives register name for pulseaudio-module-detect package
ALTERNATIVE_pulseaudio-module-detect = "\
                 module-detect.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-detect package
ALTERNATIVE_LINK_NAME[module-detect.so] = "/usr/lib/pulse-11.1/modules/module-detect.so"
ALTERNATIVE_TARGET_pulseaudio-module-detect[module-detect.so] = "/usr/lib/pulse-12.2/modules/module-detect.so"

# 14. set update-alternatives priority for pulseaudio-module-augment-properties package
ALTERNATIVE_PRIORITY_pulseaudio-module-augment-properties = "100"

# set update-alternatives register name for pulseaudio-module-augment-properties package
ALTERNATIVE_pulseaudio-module-augment-properties = "\
                 module-augment-properties.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-augment-properties package
ALTERNATIVE_LINK_NAME[module-augment-properties.so] = "/usr/lib/pulse-11.1/modules/module-augment-properties.so"
ALTERNATIVE_TARGET_pulseaudio-module-augment-properties[module-augment-properties.so] = "/usr/lib/pulse-12.2/modules/module-augment-properties.so"

# 15. set update-alternatives priority for pulseaudio-module-device-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-device-restore = "100"

# set update-alternatives register name for pulseaudio-module-device-restore package
ALTERNATIVE_pulseaudio-module-device-restore = "\
                 module-device-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-device-restore package
ALTERNATIVE_LINK_NAME[module-device-restore.so] = "/usr/lib/pulse-11.1/modules/module-device-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-device-restore[module-device-restore.so] = "/usr/lib/pulse-12.2/modules/module-device-restore.so"

# 16. set update-alternatives priority for pulseaudio-module-cli-protocol-unix package
ALTERNATIVE_PRIORITY_pulseaudio-module-cli-protocol-unix = "100"

# set update-alternatives register name for pulseaudio-module-cli-protocol-unix package
ALTERNATIVE_pulseaudio-module-cli-protocol-unix = "\
                 module-cli-protocol-unix.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-cli-protocol-unix package
ALTERNATIVE_LINK_NAME[module-cli-protocol-unix.so] = "/usr/lib/pulse-11.1/modules/module-cli-protocol-unix.so"
ALTERNATIVE_TARGET_pulseaudio-module-cli-protocol-unix[module-cli-protocol-unix.so] = "/usr/lib/pulse-12.2/modules/module-cli-protocol-unix.so"

# 17. set update-alternatives priority for pulseaudio-module-position-event-sounds package
ALTERNATIVE_PRIORITY_pulseaudio-module-position-event-sounds = "100"

# set update-alternatives register name for pulseaudio-module-position-event-sounds package
ALTERNATIVE_pulseaudio-module-position-event-sounds = "\
                 module-position-event-sounds.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-position-event-sounds package
ALTERNATIVE_LINK_NAME[module-position-event-sounds.so] = "/usr/lib/pulse-11.1/modules/module-position-event-sounds.so"
ALTERNATIVE_TARGET_pulseaudio-module-position-event-sounds[module-position-event-sounds.so] = "/usr/lib/pulse-12.2/modules/module-position-event-sounds.so"

# 18. set update-alternatives priority for pulseaudio-module-stream-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-stream-restore = "100"

# set update-alternatives register name for pulseaudio-module-stream-restore package
ALTERNATIVE_pulseaudio-module-stream-restore = "\
                 module-stream-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-stream-restore package
ALTERNATIVE_LINK_NAME[module-stream-restore.so] = "/usr/lib/pulse-11.1/modules/module-stream-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-stream-restore[module-stream-restore.so] = "/usr/lib/pulse-12.2/modules/module-stream-restore.so"

# 19. set update-alternatives priority for pulseaudio-module-dbus-protocol package
ALTERNATIVE_PRIORITY_pulseaudio-module-dbus-protocol = "100"

# set update-alternatives register name for pulseaudio-module-dbus-protocol package
ALTERNATIVE_pulseaudio-module-dbus-protocol = "\
                 module-dbus-protocol.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-dbus-protocol package
ALTERNATIVE_LINK_NAME[module-dbus-protocol.so] = "/usr/lib/pulse-11.1/modules/module-dbus-protocol.so"
ALTERNATIVE_TARGET_pulseaudio-module-dbus-protocol[module-dbus-protocol.so] = "/usr/lib/pulse-12.2/modules/module-dbus-protocol.so"

# 20. set update-alternatives priority for pulseaudio-module-filter-heuristics package
ALTERNATIVE_PRIORITY_pulseaudio-module-filter-heuristics = "100"

# set update-alternatives register name for pulseaudio-module-filter-heuristics package
ALTERNATIVE_pulseaudio-module-filter-heuristics = "\
                 module-filter-heuristics.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-filter-heuristics package
ALTERNATIVE_LINK_NAME[module-filter-heuristics.so] = "/usr/lib/pulse-11.1/modules/module-filter-heuristics.so"
ALTERNATIVE_TARGET_pulseaudio-module-filter-heuristics[module-filter-heuristics.so] = "/usr/lib/pulse-12.2/modules/module-filter-heuristics.so"

# 21. set update-alternatives priority for pulseaudio-module-null-source package
ALTERNATIVE_PRIORITY_pulseaudio-module-null-source = "100"

# set update-alternatives register name for pulseaudio-module-null-source package
ALTERNATIVE_pulseaudio-module-null-source = "\
                 module-null-source.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-null-source package
ALTERNATIVE_LINK_NAME[module-null-source.so] = "/usr/lib/pulse-11.1/modules/module-null-source.so"
ALTERNATIVE_TARGET_pulseaudio-module-null-source[module-null-source.so] = "/usr/lib/pulse-12.2/modules/module-null-source.so"

# 22. set update-alternatives priority for pulseaudio-module-combine-sink package
ALTERNATIVE_PRIORITY_pulseaudio-module-combine-sink = "100"

# set update-alternatives register name for pulseaudio-module-combine-sink package
ALTERNATIVE_pulseaudio-module-combine-sink = "\
                 module-combine-sink.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-combine-sink package
ALTERNATIVE_LINK_NAME[module-combine-sink.so] = "/usr/lib/pulse-11.1/modules/module-combine-sink.so"
ALTERNATIVE_TARGET_pulseaudio-module-combine-sink[module-combine-sink.so] = "/usr/lib/pulse-12.2/modules/module-combine-sink.so"

# 23. set update-alternatives priority for pulseaudio-module-native-protocol-unix package
ALTERNATIVE_PRIORITY_pulseaudio-module-native-protocol-unix = "100"

# set update-alternatives register name for pulseaudio-module-native-protocol-unix package
ALTERNATIVE_pulseaudio-module-native-protocol-unix = "\
                 module-native-protocol-unix.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-native-protocol-unix package
ALTERNATIVE_LINK_NAME[module-native-protocol-unix.so] = "/usr/lib/pulse-11.1/modules/module-native-protocol-unix.so"
ALTERNATIVE_TARGET_pulseaudio-module-native-protocol-unix[module-native-protocol-unix.so] = "/usr/lib/pulse-12.2/modules/module-native-protocol-unix.so"

# 24. set update-alternatives priority for pulseaudio-module-switch-on-port-available package
ALTERNATIVE_PRIORITY_pulseaudio-module-switch-on-port-available = "100"

# set update-alternatives register name for pulseaudio-module-switch-on-port-available package
ALTERNATIVE_pulseaudio-module-switch-on-port-available = "\
                 module-switch-on-port-available.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-switch-on-port-available package
ALTERNATIVE_LINK_NAME[module-switch-on-port-available.so] = "/usr/lib/pulse-11.1/modules/module-switch-on-port-available.so"
ALTERNATIVE_TARGET_pulseaudio-module-switch-on-port-available[module-switch-on-port-available.so] = "/usr/lib/pulse-12.2/modules/module-switch-on-port-available.so"

# 25. set update-alternatives priority for pulseaudio-module-alsa-sink package
ALTERNATIVE_PRIORITY_pulseaudio-module-alsa-sink = "100"

# set update-alternatives register name for pulseaudio-module-alsa-sink package
ALTERNATIVE_pulseaudio-module-alsa-sink = "\
                 module-alsa-sink.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-alsa-sink package
ALTERNATIVE_LINK_NAME[module-alsa-sink.so] = "/usr/lib/pulse-11.1/modules/module-alsa-sink.so"
ALTERNATIVE_TARGET_pulseaudio-module-alsa-sink[module-alsa-sink.so] = "/usr/lib/pulse-12.2/modules/module-alsa-sink.so"

# 26. set update-alternatives priority for pulseaudio-module-loopback package
ALTERNATIVE_PRIORITY_pulseaudio-module-loopback = "100"

# set update-alternatives register name for pulseaudio-module-loopback package
ALTERNATIVE_pulseaudio-module-loopback = "\
                 module-loopback.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-loopback package
ALTERNATIVE_LINK_NAME[module-loopback.so] = "/usr/lib/pulse-11.1/modules/module-loopback.so"
ALTERNATIVE_TARGET_pulseaudio-module-loopback[module-loopback.so] = "/usr/lib/pulse-12.2/modules/module-loopback.so"

# 27. set update-alternatives priority for pulseaudio-module-alsa-source package
ALTERNATIVE_PRIORITY_pulseaudio-module-alsa-source = "100"

# set update-alternatives register name for pulseaudio-module-alsa-source package
ALTERNATIVE_pulseaudio-module-alsa-source = "\
                 module-alsa-source.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-alsa-source package
ALTERNATIVE_LINK_NAME[module-alsa-source.so] = "/usr/lib/pulse-11.1/modules/module-alsa-source.so"
ALTERNATIVE_TARGET_pulseaudio-module-alsa-source[module-alsa-source.so] = "/usr/lib/pulse-12.2/modules/module-alsa-source.so"

# 28. set update-alternatives priority for pulseaudio-module-role-cork package
ALTERNATIVE_PRIORITY_pulseaudio-module-role-cork = "100"

# set update-alternatives register name for pulseaudio-module-role-cork package
ALTERNATIVE_pulseaudio-module-role-cork = "\
                 module-role-cork.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-role-cork package
ALTERNATIVE_LINK_NAME[module-role-cork.so] = "/usr/lib/pulse-11.1/modules/module-role-cork.so"
ALTERNATIVE_TARGET_pulseaudio-module-role-cork[module-role-cork.so] = "/usr/lib/pulse-12.2/modules/module-role-cork.so"

# 29. set update-alternatives priority for pulseaudio-module-card-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-card-restore = "100"

# set update-alternatives register name for pulseaudio-module-card-restore package
ALTERNATIVE_pulseaudio-module-card-restore = "\
                 module-card-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-card-restore package
ALTERNATIVE_LINK_NAME[module-card-restore.so] = "/usr/lib/pulse-11.1/modules/module-card-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-card-restore[module-card-restore.so] = "/usr/lib/pulse-12.2/modules/module-card-restore.so"

# 30. set update-alternatives priority for pulseaudio-module-filter-apply package
ALTERNATIVE_PRIORITY_pulseaudio-module-filter-apply = "100"

# set update-alternatives register name for pulseaudio-module-filter-apply package
ALTERNATIVE_pulseaudio-module-filter-apply = "\
                 module-filter-apply.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-filter-apply package
ALTERNATIVE_LINK_NAME[module-filter-apply.so] = "/usr/lib/pulse-11.1/modules/module-filter-apply.so"
ALTERNATIVE_TARGET_pulseaudio-module-filter-apply[module-filter-apply.so] = "/usr/lib/pulse-12.2/modules/module-filter-apply.so"

# 31. set update-alternatives priority for pulseaudio-module-default-device-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-default-device-restore = "100"

# set update-alternatives register name for pulseaudio-module-default-device-restore package
ALTERNATIVE_pulseaudio-module-default-device-restore = "\
                 module-default-device-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-default-device-restore package
ALTERNATIVE_LINK_NAME[module-default-device-restore.so] = "/usr/lib/pulse-11.1/modules/module-default-device-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-default-device-restore[module-default-device-restore.so] = "/usr/lib/pulse-12.2/modules/module-default-device-restore.so"

# 32. set update-alternatives priority for pulseaudio-module-udev-detect package
ALTERNATIVE_PRIORITY_pulseaudio-module-udev-detect = "100"

# set update-alternatives register name for pulseaudio-module-udev-detect package
ALTERNATIVE_pulseaudio-module-udev-detect = "\
                 module-udev-detect.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-udev-detect package
ALTERNATIVE_LINK_NAME[module-udev-detect.so] = "/usr/lib/pulse-11.1/modules/module-udev-detect.so"
ALTERNATIVE_TARGET_pulseaudio-module-udev-detect[module-udev-detect.so] = "/usr/lib/pulse-12.2/modules/module-udev-detect.so"

# 33. set update-alternatives priority for pulseaudio-module-rescue-streams package
ALTERNATIVE_PRIORITY_pulseaudio-module-rescue-streams = "100"

# set update-alternatives register name for pulseaudio-module-rescue-streams package
ALTERNATIVE_pulseaudio-module-rescue-streams = "\
                 module-rescue-streams.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-rescue-streams package
ALTERNATIVE_LINK_NAME[module-rescue-streams.so] = "/usr/lib/pulse-11.1/modules/module-rescue-streams.so"
ALTERNATIVE_TARGET_pulseaudio-module-rescue-streams[module-rescue-streams.so] = "/usr/lib/pulse-12.2/modules/module-rescue-streams.so"

# 34. set update-alternatives priority for pulseaudio-module-null-sink package
ALTERNATIVE_PRIORITY_pulseaudio-module-null-sink = "100"

# set update-alternatives register name for pulseaudio-module-null-sink package
ALTERNATIVE_pulseaudio-module-null-sink = "\
                 module-null-sink.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-null-sink package
ALTERNATIVE_LINK_NAME[module-null-sink.so] = "/usr/lib/pulse-11.1/modules/module-null-sink.so"
ALTERNATIVE_TARGET_pulseaudio-module-null-sink[module-null-sink.so] = "/usr/lib/pulse-12.2/modules/module-null-sink.so"

# 35. set update-alternatives priority for pulseaudio-module-intended-roles package
ALTERNATIVE_PRIORITY_pulseaudio-module-intended-roles = "100"

# set update-alternatives register name for pulseaudio-module-intended-roles package
ALTERNATIVE_pulseaudio-module-intended-roles = "\
                 module-intended-roles.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-intended-roles package
ALTERNATIVE_LINK_NAME[module-intended-roles.so] = "/usr/lib/pulse-11.1/modules/module-intended-roles.so"
ALTERNATIVE_TARGET_pulseaudio-module-intended-roles[module-intended-roles.so] = "/usr/lib/pulse-12.2/modules/module-intended-roles.so"

# 36. set update-alternatives priority for pulseaudio-module-suspend-on-idle package
ALTERNATIVE_PRIORITY_pulseaudio-module-suspend-on-idle= "100"

# set update-alternatives register name for pulseaudio-module-suspend-on-idle package
ALTERNATIVE_pulseaudio-module-suspend-on-idle= "\
                 module-suspend-on-idle.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-suspend-on-idle package
ALTERNATIVE_LINK_NAME[module-suspend-on-idle.so] = "/usr/lib/pulse-11.1/modules/module-suspend-on-idle.so"
ALTERNATIVE_TARGET_pulseaudio-module-suspend-on-idle[module-suspend-on-idle.so] = "/usr/lib/pulse-12.2/modules/module-suspend-on-idle.so"

# 37. set update-alternatives priority for pulseaudio-module-role-ignore package
ALTERNATIVE_PRIORITY_pulseaudio-module-role-ignore= "100"

# set update-alternatives register name for pulseaudio-module-role-ignore package
ALTERNATIVE_pulseaudio-module-role-ignore= "\
                 module-role-ignore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-role-ignore package
ALTERNATIVE_LINK_NAME[module-role-ignore.so] = "/usr/lib/pulse-12.2/modules/module-role-ignore.so"

# 38. set update-alternatives priority for pulseaudio-module-role-exclusive package
ALTERNATIVE_PRIORITY_pulseaudio-module-role-exclusive= "100"

# set update-alternatives register name for pulseaudio-module-role-exclusive package
ALTERNATIVE_pulseaudio-module-role-exclusive= "\
                 module-role-exclusive.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-role-exclusive package
ALTERNATIVE_LINK_NAME[module-role-exclusive.so] = "/usr/lib/pulse-12.2/modules/module-role-exclusive.so"

# 39. set update-alternatives priority for pulseaudio-module-policy-voiceui package
ALTERNATIVE_PRIORITY_pulseaudio-module-policy-voiceui= "100"

# set update-alternatives register name for pulseaudio-module-policy-voiceui package
ALTERNATIVE_pulseaudio-module-policy-voiceui= "\
                 module-policy-voiceui.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-policy-voiceui package
ALTERNATIVE_LINK_NAME[module-policy-voiceui.so] = "/usr/lib/pulse-12.2/modules/module-policy-voiceui.so"

# 40. set update-alternatives priority for pulseaudio-module-qsthw package
ALTERNATIVE_PRIORITY_pulseaudio-module-qsthw= "100"

# set update-alternatives register name for pulseaudio-module-qsthw package
ALTERNATIVE_pulseaudio-module-qsthw= "\
                 module-qsthw.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-qsthw package
ALTERNATIVE_LINK_NAME[module-qsthw.so] = "/usr/lib/pulse-12.2/modules/module-qsthw.so"

# 41. set update-alternatives priority for pulseaudio-module-always-sink package
ALTERNATIVE_PRIORITY_pulseaudio-module-always-sink= "100"

# set update-alternatives register name for pulseaudio-module-always-sink package
ALTERNATIVE_pulseaudio-module-always-sink= "\
                 module-always-sink.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-always-sink package
ALTERNATIVE_LINK_NAME[module-always-sink.so] = "/usr/lib/pulse-12.2/modules/module-always-sink.so"

# 42. set update-alternatives priority for pulseaudio-module-qahw-card package
ALTERNATIVE_PRIORITY_pulseaudio-module-qahw-card= "100"

# set update-alternatives register name for pulseaudio-module-qahw-card package
ALTERNATIVE_pulseaudio-module-qahw-card= "\
                 module-qahw-card.so apq8009-tashalite-snd-card.conf kona-iot-snd-card.conf msm8998-tasha-snd-card.conf \
                 qcs405-amic-snd-card.conf qcs405-csra1-snd-card.conf qcs405-csra6-snd-card.conf qcs405-csra8-snd-card.conf \
                 qcs405-csra8plus2-snd-card.conf qcs405-snd-card.conf qcs405-wsa-snd-card.conf sm6150-idp-snd-card.conf \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-qahw-card package
ALTERNATIVE_LINK_NAME[module-qahw-card.so] = "/usr/lib/pulse-12.2/modules/module-qahw-card.so"

ALTERNATIVE_LINK_NAME[apq8009-tashalite-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/apq8009-tashalite-snd-card.conf"

ALTERNATIVE_LINK_NAME[kona-iot-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/kona-iot-snd-card.conf"

ALTERNATIVE_LINK_NAME[msm8998-tasha-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/msm8998-tasha-snd-card.conf"

ALTERNATIVE_LINK_NAME[qcs405-amic-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/qcs405-amic-snd-card.conf"

ALTERNATIVE_LINK_NAME[qcs405-csra1-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/qcs405-csra1-snd-card.conf"

ALTERNATIVE_LINK_NAME[qcs405-csra6-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/qcs405-csra6-snd-card.conf"

ALTERNATIVE_LINK_NAME[qcs405-csra8-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/qcs405-csra8-snd-card.conf"

ALTERNATIVE_LINK_NAME[qcs405-csra8plus2-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/qcs405-csra8plus2-snd-card.conf"

ALTERNATIVE_LINK_NAME[qcs405-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/qcs405-snd-card.conf"

ALTERNATIVE_LINK_NAME[qcs405-wsa-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/qcs405-wsa-snd-card.conf"

ALTERNATIVE_LINK_NAME[sm6150-idp-snd-card.conf] = "/usr/share/pulseaudio/qahw/configs/sm6150-idp-snd-card.conf"
