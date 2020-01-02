inherit native

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = " \
                       file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9 \
                       "

DEB_BB_PATH = "${COREBASE}/meta-qti-ubuntu/recipes-packages/bsp"

do_install() {
    rm -f ${EXTERNAL_TOOLCHAIN}/*.deb
    rm -rf ${EXTERNAL_TOOLCHAIN}/deb
    FILES_DEB_BB=$(ls ${DEB_BB_PATH}/*-ubuntu-native.bb ${DEB_BB_PATH}/*-cross-native.bb ${DEB_BB_PATH}/*-sysroot.bb)
    for filename in ${FILES_DEB_BB}
    do
        rm -f ${EXTERNAL_TOOLCHAIN}/FULL_LINK
	    rm -f ${EXTERNAL_TOOLCHAIN}/DEB_NAME
	    #get full_link
        export  FULL_LINK=$(grep "FULL_LINK" ${filename} )
        export  FULL_LINK=$( echo ${FULL_LINK} | sed "s/FULL_LINK =/ /" )
        export  FULL_LINK=$(echo ${FULL_LINK}  | sed "s/'/ /g")
	    echo ${FULL_LINK} > ${EXTERNAL_TOOLCHAIN}/FULL_LINK
        #get DEB_NAME
        export  DEB_NAME=$(grep "DEB_NAME" ${filename} )
        export  DEB_NAME=$( echo ${DEB_NAME} | sed "s/DEB_NAME =/ /" )
        export  DEB_NAME=$(echo ${DEB_NAME} | sed "s/'/ /g")
	    echo ${DEB_NAME} > ${EXTERNAL_TOOLCHAIN}/DEB_NAME
	    if [ `cat ${EXTERNAL_TOOLCHAIN}/FULL_LINK` ]; then
	        #download deb
	        cat ${EXTERNAL_TOOLCHAIN}/FULL_LINK | xargs wget -N $1  -P ${EXTERNAL_TOOLCHAIN}/
	        if [ `cat ${EXTERNAL_TOOLCHAIN}/DEB_NAME` ]; then
                #install deb
                /usr/bin/dpkg-deb -X ${EXTERNAL_TOOLCHAIN}/$(cat ${EXTERNAL_TOOLCHAIN}/DEB_NAME) ${EXTERNAL_TOOLCHAIN}/deb
            else
                bbfatal '${EXTERNAL_TOOLCHAIN}/DEB_NAME did not exist'
	        fi
	    else
	        bbfatal '${EXTERNAL_TOOLCHAIN}/FULL_LINK did not exist'
	    fi
    done
    rm -f ${EXTERNAL_TOOLCHAIN}/FULL_LINK
    rm -f ${EXTERNAL_TOOLCHAIN}/DEB_NAME
}

deltask do_populate_sysroot_setscene

