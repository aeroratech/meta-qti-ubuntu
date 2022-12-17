# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "libpulse" package
ALTERNATIVE_PRIORITY_libpulse = "100"

# set update-alternatives register name for "libpulse" package
ALTERNATIVE_libpulse = " libpulse.so.0 client.conf"

# set update-alternatives symbolic link path or real target path for "libpulse" package
QTI_SEPECIFIC_LINK[libpulse.so.0] = "/usr/lib/libpulse.so.0"
ALTERNATIVE_LINK_NAME[libpulse.so.0] = "/usr/lib/aarch64-linux-gnu/libpulse.so.0"

ALTERNATIVE_LINK_NAME[client.conf] = "/etc/pulse/client.conf"

# set update-alternatives priority for "libpulse-simple" package
ALTERNATIVE_PRIORITY_libpulse-simple = "100"

# set update-alternatives register name for "libpulse-simple" package
ALTERNATIVE_libpulse-simple = " libpulse-simple.so.0.1.1 libpulse-simple.so.0"

# set update-alternatives symbolic link path or real target path for "libpulse-simple" package
QTI_SEPECIFIC_LINK[libpulse-simple.so.0] = "/usr/lib/libpulse-simple.so.0"
ALTERNATIVE_LINK_NAME[libpulse-simple.so.0] = "/usr/lib/aarch64-linux-gnu/libpulse-simple.so.0"

QTI_SEPECIFIC_LINK[libpulse-simple.so.0.1.1] = "/usr/lib/libpulse-simple.so.0.1.1"
ALTERNATIVE_LINK_NAME[libpulse-simple.so.0.1.1] = "/usr/lib/aarch64-linux-gnu/libpulse-simple.so.0.1.1"

# set update-alternatives priority for "pulseaudio-lib-cli" package
ALTERNATIVE_PRIORITY_pulseaudio-lib-cli = "100"

# set update-alternatives register name for "pulseaudio-lib-cli" package
ALTERNATIVE_pulseaudio-lib-cli = " libcli.so"

# set update-alternatives symbolic link path or real target path for "pulseaudio-lib-cli" package
QTI_SEPECIFIC_LINK[libcli.so] = "/usr/lib/pulse-13.0/modules/libcli.so"
ALTERNATIVE_LINK_NAME[libcli.so] = "/usr/lib/pulse-13.99.1/modules/libcli.so"


# set update-alternatives priority for "pulseaudio-misc" package
ALTERNATIVE_PRIORITY_pulseaudio-misc = "100"

# set update-alternatives register name for "pulseaudio-misc" package
ALTERNATIVE_pulseaudio-misc = " libpulsedsp.so"

# set update-alternatives symbolic link path or real target path for "pulseaudio-misc" package
QTI_SEPECIFIC_LINK[libpulsedsp.so] = "/usr/lib/pulseaudio/libpulsedsp.so"
ALTERNATIVE_LINK_NAME[libpulsedsp.so] = "/usr/lib/aarch64-linux-gnu/pulseaudio/libpulsedsp.so"

# set update-alternatives priority for "pulseaudio-module-alsa-card" package
ALTERNATIVE_PRIORITY_pulseaudio-module-alsa-card = "100"

