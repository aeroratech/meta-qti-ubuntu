#License applicable to the recipe file only,  not to the packages installed by this recipe.
LICENSE = "BSD-3-clause"

include ubuntu-base.inc

SRC_URI += "http://cdimage.ubuntu.com/ubuntu-base/releases/18.04/release/ubuntu-base-18.04.2-base-arm64.tar.gz"

SRC_URI[md5sum] = "fce1e4f9b98c85436f06aa27013279a5"
SRC_URI[sha256sum] = "62bd3b6df4340aa8e90d08229ced4f40aa8cbe84ed43f9f71791a46df5159f81"


do_unpack() {
        fakeroot tar xz --no-same-owner -f ${DL_DIR}/ubuntu-base-18.04.2-base-arm64.tar.gz -C ${S}
        cp -r ${FILE_DIRNAME}/files/apt-get.sh ${WORKDIR}/
}

do_populate_lic[noexec] = "1"
do_package_qa[noexec] = "1"
do_install[fakeroot] = "1"

do_install() {

}

do_install[depends] += "virtual/fakeroot-native:do_populate_sysroot"

INSANE_SKIP_${PN} += "already-stripped"
INSANE_SKIP_${PN} += "installed-vs-shipped"

PACKAGE_NO_LOCALE = "1"
PACKAGES = "${PN}"

