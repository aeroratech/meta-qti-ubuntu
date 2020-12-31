#######################################################################
# This configuration defines an linux for Ubuntu distribution required
# for running the system on qti chipsets
#######################################################################
require ${COREBASE}/meta-qti-bsp/conf/distro/include/qti-distro-base.inc

DISTRO_NAME = "ubuntu"
DISTROOVERRIDES =. "ubuntu:"
DISTRO_FEATURES_remove = "dm-verity"

PRODUCT ?= "ubuntu"

# Set DEBUG_BUILD to use flags from DEBUG_OPTIMIZATION variable
#DEBUG_BUILD = "1"

TCMODE = 'external-ubuntu'
TCLIBC = 'glibc'
PACKAGE_CLASSES = 'qpackage_deb'

#SECURITY_PIE_CFLAGS = "-fstack-protector-strong -D_FORTIFY_SOURCE=2 -Wa,--noexecstack ${SECURITY_STRINGFORMAT}"

#SECURITY_CFLAGS_pn-edk2 = "-Wa,--noexecstack"
SECURITY_CFLAGS_pn-mesa = "${SECURITY_PIC_CFLAGS}"

BUILD_IMAGES_FROM_FEEDS = "1"

# Enable qpermissions.inc, adding required user in rootfs
USERADDEXTENSION = "qpermissions"
#USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} += " \
                        -g 53 diag; \
                        -g 3003 inet; \
                        -g 19 input; \
                        -g 70 shutdown; \
                        -g 995 systemd-journal; \
                        -g 996 sshd; \
                        -g 997 messagebus; \
                        -g 998 netdev; \
                        -g 999 _apt; \
                        -g 1015 sdcard; \
                        -g 1301 rebooters; \
                        -g 2901 kmsg; \
                        -g 3004 net_raw; \
                        -g 3005 net_admin; \
                        -g 3009 readproc; \
                        -g 3010 wakelock; \
                        -g 3013 qwes; \
                        "
USERADD_PARAM_${PN}_append =  " -g diag -G root diag "
# Sizes for EXT4 (in bytes)
SYSTEM_SIZE_EXT4 = "107374182400"
KERNEL_CMD_PARAMS += "apparmor=1 security=apparmor"

##################################################################
# list of distro features
##################################################################
#
# opencl:          Include the Open Computing Language
# pulseaudio:      Use pulseaudio audio server
# tensorflow-lite: Include the tensorflow lite inference engine.
# wayland:         Include the Wayland display server protocol
# drm:             Use DRM display drivers, provided machine supports it
# qwes             Enable qwes feature support

DISTRO_FEATURES_append = " \
    opencl \
    opengl \
    vulkan \
    pulseaudio \
    tensorflow-lite \
    wayland \
    drm \
    qwesd \
    x11 \
    "

## QTI defined distro features ##
# qti-audio:         Support QTI audio solution
# qti-audio-encoder: Support QTI audio encoder
# qti-audio-cal:     Support QTI audio calibration solution
# qti-video:         Support QTI video solution
# qti-video-decoder: Support QTI video decoder
# qti-video-encoder: Support QTI video encoder
# qti-adsp:          Support QTI adsp solution
# qti-cdsp:          Support QTI cdsp solution
# audio-dlkm:        Support QTI audio drivers
# qti-camera:        Support QTI camera solution
# qti-fastcv:        Support QTI fastcv solution
# qti-qmmf:          Support QMMF
# qti-security:      Support QTI security solution
# qti-gst-ros2:      Support QTI gst ros2
# qti-mmframeworks:  Support QTI mmframeworks (synx) driver

DISTRO_FEATURES_append = " \
    qti-audio \
    qti-audio-encoder \
    qti-audio-cal \
    qti-video \
    qti-video-decoder \
    qti-video-encoder \
    qti-adsp \
    qti-cdsp \
    audio-dlkm \
    qti-camera \
    qti-fastcv \
    qti-qmmf \
    qti-security \
    qti-gst-ros2 \
    qti-sensors \
    qti-mmframeworks \
    "

## bootfs parameter ##
BOOTFS_TYPE = "ext3"
BOOTFS_BLOCK_SIZE = "4096"
BOOTFS_SIZE_EXT3 = "96M"