# set update-alternatives register name for "pulseaudio-module-alsa-card" package
ALTERNATIVE_pulseaudio-module-alsa-card = " hdmi-output-0.conf native-instruments-traktor-audio2.conf analog-input-tvtuner.conf default.conf hdmi-output-7.conf force-speaker.conf sb-omni-surround-5.1.conf hdmi-output-5.conf analog-output-headphones-2.conf analog-input-internal-mic.conf native-instruments-traktor-audio6.conf native-instruments-traktorkontrol-s4.conf analog-input-headphone-mic.conf hdmi-output-2.conf analog-output-mono.conf hdmi-output-4.conf analog-input-internal-mic-always.conf analog-input-linein.conf native-instruments-korecontroller.conf native-instruments-traktor-audio10.conf analog-input-mic.conf analog-input-mic-line.conf iec958-stereo-output.conf analog-input-video.conf maudio-fasttrack-pro.conf hdmi-output-1.conf force-speaker-and-int-mic.conf analog-output-headphones.conf analog-output-speaker-always.conf analog-input-dock-mic.conf analog-input-headset-mic.conf native-instruments-audio8dj.conf analog-input-aux.conf analog-input-front-mic.conf dell-dock-tb16-usb-audio.conf analog-input-mic.conf.common hdmi-output-3.conf analog-output-lineout.conf iec958-stereo-input.conf analog-input-rear-mic.conf analog-output.conf.common kinect-audio.conf native-instruments-audio4dj.conf analog-output-speaker.conf analog-input.conf analog-input.conf.common analog-input-fm.conf cmedia-high-speed-true-hdaudio.conf analog-output.conf hdmi-output-6.conf"

