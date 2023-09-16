PATH =. "/usr/bin:/usr/sbin:/usr/local/sbin:/usr/sbin:/sbin:/bin:"
UBUNTU_BASE_TAR="ubuntu-base-20.04.3-base-arm64.tar.gz"

#Packages to ensure boot up and WLAN function
UBUN_BASIC_PACKAGES = " dhcpcd5 \
kmod \
inetutils-ping \
wget \
net-tools \
${@bb.utils.contains('MACHINE_FEATURES', 'qca-wifi', '', 'wireless-tools', d)} \
psmisc \
usbutils \
procps \
zlib1g \
zip \
ssh-import-id \
"

UBUN_PLATFORM_EXTRA_PACKAGES = " libseccomp-dev \
libpcrecpp0v5 \
libuvc0 \
libuvc-dev \
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
fscrypt \
"

UBUN_DEBUG_PACKAGES = " gdb \
strace \
valgrind \
"

#Packages to enasure display and audio function
UBUN_MULTIMEDIA_BASIC_PACKAFES = " xkb-data \
libdrm-tests \
kbd \
"

#video, camera packages
UBUN_MULTIMEDIA_PACKAFES = " gstreamer1.0-alsa \
gstreamer1.0-gtk3 \
gstreamer1.0-rtsp \
libgstrtspserver-1.0-0 \
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
linux-libc-dev \
"


UBUN_BASIC_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_BASIC_PERF_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES} ${UBUN_DEBUG_PACKAGES}${UBUN_DEPENDENCES}"
#UBUN_FULLSTACK_DEBUG_PACKAGES = "${UBUN_BASIC_PACKAGES} ${UBUN_MULTIMEDIA_BASIC_PACKAFES}"
UBUN_FULLSTACK_PERF_PACKAGES = "${UBUN_BASIC_PERF_PACKAGES} ${UBUN_PLATFORM_EXTRA_PACKAGES} ${UBUN_MULTIMEDIA_PACKAFES}${UBUN_DEPENDENCES}"

#Package Required by ubuntu-toolchain.bb
UBUN_DEPENDENCES +=  " \
libcppunit-1.15-0 \
"

#Package Required by xtrans-ubuntu.bb
UBUN_DEPENDENCES +=  " \
xtrans-dev \
"

#Package Required by libxinerama-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxinerama1 \
"
#Package Required by ilmbase-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libilmbase24 \
"
#Package Required by libpciaccess-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpciaccess0 \
"
#Package Required by postgresql-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpq5 \
libecpg6 \
libecpg-compat3 \
libpgtypes3 \
"
#Package Required by python3-nose-ubuntu.bb
UBUN_DEPENDENCES +=  " \
python-nose \
python3-nose \
"
#Package Required by superlu-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsuperlu5 \
"

#Package Required by openexr-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libopenexr24 \
"
#Package Required by poppler-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpoppler-glib8 \
gir1.2-poppler-0.18 \
libpoppler-qt5-1 \
libpoppler-cpp0v5 \
libpoppler97 \
"
#Package Required by libxext-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxext6 \
"
#Package Required by minizip-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libminizip1 \
"
#Package Required by console-bridge-ubuntu_0.4.3-1.bb
UBUN_DEPENDENCES +=  " \
libconsole-bridge0.4 \
"
#Package Required by libgpg-error-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgpg-error0 \
"
#Package Required by libxtst-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxtst6 \
"
#Package Required by libtasn1-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtasn1-6 \
"

#Package Required by libatomic-ops-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatomic-ops-dev \
"

#Package Required by nss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnss3 \
"
#Package Required by xz-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liblzma5 \
"
#Package Required by python3-numpy-ubuntu.bb
UBUN_DEPENDENCES +=  " \
python-numpy \
python3-numpy \
"

#Package Required by libxcomposite-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxcomposite1 \
"

#Package Required by libdrm-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libdrm-freedreno1 \
libdrm2 \
"

#Package Required by libtirpc-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtirpc3 \
"
#Package Required by alsa-lib-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatopology2 \
libasound2 \
libasound2-plugins \
libasound2-plugin-smixer \
"
#Package Required by libxi-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxi6 \
"

#Package Required by lz4-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liblz4-1 \
"
#Package Required by p11-kit-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libp11-kit0 \
"

