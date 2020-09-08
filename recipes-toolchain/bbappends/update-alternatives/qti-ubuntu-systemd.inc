# use update-alternatives mechanism
inherit update-alternatives-ubuntu

# set update-alternatives priority for qti-ubuntu-systemd package
ALTERNATIVE_PRIORITY_qti-ubuntu-systemd = "100"

# set update-alternatives register name for qti-ubuntu-systemd package
ALTERNATIVE_qti-ubuntu-systemd = "logind.conf"

# set update-alternatives symbolic link path and real target path for qti-ubuntu-systemd package
ALTERNATIVE_LINK_NAME[logind.conf] = "/etc/systemd/logind.conf"
