# Use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for weston package
ALTERNATIVE_PRIORITY_weston = "100"

# set update-alternatives register name for weston package
ALTERNATIVE_weston = "\
                wcap-decode weston weston-calibrator weston-clickdot weston-cliptest \
                weston-confine weston-dnd weston-eventdemo weston-flower weston-fullscreen \
                weston-image weston-info weston-multi-resource weston-presentation-shm \
                weston-resizor weston-scaler weston-simple-damage weston-simple-dmabuf-drm \
                weston-simple-dmabuf-v4l weston-simple-egl weston-simple-shm weston-simple-touch \
                weston-smoke weston-stacking weston-subsurfaces weston-terminal weston-transformed \
                desktop-shell.so fullscreen-shell.so hmi-controller.so ivi-shell.so \
                weston-desktop-shell weston-ivi-shell-user-interface weston-keyboard weston-screenshooter weston-simple-im \
                weston.desktop background.png border.png fullscreen.png home.png icon_editor.png icon_flower.png icon_ivi_clickdot.png \
                icon_ivi_flower.png icon_ivi_simple-egl.png icon_ivi_simple-shm.png icon_ivi_smoke.png icon_terminal.png \
                icon_window.png panel.png pattern.png random.png sidebyside.png sign_close.png sign_maximize.png \
                sign_minimize.png terminal.png tiling.png wayland.png wayland.svg \
                "

# set update-alternatives symbolic link path and real target path for weston package
ALTERNATIVE_LINK_NAME[wcap-decode] = "${bindir}/wcap-decode"

ALTERNATIVE_LINK_NAME[weston] = "${bindir}/weston"

ALTERNATIVE_LINK_NAME[weston-calibrator] = "/usr/lib/weston/weston-calibrator"
ALTERNATIVE_TARGET_weston[weston-calibrator] = "${bindir}/weston-calibrator"

ALTERNATIVE_LINK_NAME[weston-clickdot] = "/usr/lib/weston/weston-clickdot"
ALTERNATIVE_TARGET_weston[weston-clickdot] = "${bindir}/weston-clickdot"

ALTERNATIVE_LINK_NAME[weston-cliptest] = "/usr/lib/weston/weston-cliptest"
ALTERNATIVE_TARGET_weston[weston-cliptest] = "${bindir}/weston-cliptest"

ALTERNATIVE_LINK_NAME[weston-confine] = "${bindir}/weston-confine"

ALTERNATIVE_LINK_NAME[weston-dnd] = "/usr/lib/weston/weston-dnd"
ALTERNATIVE_TARGET_weston[weston-dnd] = "${bindir}/weston-dnd"

ALTERNATIVE_LINK_NAME[weston-eventdemo] = "/usr/lib/weston/weston-eventdemo"
ALTERNATIVE_TARGET_weston[weston-eventdemo] = "${bindir}/weston-eventdemo"

ALTERNATIVE_LINK_NAME[weston-flower] = "/usr/lib/weston/weston-flower"
ALTERNATIVE_TARGET_weston[weston-flower] = "${bindir}/weston-flower"

ALTERNATIVE_LINK_NAME[weston-fullscreen] = "/usr/lib/weston/weston-fullscreen"
ALTERNATIVE_TARGET_weston[weston-fullscreen] = "${bindir}/weston-fullscreen"

ALTERNATIVE_LINK_NAME[weston-image] = "/usr/lib/weston/weston-image"
ALTERNATIVE_TARGET_weston[weston-image] = "${bindir}/weston-image"

ALTERNATIVE_LINK_NAME[weston-info] = "${bindir}/weston-info"

ALTERNATIVE_LINK_NAME[weston-multi-resource] = "/usr/lib/weston/weston-multi-resource"
ALTERNATIVE_TARGET_weston[weston-multi-resource] = "${bindir}/weston-multi-resource"

ALTERNATIVE_LINK_NAME[weston-presentation-shm] = "${bindir}/weston-presentation-shm"

ALTERNATIVE_LINK_NAME[weston-resizor] = "/usr/lib/weston/weston-resizor"
ALTERNATIVE_TARGET_weston[weston-resizor] = "${bindir}/weston-resizor"

ALTERNATIVE_LINK_NAME[weston-scaler] = "/usr/lib/weston/weston-scaler"
ALTERNATIVE_TARGET_weston[weston-scaler] = "${bindir}/weston-scaler"

ALTERNATIVE_LINK_NAME[weston-simple-damage] = "${bindir}/weston-simple-damage"

ALTERNATIVE_LINK_NAME[weston-simple-dmabuf-drm] = "${bindir}/weston-simple-dmabuf-drm"

