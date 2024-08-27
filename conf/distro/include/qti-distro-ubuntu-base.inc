#######################################################################
# This configuration defines an linux for Ubuntu distribution required
# for running the system on qti chipsets
#######################################################################
require ${COREBASE}/meta-qti-bsp/conf/distro/include/qti-distro-base.inc

DISTRO_NAME = "ubuntu"
DISTROOVERRIDES =. "ubuntu:"
DISTRO_FEATURES_remove = "dm-verity pulseaudio"

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
                        --system  messagebus; \
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
USERADD_PARAM_${PN}_append =  " -g diag -G root diag "
# Sizes for EXT4 (in bytes)
SYSTEM_SIZE_EXT4 = "33554432000"
KERNEL_CMD_PARAMS += "apparmor=1 security=apparmor"


## QTI defined distro features ##
# qti-adsp:          Support QTI adsp solution
# qti-cdsp:          Support QTI cdsp solution

DISTRO_FEATURES_append = " \
    qti-adsp \
    qti-cdsp \
    qim-sdk-disable \
    "

## bootfs parameter ##
BOOTFS_TYPE = "ext3"
BOOTFS_BLOCK_SIZE = "4096"
BOOTFS_SIZE_EXT3 = "96M"
