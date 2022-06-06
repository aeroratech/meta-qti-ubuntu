# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "recovery-ab" package
ALTERNATIVE_PRIORITY_recovery-ab = "100"

# set update-alternatives register name for "recovery-ab" package
ALTERNATIVE_recovery-ab = " applypatch"

# set update-alternatives symbolic link path or real target path for "recovery-ab" package
ALTERNATIVE_LINK_NAME[applypatch] = "/usr/bin/applypatch"


