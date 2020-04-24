PSEUDO_DISABLED="1"
FAKEROOTENV = " PSEUDO_DISABLED=1"
FAKEROOTBASEENV = "PSEUDO_DISABLED=1"
FAKEROOTCMD = ""
FAKEROOTNOENV = "PSEUDO_UNLOAD=1"
FAKEROOTDIRS = ""
PREFERRED_PROVIDER_virtual/fakeroot-native ?= ""
PATH =. "/usr/bin:/usr/sbin:/usr/local/sbin:/usr/sbin:/sbin:/bin:"

#Packages to ensure boot up and WLAN function
UBUN_BASIC_PACKAGES = " systemd \
                        udev \
                        dhcpcd5 \
                        libnl-3-dev \
                        libnl-genl-3-dev \
                        kmod \
                        wpasupplicant \
                        inetutils-ping \
                        wget \
                        net-tools \
                        wireless-tools \
                        usbutils \
                       "


UBUN_PLATFORM_EXTRA_PACKAGES = " libseccomp-dev \
                                 libseccomp2 \
                                 seccomp \
                                 gdb \
                                 openssh-server \
                                 tftp-hpa \
                                 tftpd-hpa \
                                 vim \
                                 apparmor \
                                 libatomic1 \
                                 libgomp1 \
                                "

#Packages to enasure display and audio function
UBUN_MULTIMEDIA_BASIC_PACKAFES = " alsa-utils \
                                   xkb-data \
                                   libcairo2 \
                                   libpng16-16 \
                                   libxkbcommon0 \
                                 "

#video, camera packages
UBUN_MULTIMEDIA_PACKAFES = " gstreamer1.0-alsa \
                             gstreamer1.0-gl \
                             gir1.2-gstreamer-1.0 \
                             gstreamer1.0-gtk3 \
                             gstreamer1.0-plugins-bad \
                             gstreamer1.0-plugins-bad-dbg \
                             gstreamer1.0-plugins-base \
                             gstreamer1.0-plugins-base-dbg \
                             gstreamer1.0-plugins-base-apps \
                             gstreamer1.0-plugins-good \
                             gstreamer1.0-plugins-good-dbg \
                             gstreamer1.0-plugins-ugly \
                             gstreamer1.0-plugins-ugly-dbg \
                             libgstreamer-gl1.0-0 \
                             libgstreamer-plugins-bad1.0-0 \
                             libgstreamer-plugins-base1.0-0 \
                             libgstreamer-plugins-good1.0-0 \
                             libgstreamer1.0-0 gstreamer1.0-libav \
                             gstreamer1.0-plugins-good \
                             gstreamer1.0-plugins-base \
                             gstreamer1.0-plugins-bad \
                             gstreamer1.0-tools \
                             libgstreamer-gl1.0-0 \
                             locales \
                             curl \
                             lsb-release \
                             python3-argcomplete \
                             gnupg2 \
                             libsqlite3-dev \
                             libitm1 \
                             libtsan0 \
                             liblsan0 \
                             libcc1-0 \
                             libjpeg-turbo8 \
                             "



UBUN_BASIC_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_BASIC_PERF_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES}"
UBUN_FULLSTACK_PERF_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES}"
