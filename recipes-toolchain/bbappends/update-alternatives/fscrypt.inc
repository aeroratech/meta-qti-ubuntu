# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for fscrypt package
ALTERNATIVE_PRIORITY_fscrypt = "100"

# set update-alternatives register name for fscrypt package
ALTERNATIVE_fscrypt = "fscrypt"

# set update-alternatives symbolic link path and real target path for fscrypt package
ALTERNATIVE_LINK_NAME[fscrypt] = "/usr/bin/fscrypt"
