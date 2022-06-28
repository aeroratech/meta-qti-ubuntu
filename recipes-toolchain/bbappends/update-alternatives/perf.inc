# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "perf" package
ALTERNATIVE_PRIORITY_perf = "100"

# set update-alternatives register name for "perf" package
ALTERNATIVE_perf = " perf"

# set update-alternatives symbolic link path or real target path for "perf" package
ALTERNATIVE_LINK_NAME[perf] = "/usr/bin/perf"
