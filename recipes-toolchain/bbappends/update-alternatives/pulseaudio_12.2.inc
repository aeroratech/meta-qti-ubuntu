# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for pulseaudio-module-alsa-card package
ALTERNATIVE_PRIORITY_pulseaudio-module-alsa-card = "100"

# set update-alternatives register name for pulseaudio-module-alsa-card package
ALTERNATIVE_pulseaudio-module-alsa-card = " analog-input-aux.conf analog-input-dock-mic.conf analog-input-fm.conf analog-input-front-mic.conf analog-input-headphone-mic.conf analog-input-headset-mic.conf analog-input-internal-mic-always.conf analog-input-internal-mic.conf analog-input-linein.conf analog-input-mic-line.conf analog-input-mic.conf analog-input-mic.conf.common analog-input-rear-mic.conf analog-input-tvtuner.conf analog-input-video.conf analog-input.conf analog-input.conf.common analog-output-headphones-2.conf analog-output-headphones.conf analog-output-lineout.conf analog-output-mono.conf analog-output-speaker-always.conf analog-output-speaker.conf analog-output.conf analog-output.conf.common hdmi-output-0.conf hdmi-output-1.conf hdmi-output-2.conf hdmi-output-3.conf hdmi-output-4.conf hdmi-output-5.conf hdmi-output-6.conf hdmi-output-7.conf iec958-stereo-output.conf default.conf dell-dock-tb16-usb-audio.conf force-speaker-and-int-mic.conf force-speaker.conf kinect-audio.conf maudio-fasttrack-pro.conf native-instruments-audio4dj.conf native-instruments-audio8dj.conf native-instruments-korecontroller.conf native-instruments-traktor-audio10.conf native-instruments-traktor-audio2.conf native-instruments-traktor-audio6.conf native-instruments-traktorkontrol-s4.conf sb-omni-surround-5.1.conf module-alsa-card.so "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-alsa-card package
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

