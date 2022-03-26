# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for hostap-daemon-qcacld package
ALTERNATIVE_PRIORITY_hostap-daemon-qcacld = "100"

# set update-alternatives register name for hostap-daemon-qcacld package
ALTERNATIVE_hostap-daemon-qcacld = " hostapd hostapd_cli "

# set update-alternatives symbolic link path and real target path for hostap-daemon-qcacld package
ALTERNATIVE_LINK_NAME[hostapd] = "/usr/sbin/hostapd"

ALTERNATIVE_LINK_NAME[hostapd_cli] = "/usr/sbin/hostapd_cli"

