inherit upkg_base

LICENSE = "MIT-Style"
LICENSE_libxcb-xkb-dev = "MIT-Style"
LICENSE_libxcb-xkb1 = "MIT-Style"
LICENSE_libxcb-dri3-dev = "MIT-Style"
LICENSE_libxcb-dri3-0 = "MIT-Style"
LICENSE_libxcb-present-dev = "MIT-Style"
LICENSE_libxcb-present0 = "MIT-Style"
LICENSE_libxcb-dri2-0-dev = "MIT-Style"
LICENSE_libxcb-dri2-0 = "MIT-Style"
LICENSE_libxcb-xvmc0-dev = "MIT-Style"
LICENSE_libxcb-xvmc0 = "MIT-Style"
LICENSE_libxcb-xv0-dev = "MIT-Style"
LICENSE_libxcb-xv0 = "MIT-Style"
LICENSE_libxcb-xtest0-dev = "MIT-Style"
LICENSE_libxcb-xtest0 = "MIT-Style"
LICENSE_libxcb-xinput-dev = "MIT-Style"
LICENSE_libxcb-xinput0 = "MIT-Style"
LICENSE_libxcb-xinerama0-dev = "MIT-Style"
LICENSE_libxcb-xinerama0 = "MIT-Style"
LICENSE_libxcb-xfixes0-dev = "MIT-Style"
LICENSE_libxcb-xfixes0 = "MIT-Style"
LICENSE_libxcb-xf86dri0-dev = "MIT-Style"
LICENSE_libxcb-xf86dri0 = "MIT-Style"
LICENSE_libxcb-sync-dev = "MIT-Style"
LICENSE_libxcb-sync1 = "MIT-Style"
LICENSE_libxcb-shm0-dev = "MIT-Style"
LICENSE_libxcb-shm0 = "MIT-Style"
LICENSE_libxcb-shape0-dev = "MIT-Style"
LICENSE_libxcb-shape0 = "MIT-Style"
LICENSE_libxcb-screensaver0-dev = "MIT-Style"
LICENSE_libxcb-screensaver0 = "MIT-Style"
LICENSE_libxcb-res0-dev = "MIT-Style"
LICENSE_libxcb-res0 = "MIT-Style"
LICENSE_libxcb-render0-dev = "MIT-Style"
LICENSE_libxcb-render0 = "MIT-Style"
LICENSE_libxcb-record0-dev = "MIT-Style"
LICENSE_libxcb-record0 = "MIT-Style"
LICENSE_libxcb-randr0-dev = "MIT-Style"
LICENSE_libxcb-randr0 = "MIT-Style"
LICENSE_libxcb-glx0-dev = "MIT-Style"
LICENSE_libxcb-glx0 = "MIT-Style"
LICENSE_libxcb-dpms0-dev = "MIT-Style"
LICENSE_libxcb-dpms0 = "MIT-Style"
LICENSE_libxcb-damage0-dev = "MIT-Style"
LICENSE_libxcb-damage0 = "MIT-Style"
LICENSE_libxcb-composite0-dev = "MIT-Style"
LICENSE_libxcb-composite0 = "MIT-Style"
LICENSE_libxcb1-dev = "MIT-Style"
LICENSE_libxcb1 = "MIT-Style"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb1_1.14-2_arm64.deb;name=libxcb1"
SRC_URI[libxcb1.md5sum] = "16b9dc33cdb8d34cc3de05579f500f64"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb1-dev_1.14-2_arm64.deb;name=libxcb1-dev"
SRC_URI[libxcb1-dev.md5sum] = "3928f69de7670a907f1507a233189525"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-composite0_1.14-2_arm64.deb;name=libxcb-composite0"
SRC_URI[libxcb-composite0.md5sum] = "cb6390df853bc18438f18b36fea4a253"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-composite0-dev_1.14-2_arm64.deb;name=libxcb-composite0-dev"
SRC_URI[libxcb-composite0-dev.md5sum] = "3febbbba041bfd4dbaa3e66c438d092e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-damage0_1.14-2_arm64.deb;name=libxcb-damage0"
SRC_URI[libxcb-damage0.md5sum] = "bf7d500830fb4b599d2adb958e269e4a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-damage0-dev_1.14-2_arm64.deb;name=libxcb-damage0-dev"
SRC_URI[libxcb-damage0-dev.md5sum] = "a194c4f54768a2568c5beaacf60f6519"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-dpms0_1.14-2_arm64.deb;name=libxcb-dpms0"
SRC_URI[libxcb-dpms0.md5sum] = "56ecc17bad4a53aa83dcc85f860729dd"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-dpms0-dev_1.14-2_arm64.deb;name=libxcb-dpms0-dev"
SRC_URI[libxcb-dpms0-dev.md5sum] = "149a18d1146907c67e1ed2acf41fb218"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-glx0_1.14-2_arm64.deb;name=libxcb-glx0"
SRC_URI[libxcb-glx0.md5sum] = "b34418d1d6f466272e686ccd94be0264"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-glx0-dev_1.14-2_arm64.deb;name=libxcb-glx0-dev"
SRC_URI[libxcb-glx0-dev.md5sum] = "f4f11f5b3c4f63a8ab60bbbdb8c6ce60"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-randr0_1.14-2_arm64.deb;name=libxcb-randr0"
SRC_URI[libxcb-randr0.md5sum] = "7f925b9aac3f7fb20b58614689b8dfd4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-randr0-dev_1.14-2_arm64.deb;name=libxcb-randr0-dev"
SRC_URI[libxcb-randr0-dev.md5sum] = "5cb52b00b37babd02fcc32537c79aea7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-record0_1.14-2_arm64.deb;name=libxcb-record0"
SRC_URI[libxcb-record0.md5sum] = "ddc1b47cc565a9d1c79ea7e52657fc30"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-record0-dev_1.14-2_arm64.deb;name=libxcb-record0-dev"
SRC_URI[libxcb-record0-dev.md5sum] = "ff4a3ad8763ce0a9d9d96bb52852166e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-render0_1.14-2_arm64.deb;name=libxcb-render0"
SRC_URI[libxcb-render0.md5sum] = "2c11fd67ca15a5f1870fb6b4a7e0b00a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-render0-dev_1.14-2_arm64.deb;name=libxcb-render0-dev"
SRC_URI[libxcb-render0-dev.md5sum] = "ab60ef867db6b3bda7b8e4b3e301f3df"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-res0_1.14-2_arm64.deb;name=libxcb-res0"
SRC_URI[libxcb-res0.md5sum] = "b70a0409035c17fd512fde158ebfe551"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-res0-dev_1.14-2_arm64.deb;name=libxcb-res0-dev"
SRC_URI[libxcb-res0-dev.md5sum] = "9dab8b31a8c5f1e815af5badeac86beb"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-screensaver0_1.14-2_arm64.deb;name=libxcb-screensaver0"
SRC_URI[libxcb-screensaver0.md5sum] = "335d2f12d017b8ec844dc57dfb6ab09f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-screensaver0-dev_1.14-2_arm64.deb;name=libxcb-screensaver0-dev"
SRC_URI[libxcb-screensaver0-dev.md5sum] = "8ebdda140c4c86a2a4bd690f3fe6403e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-shape0_1.14-2_arm64.deb;name=libxcb-shape0"
SRC_URI[libxcb-shape0.md5sum] = "1dd2d8d41513e518ae892df7c3c54708"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-shape0-dev_1.14-2_arm64.deb;name=libxcb-shape0-dev"
SRC_URI[libxcb-shape0-dev.md5sum] = "b35c06b293f7e088b42058ed7b004ac3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-shm0_1.14-2_arm64.deb;name=libxcb-shm0"
SRC_URI[libxcb-shm0.md5sum] = "b1c6e2819a29ba642d11215877db1ae6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-shm0-dev_1.14-2_arm64.deb;name=libxcb-shm0-dev"
SRC_URI[libxcb-shm0-dev.md5sum] = "859f18fabe99dd8e8eadb96bdd989e43"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-sync1_1.14-2_arm64.deb;name=libxcb-sync1"
SRC_URI[libxcb-sync1.md5sum] = "d21893a54f86729aa8cf978ecf3740aa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-sync-dev_1.14-2_arm64.deb;name=libxcb-sync-dev"
SRC_URI[libxcb-sync-dev.md5sum] = "dc8b72a0f1452e81eee00437cfee5b52"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xf86dri0_1.14-2_arm64.deb;name=libxcb-xf86dri0"
SRC_URI[libxcb-xf86dri0.md5sum] = "29a1b639e3b75c5bcd1e427e748e2232"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xf86dri0-dev_1.14-2_arm64.deb;name=libxcb-xf86dri0-dev"
SRC_URI[libxcb-xf86dri0-dev.md5sum] = "cb0e9bd530279fc24a140c0e0dfbf1d4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xfixes0_1.14-2_arm64.deb;name=libxcb-xfixes0"
SRC_URI[libxcb-xfixes0.md5sum] = "afde8b5942277f163c775d1c56e260c1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xfixes0-dev_1.14-2_arm64.deb;name=libxcb-xfixes0-dev"
SRC_URI[libxcb-xfixes0-dev.md5sum] = "8f167866c688bf8d9de597a09e10d2cc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xinerama0_1.14-2_arm64.deb;name=libxcb-xinerama0"
SRC_URI[libxcb-xinerama0.md5sum] = "f83e1139e095f4471c1949799e8e584a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xinerama0-dev_1.14-2_arm64.deb;name=libxcb-xinerama0-dev"
SRC_URI[libxcb-xinerama0-dev.md5sum] = "00af303d404091f3d02229c8dbec1840"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xinput0_1.14-2_arm64.deb;name=libxcb-xinput0"
SRC_URI[libxcb-xinput0.md5sum] = "87ecbba1a3bb6d44a8d35a1002ace6c9"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xinput-dev_1.14-2_arm64.deb;name=libxcb-xinput-dev"
SRC_URI[libxcb-xinput-dev.md5sum] = "8d1671218e7066375efe72f745568cba"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xtest0_1.14-2_arm64.deb;name=libxcb-xtest0"
SRC_URI[libxcb-xtest0.md5sum] = "4af17639cc962aa44421bd5bd4447eb2"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xtest0-dev_1.14-2_arm64.deb;name=libxcb-xtest0-dev"
SRC_URI[libxcb-xtest0-dev.md5sum] = "f7adcc102eab639494ff9c9beb809935"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xv0_1.14-2_arm64.deb;name=libxcb-xv0"
SRC_URI[libxcb-xv0.md5sum] = "89cd5715f85e15c96f3bbf708d826a3f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xv0-dev_1.14-2_arm64.deb;name=libxcb-xv0-dev"
SRC_URI[libxcb-xv0-dev.md5sum] = "ab5d7a58b62af3f47dc25ecc262d9714"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xvmc0_1.14-2_arm64.deb;name=libxcb-xvmc0"
SRC_URI[libxcb-xvmc0.md5sum] = "21a0692bee3962c4a93da9868e57bbb1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xvmc0-dev_1.14-2_arm64.deb;name=libxcb-xvmc0-dev"
SRC_URI[libxcb-xvmc0-dev.md5sum] = "4361262332e0c04a8625a9bc1577e921"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-dri2-0_1.14-2_arm64.deb;name=libxcb-dri2-0"
SRC_URI[libxcb-dri2-0.md5sum] = "f8207f2e94315ffbe36dfe451bc7f275"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-dri2-0-dev_1.14-2_arm64.deb;name=libxcb-dri2-0-dev"
SRC_URI[libxcb-dri2-0-dev.md5sum] = "713785e2477431856a76befc8ddba1d3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-present0_1.14-2_arm64.deb;name=libxcb-present0"
SRC_URI[libxcb-present0.md5sum] = "9c8e38a5a4951567ba93350aefbec34a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-present-dev_1.14-2_arm64.deb;name=libxcb-present-dev"
SRC_URI[libxcb-present-dev.md5sum] = "ad28ce9c0a1f3f64b3d2bd5eb4615b46"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-dri3-0_1.14-2_arm64.deb;name=libxcb-dri3-0"
SRC_URI[libxcb-dri3-0.md5sum] = "f442a5c83be8a2cee0a1ef9257056d40"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-dri3-dev_1.14-2_arm64.deb;name=libxcb-dri3-dev"
SRC_URI[libxcb-dri3-dev.md5sum] = "3e8b11e95d7335cfb5423b0ff1e87531"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xkb1_1.14-2_arm64.deb;name=libxcb-xkb1"
SRC_URI[libxcb-xkb1.md5sum] = "b6f18cb34388157258e47cbd58c1c611"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/libx/libxcb/libxcb-xkb-dev_1.14-2_arm64.deb;name=libxcb-xkb-dev"
SRC_URI[libxcb-xkb-dev.md5sum] = "65db77613180f75031165f35f4080347"

# other configs to feed compilation
PKG_${UPN} = "libxcb1"

DEPENDS += "libpthread-stubs libxau libxdmcp"
