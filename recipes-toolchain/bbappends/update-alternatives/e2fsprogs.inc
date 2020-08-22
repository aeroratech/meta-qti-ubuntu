# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for libext2fs package
ALTERNATIVE_PRIORITY_libext2fs = "100"

# set update-alternatives register name for libext2fs package
ALTERNATIVE_libext2fs = "libext2fs.so.2 libext2fs.so.2.4 ext2fs.pc"

# set update-alternatives symbolic link path and real target path for libext2fs package
ALTERNATIVE_LINK_NAME[libext2fs.so.2] = "/lib/aarch64-linux-gnu/libext2fs.so.2"

ALTERNATIVE_LINK_NAME[libext2fs.so.2.4] = "/lib/aarch64-linux-gnu/libext2fs.so.2.4"

ALTERNATIVE_LINK_NAME[ext2fs.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/ext2fs.pc"

# set update-alternatives priority for libss package
ALTERNATIVE_PRIORITY_libss = "100"

# set update-alternatives register name for libss package
ALTERNATIVE_libss = "libss.so.2 libss.so.2.0 ss.pc"

# set update-alternatives symbolic link path and real target path for libss package
ALTERNATIVE_LINK_NAME[libss.so.2] = "/lib/aarch64-linux-gnu/libss.so.2"

ALTERNATIVE_LINK_NAME[libss.so.2.0] = "/lib/aarch64-linux-gnu/libss.so.2.0"

ALTERNATIVE_LINK_NAME[ss.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/ss.pc"

# set update-alternatives priority for e2fsprogs-dev package
ALTERNATIVE_PRIORITY_e2fsprogs-dev = "100"

# set update-alternatives register name for e2fsprogs-dev package
ALTERNATIVE_e2fsprogs-dev = "compile_et mk_cmds com_err.h e2p.h com_err.h bitops.h ext2_err.h ext2_ext_attr.h ext2_fs.h ext2_io.h ext2_types.h ext2fs.h ext3_extents.h qcow2.h tdb.h ss.h ss_err.h et_c.awk et_h.awk ct_c.awk ct_c.sed libcom_err.so libe2p.so libext2fs.so libss.so com_err.pc e2p.pc ext2fs.pc ss.pc"

# set update-alternatives symbolic link path and real target path for e2fsprogs-dev package
ALTERNATIVE_LINK_NAME[compile_et] = "/usr/bin/compile_et"

ALTERNATIVE_LINK_NAME[mk_cmds] = "/usr/bin/mk_cmds"

ALTERNATIVE_LINK_NAME[com_err.h] = "/usr/include/com_err.h"

ALTERNATIVE_LINK_NAME[e2p.h] = "/usr/include/e2p/e2p.h"

ALTERNATIVE_LINK_NAME[com_err.h] = "/usr/include/et/com_err.h"

ALTERNATIVE_LINK_NAME[bitops.h] = "/usr/include/ext2fs/bitops.h"

ALTERNATIVE_LINK_NAME[ext2_err.h] = "/usr/include/ext2fs/ext2_err.h"

ALTERNATIVE_LINK_NAME[ext2_ext_attr.h] = "/usr/include/ext2fs/ext2_ext_attr.h"

ALTERNATIVE_LINK_NAME[ext2_fs.h] = "/usr/include/ext2fs/ext2_fs.h"

ALTERNATIVE_LINK_NAME[ext2_io.h] = "/usr/include/ext2fs/ext2_io.h"

ALTERNATIVE_LINK_NAME[ext2_types.h] = "/usr/include/ext2fs/ext2_types.h"

ALTERNATIVE_LINK_NAME[ext2fs.h] = "/usr/include/ext2fs/ext2fs.h"

ALTERNATIVE_LINK_NAME[ext3_extents.h] = "/usr/include/ext2fs/ext3_extents.h"

ALTERNATIVE_LINK_NAME[qcow2.h] = "/usr/include/ext2fs/qcow2.h"

ALTERNATIVE_LINK_NAME[tdb.h] = "/usr/include/ext2fs/tdb.h"

ALTERNATIVE_LINK_NAME[ss.h] = "/usr/include/ss/ss.h"

ALTERNATIVE_LINK_NAME[ss_err.h] = "/usr/include/ss/ss_err.h"

ALTERNATIVE_LINK_NAME[et_c.awk] = "/usr/share/et/et_c.awk"

ALTERNATIVE_LINK_NAME[et_h.awk] = "/usr/share/et/et_h.awk"

ALTERNATIVE_LINK_NAME[ct_c.awk] = "/usr/share/ss/ct_c.awk"

ALTERNATIVE_LINK_NAME[ct_c.sed] = "/usr/share/ss/ct_c.sed"

ALTERNATIVE_LINK_NAME[libcom_err.so] = "/usr/lib/aarch64-linux-gnu/libcom_err.so"
ALTERNATIVE_TARGET_e2fsprogs-dev[libcom_err.so] = "/lib/libcom_err.so"

ALTERNATIVE_LINK_NAME[libe2p.so] = "/usr/lib/aarch64-linux-gnu/libe2p.so"
ALTERNATIVE_TARGET_e2fsprogs-dev[libe2p.so] = "/lib/libe2p.so"

ALTERNATIVE_LINK_NAME[libext2fs.so] = "/usr/lib/aarch64-linux-gnu/libext2fs.so"
ALTERNATIVE_TARGET_e2fsprogs-dev[libext2fs.so] = "/lib/libext2fs.so"

ALTERNATIVE_LINK_NAME[libss.so] = "/usr/lib/aarch64-linux-gnu/libss.so"
ALTERNATIVE_TARGET_e2fsprogs-dev[libss.so] = "/lib/libss.so"

ALTERNATIVE_LINK_NAME[com_err.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/com_err.pc"
ALTERNATIVE_TARGET_e2fsprogs-dev[com_err.pc] = "/usr/lib/pkgconfig/com_err.pc"

ALTERNATIVE_LINK_NAME[e2p.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/e2p.pc"
ALTERNATIVE_TARGET_e2fsprogs-dev[e2p.pc] = "/usr/lib/pkgconfig/e2p.pc"

ALTERNATIVE_LINK_NAME[ext2fs.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/ext2fs.pc"
ALTERNATIVE_TARGET_e2fsprogs-dev[ext2fs.pc] = "/usr/lib/pkgconfig/ext2fs.pc"

ALTERNATIVE_LINK_NAME[ss.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/ss.pc"
ALTERNATIVE_TARGET_e2fsprogs-dev[ss.pc] = "/usr/lib/pkgconfig/ss.pc"

# set update-alternatives priority for libcomerr package
ALTERNATIVE_PRIORITY_libcomerr = "100"

# set update-alternatives register name for libcomerr package
ALTERNATIVE_libcomerr = "libcom_err.so.2 libcom_err.so.2.1 com_err.pc"

# set update-alternatives symbolic link path and real target path for libcomerr package
ALTERNATIVE_LINK_NAME[libcom_err.so.2] = "/lib/aarch64-linux-gnu/libcom_err.so.2"

ALTERNATIVE_LINK_NAME[libcom_err.so.2.1] = "/lib/aarch64-linux-gnu/libcom_err.so.2.1"

ALTERNATIVE_LINK_NAME[com_err.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/com_err.pc"

# set update-alternatives priority for libe2p package
ALTERNATIVE_PRIORITY_libe2p = "100"

# set update-alternatives register name for libe2p package
ALTERNATIVE_libe2p = "libe2p.so.2 libe2p.so.2.3 e2p.pc"

# set update-alternatives symbolic link path and real target path for libe2p package
ALTERNATIVE_LINK_NAME[libe2p.so.2] = "/lib/aarch64-linux-gnu/libe2p.so.2"

ALTERNATIVE_LINK_NAME[libe2p.so.2.3] = "/lib/aarch64-linux-gnu/libe2p.so.2.3"

ALTERNATIVE_LINK_NAME[e2p.pc] = "/usr/lib/aarch64-linux-gnu/pkgconfig/e2p.pc"

# set update-alternatives priority for e2fsprogs package
ALTERNATIVE_PRIORITY_e2fsprogs = "100"

# set update-alternatives register name for e2fsprogs package
ALTERNATIVE_${PN} = "mke2fs.conf badblocks debugfs dumpe2fs e2fsck e2image e2label e2undo fsck.ext2 fsck.ext3 fsck.ext4 logsave mke2fs mkfs.ext2 mkfs.ext3 mkfs.ext4 resize2fs tune2fs chattr lsattr e2freefrag e4crypt e4defrag filefrag mklost+found"

# set update-alternatives symbolic link path and real target path for e2fsprogs package
ALTERNATIVE_LINK_NAME[mke2fs.conf] = "/etc/mke2fs.conf"

ALTERNATIVE_LINK_NAME[badblocks] = "/sbin/badblocks"

ALTERNATIVE_LINK_NAME[debugfs] = "/sbin/debugfs"

ALTERNATIVE_LINK_NAME[dumpe2fs] = "/sbin/dumpe2fs"

ALTERNATIVE_LINK_NAME[e2fsck] = "/sbin/e2fsck"

ALTERNATIVE_LINK_NAME[e2image] = "/sbin/e2image"

ALTERNATIVE_LINK_NAME[e2label] = "/sbin/e2label"

ALTERNATIVE_LINK_NAME[e2undo] = "/sbin/e2undo"

ALTERNATIVE_LINK_NAME[fsck.ext2] = "/sbin/fsck.ext2"

ALTERNATIVE_LINK_NAME[fsck.ext3] = "/sbin/fsck.ext3"

ALTERNATIVE_LINK_NAME[fsck.ext4] = "/sbin/fsck.ext4"

ALTERNATIVE_LINK_NAME[logsave] = "/sbin/logsave"

ALTERNATIVE_LINK_NAME[mke2fs] = "/sbin/mke2fs"

ALTERNATIVE_LINK_NAME[mkfs.ext2] = "/sbin/mkfs.ext2"

ALTERNATIVE_LINK_NAME[mkfs.ext3] = "/sbin/mkfs.ext3"

ALTERNATIVE_LINK_NAME[mkfs.ext4] = "/sbin/mkfs.ext4"

ALTERNATIVE_LINK_NAME[resize2fs] = "/sbin/resize2fs"

ALTERNATIVE_LINK_NAME[tune2fs] = "/sbin/tune2fs"

ALTERNATIVE_LINK_NAME[chattr] = "/usr/bin/chattr"

ALTERNATIVE_LINK_NAME[lsattr] = "/usr/bin/lsattr"

ALTERNATIVE_LINK_NAME[e2freefrag] = "/usr/sbin/e2freefrag"
ALTERNATIVE_TARGET_e2fsprogs[e2freefrag] = "/sbin/e2freefrag"

ALTERNATIVE_LINK_NAME[e4crypt] = "/usr/sbin/e4crypt"
ALTERNATIVE_TARGET_e2fsprogs[e4crypt] = "/sbin/e4crypt"

ALTERNATIVE_LINK_NAME[e4defrag] = "/usr/sbin/e4defrag"
ALTERNATIVE_TARGET_e2fsprogs[e4defrag] = "/sbin/e4defrag"

ALTERNATIVE_LINK_NAME[filefrag] = "/usr/sbin/filefrag"
ALTERNATIVE_TARGET_e2fsprogs[filefrag] = "/sbin/filefrag"

ALTERNATIVE_LINK_NAME[mklost+found] = "/usr/sbin/mklost+found"
ALTERNATIVE_TARGET_e2fsprogs[mklost+found] = "/sbin/mklost+found"