#Package Required by arpack-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libparpack2 \
libarpack2 \
"
#Package Required by libxau-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxau6 \
"

#Package Required by liba52-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liba52-0.7.4 \
"

#Package Required by tcp-wrappers-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libwrap0 \
"
#Package Required by gstreamer1.0-plugins-good-oss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-plugins-good \
libgstreamer-plugins-good1.0-0 \
"

#Package Required by at-spi2-atk-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatk-adaptor \
libatk-bridge2.0-0 \
"

#Package Required by jbigkit-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libjbig0 \
"
#Package Required by gstreamer1.0-plugins-base-oss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-gl \
libgstreamer-gl1.0-0 \
libgstreamer-plugins-base1.0-0 \
gstreamer1.0-plugins-base \
gstreamer1.0-plugins-base-apps \
"
#Package Required by gtk+3-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgtk-3-0 \
libgtk-3-common \
libgtk-3-bin \
gir1.2-gtk-3.0 \
libgail-3-0 \
"

#Package Required by alsa-utils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
alsa-utils \
"
#Package Required by opencv-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libopencv-video4.2 \
"
#Package Required by gstreamer1.0-plugins-bad-oss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-plugins-bad \
libgstreamer-plugins-bad1.0-0 \
"

#Package Required by boost-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libboost1.71-dev \
libboost-atomic1.71.0 \
libboost-chrono1.71.0 \
libboost-container1.71.0 \
libboost-context1.71.0 \
libboost-contract1.71.0 \
libboost-coroutine1.71.0 \
libboost-date-time1.71.0 \
libboost-fiber1.71.0 \
libboost-filesystem1.71.0 \
libboost-graph1.71.0 \
libboost-graph-parallel1.71.0 \
libboost-iostreams1.71.0 \
libboost-locale1.71.0 \
libboost-log1.71.0 \
libboost-math1.71.0 \
libboost-mpi1.71.0 \
libboost-mpi-python1.71.0 \
libboost-numpy1.71.0 \
libboost-program-options1.71.0 \
libboost-python1.71.0 \
libboost-random1.71.0 \
libboost-regex1.71.0 \
libboost-serialization1.71.0 \
libboost-stacktrace1.71.0 \
libboost-system1.71.0 \
libboost-test1.71.0 \
libboost-thread1.71.0 \
libboost-timer1.71.0 \
libboost-type-erasure1.71.0 \
libboost-wave1.71.0 \
"
#Package Required by libpcre2-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpcre2-32-0 \
libpcre2-16-0 \
libpcre2-8-0 \
"
#Package Required by rtmpdump-ubuntu.bb
UBUN_DEPENDENCES +=  " \
librtmp1 \
"
#Package Required by orc-ubuntu_0.1.0-1.bb
UBUN_DEPENDENCES +=  " \
liborc-0.4-0 \
"
#Package Required by libxdmcp-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxdmcp6-dbg \
"

#Package Required by libtool-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libltdl7 \
libtool \
libtool-bin \
"

#Package Required by gobject-introspection-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgirepository-1.0-1 \
gir1.2-glib-2.0 \
gobject-introspection \
"

#Package Required by tbb-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtbb2 \
"
#Package Required by lapack-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libblas3 \
libblas64-3 \
"
#Package Required by zstd-ubuntu.bb
UBUN_DEPENDENCES +=  " \
zstd \
libzstd1 \
"

#Package Required by nettle-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnettle7 \
libhogweed5 \
"

#Package Required by libepoxy-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libepoxy0 \
"

#Package Required by atk-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatk1.0-data \
gir1.2-atk-1.0 \
libatk1.0-0 \
"

#Package Required by uriparser-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liburiparser1 \
"
#Package Required by libpng-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpng16-16 \
"
#Package Required by ogdi-dfsg-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libogdi4.1 \
"
#Package Required by nspr-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnspr4 \
"
#Package Required by libinput-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libinput10 \
"

#Package Required by libaec-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libaec0 \
libsz2 \
"

#Package Required by pciutils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
pciutils \
"
#Package Required by at-spi2-core-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gir1.2-atspi-2.0 \
libatspi2.0-0 \
"

#Package Required by libssh-ubuntu_0.9.3-1.bb
UBUN_DEPENDENCES +=  " \
libssh-4 \
"

#Package Required by socket++-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsocket++1 \
"

