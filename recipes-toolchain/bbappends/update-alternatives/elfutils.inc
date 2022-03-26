# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "elfutils" package
ALTERNATIVE_PRIORITY_elfutils = "100"

# set update-alternatives register name for "elfutils" package
ALTERNATIVE_elfutils = " eu-elfcompress eu-ranlib eu-objdump eu-make-debug-archive eu-strings eu-ar eu-findtextrel eu-elfcmp eu-stack eu-elflint eu-unstrip"

# set update-alternatives symbolic link path or real target path for "elfutils" package
ALTERNATIVE_LINK_NAME[eu-unstrip] = "/usr/bin/eu-unstrip"

ALTERNATIVE_LINK_NAME[eu-elfcompress] = "/usr/bin/eu-elfcompress"

ALTERNATIVE_LINK_NAME[eu-strings] = "/usr/bin/eu-strings"

ALTERNATIVE_LINK_NAME[eu-stack] = "/usr/bin/eu-stack"

ALTERNATIVE_LINK_NAME[eu-elflint] = "/usr/bin/eu-elflint"

ALTERNATIVE_LINK_NAME[eu-elfcmp] = "/usr/bin/eu-elfcmp"

ALTERNATIVE_LINK_NAME[eu-ranlib] = "/usr/bin/eu-ranlib"

ALTERNATIVE_LINK_NAME[eu-objdump] = "/usr/bin/eu-objdump"

ALTERNATIVE_LINK_NAME[eu-ar] = "/usr/bin/eu-ar"

ALTERNATIVE_LINK_NAME[eu-findtextrel] = "/usr/bin/eu-findtextrel"

ALTERNATIVE_LINK_NAME[eu-make-debug-archive] = "/usr/bin/eu-make-debug-archive"

# set FILES for "elfutils" package
FILES_elfutils += " /usr/bin/eu-unstrip /usr/bin/eu-elfcompress /usr/bin/eu-strings /usr/bin/eu-stack /usr/bin/eu-elflint /usr/bin/eu-elfcmp /usr/bin/eu-ranlib /usr/bin/eu-objdump /usr/bin/eu-ar /usr/bin/eu-findtextrel /usr/bin/eu-make-debug-archive"


# set update-alternatives priority for "libasm" package
ALTERNATIVE_PRIORITY_libasm = "100"

# set update-alternatives register name for "libasm" package
ALTERNATIVE_libasm = " libasm.so.1"

# set update-alternatives symbolic link path or real target path for "libasm" package
QTI_SEPECIFIC_LINK[libasm.so.1] = "/usr/lib/libasm.so.1"
ALTERNATIVE_LINK_NAME[libasm.so.1] = "/usr/lib/aarch64-linux-gnu/libasm.so.1"

# set FILES for "libasm" package
FILES_libasm += " /usr/lib/libasm.so.1"


# set update-alternatives priority for "libdw" package
ALTERNATIVE_PRIORITY_libdw = "100"

# set update-alternatives register name for "libdw" package
ALTERNATIVE_libdw = " libdw.so.1"

# set update-alternatives symbolic link path or real target path for "libdw" package
QTI_SEPECIFIC_LINK[libdw.so.1] = "/usr/lib/libdw.so.1"
ALTERNATIVE_LINK_NAME[libdw.so.1] = "/usr/lib/aarch64-linux-gnu/libdw.so.1"

# set FILES for "libdw" package
FILES_libdw += " /usr/lib/libdw.so.1"


# set update-alternatives priority for "libelf" package
ALTERNATIVE_PRIORITY_libelf = "100"

# set update-alternatives register name for "libelf" package
ALTERNATIVE_libelf = " libelf.so.1"

# set update-alternatives symbolic link path or real target path for "libelf" package
QTI_SEPECIFIC_LINK[libelf.so.1] = "/usr/lib/libelf.so.1"
ALTERNATIVE_LINK_NAME[libelf.so.1] = "/usr/lib/aarch64-linux-gnu/libelf.so.1"

# set FILES for "libelf" package
FILES_libelf += " /usr/lib/libelf.so.1"

