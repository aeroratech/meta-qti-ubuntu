require ${BPN}.inc

FILESPATH =+ "${WORKSPACE}:"
SRC_URI  = "git://source.codeaurora.org/quic/le/external/mesa3d/mesa/;protocol=http;branch=mesa3d/19.1"
SRC_URI += "file://0001-mesa-support-KDE-desktop.patch"

SRC_URI[md5sum] = "7dbb40b8d10e89bee0a5bfc85350647b"
SRC_URI[sha256sum] = "2a369b7b48545c6486e7e44913ad022daca097c8bd937bf30dcf3f17a94d3496"
SRCREV = "cc88eeb6ffc4e86d76dfdbfc601d519bc35b6c41"

S = "${WORKDIR}/git"

UPSTREAM_CHECK_GITTAGREGEX = "mesa-(?P<pver>\d+(\.\d+)+)"

#because we cannot rely on the fact that all apps will use pkgconfig,
#make eglplatform.h independent of MESA_EGL_NO_X11_HEADER
do_install_append() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'egl', 'true', 'false', d)}; then
        sed -i -e 's/^#if defined(MESA_EGL_NO_X11_HEADERS)$/#if defined(MESA_EGL_NO_X11_HEADERS) || ${@bb.utils.contains('PACKAGECONFIG', 'x11', '0', '1', d)}/' ${D}${includedir}/EGL/eglplatform.h
    fi
}

do_package_qa[noexec] = "1"
