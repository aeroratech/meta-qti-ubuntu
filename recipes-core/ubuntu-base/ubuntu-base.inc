PATH =. "/usr/bin:/usr/sbin:/usr/local/sbin:/usr/sbin:/sbin:/bin:"

#Packages to ensure boot up and WLAN function
UBUN_BASIC_PACKAGES = " systemd \
                        udev \
                        dhcpcd5 \
                        libnl-3-dev \
                        libnl-genl-3-dev \
                        libnl-route-3-dev \
                        kmod \
                        inetutils-ping \
                        wget \
                        net-tools \
                        wireless-tools \
                        psmisc \
                        usbutils \
                        libffi6 \
                        libssl1.1 \
                        libssl-dev \
                        openssl \
                        zlib1g \
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
                                 dnsmasq \
                                 libevdev2 \
                                 libevdev-dev \
                                 libbsd0 \
                                 libbsd-dev \
                                 libpciaccess0 \
                                 libpciaccess-dev \
                                 xutils-dev \
                                 libpthread-stubs0-dev \
                                 libpixman-1-dev \
                                 libpixman-1-0 \
                                "

#Packages to enasure display and audio function
UBUN_MULTIMEDIA_BASIC_PACKAFES = " alsa-utils \
                                   xkb-data \
                                   libcairo2 \
                                   libpng16-16 \
                                   libxkbcommon0 \
                                   libwayland-client0 \
                                   libwayland-cursor0 \
                                   libwayland-server0 \
                                   libwayland-dev \
                                   libjpeg-turbo8 \
                                   libdrm-dev \
                                   libdrm2 \
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
                             gstreamer1.0-rtsp \
                             libgstrtspserver-1.0-0 \
                             gstreamer1.0-libav \
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
                             libcap2 \
                             libcap-ng0 \
                             libcap-dev \
                             libcap-ng-dev \
                             libatomic1 \
                             libatomic-ops-dev \
                             libvorbis0a \
                             libvorbis-dev \
                             libvorbisenc2 \
                             libvorbisfile3 \
                             libspeexdsp1 \
                             libspeexdsp-dev \
                             libspeex1 \
                             libspeex-dev \
                             libogg0 \
                             libogg-dev \
                             libsamplerate0 \
                             libsamplerate0-dev \
                             libsndfile1-dev \
                             libsndfile1 \
                             libflac8 \
                             libflac++6v5 \
                             libflac++-dev \
                             libasound2-plugins \
                             "



UBUN_BASIC_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_BASIC_PERF_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES}"
UBUN_FULLSTACK_PERF_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES}"
