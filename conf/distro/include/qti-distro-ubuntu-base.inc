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
SYSTEM_SIZE_EXT4 = "33554432000"
KERNEL_CMD_PARAMS += "apparmor=1 security=apparmor"

##################################################################
# list of distro features
##################################################################
#
# opencl:          Include the Open Computing Language
# pulseaudio:      Use pulseaudio audio server
# tensorflow-lite: Include the tensorflow lite inference engine.

DISTRO_FEATURES_append = "opencl pulseaudio tensorflow-lite"

## QTI defined distro features ##
# qti-audio:     Support QTI audio solution
# qti-bluetooth: Support QTI bluetooth solution
# qti-camera:    Support QTI camera solution
# qti-mm-parser: Support QTI multimeida parsers
# qti-video-decoder: Support QTI video decoder
# qti-video-encoder: Support QTI video encoder

DISTRO_FEATURES_append = " qti-audio qti-video-decoder qti-video-encoder qti-adsp qti-cdsp audio-dlkm qti-camera qti-fastcv"
