# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for elfutils package
ALTERNATIVE_PRIORITY_elfutils = "100"

# set update-alternatives register name for elfutils package
ALTERNATIVE_elfutils = "eu-ar eu-elfcmp eu-elfcompress eu-elflint eu-findtextrel eu-make-debug-archive eu-ranlib eu-stack eu-strings eu-unstrip"

# set update-alternatives symbolic link path and real target path for elfutils package
ALTERNATIVE_LINK_NAME[eu-ar] = "/usr/bin/eu-ar"

ALTERNATIVE_LINK_NAME[eu-elfcmp] = "/usr/bin/eu-elfcmp"

ALTERNATIVE_LINK_NAME[eu-elfcompress] = "/usr/bin/eu-elfcompress"

ALTERNATIVE_LINK_NAME[eu-elflint] = "/usr/bin/eu-elflint"

ALTERNATIVE_LINK_NAME[eu-findtextrel] = "/usr/bin/eu-findtextrel"

ALTERNATIVE_LINK_NAME[eu-make-debug-archive] = "/usr/bin/eu-make-debug-archive"

ALTERNATIVE_LINK_NAME[eu-ranlib] = "/usr/bin/eu-ranlib"

ALTERNATIVE_LINK_NAME[eu-stack] = "/usr/bin/eu-stack"

ALTERNATIVE_LINK_NAME[eu-strings] = "/usr/bin/eu-strings"

ALTERNATIVE_LINK_NAME[eu-unstrip] = "/usr/bin/eu-unstrip"

# set update-alternatives priority for libdw package
ALTERNATIVE_PRIORITY_libdw = "100"

# set update-alternatives register name for libdw package
ALTERNATIVE_libdw = "libebl_aarch64.so libebl_alpha.so libebl_arm.so libebl_bpf.so libebl_i386.so libebl_ia64.so libebl_m68k.so libebl_mips.so libebl_parisc.so libebl_ppc.so libebl_ppc64.so libebl_s390.so libebl_sh.so libebl_sparc.so libebl_tilegx.so libebl_x86_64.so libdw.so.1"

# set update-alternatives symbolic link path and real target path for libdw package
ALTERNATIVE_LINK_NAME[libebl_aarch64.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_aarch64.so"
ALTERNATIVE_TARGET_libdw[libebl_aarch64.so] = "/usr/lib/elfutils/libebl_aarch64.so"

ALTERNATIVE_LINK_NAME[libebl_alpha.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_alpha.so"
ALTERNATIVE_TARGET_libdw[libebl_alpha.so] = "/usr/lib/elfutils/libebl_alpha.so"

ALTERNATIVE_LINK_NAME[libebl_arm.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_arm.so"
ALTERNATIVE_TARGET_libdw[libebl_arm.so] = "/usr/lib/elfutils/libebl_arm.so"

ALTERNATIVE_LINK_NAME[libebl_bpf.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_bpf.so"
ALTERNATIVE_TARGET_libdw[libebl_bpf.so] = "/usr/lib/elfutils/libebl_bpf.so"

ALTERNATIVE_LINK_NAME[libebl_i386.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_i386.so"
ALTERNATIVE_TARGET_libdw[libebl_i386.so] = "/usr/lib/elfutils/libebl_i386.so"

ALTERNATIVE_LINK_NAME[libebl_ia64.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_ia64.so"
ALTERNATIVE_TARGET_libdw[libebl_ia64.so] = "/usr/lib/elfutils/libebl_ia64.so"

ALTERNATIVE_LINK_NAME[libebl_m68k.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_m68k.so"
ALTERNATIVE_TARGET_libdw[libebl_m68k.so] = "/usr/lib/elfutils/libebl_m68k.so"

ALTERNATIVE_LINK_NAME[libebl_mips.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_mips.so"
ALTERNATIVE_TARGET_libdw[libebl_mips.so] = "/usr/lib/elfutils/libebl_mips.so"

ALTERNATIVE_LINK_NAME[libebl_parisc.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_parisc.so"
ALTERNATIVE_TARGET_libdw[libebl_parisc.so] = "/usr/lib/elfutils/libebl_parisc.so"

ALTERNATIVE_LINK_NAME[libebl_ppc.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_ppc.so"
ALTERNATIVE_TARGET_libdw[libebl_ppc.so] = "/usr/lib/elfutils/libebl_ppc.so"

ALTERNATIVE_LINK_NAME[libebl_ppc64.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_ppc64.so"
ALTERNATIVE_TARGET_libdw[libebl_ppc64.so] = "/usr/lib/elfutils/libebl_ppc64.so"

ALTERNATIVE_LINK_NAME[libebl_s390.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_s390.so"
ALTERNATIVE_TARGET_libdw[libebl_s390.so] = "/usr/lib/elfutils/libebl_s390.so"

ALTERNATIVE_LINK_NAME[libebl_sh.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_sh.so"
ALTERNATIVE_TARGET_libdw[libebl_sh.so] = "/usr/lib/elfutils/libebl_sh.so"

ALTERNATIVE_LINK_NAME[libebl_sparc.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_sparc.so"
ALTERNATIVE_TARGET_libdw[libebl_sparc.so] = "/usr/lib/elfutils/libebl_sparc.so"

ALTERNATIVE_LINK_NAME[libebl_tilegx.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_tilegx.so"
ALTERNATIVE_TARGET_libdw[libebl_tilegx.so] = "/usr/lib/elfutils/libebl_tilegx.so"

ALTERNATIVE_LINK_NAME[libebl_x86_64.so] = "/usr/lib/aarch64-linux-gnu/elfutils/libebl_x86_64.so"
ALTERNATIVE_TARGET_libdw[libebl_x86_64.so] = "/usr/lib/elfutils/libebl_x86_64.so"

ALTERNATIVE_LINK_NAME[libdw.so.1] = "/usr/lib/aarch64-linux-gnu/libdw.so.1"
ALTERNATIVE_TARGET_libdw[libdw.so.1] = "/usr/lib/libdw.so.1"

# set update-alternatives priority for libelf package
ALTERNATIVE_PRIORITY_libelf = "100"

# set update-alternatives register name for libelf package
ALTERNATIVE_libelf = "libelf.so.1"

# set update-alternatives symbolic link path and real target path for libelf package
ALTERNATIVE_LINK_NAME[libelf.so.1] = "/usr/lib/aarch64-linux-gnu/libelf.so.1"
ALTERNATIVE_TARGET_libelf[libelf.so.1] = "/usr/lib/libelf.so.1"

