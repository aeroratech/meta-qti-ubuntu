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
python3-dbg \
python2-dbg \
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
libcppunit-dev \
"

#Package Required by xtrans-ubuntu.bb
UBUN_DEPENDENCES +=  " \
xtrans-dev \
"

#Package Required by libxinerama-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxinerama-dev \
libxinerama1 \
"
#Package Required by ilmbase-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libilmbase-dev \
libilmbase24 \
"
#Package Required by libpciaccess-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpciaccess0 \
"
#Package Required by postgresql-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpq-dev \
libpq5 \
libecpg6 \
libecpg-dev \
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
libsuperlu-dev \
libsuperlu5 \
"

#Package Required by openexr-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libopenexr-dev \
libopenexr24 \
"
#Package Required by poppler-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpoppler-dev \
libpoppler-private-dev \
libpoppler-glib8 \
libpoppler-glib-dev \
gir1.2-poppler-0.18 \
libpoppler-qt5-1 \
libpoppler-qt5-dev \
libpoppler-cpp0v5 \
libpoppler-cpp-dev \
libpoppler97 \
"
#Package Required by libxext-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxext-dev \
libxext6 \
"
#Package Required by minizip-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libminizip-dev \
libminizip1 \
"
#Package Required by console-bridge-ubuntu_0.4.3-1.bb
UBUN_DEPENDENCES +=  " \
libconsole-bridge-dev \
libconsole-bridge0.4 \
"
#Package Required by libgpg-error-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgpg-error-dev \
libgpg-error0 \
"
#Package Required by libxtst-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxtst-dev \
libxtst6 \
"
#Package Required by libtasn1-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtasn1-6 \
libtasn1-6-dev \
"

#Package Required by libatomic-ops-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatomic-ops-dev \
"

#Package Required by nss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnss3 \
libnss3-dev \
"
#Package Required by xz-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liblzma-dev \
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
libxcomposite-dev \
"

#Package Required by libdrm-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libdrm-dev \
libdrm-freedreno1 \
libdrm2 \
"

#Package Required by libtirpc-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtirpc-dev \
libtirpc3 \
"
#Package Required by alsa-lib-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatopology-dev \
libatopology2 \
libasound2 \
libasound2-plugins \
libasound2-plugin-smixer \
libasound2-dev \
"
#Package Required by libxi-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxi6 \
libxi-dev \
"

#Package Required by lz4-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liblz4-dev \
liblz4-1 \
"
#Package Required by p11-kit-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libp11-kit-dev \
libp11-kit0 \
"

#Package Required by arpack-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libparpack2 \
libparpack2-dev \
libarpack2 \
libarpack2-dev \
"
#Package Required by libxau-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxau6-dbg \
"

#Package Required by gstreamer1.0-libav-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-libav \
"

#Package Required by liba52-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liba52-0.7.4 \
liba52-0.7.4-dev \
"

#Package Required by tcp-wrappers-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libwrap0 \
libwrap0-dev \
"
#Package Required by gstreamer1.0-plugins-good-oss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-plugins-good \
gstreamer1.0-plugins-good-dbg \
libgstreamer-plugins-good1.0-0 \
"

#Package Required by at-spi2-atk-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatk-bridge2.0-dev \
libatk-adaptor \
libatk-bridge2.0-0 \
"

#Package Required by jbigkit-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libjbig-dev \
libjbig0 \
"
#Package Required by gstreamer1.0-plugins-base-oss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-gl \
libgstreamer-gl1.0-0 \
libgstreamer-plugins-base1.0-0 \
gstreamer1.0-plugins-base \
gstreamer1.0-plugins-base-dbg \
gstreamer1.0-plugins-base-apps \
"
#Package Required by gtk+3-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgtk-3-0 \
libgtk-3-common \
libgtk-3-bin \
libgtk-3-dev \
libgtk-3-doc \
gir1.2-gtk-3.0 \
libgail-3-0 \
libgail-3-dev \
"