ALTERNATIVE_LINK_NAME[weston-simple-dmabuf-v4l] = "${bindir}/weston-simple-dmabuf-v4l"

ALTERNATIVE_LINK_NAME[weston-simple-egl] = "/usr/lib/weston/weston-simple-egl"
ALTERNATIVE_TARGET_weston[weston-simple-egl] = "${bindir}/weston-simple-egl"

ALTERNATIVE_LINK_NAME[weston-simple-shm] = "/usr/lib/weston/weston-simple-shm"
ALTERNATIVE_TARGET_weston[weston-simple-shm] = "${bindir}/weston-simple-shm"

ALTERNATIVE_LINK_NAME[weston-simple-touch] = "/usr/lib/weston/weston-simple-touch"
ALTERNATIVE_TARGET_weston[weston-simple-touch] = "${bindir}/weston-simple-touch"

ALTERNATIVE_LINK_NAME[weston-smoke] = "/usr/lib/weston/weston-smoke"
ALTERNATIVE_TARGET_weston[weston-smoke] = "${bindir}/weston-smoke"

ALTERNATIVE_LINK_NAME[weston-stacking] = "/usr/lib/weston/weston-stacking"
ALTERNATIVE_TARGET_weston[weston-stacking] = "${bindir}/weston-stacking"

ALTERNATIVE_LINK_NAME[weston-subsurfaces] = "${bindir}/weston-subsurfaces"

ALTERNATIVE_LINK_NAME[weston-terminal] = "${bindir}/weston-terminal"

ALTERNATIVE_LINK_NAME[weston-transformed] = "/usr/lib/weston/weston-transformed"
ALTERNATIVE_TARGET_weston[weston-transformed] = "${bindir}/weston-transformed"

