inherit python3native

LICENSE = "BSD-3-clause-clear"
# License applies to this recipe code, not the packages itself.

SYSROOT_DIRS_append = "/opt/ros/dashing"

do_install() {
    CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

    # mkdir ros2 dashing dir
    install -d ${D}/opt/ros/dashing/
    install -d ${D}/usr/lib/aarch64-linux-gnu
    install -d ${D}/usr/include
    install -d ${D}/usr/lib/Poco
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}
    install -d ${D}/lib/

    # copy ros2 dashing to /opt/ros/dashing
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/opt/ros/foxy/* ${D}/opt/ros/dashing
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/opt/ros/foxy/lib/python3.8/site-packages/* ${D}${PYTHON_SITEPACKAGES_DIR}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/lib/aarch64-linux-gnu/libspdlog.so.* ${D}/usr/lib/
#    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/opt/ros/foxy/lib/aarch64-linux-gnu/* ${D}/lib/

    # libtinyxml2 install lib
#    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/tinyxml2.h ${D}/usr/include
#    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/aarch64-linux-gnu/libtinyxml2.so ${D}/usr/lib/aarch64-linux-gnu
#    ln -sf ./libtinyxml2.so.6 ${D}${libdir}/${UBUN_TARGET_SYS}/libtinyxml2.so.6
#    ln -sf ./libtinyxml2.so.66.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libtinyxml2.so.6

    # libpoco-dev install lib
#    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/Poco ${D}/usr/include
#    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/aarch64-linux-gnu/libPocoFoundation.so ${D}/usr/lib

    # python3-catkin-pkg-modules_0.4.23-1_all install lib
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/python3/dist-packages/catkin_pkg ${D}${PYTHON_SITEPACKAGES_DIR}
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/python3/dist-packages/catkin_pkg_modules-0.4.*.egg-info ${D}${PYTHON_SITEPACKAGES_DIR}

    # python3-pkg-resources_39.0.1-2_all install lib
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/python3/dist-packages/pkg_resources ${D}${PYTHON_SITEPACKAGES_DIR}

}
do_package_qa[noexec] = "1"
