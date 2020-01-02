#
# ubuntu glibc specific configuration
#

LIBCEXTENSION = "${@['', '-gnu'][(d.getVar('ABIEXTENSION') or '') != '']}"

LIBCOVERRIDE = ":libc-glibc"

LIBC_DEPENDENCIES = ""

CXXFLAGS += "-fvisibility-inlines-hidden"
