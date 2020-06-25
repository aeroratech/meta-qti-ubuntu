
LICENSE = "BSD-3-Clause"
# License applies to this recipe code, not the packages itself.

SYSROOT_DIRS_append = "/opt/ros/dashing"

do_install() {
    CP_ARGS="-Prfd --preserve=mode,timestamps --no-preserve=ownership"

    # mkdir ros2 dashing dir
    install -d ${D}/opt/ros/dashing/
    install -d ${D}/usr/lib/aarch64-linux-gnu
    install -d ${D}/usr/include
    install -d ${D}/usr/lib/Poco

    # copy ros2 dashing to /opt/ros/dashing
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/opt/ros/dashing/* ${D}/opt/ros/dashing

    # libtinyxml2 install lib
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/tinyxml2.h ${D}/usr/include
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/${libdir}/aarch64-linux-gnu/libtinyxml2.so ${D}/usr/lib/aarch64-linux-gnu
    ln -sf ./libtinyxml2.so.6 ${D}${libdir}/${UBUN_TARGET_SYS}/libtinyxml2.so.6
    ln -sf ./libtinyxml2.so.66.0.0 ${D}${libdir}/${UBUN_TARGET_SYS}/libtinyxml2.so.6

    # libpoco-dev install lib
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb/usr/include/Poco ${D}/usr/include
    cp ${CP_ARGS} -H ${EXTERNAL_TOOLCHAIN}/deb${libdir}/libPocoFoundation.so ${D}/usr/lib
}
do_package_qa[noexec] = "1"
