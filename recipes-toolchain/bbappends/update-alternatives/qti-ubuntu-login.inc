# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for qti-ubuntu-login package
ALTERNATIVE_PRIORITY_qti-ubuntu-login = "100"

# set update-alternatives register name for qti-ubuntu-login package
ALTERNATIVE_qti-ubuntu-login = "login"

# set update-alternatives symbolic link path and real target path for qti-ubuntu-login package
ALTERNATIVE_LINK_NAME[login] = "/etc/pam.d/login"

