#This file is derived from
#https://git.codelinaro.org/clo/ype/external/yoctoproject.org/meta-openembedded/tree/meta-oe/recipes-multimedia/v4l2apps/yavta_git.bb

#Permission is hereby granted, free of charge, to any person obtaining a copy
#of this software and associated documentation files (the "Software"), to deal
#in the Software without restriction, including without limitation the rights
#to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
#copies of the Software, and to permit persons to whom the Software is
#furnished to do so, subject to the following conditions:

#The above copyright notice and this permission notice shall be included in
#all copies or substantial portions of the Software.

#THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
#IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
#FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
#AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
#LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
#OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
#THE SOFTWARE.

SUMMARY = "Yet Another V4L2 Test Application"

HOMEPAGE = "https://github.com/ebe-forks/yavta"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/${LICENSE};md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://git.codelinaro.org/clo/le/external/yavta;branch=caf_migration/obscuritys/master;protocol=git"
SRCREV = "7e9f28bedc1ed3205fb5164f686aea96f27a0de2"

PV = "0.0"
PR = "r1"
S = "${WORKDIR}/git"

EXTRA_OEMAKE = "-e MAKEFLAGS="

# The yavta sources include copies of the headers required to build in the
# include directory.  The Makefile uses CFLAGS to include these, but since
# we override the CFLAGS then we need to add this include path back in.
CFLAGS += "-I${S}/include"

do_install() {
    install -m 0755 yavta -D ${D}/sbin/yavta
}