#Package Required by alsa-utils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
alsa-utils \
"
#Package Required by opencv-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libopencv-dev \
"
#Package Required by gstreamer1.0-plugins-bad-oss-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-plugins-bad \
gstreamer1.0-plugins-bad-dbg \
libgstreamer-plugins-bad1.0-0 \
"

#Package Required by boost-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libboost1.71-tools-dev \
libboost1.71-all-dev \
libboost-atomic1.71.0 \
libboost-atomic1.71-dev \
libboost-chrono1.71.0 \
libboost-chrono1.71-dev \
libboost-container1.71.0 \
libboost-container1.71-dev \
libboost-context1.71.0 \
libboost-context1.71-dev \
libboost-contract1.71.0 \
libboost-contract1.71-dev \
libboost-coroutine1.71.0 \
libboost-coroutine1.71-dev \
libboost-date-time1.71.0 \
libboost-date-time1.71-dev \
libboost-exception1.71-dev \
libboost-fiber1.71.0 \
libboost-fiber1.71-dev \
libboost-filesystem1.71.0 \
libboost-filesystem1.71-dev \
libboost-graph1.71.0 \
libboost-graph1.71-dev \
libboost-graph-parallel1.71.0 \
libboost-graph-parallel1.71-dev \
libboost-iostreams1.71.0 \
libboost-iostreams1.71-dev \
libboost-locale1.71.0 \
libboost-locale1.71-dev \
libboost-log1.71.0 \
libboost-log1.71-dev \
libboost-math1.71.0 \
libboost-math1.71-dev \
libboost-mpi1.71.0 \
libboost-mpi1.71-dev \
libboost-mpi-python1.71.0 \
libboost-mpi-python1.71-dev \
libboost-numpy1.71.0 \
libboost-numpy1.71-dev \
libboost-program-options1.71.0 \
libboost-program-options1.71-dev \
libboost-python1.71.0 \
libboost-python1.71-dev \
libboost-random1.71.0 \
libboost-random1.71-dev \
libboost-regex1.71.0 \
libboost-regex1.71-dev \
libboost-serialization1.71.0 \
libboost-serialization1.71-dev \
libboost-stacktrace1.71.0 \
libboost-stacktrace1.71-dev \
libboost-system1.71.0 \
libboost-system1.71-dev \
libboost-test1.71.0 \
libboost-test1.71-dev \
libboost-thread1.71.0 \
libboost-thread1.71-dev \
libboost-timer1.71.0 \
libboost-timer1.71-dev \
libboost-type-erasure1.71.0 \
libboost-type-erasure1.71-dev \
libboost-wave1.71.0 \
libboost-wave1.71-dev \
libboost1.71-dev \
"
#Package Required by libpcre2-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpcre2-dev \
libpcre2-32-0 \
libpcre2-16-0 \
libpcre2-8-0 \
"
#Package Required by rtmpdump-ubuntu.bb
UBUN_DEPENDENCES +=  " \
librtmp-dev \
librtmp1 \
"
#Package Required by orc-ubuntu_0.1.0-1.bb
UBUN_DEPENDENCES +=  " \
liborc-0.4-dev \
liborc-0.4-dev-bin \
liborc-0.4-0 \
"
#Package Required by libxdmcp-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxdmcp6-dbg \
"

#Package Required by libtool-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libltdl-dev \
libltdl7 \
libtool \
libtool-bin \
"

#Package Required by gobject-introspection-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgirepository1.0-dev \
libgirepository-1.0-1 \
gir1.2-glib-2.0 \
gobject-introspection \
"

#Package Required by tbb-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtbb-dev \
libtbb2 \
"
#Package Required by lapack-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libblas3 \
libblas64-3 \
libblas-dev \
libblas64-dev \
"
#Package Required by zstd-ubuntu.bb
UBUN_DEPENDENCES +=  " \
zstd \
libzstd-dev \
libzstd1 \
"

