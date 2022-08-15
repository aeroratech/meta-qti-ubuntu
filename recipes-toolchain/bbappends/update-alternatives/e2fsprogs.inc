# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for libext2fs package
ALTERNATIVE_PRIORITY_e2fsprogs-tools = "100"

# set update-alternatives register name for libext2fs package
ALTERNATIVE_e2fsprogs-tools = "libext2fs.so.2 libext2fs.so.2.4 libss.so.2 libss.so.2.0 compile_et mk_cmds libcom_err.so libe2p.so libext2fs.so libss.so libcom_err.so.2 libcom_err.so.2.1 libe2p.so.2 libe2p.so.2.3 e2scrub.conf mke2fs.conf badblocks debugfs dumpe2fs e2fsck e2image e2label e2undo fsck.ext2 fsck.ext3 fsck.ext4 logsave mke2fs mkfs.ext2 mkfs.ext3 mkfs.ext4 resize2fs tune2fs chattr lsattr e2freefrag e2mmpstatus e2scrub e2scrub_all e4crypt e4defrag filefrag mklost+found"

# set update-alternatives symbolic link path and real target path for libext2fs package
ALTERNATIVE_LINK_NAME[libext2fs.so.2] = "/lib/aarch64-linux-gnu/libext2fs.so.2"

ALTERNATIVE_LINK_NAME[libext2fs.so.2.4] = "/lib/aarch64-linux-gnu/libext2fs.so.2.4"

ALTERNATIVE_LINK_NAME[libss.so.2] = "/lib/aarch64-linux-gnu/libss.so.2"

ALTERNATIVE_LINK_NAME[libss.so.2.0] = "/lib/aarch64-linux-gnu/libss.so.2.0"

ALTERNATIVE_LINK_NAME[compile_et] = "/usr/bin/compile_et"

ALTERNATIVE_LINK_NAME[mk_cmds] = "/usr/bin/mk_cmds"

ALTERNATIVE_LINK_NAME[libcom_err.so] = "/usr/lib/aarch64-linux-gnu/libcom_err.so"
QTI_SEPECIFIC_LINK[libcom_err.so] = "/lib/libcom_err.so"

ALTERNATIVE_LINK_NAME[libe2p.so] = "/usr/lib/aarch64-linux-gnu/libe2p.so"
QTI_SEPECIFIC_LINK[libe2p.so] = "/lib/libe2p.so"

ALTERNATIVE_LINK_NAME[libext2fs.so] = "/usr/lib/aarch64-linux-gnu/libext2fs.so"
QTI_SEPECIFIC_LINK[libext2fs.so] = "/lib/libext2fs.so"

ALTERNATIVE_LINK_NAME[libss.so] = "/usr/lib/aarch64-linux-gnu/libss.so"
QTI_SEPECIFIC_LINK[libss.so] = "/lib/libss.so"

ALTERNATIVE_LINK_NAME[libcom_err.so.2] = "/lib/aarch64-linux-gnu/libcom_err.so.2"

ALTERNATIVE_LINK_NAME[libcom_err.so.2.1] = "/lib/aarch64-linux-gnu/libcom_err.so.2.1"

ALTERNATIVE_LINK_NAME[libe2p.so.2] = "/usr/lib/aarch64-linux-gnu/libe2p.so.2"
QTI_SEPECIFIC_LINK[libe2p.so.2] = "/lib/libe2p.so.2"

ALTERNATIVE_LINK_NAME[libe2p.so.2.3] = "/usr/lib/aarch64-linux-gnu/libe2p.so.2.3"
QTI_SEPECIFIC_LINK[libe2p.so.2.3] = "/lib/libe2p.so.2.3"

ALTERNATIVE_LINK_NAME[mke2fs.conf] = "/etc/mke2fs.conf"

ALTERNATIVE_LINK_NAME[e2scrub.conf] = "/etc/e2scrub.conf"

ALTERNATIVE_LINK_NAME[badblocks] = "/sbin/badblocks"

ALTERNATIVE_LINK_NAME[debugfs] = "/sbin/debugfs"

ALTERNATIVE_LINK_NAME[e2mmpstatus] = "/sbin/e2mmpstatus"

ALTERNATIVE_LINK_NAME[e2scrub] = "/sbin/e2scrub"

ALTERNATIVE_LINK_NAME[e2scrub_all] = "/sbin/e2scrub_all"

ALTERNATIVE_LINK_NAME[dumpe2fs] = "/sbin/dumpe2fs"

ALTERNATIVE_LINK_NAME[e2fsck] = "/sbin/e2fsck"

ALTERNATIVE_LINK_NAME[e2freefrag] = "/usr/sbin/e2freefrag"
QTI_SEPECIFIC_LINK[e2freefrag] = "/sbin/e2freefrag"

ALTERNATIVE_LINK_NAME[e4crypt] = "/usr/sbin/e4crypt"
QTI_SEPECIFIC_LINK[e4crypt] = "/sbin/e4crypt"

ALTERNATIVE_LINK_NAME[e4defrag] = "/usr/sbin/e4defrag"
QTI_SEPECIFIC_LINK[e4defrag] = "/sbin/e4defrag"

ALTERNATIVE_LINK_NAME[e2image] = "/sbin/e2image"

ALTERNATIVE_LINK_NAME[e2label] = "/sbin/e2label"

ALTERNATIVE_LINK_NAME[e2undo] = "/sbin/e2undo"

ALTERNATIVE_LINK_NAME[filefrag] = "/usr/sbin/filefrag"
QTI_SEPECIFIC_LINK[filefrag] = "/sbin/filefrag"

ALTERNATIVE_LINK_NAME[fsck.ext2] = "/sbin/fsck.ext2"

ALTERNATIVE_LINK_NAME[fsck.ext3] = "/sbin/fsck.ext3"

ALTERNATIVE_LINK_NAME[fsck.ext4] = "/sbin/fsck.ext4"

ALTERNATIVE_LINK_NAME[logsave] = "/sbin/logsave"

ALTERNATIVE_LINK_NAME[mke2fs] = "/sbin/mke2fs"

ALTERNATIVE_LINK_NAME[mkfs.ext2] = "/sbin/mkfs.ext2"

ALTERNATIVE_LINK_NAME[mkfs.ext3] = "/sbin/mkfs.ext3"

ALTERNATIVE_LINK_NAME[mkfs.ext4] = "/sbin/mkfs.ext4"

ALTERNATIVE_LINK_NAME[mklost+found] = "/usr/sbin/mklost+found"
QTI_SEPECIFIC_LINK[mklost+found] = "/sbin/mklost+found"

ALTERNATIVE_LINK_NAME[resize2fs] = "/sbin/resize2fs"

ALTERNATIVE_LINK_NAME[tune2fs] = "/sbin/tune2fs"

ALTERNATIVE_LINK_NAME[chattr] = "/usr/bin/chattr"

ALTERNATIVE_LINK_NAME[lsattr] = "/usr/bin/lsattr"