# set update-alternatives symbolic link path or real target path for "pulseaudio-module-alsa-card" package
ALTERNATIVE_LINK_NAME[native-instruments-audio8dj.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-audio8dj.conf"

ALTERNATIVE_LINK_NAME[analog-output-lineout.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-lineout.conf"

ALTERNATIVE_LINK_NAME[maudio-fasttrack-pro.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/maudio-fasttrack-pro.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-5.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-5.conf"

ALTERNATIVE_LINK_NAME[sb-omni-surround-5.1.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/sb-omni-surround-5.1.conf"

ALTERNATIVE_LINK_NAME[analog-input-headset-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-headset-mic.conf"

ALTERNATIVE_LINK_NAME[cmedia-high-speed-true-hdaudio.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/cmedia-high-speed-true-hdaudio.conf"

ALTERNATIVE_LINK_NAME[analog-output.conf.common] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output.conf.common"

ALTERNATIVE_LINK_NAME[hdmi-output-6.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-6.conf"

ALTERNATIVE_LINK_NAME[analog-output-mono.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-mono.conf"

ALTERNATIVE_LINK_NAME[analog-input-tvtuner.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-tvtuner.conf"

ALTERNATIVE_LINK_NAME[analog-input-linein.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-linein.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktor-audio2.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktor-audio2.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktor-audio6.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktor-audio6.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktorkontrol-s4.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktorkontrol-s4.conf"

ALTERNATIVE_LINK_NAME[analog-input-internal-mic-always.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-internal-mic-always.conf"

ALTERNATIVE_LINK_NAME[analog-output-headphones-2.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-headphones-2.conf"

ALTERNATIVE_LINK_NAME[iec958-stereo-output.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/iec958-stereo-output.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-7.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-7.conf"

ALTERNATIVE_LINK_NAME[analog-input-mic.conf.common] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-mic.conf.common"

ALTERNATIVE_LINK_NAME[hdmi-output-3.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-3.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-0.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-0.conf"

ALTERNATIVE_LINK_NAME[iec958-stereo-input.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/iec958-stereo-input.conf"

ALTERNATIVE_LINK_NAME[native-instruments-audio4dj.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-audio4dj.conf"

ALTERNATIVE_LINK_NAME[analog-input-rear-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-rear-mic.conf"

ALTERNATIVE_LINK_NAME[force-speaker.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/force-speaker.conf"

ALTERNATIVE_LINK_NAME[analog-input-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input.conf"

ALTERNATIVE_LINK_NAME[analog-input-fm.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-fm.conf"

ALTERNATIVE_LINK_NAME[native-instruments-traktor-audio10.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-traktor-audio10.conf"

ALTERNATIVE_LINK_NAME[analog-input-headphone-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-headphone-mic.conf"

ALTERNATIVE_LINK_NAME[force-speaker-and-int-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/force-speaker-and-int-mic.conf"

ALTERNATIVE_LINK_NAME[kinect-audio.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/kinect-audio.conf"

ALTERNATIVE_LINK_NAME[dell-dock-tb16-usb-audio.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/dell-dock-tb16-usb-audio.conf"

ALTERNATIVE_LINK_NAME[analog-output-speaker.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-speaker.conf"

ALTERNATIVE_LINK_NAME[analog-input-video.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-video.conf"

ALTERNATIVE_LINK_NAME[native-instruments-korecontroller.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/native-instruments-korecontroller.conf"

ALTERNATIVE_LINK_NAME[analog-output.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output.conf"

ALTERNATIVE_LINK_NAME[analog-input.conf.common] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input.conf.common"

ALTERNATIVE_LINK_NAME[default.conf] = "/usr/share/pulseaudio/alsa-mixer/profile-sets/default.conf"

ALTERNATIVE_LINK_NAME[analog-input-front-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-front-mic.conf"

ALTERNATIVE_LINK_NAME[analog-output-headphones.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-headphones.conf"

ALTERNATIVE_LINK_NAME[analog-input-aux.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-aux.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-2.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-2.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-1.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-1.conf"

ALTERNATIVE_LINK_NAME[analog-input-internal-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-internal-mic.conf"

ALTERNATIVE_LINK_NAME[hdmi-output-4.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/hdmi-output-4.conf"

ALTERNATIVE_LINK_NAME[analog-input-dock-mic.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-dock-mic.conf"

ALTERNATIVE_LINK_NAME[analog-input-mic-line.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-input-mic-line.conf"

ALTERNATIVE_LINK_NAME[analog-output-speaker-always.conf] = "/usr/share/pulseaudio/alsa-mixer/paths/analog-output-speaker-always.conf"

# set update-alternatives priority for "pulseaudio-server" package
ALTERNATIVE_PRIORITY_pulseaudio-server = "100"

# set update-alternatives register name for "pulseaudio-server" package
ALTERNATIVE_pulseaudio-server = " default.pa parecord pulseaudio.service system.pa pasuspender pactl 90-pulseaudio.rules daemon.conf pacmd pulseaudio-system.conf parec pulseaudio.socket pamon padsp pacat paplay pulseaudio"

# set update-alternatives symbolic link path or real target path for "pulseaudio-server" package
ALTERNATIVE_LINK_NAME[pulseaudio.socket] = "/usr/lib/systemd/user/pulseaudio.socket"

ALTERNATIVE_LINK_NAME[pacat] = "/usr/bin/pacat"

ALTERNATIVE_LINK_NAME[pamon] = "/usr/bin/pamon"

ALTERNATIVE_LINK_NAME[pasuspender] = "/usr/bin/pasuspender"

ALTERNATIVE_LINK_NAME[pulseaudio.service] = "/usr/lib/systemd/user/pulseaudio.service"

ALTERNATIVE_LINK_NAME[system.pa] = "/etc/pulse/system.pa"

ALTERNATIVE_LINK_NAME[pulseaudio] = "/usr/bin/pulseaudio"

ALTERNATIVE_LINK_NAME[parec] = "/usr/bin/parec"

ALTERNATIVE_LINK_NAME[padsp] = "/usr/bin/padsp"

ALTERNATIVE_LINK_NAME[parecord] = "/usr/bin/parecord"

ALTERNATIVE_LINK_NAME[pactl] = "/usr/bin/pactl"

ALTERNATIVE_LINK_NAME[90-pulseaudio.rules] = "/lib/udev/rules.d/90-pulseaudio.rules"

ALTERNATIVE_LINK_NAME[pacmd] = "/usr/bin/pacmd"

ALTERNATIVE_LINK_NAME[default.pa] = "/etc/pulse/default.pa"

ALTERNATIVE_LINK_NAME[daemon.conf] = "/etc/pulse/daemon.conf"

ALTERNATIVE_LINK_NAME[paplay] = "/usr/bin/paplay"

ALTERNATIVE_LINK_NAME[pulseaudio-system.conf] = "/etc/dbus-1/system.d/pulseaudio-system.conf"