#Package Required by nettle-ubuntu.bb
UBUN_DEPENDENCES +=  " \
nettle-dev \
libnettle7 \
libhogweed5 \
"

#Package Required by libepoxy-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libepoxy-dev \
libepoxy0 \
"

#Package Required by atk-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatk1.0-data \
libatk1.0-dev \
gir1.2-atk-1.0 \
libatk1.0-0 \
"

#Package Required by uriparser-ubuntu.bb
UBUN_DEPENDENCES +=  " \
liburiparser-dev \
liburiparser1 \
"
#Package Required by libpng-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpng-dev \
"
#Package Required by ogdi-dfsg-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libogdi-dev \
libogdi4.1 \
"
#Package Required by nspr-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnspr4 \
libnspr4-dev \
"
#Package Required by libinput-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libinput-dev \
libinput10 \
"

#Package Required by libaec-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libaec-dev \
libaec0 \
libsz2 \
"

#Package Required by pciutils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpci3 \
libpci-dev \
"
#Package Required by at-spi2-core-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libatspi2.0-dev \
gir1.2-atspi-2.0 \
libatspi2.0-0 \
"

#Package Required by libssh-ubuntu_0.9.3-1.bb
UBUN_DEPENDENCES +=  " \
libssh-dev \
libssh-4 \
"

#Package Required by socket++-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsocket++-dev \
libsocket++1 \
"

#Package Required by cyrus-sasl-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsasl2-dev \
libsasl2-modules \
libsasl2-2 \
"

#Package Required by netcdf-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnetcdf-dev \
libnetcdf15 \
"

#Package Required by libgcrypt-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgcrypt20 \
libgcrypt20-dev \
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
libldap2-dev \
libldap-2.4-2 \
"
#Package Required by mtdev-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libmtdev1 \
libmtdev-dev \
"

#Package Required by libcap-ng-ubuntu_0.7.9-1.bb
UBUN_DEPENDENCES +=  " \
python3-cap-ng \
libcap-ng-dev \
libcap-ng0 \
"
#Package Required by libxrandr-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxrandr-dev \
libxrandr2 \
"
#Package Required by spatialite-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libspatialite-dev \
libspatialite7 \
"

#Package Required by sbc-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsbc-dev \
libsbc1 \
"
#Package Required by gnutls-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgnutls28-dev \
libgnutls30 \
"

#Package Required by libxfixes-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxfixes3 \
libxfixes-dev \
"

#Package Required by tcl-ubuntu.bb
UBUN_DEPENDENCES +=  " \
tcl8.6-dev \
libtcl8.6 \
"
#Package Required by audit-ubuntu.bb
UBUN_DEPENDENCES +=  " \
python3-audit \
libaudit-dev \
libauparse-dev \
libauparse0 \
libaudit1 \
"
#Package Required by libsepol-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsepol1 \
libsepol1-dev \
"

#Package Required by v4l-utils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libv4l-0 \
libv4lconvert0 \
libv4l2rds0 \
libv4l-dev \
libdvbv5-0 \
libdvbv5-dev \
dvb-tools \
qv4l2 \
ir-keytable \
v4l-utils \
"

#Package Required by libcap-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libcap-dev \
libcap2 \
"

#Package Required by iso-codes-ubuntu.bb
UBUN_DEPENDENCES +=  " \
iso-codes \
"

#Package Required by libxdamage-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxdamage1 \
libxdamage-dev \
"
#Package Required by pth-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpth-dev \
libpth20 \
"
#Package Required by spdlog-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libspdlog1 \
libspdlog-dev \
"
#Package Required by libselinux-ubuntu.bb
UBUN_DEPENDENCES +=  " \
python3-selinux \
libselinux1 \
libselinux1-dev \
"

