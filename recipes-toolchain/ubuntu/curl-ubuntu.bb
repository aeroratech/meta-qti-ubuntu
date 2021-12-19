LICENSE = "curl & BSD-3-clause & ISC & BSD-4-Clause"
LICENSE_libcurl4 = "curl & BSD-3-clause & ISC & BSD-4-Clause"
LICENSE_libcurl4-openssl-dev = "curl & BSD-3-clause & ISC & BSD-4-Clause"
LICENSE_curl4 = "curl & BSD-3-clause & ISC & BSD-4-Clause"

inherit upkg_base

# the information of ubuntu package(s)
SRC_URI = "http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/libcurl4_7.68.0-1ubuntu2_arm64.deb;name=libcurl4 \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/libcurl4-openssl-dev_7.68.0-1ubuntu2_arm64.deb;name=libcurl4-openssl-dev \
           http://ports.ubuntu.com/ubuntu-ports/pool/main/c/curl/curl_7.68.0-1ubuntu2_arm64.deb;name=curl"

SRC_URI[libcurl4.md5sum] = "5b806ab6665ee46cca5f9f9ca14a4fa7"
SRC_URI[libcurl4-openssl-dev.md5sum] = "2434f87d648ce75805d276fbaf06e487"
SRC_URI[curl.md5sum] = "bcca1f1ae491a065f6f7b91fb3fd5ea7"

# other configs to feed compilation
#RPROVIDES_curl += "libcurl"