#Package Required by cyrus-sasl-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsasl2-modules \
libsasl2-2 \
"

#Package Required by netcdf-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnetcdf15 \
"

#Package Required by libgcrypt-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgcrypt20 \
"
#Package Required by curl-ubuntu.bb
UBUN_DEPENDENCES +=  " \
curl \
libcurl4 \
libcurl3-gnutls \
libcurl3-nss \
"
#Package Required by openldap-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libldap-2.4-2 \
"
#Package Required by mtdev-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libmtdev1 \
"

#Package Required by libcap-ng-ubuntu_0.7.9-1.bb
UBUN_DEPENDENCES +=  " \
python3-cap-ng \
libcap-ng0 \
"
#Package Required by libxrandr-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxrandr2 \
"
#Package Required by spatialite-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libspatialite7 \
"

#Package Required by sbc-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsbc1 \
"
#Package Required by gnutls-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgnutls30 \
"

#Package Required by libxfixes-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxfixes3 \
"

#Package Required by tcl-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtcl8.6 \
"
#Package Required by audit-ubuntu.bb
UBUN_DEPENDENCES +=  " \
python3-audit \
libauparse0 \
libaudit1 \
"
#Package Required by libsepol-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsepol1 \
"

#Package Required by v4l-utils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libv4l-0 \
libv4lconvert0 \
libv4l2rds0 \
libdvbv5-0 \
dvb-tools \
qv4l2 \
ir-keytable \
v4l-utils \
"

#Package Required by libcap-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libcap2 \
"

#Package Required by iso-codes-ubuntu.bb
UBUN_DEPENDENCES +=  " \
iso-codes \
"

#Package Required by libxdamage-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxdamage1 \
"
#Package Required by pth-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpth20 \
"
#Package Required by spdlog-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libspdlog1 \
"
#Package Required by libselinux-ubuntu.bb
UBUN_DEPENDENCES +=  " \
python3-selinux \
libselinux1 \
"

#Package Required by keyutils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libkeyutils1 \
"
#Package Required by libcrypto++-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libcrypto++6 \
libcrypto++-utils \
libcrypto++-dev \
"
#Package Required by tiff-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtiff5 \
libtiffxx5 \
libtiff-tools \
libtiff-opengl \
"

#Package Required by gstreamer1.0-plugins-ugly-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-plugins-ugly \
"
#Package Required by openssl-ubuntu.bb
UBUN_DEPENDENCES +=  " \
openssl \
"

#Package Required by sqlite3-ubuntu.bb
UBUN_DEPENDENCES +=  " \
sqlite3 \
libsqlite3-0 \
libsqlite3-dev \
"

#Package Required by libexif-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libexif12 \
"

#Package Required by e2fsprogs-ubuntu.bb
UBUN_DEPENDENCES +=  " \
e2fsprogs \
libcom-err2 \
"

#Package Required by xerces-c-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxerces-c3.2 \
"

#Package Required by gcc-runtime-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgfortran5 \
libatomic1 \
libgomp1 \
libitm1 \
liblsan0 \
libstdc++6 \
libstdc++-10-dev \
libtsan0 \
"

#Package Required by krb5-ubuntu.bb
UBUN_DEPENDENCES +=  " \
krb5-multidev \
libgssapi-krb5-2 \
libkrb5-3 \
libkrb5support0 \
libk5crypto3 \
"

#Package Required by json-glib-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libjson-glib-1.0-0 \
"
#Package Required by libidn2-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libidn2-0 \
"

#Package Required by slang-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libslang2 \
"
#Package Required by brotli-ubuntu.bb
UBUN_DEPENDENCES +=  " \
python3-brotli \
libbrotli1 \
"

#Package Required by util-macros-ubuntu.bb
UBUN_DEPENDENCES +=  " \
xutils-dev \
"

#Package Required by heimdal-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libasn1-8-heimdal \
libgssapi3-heimdal \
libhcrypto4-heimdal \
libheimbase1-heimdal \
libheimntlm0-heimdal \
libhx509-5-heimdal \
libkrb5-26-heimdal \
libroken18-heimdal \
libwind0-heimdal \
"
#Package Required by bridge-utils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
bridge-utils \
"
#Package Required by openjpeg2-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libopenjp2-7 \
libopenjpip7 \
libopenjp3d7 \
"
#Package Required by libdaemon-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libdaemon0 \
"
#Package Required by sysfsutils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsysfs2 \
"
#Package Required by systemd-ubuntu.bb
UBUN_DEPENDENCES +=  " \
systemd \
libsystemd0 \
udev \
libudev1 \
"

