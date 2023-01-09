#######################################################################
# This configuration defines an linux for Ubuntu distribution required
# for running the system on qti chipsets
#######################################################################
#require ${COREBASE}/meta-qti-bsp/conf/distro/include/qti-distro-base.inc
require ${COREBASE}/meta-qti-distro/conf/distro/include/qti-distro-base.inc
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

BUILD_IMAGES_FROM_FEEDS = "1"

# Enable qpermissions.inc, adding required user in rootfs
USERADDEXTENSION = "qpermissions"
#USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} += " \
                        -g 53 diag; \
                        -g 3003 inet; \
                        -g 19 input; \
                        -g 70 shutdown; \
                        --system systemd-journal; \
                        --system sshd; \
                        --system messagebus; \
                        --system netdev; \
                        --system _apt; \
                        -g 1015 sdcard; \
                        -g 1301 rebooters; \
                        -g 2901 kmsg; \
                        -g 3004 net_raw; \
                        -g 3005 net_admin; \
                        -g 3009 readproc; \
                        -g 3010 wakelock; \
                        -g 3013 qwes; \
                        "
USERADD_PARAM_${PN}_append =  " -g diag -G root diag ;"
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
# ros2-foxy:       Enable ros2 foxy
# vslam            Enable vslam

DISTRO_FEATURES_append = " \
    auto-explore \
    opengl \
    opencl \
    pulseaudio \
    tensorflow-lite \
    wayland \
    drm \
    qwesd \
    ros2-foxy \
    vslam \
    "

## QTI defined distro features ##
# qti-audio:         Support QTI audio solution
# qti-audio-encoder: Support QTI audio encoder
# qti-audio-cal:     Support QTI audio calibration solution
# qti-bluetooth:     Support QTI bluetooth solution
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
    qti-bluetooth \
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
    qti-mmframeworks \
    qti-sensors \
    qti-gst-ros2 \
    "

## bootfs parameter ##
BOOTFS_TYPE = "ext3"
BOOTFS_BLOCK_SIZE = "4096"
BOOTFS_SIZE_EXT3 = "96M"

## kernel configuration
PREFERRED_VERSION_linux-msm = "5.4"
PREFERRED_VERSION_linux-msm-headers = "5.4"
DEFAULTTUNE = "aarch64"
KERNEL_DYNAMIC_DEFCONFIG = "True"
UFS_BSG_DEV_USAGE = "True"
