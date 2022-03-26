# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "libunwind" package
ALTERNATIVE_PRIORITY_libunwind = "100"

# set update-alternatives register name for "libunwind" package
ALTERNATIVE_libunwind = " libunwind-aarch64.so.8.0.1 libunwind-coredump.so.0.0.0 libunwind-setjmp.so.0.0.0 libunwind-ptrace.so.0 libunwind-ptrace.so.0.0.0 libunwind.so.8.0.1 libunwind-coredump.so.0 libunwind-aarch64.so.8 libunwind.so.8 libunwind-setjmp.so.0"

# set update-alternatives symbolic link path or real target path for "libunwind" package
QTI_SEPECIFIC_LINK[libunwind.so.8.0.1] = "/usr/lib/libunwind.so.8.0.1"
ALTERNATIVE_LINK_NAME[libunwind.so.8.0.1] = "/usr/lib/aarch64-linux-gnu/libunwind.so.8.0.1"

QTI_SEPECIFIC_LINK[libunwind-setjmp.so.0] = "/usr/lib/libunwind-setjmp.so.0"
ALTERNATIVE_LINK_NAME[libunwind-setjmp.so.0] = "/usr/lib/aarch64-linux-gnu/libunwind-setjmp.so.0"

QTI_SEPECIFIC_LINK[libunwind-ptrace.so.0.0.0] = "/usr/lib/libunwind-ptrace.so.0.0.0"
ALTERNATIVE_LINK_NAME[libunwind-ptrace.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libunwind-ptrace.so.0.0.0"

QTI_SEPECIFIC_LINK[libunwind.so.8] = "/usr/lib/libunwind.so.8"
ALTERNATIVE_LINK_NAME[libunwind.so.8] = "/usr/lib/aarch64-linux-gnu/libunwind.so.8"

QTI_SEPECIFIC_LINK[libunwind-coredump.so.0] = "/usr/lib/libunwind-coredump.so.0"
ALTERNATIVE_LINK_NAME[libunwind-coredump.so.0] = "/usr/lib/aarch64-linux-gnu/libunwind-coredump.so.0"

QTI_SEPECIFIC_LINK[libunwind-coredump.so.0.0.0] = "/usr/lib/libunwind-coredump.so.0.0.0"
ALTERNATIVE_LINK_NAME[libunwind-coredump.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libunwind-coredump.so.0.0.0"

QTI_SEPECIFIC_LINK[libunwind-setjmp.so.0.0.0] = "/usr/lib/libunwind-setjmp.so.0.0.0"
ALTERNATIVE_LINK_NAME[libunwind-setjmp.so.0.0.0] = "/usr/lib/aarch64-linux-gnu/libunwind-setjmp.so.0.0.0"

QTI_SEPECIFIC_LINK[libunwind-ptrace.so.0] = "/usr/lib/libunwind-ptrace.so.0"
ALTERNATIVE_LINK_NAME[libunwind-ptrace.so.0] = "/usr/lib/aarch64-linux-gnu/libunwind-ptrace.so.0"

QTI_SEPECIFIC_LINK[libunwind-aarch64.so.8.0.1] = "/usr/lib/libunwind-aarch64.so.8.0.1"
ALTERNATIVE_LINK_NAME[libunwind-aarch64.so.8.0.1] = "/usr/lib/aarch64-linux-gnu/libunwind-aarch64.so.8.0.1"

QTI_SEPECIFIC_LINK[libunwind-aarch64.so.8] = "/usr/lib/libunwind-aarch64.so.8"
ALTERNATIVE_LINK_NAME[libunwind-aarch64.so.8] = "/usr/lib/aarch64-linux-gnu/libunwind-aarch64.so.8"

# set FILES for "libunwind" package
FILES_libunwind += " /usr/lib/libunwind.so.8.0.1 /usr/lib/libunwind-setjmp.so.0 /usr/lib/libunwind-ptrace.so.0.0.0 /usr/lib/libunwind.so.8 /usr/lib/libunwind-coredump.so.0 /usr/lib/libunwind-coredump.so.0.0.0 /usr/lib/libunwind-setjmp.so.0.0.0 /usr/lib/libunwind-ptrace.so.0 /usr/lib/libunwind-aarch64.so.8.0.1 /usr/lib/libunwind-aarch64.so.8"

