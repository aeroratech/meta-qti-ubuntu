PATH =. "/usr/bin:/usr/sbin:/usr/local/sbin:/usr/sbin:/sbin:/bin:"
UBUNTU_BASE_TAR="ubuntu-base-20.04.3-base-arm64.tar.gz"

#Packages to ensure boot up and WLAN function
UBUN_BASIC_PACKAGES = " systemd \
                        dhcpcd5 \
                        kmod \
                        inetutils-ping \
                        wget \
                        net-tools \
                        wireless-tools \
                        psmisc \
                        usbutils \
                        procps \
                        zlib1g \
			zip \
                       "


UBUN_PLATFORM_EXTRA_PACKAGES = " libseccomp-dev \
libspdlog-dev \
libspdlog1 \
gstreamer1.0-libav \
gstreamer1.0-plugins-base \
libgstreamer-plugins-base1.0-0 \
libgstreamer-gl1.0-0 \
gstreamer1.0-gl \
gstreamer1.0-plugins-ugly \
libgstreamer-plugins-good1.0-0 \
gstreamer1.0-plugins-good \
libgstreamer-plugins-base1.0-0 \
gstreamer1.0-plugins-base \
libgstreamer-plugins-bad1.0-0 \
gstreamer1.0-plugins-base \
gstreamer1.0-plugins-bad \
libdrm2 \
libdrm-freedreno1 \
libdrm-dev \
gobject-introspection \
gir1.2-glib-2.0 \
libgirepository-1.0-1 \
libgirepository1.0-dev \
libgfortran5 \
libgfortran-10-dev \
libtsan0 \
libstdc++6 \
libstdc++-10-dev \
liblsan0 \
libitm1 \
libgomp1 \
libatomic1 \
libatomic-ops-dev \
libtbb2 \
libtbb-dev \
libaudit1 \
libauparse0 \
libauparse-dev \
libaudit-dev \
python3-audit \
libtirpc3 \
libtirpc-dev \
liblz4-1 \
liblz4-dev \
libconsole-bridge0.4 \
libconsole-bridge-dev \
libssh-4 \
libssh-dev \
libbrotli1 \
python3-brotli \
libbrotli-dev \
libkmod2 \
libkmod-dev \
liborc-0.4-0 \
liborc-0.4-dev \
liborc-0.4-dev-bin \
libcap-ng0 \
libcap-ng-dev \
python3-cap-ng \
alsa-utils \
libsbc1 \
libsbc-dev \
libasound2-plugins \
libasound2 \
libasound2-dev \
libasound2-plugin-smixer \
libatopology2 \
libatopology-dev \
libsepol1 \
libsepol1-dev \
libselinux1 \
libselinux1-dev \
python3-selinux \
libpcre3 \
libpcre32-3 \
libpcre16-3 \
libpcre3-dev \
libpcre2-8-0 \
libpcre2-16-0 \
libpcre2-32-0 \
libpcre2-dev \
liblzma5 \
liblzma-dev \
libffi-dev \
libffi7 \
libpthread-stubs0-dev \
libpciaccess0 \
libpciaccess-dev \
xutils-dev \
libmtdev-dev \
libmtdev1 \
libinput10 \
libinput-dev \
libsystemd0 \
libudev1 \
xtrans-dev \
udev \
systemd \
libudev-dev \
libpng-dev \
libsystemd-dev \
libp11-kit0 \
libp11-kit-dev \
libtasn1-6 \
libtasn1-6-dev \
curl \
libcurl4-openssl-dev \
libcurl4 \
libkrb5support0 \
libkrb5-3 \
libkrb5-26-heimdal \
libgssapi-krb5-2 \
libkrb5-dev \
krb5-multidev \
libkeyutils1 \
libkeyutils-dev \
libkrb5-3 \
libkrb5-dev \
krb5-multidev \
libkrb5-3 \
libkrb5-dev \
libgpg-error0 \
libgpg-error-dev \
libgcrypt20 \
libgcrypt20-dev \
libldap-2.4-2 \
libldap2-dev \
librtmp1 \
librtmp-dev \
libsasl2-2 \
libsasl2-modules \
libsasl2-dev \
libsasl2-2 \
libsasl2-dev \
libnettle7 \
nettle-dev \
libnettle7 \
nettle-dev \
libgmp10 \
libgmp-dev \
libgnutls28-dev \
libcap2 \
libcap-dev \
libcap-dev \
iso-codes \
                                 libseccomp2 \
                                 seccomp \
                                 openssh-server \
                                 tftp-hpa \
                                 tftpd-hpa \
                                 vim \
				 hostapd \
                                 apparmor \
                                 dnsmasq \
				 iw \
                                 libion0 \
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
                                   libdrm-tests \
                                   libxau6-dbg \
                                   libxdmcp6-dbg \
                                   python3-dbg \
                                   python2-dbg \
                                   kbd \
                                 "

#video, camera packages
UBUN_MULTIMEDIA_PACKAFES = " gstreamer1.0-alsa \
                             gstreamer1.0-gtk3 \
                             gstreamer1.0-plugins-bad-dbg \
                             gstreamer1.0-plugins-base-dbg \
                             gstreamer1.0-plugins-base-apps \
                             gstreamer1.0-plugins-good-dbg \
                             gstreamer1.0-plugins-ugly-dbg \
                             gstreamer1.0-rtsp \
                             libgstrtspserver-1.0-0 \
                             libidn2-0 \
                             libidn2-dev \
                             libunistring2 \
                             libunistring-dev \
                             libk5crypto3 \
                             libcom-err2 \
                             libgssapi3-heimdal \
                             libgnutls30 \
                             libhogweed5 \
                             libheimntlm0-heimdal \
                             libasn1-8-heimdal \
                             libhcrypto4-heimdal \
                             libroken18-heimdal \
                             libwind0-heimdal \
                             libheimbase1-heimdal \
                             libhx509-5-heimdal \
                             lsb-release \
                             python3-argcomplete \
                             gnupg2 \
                             weston \
                             libweston-8-0 \
                             libcc1-0 \
                             libspeexdsp1 \
                             libspeexdsp-dev \
                             libspeex1 \
                             libspeex-dev \
                             libmtdev1 \
                             libmtdev-dev \
                             libwrap0 \
                             libwrap0-dev \
                             liba52-0.7.4 \
                             liba52-0.7.4-dev \
                             libqhull-dev \
                             libqhull7 \
                             libcrypto++6 \
                             libcrypto++-dev \
                             linux-libc-dev \
                             "


UBUN_BASIC_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_BASIC_PERF_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES} ${UBUN_DEBUG_PACKAGES}"
#UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES}"
UBUN_FULLSTACK_PERF_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES}"
