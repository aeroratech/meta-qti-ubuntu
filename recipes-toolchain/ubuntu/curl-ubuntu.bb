LICENSE = "curl & BSD-3-clause & ISC & BSD-4-Clause"
LICENSE_libcurl4 = "curl & BSD-3-clause & ISC & BSD-4-Clause"
LICENSE_libcurl4-openssl-dev = "curl & BSD-3-clause & ISC & BSD-4-Clause"
LICENSE_curl4 = "curl & BSD-3-clause & ISC & BSD-4-Clause"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/libcurl4_7.68.0-1ubuntu2_arm64.deb;name=libcurl4 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/libcurl4-openssl-dev_7.68.0-1ubuntu2_arm64.deb;name=libcurl4-openssl-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/curl_7.68.0-1ubuntu2_arm64.deb;name=curl \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/libcurl4-gnutls-dev_7.68.0-1ubuntu2_arm64.deb;name=libcurl4-gnutls-dev"

SRC_URI[libcurl4-gnutls-dev.md5sum] = "5ef8ebeb51ba2b4038e293f2f6b05692"
SRC_URI[libcurl4.md5sum] = "5b806ab6665ee46cca5f9f9ca14a4fa7"
SRC_URI[libcurl4-openssl-dev.md5sum] = "2434f87d648ce75805d276fbaf06e487"
SRC_URI[curl.md5sum] = "bcca1f1ae491a065f6f7b91fb3fd5ea7"
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/libcurl3-gnutls_7.68.0-1ubuntu2_arm64.deb;name=libcurl3-gnutls"
SRC_URI[libcurl3-gnutls.md5sum] = "cbf7d246296501ccc45758e552070a35"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/libcurl3-nss_7.68.0-1ubuntu2_arm64.deb;name=libcurl3-nss"
SRC_URI[libcurl3-nss.md5sum] = "6672909c95b3bdcfd80518499779869e"


# other configs to feed compilation
#RPROVIDES_curl += "libcurl"
PKG_${UPN} = "curl"
DEPENDS += "libtool-cross  virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc  gnutls libidn2 zlib brotli"
PROVIDES += "curl "

#dependency for ubuntu
DEPENDS += "openldap rtmpdump krb5 nghttp2 libssh libpsl"
