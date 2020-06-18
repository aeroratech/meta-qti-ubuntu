# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for libweston-3 package
ALTERNATIVE_PRIORITY_libweston-3 = "100"

# set update-alternatives register name for libweston-3 package
ALTERNATIVE_libweston-3 = " libweston-3.so.0 libweston-3.so.0.0.0 drm-backend.so gl-renderer.so libweston-desktop-3.so.0 libweston-desktop-3.so.0.0.0 "

# set update-alternatives symbolic link path and real target path for libweston-3 package
ALTERNATIVE_LINK_NAME[libweston-3.so.0] = "/usr/lib/aarch64-linux-gnu/libweston-3.so.0"
ALTERNATIVE_TARGET_libweston-3[libweston-3.so.0] = "/usr/lib/libweston-3.so.0"

ALTERNATIVE_LINK_NAME[libweston-3.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libweston-3.so.0.0.0"
ALTERNATIVE_TARGET_libweston-3[libweston-3.so.0.0.0] = "/usr/lib/libweston-3.so.0.0.0"

ALTERNATIVE_LINK_NAME[drm-backend.so] = "/usr/lib/aarch64-linux-gnu/libweston-3/drm-backend.so"
ALTERNATIVE_TARGET_libweston-3[drm-backend.so] = "/usr/lib/libweston-3/drm-backend.so"

ALTERNATIVE_LINK_NAME[gl-renderer.so] = "/usr/lib/aarch64-linux-gnu/libweston-3/gl-renderer.so"
ALTERNATIVE_TARGET_libweston-3[gl-renderer.so] = "/usr/lib/libweston-3/gl-renderer.so"

ALTERNATIVE_LINK_NAME[libweston-desktop-3.so.0] = "/usr/lib/aarch64-linux-gnu/libweston-desktop-3.so.0"
ALTERNATIVE_TARGET_libweston-3[libweston-desktop-3.so.0] = "/usr/lib/libweston-desktop-3.so.0"

ALTERNATIVE_LINK_NAME[libweston-desktop-3.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libweston-desktop-3.so.0.0.0"
ALTERNATIVE_TARGET_libweston-3[libweston-desktop-3.so.0.0.0] = "/usr/lib/libweston-desktop-3.so.0.0.0"

# set update-alternatives priority for weston package
ALTERNATIVE_PRIORITY_weston = "100"

# set update-alternatives register name for weston package
ALTERNATIVE_weston = " wcap-decode weston weston-info weston-terminal weston.desktop background.png border.png fullscreen.png home.png icon_editor.png icon_flower.png icon_ivi_clickdot.png icon_ivi_flower.png icon_ivi_simple-egl.png icon_ivi_simple-shm.png icon_ivi_smoke.png icon_terminal.png icon_window.png panel.png pattern.png random.png sidebyside.png sign_close.png sign_maximize.png sign_minimize.png terminal.png tiling.png wayland.png wayland.svg weston-calibrator weston-clickdot weston-cliptest weston-dnd weston-eventdemo weston-flower weston-fullscreen weston-image weston-multi-resource weston-resizor weston-scaler weston-simple-egl weston-simple-shm weston-simple-touch weston-smoke weston-stacking weston-transformed desktop-shell.so fullscreen-shell.so hmi-controller.so ivi-shell.so weston-desktop-shell weston-ivi-shell-user-interface weston-keyboard weston-screenshooter weston-simple-im "

# set update-alternatives symbolic link path and real target path for weston package
ALTERNATIVE_LINK_NAME[wcap-decode] = "/usr/bin/wcap-decode"

ALTERNATIVE_LINK_NAME[weston] = "/usr/bin/weston"

ALTERNATIVE_LINK_NAME[weston-info] = "/usr/bin/weston-info"

ALTERNATIVE_LINK_NAME[weston-terminal] = "/usr/bin/weston-terminal"

ALTERNATIVE_LINK_NAME[weston.desktop] = "/usr/share/wayland-sessions/weston.desktop"

ALTERNATIVE_LINK_NAME[background.png] = "/usr/share/weston/background.png"

ALTERNATIVE_LINK_NAME[border.png] = "/usr/share/weston/border.png"

ALTERNATIVE_LINK_NAME[fullscreen.png] = "/usr/share/weston/fullscreen.png"

ALTERNATIVE_LINK_NAME[home.png] = "/usr/share/weston/home.png"

ALTERNATIVE_LINK_NAME[icon_editor.png] = "/usr/share/weston/icon_editor.png"

ALTERNATIVE_LINK_NAME[icon_flower.png] = "/usr/share/weston/icon_flower.png"

ALTERNATIVE_LINK_NAME[icon_ivi_clickdot.png] = "/usr/share/weston/icon_ivi_clickdot.png"

ALTERNATIVE_LINK_NAME[icon_ivi_flower.png] = "/usr/share/weston/icon_ivi_flower.png"

ALTERNATIVE_LINK_NAME[icon_ivi_simple-egl.png] = "/usr/share/weston/icon_ivi_simple-egl.png"

ALTERNATIVE_LINK_NAME[icon_ivi_simple-shm.png] = "/usr/share/weston/icon_ivi_simple-shm.png"

ALTERNATIVE_LINK_NAME[icon_ivi_smoke.png] = "/usr/share/weston/icon_ivi_smoke.png"

ALTERNATIVE_LINK_NAME[icon_terminal.png] = "/usr/share/weston/icon_terminal.png"

ALTERNATIVE_LINK_NAME[icon_window.png] = "/usr/share/weston/icon_window.png"

ALTERNATIVE_LINK_NAME[panel.png] = "/usr/share/weston/panel.png"

ALTERNATIVE_LINK_NAME[pattern.png] = "/usr/share/weston/pattern.png"

ALTERNATIVE_LINK_NAME[random.png] = "/usr/share/weston/random.png"

ALTERNATIVE_LINK_NAME[sidebyside.png] = "/usr/share/weston/sidebyside.png"

ALTERNATIVE_LINK_NAME[sign_close.png] = "/usr/share/weston/sign_close.png"

ALTERNATIVE_LINK_NAME[sign_maximize.png] = "/usr/share/weston/sign_maximize.png"

ALTERNATIVE_LINK_NAME[sign_minimize.png] = "/usr/share/weston/sign_minimize.png"

ALTERNATIVE_LINK_NAME[terminal.png] = "/usr/share/weston/terminal.png"

ALTERNATIVE_LINK_NAME[tiling.png] = "/usr/share/weston/tiling.png"

ALTERNATIVE_LINK_NAME[wayland.png] = "/usr/share/weston/wayland.png"

ALTERNATIVE_LINK_NAME[wayland.svg] = "/usr/share/weston/wayland.svg"

ALTERNATIVE_LINK_NAME[weston-calibrator] = "/usr/lib/weston/weston-calibrator"
ALTERNATIVE_TARGET_weston[weston-calibrator] = "/usr/bin/weston-calibrator"

ALTERNATIVE_LINK_NAME[weston-clickdot] = "/usr/lib/weston/weston-clickdot"
ALTERNATIVE_TARGET_weston[weston-clickdot] = "/usr/bin/weston-clickdot"

ALTERNATIVE_LINK_NAME[weston-cliptest] = "/usr/lib/weston/weston-cliptest"
ALTERNATIVE_TARGET_weston[weston-cliptest] = "/usr/bin/weston-cliptest"

ALTERNATIVE_LINK_NAME[weston-dnd] = "/usr/lib/weston/weston-dnd"
ALTERNATIVE_TARGET_weston[weston-dnd] = "/usr/bin/weston-dnd"

ALTERNATIVE_LINK_NAME[weston-eventdemo] = "/usr/lib/weston/weston-eventdemo"
ALTERNATIVE_TARGET_weston[weston-eventdemo] = "/usr/bin/weston-eventdemo"

ALTERNATIVE_LINK_NAME[weston-flower] = "/usr/lib/weston/weston-flower"
ALTERNATIVE_TARGET_weston[weston-flower] = "/usr/bin/weston-flower"

ALTERNATIVE_LINK_NAME[weston-fullscreen] = "/usr/lib/weston/weston-fullscreen"
ALTERNATIVE_TARGET_weston[weston-fullscreen] = "/usr/bin/weston-fullscreen"

ALTERNATIVE_LINK_NAME[weston-image] = "/usr/lib/weston/weston-image"
ALTERNATIVE_TARGET_weston[weston-image] = "/usr/bin/weston-image"

ALTERNATIVE_LINK_NAME[weston-multi-resource] = "/usr/lib/weston/weston-multi-resource"
ALTERNATIVE_TARGET_weston[weston-multi-resource] = "/usr/bin/weston-multi-resource"

ALTERNATIVE_LINK_NAME[weston-resizor] = "/usr/lib/weston/weston-resizor"
ALTERNATIVE_TARGET_weston[weston-resizor] = "/usr/bin/weston-resizor"

ALTERNATIVE_LINK_NAME[weston-scaler] = "/usr/lib/weston/weston-scaler"
ALTERNATIVE_TARGET_weston[weston-scaler] = "/usr/bin/weston-scaler"

ALTERNATIVE_LINK_NAME[weston-simple-egl] = "/usr/lib/weston/weston-simple-egl"
ALTERNATIVE_TARGET_weston[weston-simple-egl] = "/usr/bin/weston-simple-egl"

ALTERNATIVE_LINK_NAME[weston-simple-shm] = "/usr/lib/weston/weston-simple-shm"
ALTERNATIVE_TARGET_weston[weston-simple-shm] = "/usr/bin/weston-simple-shm"

ALTERNATIVE_LINK_NAME[weston-simple-touch] = "/usr/lib/weston/weston-simple-touch"
ALTERNATIVE_TARGET_weston[weston-simple-touch] = "/usr/bin/weston-simple-touch"

ALTERNATIVE_LINK_NAME[weston-smoke] = "/usr/lib/weston/weston-smoke"
ALTERNATIVE_TARGET_weston[weston-smoke] = "/usr/bin/weston-smoke"

ALTERNATIVE_LINK_NAME[weston-stacking] = "/usr/lib/weston/weston-stacking"
ALTERNATIVE_TARGET_weston[weston-stacking] = "/usr/bin/weston-stacking"

ALTERNATIVE_LINK_NAME[weston-transformed] = "/usr/lib/weston/weston-transformed"
ALTERNATIVE_TARGET_weston[weston-transformed] = "/usr/bin/weston-transformed"

ALTERNATIVE_LINK_NAME[desktop-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/desktop-shell.so"
ALTERNATIVE_TARGET_weston[desktop-shell.so] = "/usr/lib/weston/desktop-shell.so"

ALTERNATIVE_LINK_NAME[fullscreen-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/fullscreen-shell.so"
ALTERNATIVE_TARGET_weston[fullscreen-shell.so] = "/usr/lib/weston/fullscreen-shell.so"

ALTERNATIVE_LINK_NAME[hmi-controller.so] = "/usr/lib/aarch64-linux-gnu/weston/hmi-controller.so"
ALTERNATIVE_TARGET_weston[hmi-controller.so] = "/usr/lib/weston/hmi-controller.so"

ALTERNATIVE_LINK_NAME[ivi-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/ivi-shell.so"
ALTERNATIVE_TARGET_weston[ivi-shell.so] = "/usr/lib/weston/ivi-shell.so"

ALTERNATIVE_LINK_NAME[weston-desktop-shell] = "/usr/lib/weston/weston-desktop-shell"
ALTERNATIVE_TARGET_weston[weston-desktop-shell] = "/usr/libexec/weston-desktop-shell"

ALTERNATIVE_LINK_NAME[weston-ivi-shell-user-interface] = "/usr/lib/weston/weston-ivi-shell-user-interface"
ALTERNATIVE_TARGET_weston[weston-ivi-shell-user-interface] = "/usr/libexec/weston-ivi-shell-user-interface"

ALTERNATIVE_LINK_NAME[weston-keyboard] = "/usr/lib/weston/weston-keyboard"
ALTERNATIVE_TARGET_weston[weston-keyboard] = "/usr/libexec/weston-keyboard"

ALTERNATIVE_LINK_NAME[weston-screenshooter] = "/usr/lib/weston/weston-screenshooter"
ALTERNATIVE_TARGET_weston[weston-screenshooter] = "/usr/libexec/weston-screenshooter"

ALTERNATIVE_LINK_NAME[weston-simple-im] = "/usr/lib/weston/weston-simple-im"
ALTERNATIVE_TARGET_weston[weston-simple-im] = "/usr/libexec/weston-simple-im"

