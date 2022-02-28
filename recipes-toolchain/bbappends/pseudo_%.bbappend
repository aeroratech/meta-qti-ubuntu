FILESEXTRAPATHS_append := "${THISDIR}:${THISDIR}/pseudo:"

SRC_URI += " \
    file://fix_db_mismatch.patch \
"
