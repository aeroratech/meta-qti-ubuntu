SUMMARY = "Package suite with debugging tools from OE and QTI"

inherit packagegroup

PACKAGES =  "\
              packagegroup-qti-ubuntu-debug-tools \
            "

# Add debug support packages to RDEPENDS list for a debug build.
RDEPENDS_packagegroup-qti-ubuntu-debug-tools = " \
            perf \
        "