ALTERNATIVE_LINK_NAME[iec958-stereo-output.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/iec958-stereo-output.conf"

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

ALTERNATIVE_LINK_NAME[module-alsa-card.so] = "/usr/lib/pulse-11.1/modules/module-alsa-card.so"
ALTERNATIVE_TARGET_pulseaudio-module-alsa-card[module-alsa-card.so] = "/usr/lib/pulse-12.2/modules/module-alsa-card.so"

# set update-alternatives priority for pulseaudio-misc package
ALTERNATIVE_PRIORITY_pulseaudio-misc = "100"

# set update-alternatives register name for pulseaudio-misc package
ALTERNATIVE_pulseaudio-misc = " esdcompat pacat pacmd padsp pamon paplay parec parecord pasuspender pax11publish"

# set update-alternatives symbolic link path and real target path for pulseaudio-misc package
ALTERNATIVE_LINK_NAME[esdcompat] = "/usr/bin/esdcompat"

ALTERNATIVE_LINK_NAME[pacat] = "/usr/bin/pacat"

ALTERNATIVE_LINK_NAME[pacmd] = "/usr/bin/pacmd"

ALTERNATIVE_LINK_NAME[padsp] = "/usr/bin/padsp"

ALTERNATIVE_LINK_NAME[pamon] = "/usr/bin/pamon"

ALTERNATIVE_LINK_NAME[paplay] = "/usr/bin/paplay"

ALTERNATIVE_LINK_NAME[parec] = "/usr/bin/parec"

ALTERNATIVE_LINK_NAME[parecord] = "/usr/bin/parecord"

ALTERNATIVE_LINK_NAME[pasuspender] = "/usr/bin/pasuspender"

ALTERNATIVE_LINK_NAME[pax11publish] = "/usr/bin/pax11publish"

# set update-alternatives priority for libpulse package
ALTERNATIVE_PRIORITY_libpulse = "100"

# set update-alternatives register name for libpulse package
ALTERNATIVE_libpulse = " client.conf libpulse.so.0 "

# set update-alternatives symbolic link path and real target path for libpulse package
ALTERNATIVE_LINK_NAME[client.conf] = "/etc/pulse/client.conf"

ALTERNATIVE_LINK_NAME[libpulse.so.0] = "/usr/lib/aarch64-linux-gnu/libpulse.so.0"
ALTERNATIVE_TARGET_libpulse[libpulse.so.0] = "/usr/lib/libpulse.so.0"

# set update-alternatives priority for pulseaudio-server package
ALTERNATIVE_PRIORITY_pulseaudio-server = "100"

# set update-alternatives register name for pulseaudio-server package
ALTERNATIVE_pulseaudio-server = " pulseaudio-system.conf daemon.conf default.pa system.pa 90-pulseaudio.rules pulseaudio user-pulseaudio.service pulseaudio.socket pactl pulseaudio.desktop start-pulseaudio-x11 pulseaudio.service "

# set update-alternatives symbolic link path and real target path for pulseaudio-server package
ALTERNATIVE_LINK_NAME[pulseaudio-system.conf] = "/etc/dbus-1/system.d/pulseaudio-system.conf"

ALTERNATIVE_LINK_NAME[daemon.conf] = "/etc/pulse/daemon.conf"

ALTERNATIVE_LINK_NAME[default.pa] = "/etc/pulse/default.pa"

ALTERNATIVE_LINK_NAME[system.pa] = "/etc/pulse/system.pa"

ALTERNATIVE_LINK_NAME[90-pulseaudio.rules] = "/lib/udev/rules.d/90-pulseaudio.rules"

ALTERNATIVE_LINK_NAME[pulseaudio] = "/usr/bin/pulseaudio"

ALTERNATIVE_LINK_NAME[user-pulseaudio.service] = "/usr/lib/systemd/user/pulseaudio.service"

ALTERNATIVE_LINK_NAME[pulseaudio.socket] = "/usr/lib/systemd/user/pulseaudio.socket"

ALTERNATIVE_LINK_NAME[pactl] = "/usr/bin/pactl"

ALTERNATIVE_LINK_NAME[pulseaudio.desktop] = "/etc/xdg/autostart/pulseaudio.desktop"

ALTERNATIVE_LINK_NAME[start-pulseaudio-x11] = "/usr/bin/start-pulseaudio-x11"

ALTERNATIVE_LINK_NAME[pulseaudio.service] = "/usr/lib/systemd/user/pulseaudio.service"
ALTERNATIVE_TARGET_pulseaudio-server[pulseaudio.service] = "/lib/systemd/system/pulseaudio.service"

# set update-alternatives priority for pulseaudio-module-role-ducking package
ALTERNATIVE_PRIORITY_pulseaudio-module-role-ducking = "100"

# set update-alternatives register name for pulseaudio-module-role-ducking package
ALTERNATIVE_pulseaudio-module-role-ducking = "\
                 module-role-ducking.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-role-ducking package
ALTERNATIVE_LINK_NAME[module-role-ducking.so] = "/usr/lib/pulse-11.1/modules/module-role-ducking.so"
ALTERNATIVE_TARGET_pulseaudio-module-role-ducking[module-role-ducking.so] = "/usr/lib/pulse-12.2/modules/module-role-ducking.so"

# set update-alternatives priority for pulseaudio-module-detect package
ALTERNATIVE_PRIORITY_pulseaudio-module-detect = "100"

# set update-alternatives register name for pulseaudio-module-detect package
ALTERNATIVE_pulseaudio-module-detect = "\
                 module-detect.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-detect package
ALTERNATIVE_LINK_NAME[module-detect.so] = "/usr/lib/pulse-11.1/modules/module-detect.so"
ALTERNATIVE_TARGET_pulseaudio-module-detect[module-detect.so] = "/usr/lib/pulse-12.2/modules/module-detect.so"

# set update-alternatives priority for pulseaudio-module-augment-properties package
ALTERNATIVE_PRIORITY_pulseaudio-module-augment-properties = "100"

# set update-alternatives register name for pulseaudio-module-augment-properties package
ALTERNATIVE_pulseaudio-module-augment-properties = "\
                 module-augment-properties.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-augment-properties package
ALTERNATIVE_LINK_NAME[module-augment-properties.so] = "/usr/lib/pulse-11.1/modules/module-augment-properties.so"
ALTERNATIVE_TARGET_pulseaudio-module-augment-properties[module-augment-properties.so] = "/usr/lib/pulse-12.2/modules/module-augment-properties.so"

# set update-alternatives priority for pulseaudio-module-device-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-device-restore = "100"

# set update-alternatives register name for pulseaudio-module-device-restore package
ALTERNATIVE_pulseaudio-module-device-restore = "\
                 module-device-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-device-restore package
ALTERNATIVE_LINK_NAME[module-device-restore.so] = "/usr/lib/pulse-11.1/modules/module-device-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-device-restore[module-device-restore.so] = "/usr/lib/pulse-12.2/modules/module-device-restore.so"

# set update-alternatives priority for pulseaudio-module-cli-protocol-unix package
ALTERNATIVE_PRIORITY_pulseaudio-module-cli-protocol-unix = "100"

# set update-alternatives register name for pulseaudio-module-cli-protocol-unix package
ALTERNATIVE_pulseaudio-module-cli-protocol-unix = "\
                 module-cli-protocol-unix.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-cli-protocol-unix package
ALTERNATIVE_LINK_NAME[module-cli-protocol-unix.so] = "/usr/lib/pulse-11.1/modules/module-cli-protocol-unix.so"
ALTERNATIVE_TARGET_pulseaudio-module-cli-protocol-unix[module-cli-protocol-unix.so] = "/usr/lib/pulse-12.2/modules/module-cli-protocol-unix.so"

# set update-alternatives priority for pulseaudio-module-position-event-sounds package
ALTERNATIVE_PRIORITY_pulseaudio-module-position-event-sounds = "100"

# set update-alternatives register name for pulseaudio-module-position-event-sounds package
ALTERNATIVE_pulseaudio-module-position-event-sounds = "\
                 module-position-event-sounds.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-position-event-sounds package
ALTERNATIVE_LINK_NAME[module-position-event-sounds.so] = "/usr/lib/pulse-11.1/modules/module-position-event-sounds.so"
ALTERNATIVE_TARGET_pulseaudio-module-position-event-sounds[module-position-event-sounds.so] = "/usr/lib/pulse-12.2/modules/module-position-event-sounds.so"

# set update-alternatives priority for pulseaudio-module-stream-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-stream-restore = "100"

# set update-alternatives register name for pulseaudio-module-stream-restore package
ALTERNATIVE_pulseaudio-module-stream-restore = "\
                 module-stream-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-stream-restore package
ALTERNATIVE_LINK_NAME[module-stream-restore.so] = "/usr/lib/pulse-11.1/modules/module-stream-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-stream-restore[module-stream-restore.so] = "/usr/lib/pulse-12.2/modules/module-stream-restore.so"

# set update-alternatives priority for pulseaudio-module-dbus-protocol package
ALTERNATIVE_PRIORITY_pulseaudio-module-dbus-protocol = "100"

# set update-alternatives register name for pulseaudio-module-dbus-protocol package
ALTERNATIVE_pulseaudio-module-dbus-protocol = "\
                 module-dbus-protocol.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-dbus-protocol package
ALTERNATIVE_LINK_NAME[module-dbus-protocol.so] = "/usr/lib/pulse-11.1/modules/module-dbus-protocol.so"
ALTERNATIVE_TARGET_pulseaudio-module-dbus-protocol[module-dbus-protocol.so] = "/usr/lib/pulse-12.2/modules/module-dbus-protocol.so"

# set update-alternatives priority for pulseaudio-module-filter-heuristics package
ALTERNATIVE_PRIORITY_pulseaudio-module-filter-heuristics = "100"

# set update-alternatives register name for pulseaudio-module-filter-heuristics package
ALTERNATIVE_pulseaudio-module-filter-heuristics = "\
                 module-filter-heuristics.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-filter-heuristics package
ALTERNATIVE_LINK_NAME[module-filter-heuristics.so] = "/usr/lib/pulse-11.1/modules/module-filter-heuristics.so"
ALTERNATIVE_TARGET_pulseaudio-module-filter-heuristics[module-filter-heuristics.so] = "/usr/lib/pulse-12.2/modules/module-filter-heuristics.so"

# set update-alternatives priority for pulseaudio-module-null-source package
ALTERNATIVE_PRIORITY_pulseaudio-module-null-source = "100"

# set update-alternatives register name for pulseaudio-module-null-source package
ALTERNATIVE_pulseaudio-module-null-source = "\
                 module-null-source.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-null-source package
ALTERNATIVE_LINK_NAME[module-null-source.so] = "/usr/lib/pulse-11.1/modules/module-null-source.so"
ALTERNATIVE_TARGET_pulseaudio-module-null-source[module-null-source.so] = "/usr/lib/pulse-12.2/modules/module-null-source.so"

# set update-alternatives priority for pulseaudio-module-combine-sink package
ALTERNATIVE_PRIORITY_pulseaudio-module-combine-sink = "100"

# set update-alternatives register name for pulseaudio-module-combine-sink package
ALTERNATIVE_pulseaudio-module-combine-sink = "\
                 module-combine-sink.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-combine-sink package
ALTERNATIVE_LINK_NAME[module-combine-sink.so] = "/usr/lib/pulse-11.1/modules/module-combine-sink.so"
ALTERNATIVE_TARGET_pulseaudio-module-combine-sink[module-combine-sink.so] = "/usr/lib/pulse-12.2/modules/module-combine-sink.so"

# set update-alternatives priority for pulseaudio-module-native-protocol-unix package
ALTERNATIVE_PRIORITY_pulseaudio-module-native-protocol-unix = "100"

# set update-alternatives register name for pulseaudio-module-native-protocol-unix package
ALTERNATIVE_pulseaudio-module-native-protocol-unix = "\
                 module-native-protocol-unix.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-native-protocol-unix package
ALTERNATIVE_LINK_NAME[module-native-protocol-unix.so] = "/usr/lib/pulse-11.1/modules/module-native-protocol-unix.so"
ALTERNATIVE_TARGET_pulseaudio-module-native-protocol-unix[module-native-protocol-unix.so] = "/usr/lib/pulse-12.2/modules/module-native-protocol-unix.so"

# set update-alternatives priority for pulseaudio-module-switch-on-port-available package
ALTERNATIVE_PRIORITY_pulseaudio-module-switch-on-port-available = "100"

# set update-alternatives register name for pulseaudio-module-switch-on-port-available package
ALTERNATIVE_pulseaudio-module-switch-on-port-available = "\
                 module-switch-on-port-available.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-switch-on-port-available package
ALTERNATIVE_LINK_NAME[module-switch-on-port-available.so] = "/usr/lib/pulse-11.1/modules/module-switch-on-port-available.so"
ALTERNATIVE_TARGET_pulseaudio-module-switch-on-port-available[module-switch-on-port-available.so] = "/usr/lib/pulse-12.2/modules/module-switch-on-port-available.so"

# set update-alternatives priority for pulseaudio-module-alsa-sink package
ALTERNATIVE_PRIORITY_pulseaudio-module-alsa-sink = "100"

# set update-alternatives register name for pulseaudio-module-alsa-sink package
ALTERNATIVE_pulseaudio-module-alsa-sink = "\
                 module-alsa-sink.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-alsa-sink package
ALTERNATIVE_LINK_NAME[module-alsa-sink.so] = "/usr/lib/pulse-11.1/modules/module-alsa-sink.so"
ALTERNATIVE_TARGET_pulseaudio-module-alsa-sink[module-alsa-sink.so] = "/usr/lib/pulse-12.2/modules/module-alsa-sink.so"

# set update-alternatives priority for pulseaudio-module-loopback package
ALTERNATIVE_PRIORITY_pulseaudio-module-loopback = "100"

# set update-alternatives register name for pulseaudio-module-loopback package
ALTERNATIVE_pulseaudio-module-loopback = "\
                 module-loopback.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-loopback package
ALTERNATIVE_LINK_NAME[module-loopback.so] = "/usr/lib/pulse-11.1/modules/module-loopback.so"
ALTERNATIVE_TARGET_pulseaudio-module-loopback[module-loopback.so] = "/usr/lib/pulse-12.2/modules/module-loopback.so"

# set update-alternatives priority for pulseaudio-module-alsa-source package
ALTERNATIVE_PRIORITY_pulseaudio-module-alsa-source = "100"

# set update-alternatives register name for pulseaudio-module-alsa-source package
ALTERNATIVE_pulseaudio-module-alsa-source = "\
                 module-alsa-source.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-alsa-source package
ALTERNATIVE_LINK_NAME[module-alsa-source.so] = "/usr/lib/pulse-11.1/modules/module-alsa-source.so"
ALTERNATIVE_TARGET_pulseaudio-module-alsa-source[module-alsa-source.so] = "/usr/lib/pulse-12.2/modules/module-alsa-source.so"

# set update-alternatives priority for pulseaudio-module-role-cork package
ALTERNATIVE_PRIORITY_pulseaudio-module-role-cork = "100"

# set update-alternatives register name for pulseaudio-module-role-cork package
ALTERNATIVE_pulseaudio-module-role-cork = "\
                 module-role-cork.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-role-cork package
ALTERNATIVE_LINK_NAME[module-role-cork.so] = "/usr/lib/pulse-11.1/modules/module-role-cork.so"
ALTERNATIVE_TARGET_pulseaudio-module-role-cork[module-role-cork.so] = "/usr/lib/pulse-12.2/modules/module-role-cork.so"

# set update-alternatives priority for pulseaudio-module-card-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-card-restore = "100"

# set update-alternatives register name for pulseaudio-module-card-restore package
ALTERNATIVE_pulseaudio-module-card-restore = "\
                 module-card-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-card-restore package
ALTERNATIVE_LINK_NAME[module-card-restore.so] = "/usr/lib/pulse-11.1/modules/module-card-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-card-restore[module-card-restore.so] = "/usr/lib/pulse-12.2/modules/module-card-restore.so"

# set update-alternatives priority for pulseaudio-module-filter-apply package
ALTERNATIVE_PRIORITY_pulseaudio-module-filter-apply = "100"

# set update-alternatives register name for pulseaudio-module-filter-apply package
ALTERNATIVE_pulseaudio-module-filter-apply = "\
                 module-filter-apply.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-filter-apply package
ALTERNATIVE_LINK_NAME[module-filter-apply.so] = "/usr/lib/pulse-11.1/modules/module-filter-apply.so"
ALTERNATIVE_TARGET_pulseaudio-module-filter-apply[module-filter-apply.so] = "/usr/lib/pulse-12.2/modules/module-filter-apply.so"

# set update-alternatives priority for pulseaudio-module-default-device-restore package
ALTERNATIVE_PRIORITY_pulseaudio-module-default-device-restore = "100"

# set update-alternatives register name for pulseaudio-module-default-device-restore package
ALTERNATIVE_pulseaudio-module-default-device-restore = "\
                 module-default-device-restore.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-default-device-restore package
ALTERNATIVE_LINK_NAME[module-default-device-restore.so] = "/usr/lib/pulse-11.1/modules/module-default-device-restore.so"
ALTERNATIVE_TARGET_pulseaudio-module-default-device-restore[module-default-device-restore.so] = "/usr/lib/pulse-12.2/modules/module-default-device-restore.so"

# set update-alternatives priority for pulseaudio-module-udev-detect package
ALTERNATIVE_PRIORITY_pulseaudio-module-udev-detect = "100"

# set update-alternatives register name for pulseaudio-module-udev-detect package
ALTERNATIVE_pulseaudio-module-udev-detect = "\
                 module-udev-detect.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-udev-detect package
ALTERNATIVE_LINK_NAME[module-udev-detect.so] = "/usr/lib/pulse-11.1/modules/module-udev-detect.so"
ALTERNATIVE_TARGET_pulseaudio-module-udev-detect[module-udev-detect.so] = "/usr/lib/pulse-12.2/modules/module-udev-detect.so"

# set update-alternatives priority for pulseaudio-module-rescue-streams package
ALTERNATIVE_PRIORITY_pulseaudio-module-rescue-streams = "100"

# set update-alternatives register name for pulseaudio-module-rescue-streams package
ALTERNATIVE_pulseaudio-module-rescue-streams = "\
                 module-rescue-streams.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-rescue-streams package
ALTERNATIVE_LINK_NAME[module-rescue-streams.so] = "/usr/lib/pulse-11.1/modules/module-rescue-streams.so"
ALTERNATIVE_TARGET_pulseaudio-module-rescue-streams[module-rescue-streams.so] = "/usr/lib/pulse-12.2/modules/module-rescue-streams.so"

# set update-alternatives priority for pulseaudio-module-null-sink package
ALTERNATIVE_PRIORITY_pulseaudio-module-null-sink = "100"

# set update-alternatives register name for pulseaudio-module-null-sink package
ALTERNATIVE_pulseaudio-module-null-sink = "\
                 module-null-sink.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-null-sink package
ALTERNATIVE_LINK_NAME[module-null-sink.so] = "/usr/lib/pulse-11.1/modules/module-null-sink.so"
ALTERNATIVE_TARGET_pulseaudio-module-null-sink[module-null-sink.so] = "/usr/lib/pulse-12.2/modules/module-null-sink.so"

# set update-alternatives priority for pulseaudio-module-intended-roles package
ALTERNATIVE_PRIORITY_pulseaudio-module-intended-roles = "100"

# set update-alternatives register name for pulseaudio-module-intended-roles package
ALTERNATIVE_pulseaudio-module-intended-roles = "\
                 module-intended-roles.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-intended-roles package
ALTERNATIVE_LINK_NAME[module-intended-roles.so] = "/usr/lib/pulse-11.1/modules/module-intended-roles.so"
ALTERNATIVE_TARGET_pulseaudio-module-intended-roles[module-intended-roles.so] = "/usr/lib/pulse-12.2/modules/module-intended-roles.so"

# set update-alternatives priority for pulseaudio-module-suspend-on-idle package
ALTERNATIVE_PRIORITY_pulseaudio-module-suspend-on-idle= "100"

# set update-alternatives register name for pulseaudio-module-suspend-on-idle package
ALTERNATIVE_pulseaudio-module-suspend-on-idle= "\
                 module-suspend-on-idle.so \
                "

# set update-alternatives symbolic link path and real target path for pulseaudio-module-suspend-on-idle package
ALTERNATIVE_LINK_NAME[module-suspend-on-idle.so] = "/usr/lib/pulse-11.1/modules/module-suspend-on-idle.so"
ALTERNATIVE_TARGET_pulseaudio-module-suspend-on-idle[module-suspend-on-idle.so] = "/usr/lib/pulse-12.2/modules/module-suspend-on-idle.so"
