PATH =. "/usr/bin:/usr/sbin:/usr/local/sbin:/usr/sbin:/sbin:/bin:"
UBUNTU_BASE_TAR="ubuntu-base-20.04.3-base-arm64.tar.gz"

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
                        libffi7 \
                        libssl1.1 \		
                        libssl-dev \
                        openssl \
                        procps \
                        zlib1g \
			zip \
                       "


UBUN_PLATFORM_EXTRA_PACKAGES = " libseccomp-dev \
libmtdev-dev \
libmtdev1 \
libinput10 \
libinput-dev \
                                 libseccomp2 \
                                 seccomp \
                                 openssh-server \
                                 tftp-hpa \
                                 tftpd-hpa \
                                 vim \
				 hostapd \
                                 apparmor \
                                 libatomic1 \
                                 libgomp1 \
                                 dnsmasq \
				 iw \
                                 libevdev2 \
                                 libevdev-dev \
                                 libbsd0 \
                                 libbsd-dev \
                                 libpciaccess0 \
                                 libpciaccess-dev \
                                 libion0 \
                                 xutils-dev \
                                 libpthread-stubs0-dev \
                                 libpixman-1-dev \
                                 libpixman-1-0 \
                                 libjsoncpp1 \
                                 libjsoncpp-dev \
                                 libltdl7 \
                                 libltdl-dev \
                                 libext2fs-dev \
                                 comerr-dev \
                                 ss-dev \
                                 fscrypt \
				 libconsole-bridge-dev \
				 libkmod-dev \
                                "

UBUN_DEBUG_PACKAGES = " gdb \
                        strace \
                        valgrind \
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
                                   libjpeg-turbo8 \
                                   libgdk-pixbuf2.0-0 \
                                   libdrm-tests \
                                   libxau6-dbg \
                                   libxdmcp6-dbg \
                                   libxext6-dbg \
                                   python3-dbg \
                                   python2-dbg \
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
                             curl \
                             libcurl4 \
                             libcurl4-openssl-dev \
                             libidn2-0 \
                             libidn2-dev \
                             libunistring2 \
                             libunistring-dev \
                             libnghttp2-14 \
                             libpsl5 \
                             libgssapi-krb5-2 \
                             libldap-2.4-2 \
                             librtmp1 \
                             libkrb5-3 \
                             libk5crypto3 \
                             libcom-err2 \
                             libkrb5support0 \
                             libsasl2-2 \
                             libgssapi3-heimdal \
                             libgnutls30 \
                             libhogweed5 \
                             libnettle7 \
                             libgmp10 \
                             libp11-kit0 \
                             libtasn1-6 \
                             libkeyutils1 \
                             libheimntlm0-heimdal \
                             libkrb5-26-heimdal \
                             libasn1-8-heimdal \
                             libhcrypto4-heimdal \
                             libroken18-heimdal \
                             libwind0-heimdal \
                             libheimbase1-heimdal \
                             libhx509-5-heimdal \
                             libsqlite3-0 \
                             lsb-release \
                             python3-argcomplete \
                             gnupg2 \
                             libsqlite3-dev \
                             weston \
                             libweston-8-0 \
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
                             libevdev2 \
                             libwrap0 \
                             libwrap0-dev \
                             liba52-0.7.4 \
                             liba52-0.7.4-dev \
                             libqhull-dev \
                             libqhull7 \
                             libcrypto++6 \
                             libcrypto++-dev \
                             libcroco3 \
                             libcroco3-dev \
                             libgudev-1.0-0 \
                             libgudev-1.0-dev \
                             libid3tag0 \
                             libid3tag0-dev \
                             librsvg2-2 \
                             librsvg2-dev \
                             libsoup2.4-1 \
                             libsoup2.4-dev \
                             liborc-0.4-0 \
                             liborc-0.4-dev \
			     libtheora0 \
                             libtheora-dev \
                             liburcu6 \
                             liburcu-dev \
                             libwebp6 \
                             libwebpdemux2 \
                             libwebpmux3 \
                             libwebp-dev \
                             libmpg123-0 \
                             libmpg123-dev \
                             libout123-0 \
                             libtag1v5-vanilla \
                             libtagc0 \
                             libtagc0-dev \
                             libtag1-dev \
                             libjson-c4 \
                             libjson-c-dev \
                             iso-codes \
                             linux-libc-dev \
                             "


UBUN_BASIC_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_BASIC_PERF_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES} ${UBUN_DEBUG_PACKAGES}"
#UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES}"
UBUN_FULLSTACK_PERF_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES}"
