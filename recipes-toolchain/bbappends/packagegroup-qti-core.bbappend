RDEPENDS_${PN}_remove = "mtd-utils-ubifs"

DIAGROUTER_qrb5165-rb5 = "${@oe.utils.version_less_or_equal('PREFERRED_VERSION_linux-msm', '4.19', 'False', 'True', d)}"
DIAGROUTER_qrb5165-rb5-pine = "${@oe.utils.version_less_or_equal('PREFERRED_VERSION_linux-msm', '4.19', 'False', 'True', d)}"

FSSCRUBD_qrb5165-rb5 = "${@oe.utils.version_less_or_equal('PREFERRED_VERSION_linux-msm', '4.19', 'False', 'True', d)}"
FSSCRUBD_qrb5165-rb5-pine = "${@oe.utils.version_less_or_equal('PREFERRED_VERSION_linux-msm', '4.19', 'False', 'True', d)}"