#Package Required by keyutils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libkeyutils-dev \
libkeyutils1 \
"
#Package Required by libcrypto++-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libcrypto++6 \
libcrypto++-dev \
libcrypto++-utils \
"
#Package Required by tiff-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libtiff-dev \
libtiff5 \
libtiff5-dev \
libtiffxx5 \
libtiff-tools \
libtiff-opengl \
"

#Package Required by gstreamer1.0-plugins-ugly-ubuntu.bb
UBUN_DEPENDENCES +=  " \
gstreamer1.0-plugins-ugly \
gstreamer1.0-plugins-ugly-dbg \
"
#Package Required by openssl-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libcurl4-openssl-dev \
"
#Package Required by libexif-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libexif-dev \
libexif12 \
"

#Package Required by e2fsprogs-ubuntu.bb
UBUN_DEPENDENCES +=  " \
comerr-dev \
libcom-err2 \
libext2fs-dev \
ss-dev \
libpciaccess-dev \
"

#Package Required by xerces-c-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxerces-c-dev \
libxerces-c3.2 \
"

#Package Required by gcc-runtime-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgfortran-10-dev \
libgfortran5 \
libatomic1 \
libgomp1 \
libitm1 \
liblsan0 \
libstdc++-10-dev \
libstdc++6 \
libtsan0 \
"

#Package Required by krb5-ubuntu.bb
UBUN_DEPENDENCES +=  " \
krb5-multidev \
libkrb5-dev \
libgssapi-krb5-2 \
libkrb5-3 \
libkrb5support0 \
libk5crypto3 \
"

#Package Required by json-glib-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libjson-glib-dev \
libjson-glib-1.0-0 \
"
#Package Required by libidn2-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libidn2-dev \
libidn2-0 \
"

#Package Required by slang-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libslang2 \
"
#Package Required by brotli-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libbrotli-dev \
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
libopenjp2-7-dev \
libopenjpip7 \
libopenjp3d7 \
"
#Package Required by libdaemon-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libdaemon-dev \
libdaemon0 \
"
#Package Required by sysfsutils-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libsysfs2 \
"
#Package Required by systemd-ubuntu.bb
UBUN_DEPENDENCES +=  " \
systemd \
libsystemd-dev \
libsystemd0 \
udev \
libudev-dev \
libudev1 \
"

#Package Required by proj-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libproj-dev \
libproj15 \
"
#Package Required by unixodbc-ubuntu.bb
UBUN_DEPENDENCES +=  " \
odbcinst1debian2 \
unixodbc-dev \
libodbc1 \
"

#Package Required by libffi-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libffi-dev \
libffi7 \
"
#Package Required by libpcre-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpcre16-3 \
libpcre3 \
libpcre3-dev \
libpcre32-3 \
"
#Package Required by libpcap-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpcap-dev \
libpcap0.8 \
libpcap0.8-dev \
"
#Package Required by libxcursor-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxcursor1 \
libxcursor-dev \
"

#Package Required by gdcm-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgdcm3.0 \
libgdcm-dev \
libgdcm-cil \
python3-gdcm \
libvtkgdcm3.0 \
libvtkgdcm-dev \
libvtkgdcm-cil \
python3-vtkgdcm \
libgdcm-java \
libvtkgdcm-java \
"

#Package Required by qhull-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libqhull-dev \
libqhull7 \
"

#Package Required by kmod-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libkmod-dev \
libkmod2 \
"
#Package Required by gmp-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libgmp-dev \
libgmp10 \
"

#Package Required by bash-completion-ubuntu.bb
UBUN_DEPENDENCES +=  " \
bash-completion \
"
#Package Required by libxrender-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libxrender-dev \
libxrender1 \
"

#Package Required by libpthread-stubs-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libpthread-stubs0-dev \
"
#Package Required by libunistring-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libunistring-dev \
libunistring2 \
"

#Package Required by npth-ubuntu.bb
UBUN_DEPENDENCES +=  " \
libnpth0 \
libnpth0-dev \
"