ALTERNATIVE_LINK_NAME[desktop-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/desktop-shell.so"
ALTERNATIVE_TARGET_weston[desktop-shell.so] = "${libdir}/${BPN}/desktop-shell.so"

ALTERNATIVE_LINK_NAME[fullscreen-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/fullscreen-shell.so"
ALTERNATIVE_TARGET_weston[fullscreen-shell.so] = "${libdir}/${BPN}/fullscreen-shell.so"

ALTERNATIVE_LINK_NAME[hmi-controller.so] = "/usr/lib/aarch64-linux-gnu/weston/hmi-controller.so"
ALTERNATIVE_TARGET_weston[hmi-controller.so] = "${libdir}/${BPN}/hmi-controller.so"

ALTERNATIVE_LINK_NAME[ivi-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/ivi-shell.so"
ALTERNATIVE_TARGET_weston[ivi-shell.so] = "${libdir}/${BPN}/ivi-shell.so"

ALTERNATIVE_LINK_NAME[weston-desktop-shell] = "/usr/lib/weston/weston-desktop-shell"
ALTERNATIVE_TARGET_weston[weston-desktop-shell] = "${libexecdir}/weston-desktop-shell"

ALTERNATIVE_LINK_NAME[weston-ivi-shell-user-interface] = "/usr/lib/weston/weston-ivi-shell-user-interface"
ALTERNATIVE_TARGET_weston[weston-ivi-shell-user-interface] = "${libexecdir}/weston-ivi-shell-user-interface"

ALTERNATIVE_LINK_NAME[weston-keyboard] = "/usr/lib/weston/weston-keyboard"
ALTERNATIVE_TARGET_weston[weston-keyboard] = "${libexecdir}/weston-keyboard"

ALTERNATIVE_LINK_NAME[weston-screenshooter] = "/usr/lib/weston/weston-screenshooter"
ALTERNATIVE_TARGET_weston[weston-screenshooter] = "${libexecdir}/weston-screenshooter"

ALTERNATIVE_LINK_NAME[weston-simple-im] = "/usr/lib/weston/weston-simple-im"
ALTERNATIVE_TARGET_weston[weston-simple-im] = "${libexecdir}/weston-simple-im"

ALTERNATIVE_LINK_NAME[weston.desktop] = "${datadir}/wayland-sessions/weston.desktop"
ALTERNATIVE_LINK_NAME[background.png] = "${datadir}/${BPN}/background.png"
ALTERNATIVE_LINK_NAME[border.png] = "${datadir}/${BPN}/border.png"
ALTERNATIVE_LINK_NAME[fullscreen.png] = "${datadir}/${BPN}/fullscreen.png"
ALTERNATIVE_LINK_NAME[home.png] = "${datadir}/${BPN}/home.png"
ALTERNATIVE_LINK_NAME[icon_editor.png] = "${datadir}/${BPN}/icon_editor.png"
ALTERNATIVE_LINK_NAME[icon_flower.png] = "${datadir}/${BPN}/icon_flower.png"
ALTERNATIVE_LINK_NAME[icon_ivi_clickdot.png] = "${datadir}/${BPN}/icon_ivi_clickdot.png"
ALTERNATIVE_LINK_NAME[icon_ivi_flower.png] = "${datadir}/${BPN}/icon_ivi_flower.png"
ALTERNATIVE_LINK_NAME[icon_ivi_simple-egl.png] = "${datadir}/${BPN}/icon_ivi_simple-egl.png"
ALTERNATIVE_LINK_NAME[icon_ivi_simple-shm.png] = "${datadir}/${BPN}/icon_ivi_simple-shm.png"
ALTERNATIVE_LINK_NAME[icon_ivi_smoke.png] = "${datadir}/${BPN}/icon_ivi_smoke.png"
ALTERNATIVE_LINK_NAME[icon_terminal.png] = "${datadir}/${BPN}/icon_terminal.png"
ALTERNATIVE_LINK_NAME[icon_window.png] = "${datadir}/${BPN}/icon_window.png"
ALTERNATIVE_LINK_NAME[panel.png] = "${datadir}/${BPN}/panel.png"
ALTERNATIVE_LINK_NAME[pattern.png] = "${datadir}/${BPN}/pattern.png"
ALTERNATIVE_LINK_NAME[random.png] = "${datadir}/${BPN}/random.png"
ALTERNATIVE_LINK_NAME[sidebyside.png] = "${datadir}/${BPN}/sidebyside.png"
ALTERNATIVE_LINK_NAME[sign_close.png] = "${datadir}/${BPN}/sign_close.png"
ALTERNATIVE_LINK_NAME[sign_maximize.png] = "${datadir}/${BPN}/sign_maximize.png"
ALTERNATIVE_LINK_NAME[sign_minimize.png] = "${datadir}/${BPN}/sign_minimize.png"
ALTERNATIVE_LINK_NAME[terminal.png] = "${datadir}/${BPN}/terminal.png"
ALTERNATIVE_LINK_NAME[tiling.png] = "${datadir}/${BPN}/tiling.png"
ALTERNATIVE_LINK_NAME[wayland.png] = "${datadir}/${BPN}/wayland.png"
ALTERNATIVE_LINK_NAME[wayland.svg] = "${datadir}/${BPN}/wayland.svg"

# set update-alternatives priority for libweston-3 package
ALTERNATIVE_PRIORITY_libweston-3 = "100"

# set update-alternatives register name for libweston-3 package
ALTERNATIVE_libweston-3 = "\
                drm-backend.so gl-renderer.so \
                libweston-3.so.0 libweston-3.so.0.0.0 \
                libweston-desktop-3.so.0 libweston-desktop-3.so.0.0.0 \
                "
# set update-alternatives symbolic link path and real target path for libweston-3 package
ALTERNATIVE_LINK_NAME[drm-backend.so] = "/usr/lib/aarch64-linux-gnu/libweston-3/drm-backend.so"
ALTERNATIVE_TARGET_libweston-3[drm-backend.so] = "${libdir}/libweston-3/drm-backend.so"

ALTERNATIVE_LINK_NAME[gl-renderer.so] = "/usr/lib/aarch64-linux-gnu/libweston-3/gl-renderer.so"
ALTERNATIVE_TARGET_libweston-3[gl-renderer.so] = "${libdir}/libweston-3/gl-renderer.so"

ALTERNATIVE_LINK_NAME[libweston-3.so.0] = "/usr/lib/aarch64-linux-gnu/libweston-3.so.0"
ALTERNATIVE_TARGET_libweston-3[libweston-3.so.0] = "${libdir}/libweston-3.so.0"

ALTERNATIVE_LINK_NAME[libweston-3.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libweston-3.so.0.0.0"
ALTERNATIVE_TARGET_libweston-3[libweston-3.so.0.0.0] = "${libdir}/libweston-3.so.0.0.0"

ALTERNATIVE_LINK_NAME[libweston-desktop-3.so.0] = "/usr/lib/aarch64-linux-gnu/libweston-desktop-3.so.0"
ALTERNATIVE_TARGET_libweston-3[libweston-desktop-3.so.0] = "${libdir}/libweston-desktop-3.so.0"

ALTERNATIVE_LINK_NAME[libweston-desktop-3.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libweston-desktop-3.so.0.0.0"
ALTERNATIVE_TARGET_libweston-3[libweston-desktop-3.so.0.0.0] = "${libdir}/libweston-desktop-3.so.0.0.0"

