inherit upkg_base

LICENSE = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_python3-opencv = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv4.2-jni = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv4.2-java = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-contrib4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-contrib-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-viz4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-viz-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-superres4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-superres-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-shape4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-shape-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-stitching4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-stitching-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-videostab4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-videostab-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-photo4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-photo-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-ts-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-features2d4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-features2d-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-dnn4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-dnn-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-flann4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-flann-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-calib3d4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-calib3d-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-highgui4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-highgui-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-objdetect4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-objdetect-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-videoio4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-videoio-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-video4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-video-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-imgcodecs4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-imgcodecs-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-imgproc4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-imgproc-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-ml4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-ml-dev = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-core4.2 = "BSD-3-Clause & MIT & BSD-2-clause"
LICENSE_libopencv-core-dev = "BSD-3-Clause & MIT & BSD-2-clause"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-core-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-core-dev"
SRC_URI[libopencv-core-dev.md5sum] = "d52050959225609ed94792751fb715e3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-core4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-core4.2"
SRC_URI[libopencv-core4.2.md5sum] = "0c5f7abbd61c8101042b733c75e06055"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-ml-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-ml-dev"
SRC_URI[libopencv-ml-dev.md5sum] = "f470030c6a6a60a0c0f345557d28e5ef"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-ml4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-ml4.2"
SRC_URI[libopencv-ml4.2.md5sum] = "3a8ed9bc60ace2b8bff5a3b2b5d8529d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-imgproc-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-imgproc-dev"
SRC_URI[libopencv-imgproc-dev.md5sum] = "8aac357dec9bbaa693dda49159377d5d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-imgproc4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-imgproc4.2"
SRC_URI[libopencv-imgproc4.2.md5sum] = "a03f9457c6fc6e80e8e1e524662ac687"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-imgcodecs-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-imgcodecs-dev"
SRC_URI[libopencv-imgcodecs-dev.md5sum] = "be54a16a64b39f31a759d9c15b20c8f5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-imgcodecs4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-imgcodecs4.2"
SRC_URI[libopencv-imgcodecs4.2.md5sum] = "0507f7c71562cbf6b96a413260462dd8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-video-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-video-dev"
SRC_URI[libopencv-video-dev.md5sum] = "084436c90495cad8608df6eb2f3ae38d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-video4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-video4.2"
SRC_URI[libopencv-video4.2.md5sum] = "587a01a8a279ef119b0457d429ce8b94"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-videoio-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-videoio-dev"
SRC_URI[libopencv-videoio-dev.md5sum] = "fc096f2f149b196526768152d166c2fa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-videoio4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-videoio4.2"
SRC_URI[libopencv-videoio4.2.md5sum] = "329b9843d2b955ae80084b29a54b420d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-objdetect-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-objdetect-dev"
SRC_URI[libopencv-objdetect-dev.md5sum] = "340c1212b6ddc692b861a76d844fc2b3"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-objdetect4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-objdetect4.2"
SRC_URI[libopencv-objdetect4.2.md5sum] = "570e52d64e02662f44d95f9ee968650a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-highgui-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-highgui-dev"
SRC_URI[libopencv-highgui-dev.md5sum] = "dc0208c06ea34bfec68ec2e0740505b5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-highgui4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-highgui4.2"
SRC_URI[libopencv-highgui4.2.md5sum] = "f5694fc63f528ed12604ea754a6102c4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-calib3d-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-calib3d-dev"
SRC_URI[libopencv-calib3d-dev.md5sum] = "7e3c260379e69e3c1012b95661525408"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-calib3d4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-calib3d4.2"
SRC_URI[libopencv-calib3d4.2.md5sum] = "f36351bc983e38182293785d775ac500"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-flann-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-flann-dev"
SRC_URI[libopencv-flann-dev.md5sum] = "58c24f3b9878255744b1c329c98450ae"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-flann4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-flann4.2"
SRC_URI[libopencv-flann4.2.md5sum] = "e40b2823ac2b9f86e420101fd3d42c24"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-dnn-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-dnn-dev"
SRC_URI[libopencv-dnn-dev.md5sum] = "c5cf62b4bc5e5c7cde7537e62eb75b94"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-dnn4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-dnn4.2"
SRC_URI[libopencv-dnn4.2.md5sum] = "08d6f81ac585d28e82a8e154760e925d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-features2d-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-features2d-dev"
SRC_URI[libopencv-features2d-dev.md5sum] = "e25aa7aecf6a80a6e8c960f0c99dd506"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-features2d4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-features2d4.2"
SRC_URI[libopencv-features2d4.2.md5sum] = "0430a0f0a4004ec75302dff9b7b68b3d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-ts-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-ts-dev"
SRC_URI[libopencv-ts-dev.md5sum] = "47bd1d1b5cbaebcb190b13ad213477c6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-photo-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-photo-dev"
SRC_URI[libopencv-photo-dev.md5sum] = "04ee61dda092634dc8b8a8a597583eaf"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-photo4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-photo4.2"
SRC_URI[libopencv-photo4.2.md5sum] = "244f1bbef43c52b35db659ec998b9b28"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-videostab-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-videostab-dev"
SRC_URI[libopencv-videostab-dev.md5sum] = "1962def494a36bbcb743e6c3805ee10a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-videostab4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-videostab4.2"
SRC_URI[libopencv-videostab4.2.md5sum] = "ff2ac4e5a0eb7b8c5cb0c18923eda680"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-stitching-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-stitching-dev"
SRC_URI[libopencv-stitching-dev.md5sum] = "8bdb94ac811cd68279f8e6ea930ad4af"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-stitching4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-stitching4.2"
SRC_URI[libopencv-stitching4.2.md5sum] = "84062931a24e9ac9f8acde2641f0c848"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-shape-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-shape-dev"
SRC_URI[libopencv-shape-dev.md5sum] = "a704c36e2e30ffdc7979b236b1810040"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-shape4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-shape4.2"
SRC_URI[libopencv-shape4.2.md5sum] = "499152058404519e9f0574e9951d9d5c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-superres-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-superres-dev"
SRC_URI[libopencv-superres-dev.md5sum] = "764a204b89b5f49bdcac7f2b3274aeda"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-superres4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-superres4.2"
SRC_URI[libopencv-superres4.2.md5sum] = "e42a85ba7840d340a82e9d9180c6d35e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-viz-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-viz-dev"
SRC_URI[libopencv-viz-dev.md5sum] = "1c5fc1fad5256342b633962b005d1a72"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-viz4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-viz4.2"
SRC_URI[libopencv-viz4.2.md5sum] = "5433e133121a834fb0423d3185ba313b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-contrib-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-contrib-dev"
SRC_URI[libopencv-contrib-dev.md5sum] = "c43ba48b910020530a7a8cc918228981"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-contrib4.2_4.2.0+dfsg-5_arm64.deb;name=libopencv-contrib4.2"
SRC_URI[libopencv-contrib4.2.md5sum] = "1e43699678527e7aa0a489053d1a5b3a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv4.2-java_4.2.0+dfsg-5_all.deb;name=libopencv4.2-java"
SRC_URI[libopencv4.2-java.md5sum] = "f3072fb2d324957295d264c3aec0de8f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv4.2-jni_4.2.0+dfsg-5_arm64.deb;name=libopencv4.2-jni"
SRC_URI[libopencv4.2-jni.md5sum] = "49786774d444636019c70dd6a9a964a8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/python3-opencv_4.2.0+dfsg-5_arm64.deb;name=python3-opencv"
SRC_URI[python3-opencv.md5sum] = "077ce4ba894b1ab0a86dfecebf3b32b8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/o/opencv/libopencv-dev_4.2.0+dfsg-5_arm64.deb;name=libopencv-dev"
SRC_URI[libopencv-dev.md5sum] = "4be05ba57a96c607ce87229fefc2c73c"

# other configs to feed compilation
PKG_${UPN} = "libopencv-dev"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-oe-linux-compilerlibs virtual/libc libtool bzip2 zlib glib-2.0 libwebp python3  python3 libeigen gflags glog ade libgphoto2 gstreamer1.0 gstreamer1.0-plugins-base jpeg v4l-utils libpng python3-numpy tbb tiff"
PROVIDES += "opencv "
