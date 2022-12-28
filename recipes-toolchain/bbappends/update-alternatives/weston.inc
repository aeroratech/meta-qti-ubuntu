# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "libweston-8" package
ALTERNATIVE_PRIORITY_libweston-8 = "100"

# set update-alternatives register name for "libweston-8" package
ALTERNATIVE_libweston-8 = " libweston-desktop-8.so.0 gl-renderer.so libweston-desktop-8.so.0.0.0 libweston-8.so.0 libweston-8.so.0.0.0 drm-backend.so"

# set update-alternatives symbolic link path or real target path for "libweston-8" package
QTI_SEPECIFIC_LINK[libweston-desktop-8.so.0.0.0] = "/usr/lib/libweston-desktop-8.so.0.0.0"
ALTERNATIVE_LINK_NAME[libweston-desktop-8.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libweston-desktop-8.so.0.0.0"

ALTERNATIVE_LINK_NAME[libweston-8.so.0] = "/usr/lib/aarch64-linux-gnu/libweston-8.so.0"

ALTERNATIVE_LINK_NAME[libweston-desktop-8.so.0] = "/usr/lib/aarch64-linux-gnu/libweston-desktop-8.so.0"

QTI_SEPECIFIC_LINK[gl-renderer.so] = "/usr/lib/libweston-8/gl-renderer.so"
ALTERNATIVE_LINK_NAME[gl-renderer.so] = "/usr/lib/aarch64-linux-gnu/libweston-8/gl-renderer.so"

QTI_SEPECIFIC_LINK[libweston-8.so.0.0.0] = "/usr/lib/libweston-8.so.0.0.0"
ALTERNATIVE_LINK_NAME[libweston-8.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libweston-8.so.0.0.0"

QTI_SEPECIFIC_LINK[drm-backend.so] = "/usr/lib/libweston-8/drm-backend.so"
ALTERNATIVE_LINK_NAME[drm-backend.so] = "/usr/lib/aarch64-linux-gnu/libweston-8/drm-backend.so"

# set update-alternatives priority for "weston" package
ALTERNATIVE_PRIORITY_weston = "100"

# set update-alternatives register name for "weston" package
ALTERNATIVE_weston = "weston-simple-im weston-keyboard weston-ivi-shell-user-interface weston-desktop-shell terminal.png panel.png home.png fullscreen.png border.png background.png weston-image libexec_weston.so.0 weston-terminal icon_ivi_simple-shm.png libexec_weston.so.0.0.0 desktop-shell.so weston-screenshooter weston-simple-touch weston-simple-egl icon_ivi_flower.png weston-confine hmi-controller.so screen-share.so weston-transformed icon_flower.png weston-editor weston-calibrator sidebyside.png pattern.png weston ivi-shell.so wayland.png weston-debug weston-content_protection weston-multi-resource icon_editor.png weston-dnd sign_maximize.png weston-debug.xml tiling.png weston-presentation-shm weston-simple-shm icon_ivi_clickdot.png wayland.svg icon_ivi_simple-egl.png weston-fullscreen weston-clickdot weston-cliptest weston-info icon_ivi_smoke.png weston-stacking sign_close.png weston-eventdemo weston.desktop sign_minimize.png random.png icon_terminal.png weston-flower icon_window.png weston-smoke weston-simple-dmabuf-v4l weston-simple-damage weston-resizor weston-scaler weston-touch-calibrator weston-direct-display.xml wcap-decode weston-simple-dmabuf-egl weston-subsurfaces fullscreen-shell.so"

# set update-alternatives symbolic link path or real target path for "weston" package
ALTERNATIVE_LINK_NAME[background.png] = "/usr/share/weston/background.png"

ALTERNATIVE_LINK_NAME[border.png] = "/usr/share/weston/border.png"

ALTERNATIVE_LINK_NAME[fullscreen.png] = "/usr/share/weston/fullscreen.png"

ALTERNATIVE_LINK_NAME[home.png] = "/usr/share/weston/home.png"

ALTERNATIVE_LINK_NAME[panel.png] = "/usr/share/weston/panel.png"

ALTERNATIVE_LINK_NAME[terminal.png] = "/usr/share/weston/terminal.png"

ALTERNATIVE_LINK_NAME[weston-desktop-shell] = "/usr/lib/weston/weston-desktop-shell"

ALTERNATIVE_LINK_NAME[weston-ivi-shell-user-interface] = "/usr/lib/weston/weston-ivi-shell-user-interface"

ALTERNATIVE_LINK_NAME[weston-keyboard] = "/usr/lib/weston/weston-keyboard"

ALTERNATIVE_LINK_NAME[weston-simple-im] = "/usr/lib/weston/weston-simple-im"

ALTERNATIVE_LINK_NAME[weston.desktop] = "/usr/share/wayland-sessions/weston.desktop"

ALTERNATIVE_LINK_NAME[wayland.svg] = "/usr/share/weston/wayland.svg"

QTI_SEPECIFIC_LINK[ivi-shell.so] = "/usr/lib/weston/ivi-shell.so"
ALTERNATIVE_LINK_NAME[ivi-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/ivi-shell.so"

ALTERNATIVE_LINK_NAME[tiling.png] = "/usr/share/weston/tiling.png"

ALTERNATIVE_LINK_NAME[sidebyside.png] = "/usr/share/weston/sidebyside.png"

ALTERNATIVE_LINK_NAME[weston-stacking] = "/usr/bin/weston-stacking"

ALTERNATIVE_LINK_NAME[weston-fullscreen] = "/usr/bin/weston-fullscreen"

ALTERNATIVE_LINK_NAME[icon_window.png] = "/usr/share/weston/icon_window.png"

ALTERNATIVE_LINK_NAME[weston-content_protection] = "/usr/bin/weston-content_protection"

ALTERNATIVE_LINK_NAME[pattern.png] = "/usr/share/weston/pattern.png"

ALTERNATIVE_LINK_NAME[wayland.png] = "/usr/share/weston/wayland.png"

ALTERNATIVE_LINK_NAME[weston-simple-dmabuf-v4l] = "/usr/bin/weston-simple-dmabuf-v4l"

ALTERNATIVE_LINK_NAME[icon_ivi_simple-shm.png] = "/usr/share/weston/icon_ivi_simple-shm.png"

ALTERNATIVE_LINK_NAME[weston-editor] = "/usr/bin/weston-editor"

ALTERNATIVE_LINK_NAME[libexec_weston.so.0] = "/usr/lib/aarch64-linux-gnu/weston/libexec_weston.so.0"

ALTERNATIVE_LINK_NAME[weston-simple-egl] = "/usr/bin/weston-simple-egl"

ALTERNATIVE_LINK_NAME[weston-simple-dmabuf-egl] = "/usr/bin/weston-simple-dmabuf-egl"

ALTERNATIVE_LINK_NAME[sign_minimize.png] = "/usr/share/weston/sign_minimize.png"

ALTERNATIVE_LINK_NAME[weston-simple-shm] = "/usr/bin/weston-simple-shm"

ALTERNATIVE_LINK_NAME[random.png] = "/usr/share/weston/random.png"

ALTERNATIVE_LINK_NAME[weston-transformed] = "/usr/bin/weston-transformed"

ALTERNATIVE_LINK_NAME[icon_ivi_flower.png] = "/usr/share/weston/icon_ivi_flower.png"

ALTERNATIVE_LINK_NAME[weston-multi-resource] = "/usr/bin/weston-multi-resource"

ALTERNATIVE_LINK_NAME[weston-presentation-shm] = "/usr/bin/weston-presentation-shm"

ALTERNATIVE_LINK_NAME[weston-image] = "/usr/bin/weston-image"

ALTERNATIVE_LINK_NAME[sign_close.png] = "/usr/share/weston/sign_close.png"

ALTERNATIVE_LINK_NAME[sign_maximize.png] = "/usr/share/weston/sign_maximize.png"

ALTERNATIVE_LINK_NAME[weston-calibrator] = "/usr/bin/weston-calibrator"

ALTERNATIVE_LINK_NAME[weston-smoke] = "/usr/bin/weston-smoke"

QTI_SEPECIFIC_LINK[fullscreen-shell.so] = "/usr/lib/weston/fullscreen-shell.so"
ALTERNATIVE_LINK_NAME[fullscreen-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/fullscreen-shell.so"

ALTERNATIVE_LINK_NAME[icon_terminal.png] = "/usr/share/weston/icon_terminal.png"

ALTERNATIVE_LINK_NAME[weston-eventdemo] = "/usr/bin/weston-eventdemo"

ALTERNATIVE_LINK_NAME[weston-info] = "/usr/bin/weston-info"

ALTERNATIVE_LINK_NAME[icon_editor.png] = "/usr/share/weston/icon_editor.png"

ALTERNATIVE_LINK_NAME[weston-cliptest] = "/usr/bin/weston-cliptest"

ALTERNATIVE_LINK_NAME[weston-terminal] = "/usr/bin/weston-terminal"

ALTERNATIVE_LINK_NAME[weston-resizor] = "/usr/bin/weston-resizor"

ALTERNATIVE_LINK_NAME[weston-simple-damage] = "/usr/bin/weston-simple-damage"

ALTERNATIVE_LINK_NAME[weston-scaler] = "/usr/bin/weston-scaler"

QTI_SEPECIFIC_LINK[desktop-shell.so] = "/usr/lib/weston/desktop-shell.so"
ALTERNATIVE_LINK_NAME[desktop-shell.so] = "/usr/lib/aarch64-linux-gnu/weston/desktop-shell.so"

ALTERNATIVE_LINK_NAME[weston-touch-calibrator] = "/usr/bin/weston-touch-calibrator"

ALTERNATIVE_LINK_NAME[weston-debug.xml] = "/usr/share/libweston-8/protocols/weston-debug.xml"

QTI_SEPECIFIC_LINK[screen-share.so] = "/usr/lib/weston/screen-share.so"
ALTERNATIVE_LINK_NAME[screen-share.so] = "/usr/lib/aarch64-linux-gnu/weston/screen-share.so"

ALTERNATIVE_LINK_NAME[weston-subsurfaces] = "/usr/bin/weston-subsurfaces"

ALTERNATIVE_LINK_NAME[weston-simple-touch] = "/usr/bin/weston-simple-touch"

ALTERNATIVE_LINK_NAME[weston-direct-display.xml] = "/usr/share/libweston-8/protocols/weston-direct-display.xml"

ALTERNATIVE_LINK_NAME[icon_flower.png] = "/usr/share/weston/icon_flower.png"

ALTERNATIVE_LINK_NAME[weston] = "/usr/bin/weston"

ALTERNATIVE_LINK_NAME[icon_ivi_simple-egl.png] = "/usr/share/weston/icon_ivi_simple-egl.png"

ALTERNATIVE_LINK_NAME[weston-dnd] = "/usr/bin/weston-dnd"

QTI_SEPECIFIC_LINK[libexec_weston.so.0.0.0] = "/usr/lib/weston/libexec_weston.so.0.0.0"
ALTERNATIVE_LINK_NAME[libexec_weston.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/weston/libexec_weston.so.0.0.0"

ALTERNATIVE_LINK_NAME[icon_ivi_smoke.png] = "/usr/share/weston/icon_ivi_smoke.png"

ALTERNATIVE_LINK_NAME[icon_ivi_clickdot.png] = "/usr/share/weston/icon_ivi_clickdot.png"

ALTERNATIVE_LINK_NAME[weston-flower] = "/usr/bin/weston-flower"

ALTERNATIVE_LINK_NAME[weston-debug] = "/usr/bin/weston-debug"

ALTERNATIVE_LINK_NAME[weston-clickdot] = "/usr/bin/weston-clickdot"

ALTERNATIVE_LINK_NAME[weston-confine] = "/usr/bin/weston-confine"

ALTERNATIVE_LINK_NAME[weston-screenshooter] = "/usr/bin/weston-screenshooter"

ALTERNATIVE_LINK_NAME[wcap-decode] = "/usr/bin/wcap-decode"

QTI_SEPECIFIC_LINK[hmi-controller.so] = "/usr/lib/weston/hmi-controller.so"
ALTERNATIVE_LINK_NAME[hmi-controller.so] = "/usr/lib/aarch64-linux-gnu/weston/hmi-controller.so"

