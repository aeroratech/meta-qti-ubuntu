inherit python3native

LICENSE = "BSD-3-Clause-clear"
# License applies to this recipe code, not the packages itself.
ROS_VERSION = "foxy"
ROS_BASE = "/opt/ros"
ROS_DIR = "${ROS_BASE}/${ROS_VERSION}"

SYSROOT_DIRS_append = "${ROS_DIR}"

do_install() {
    CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

    # mkdir ros2 dashing dir
    install -d ${D}${ROS_DIR}
    install -d ${D}/usr/lib/aarch64-linux-gnu
    install -d ${D}/usr/include
    install -d ${D}/usr/lib/Poco
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}
    install -d ${D}/lib/

    # copy ros2 dashing to /opt/ros/dashing
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/opt/ros/foxy/* ${D}${ROS_DIR}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/opt/ros/foxy/lib/python3.8/site-packages/* ${D}${PYTHON_SITEPACKAGES_DIR}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libspdlog.so.* ${D}/usr/lib/

    # python3-catkin-pkg-modules_0.4.23-1_all install lib
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/python3/dist-packages/catkin_pkg ${D}${PYTHON_SITEPACKAGES_DIR}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/python3/dist-packages/catkin_pkg_modules-0.4.*.egg-info ${D}${PYTHON_SITEPACKAGES_DIR}

    # python3-pkg-resources_39.0.1-2_all install lib
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/python3/dist-packages/pkg_resources ${D}${PYTHON_SITEPACKAGES_DIR}

}
do_package_qa[noexec] = "1"