#Package Required by proj-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libproj15 \
"
#Package Required by unixodbc-ubuntu.bb
UBUN_DEPENDENCES +=  " \
odbcinst1debian2 \
libodbc1 \
"

#Package Required by libffi-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libffi7 \
"
#Package Required by libpcre-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpcre16-3 \
libpcre3 \
libpcre32-3 \
"
#Package Required by libpcap-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpcap0.8 \
"
#Package Required by libxcursor-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxcursor1 \
"

#Package Required by gdcm-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgdcm3.0 \
libgdcm-cil \
python3-gdcm \
libvtkgdcm3.0 \
libvtkgdcm-cil \
python3-vtkgdcm \
libgdcm-java \
libvtkgdcm-java \
"

#Package Required by qhull-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libqhull7 \
libqhull-dev \
"

#Package Required by kmod-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libkmod2 \
"
#Package Required by gmp-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgmp10 \
"

#Package Required by bash-completion-ubuntu.bb
UBUN_DEPENDENCES +=  " \
bash-completion \
"
#Package Required by libxrender-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxrender1 \
"

#Package Required by libpthread-stubs-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpthread-stubs0-dev \
"
#Package Required by libunistring-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libunistring2 \
"

#Package Required by npth-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnpth0 \
"
#Package Required by gstreamer1.0-libav-ubuntu.bb for qcs6490
UBUN_DEPENDENCES +=  " \
${@bb.utils.contains("BASEMACHINE", "qcs6490", "gstreamer1.0-libav", "", d)} \
"

#Package Required by python3-ubuntu
UBUN_DEPENDENCES +=  " \
libpython3.8 \
libpython3.8-dev \
libpython3.8-minimal \
libpython3.8-stdlib \
libpython3.8-testsuite \
python3.8-dev \
python3.8-minimal \
python3.8-full \
python3.8-venv \
python3.8-examples \
pypy3-dev \
pypy3-lib \
python3-minimal \
"

#Package Required by libtheora-ubuntu
UBUN_DEPENDENCES +=  " \
libtheora-bin \
libtheora0 \
"

#Package Required by ffmpeg-ubuntu
UBUN_DEPENDENCES +=  " \
ffmpeg \
libavfilter7 \
libavfilter-dev \
libpostproc-dev \
libpostproc55 \
libavutil-dev \
libavutil56 \
libavresample-dev \
libavresample4 \
libavformat-dev \
libavformat58 \
libavdevice-dev \
libavdevice58 \
libavcodec-dev \
libavcodec58 \
libswresample3 \
libswresample-dev \
"

#Package Required by libyaml-ubuntu
UBUN_DEPENDENCES +=  " \
libyaml-dev \
libyaml-0-2 \
"

#Package Required by python3-setuptools-ubuntu
UBUN_DEPENDENCES +=  " \
python3-setuptools \
"

#Package Required by python3-six-ubuntu
UBUN_DEPENDENCES +=  " \
python3-six \
"

#Package Required by libxslt-ubuntu
UBUN_DEPENDENCES +=  " \
libxslt1-dev \
libxslt1.1 \
"

#Package Required by python3-docutils-ubuntu
UBUN_DEPENDENCES +=  " \
python3-docutils \
"

#Package Required by net-tools-ubuntu
UBUN_DEPENDENCES +=  " \
net-tools \
"
#Package Required by gcc-runtime-ubuntu
UBUN_DEPENDENCES +=  " \
cpp \
"

#Package Required by sqlite-ubuntu
UBUN_DEPENDENCES +=  " \
libsqlite3-0 \
sqlite3 \
"

#Package Required by pkgconfig-ubuntu
UBUN_DEPENDENCES +=  " \
pkg-config \
"

#Package Required by python3-netifaces-ubuntu
UBUN_DEPENDENCES +=  " \
python3-netifaces \
"

#Package Required by python3-lark-parser-ubuntu
UBUN_DEPENDENCES +=  " \
python3-lark \
"

#Package Required by exfat-utils-ubuntu
UBUN_DEPENDENCES +=  "\
exfat-utils \
"
