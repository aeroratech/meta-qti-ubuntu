#!/bin/sh
###############################################################################
#
#Copyright (c) 2020, The Linux Foundation. All rights reserved.
#
#Redistribution and use in source and binary forms, with or without
#modification, are permitted provided that the following conditions are
#met:
#    * Redistributions of source code must retain the above copyright
#      notice, this list of conditions and the following disclaimer.
#    * Redistributions in binary form must reproduce the above
#      copyright notice, this list of conditions and the following
#      disclaimer in the documentation and/or other materials provided
#      with the distribution.
#    * Neither the name of The Linux Foundation nor the names of its
#      contributors may be used to endorse or promote products derived
#      from this software without specific prior written permission.
#
#THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
#WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
#MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
#ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
#BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
#CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
#SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
#BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
#WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
#OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
#IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
#
###############################################################################

#systemctl stop init_display.service


#Start OTA upgrade
echo '############################################'
echo '#                                          #'
echo '#             Start OTA upgrade            #'
echo '#                                          #'
echo '############################################'
echo ''
timer_start=`date +'%Y-%m-%d %H:%M:%S'`
echo "Start time is : $timer_start"
echo ''


# upgrade mode:
#1. Main deb + <NON-HLOS and boot.img>
#2. All debs upograde + <NON-HLOS and boot.img>
#3. only upgrade the <NON-HLOS and boot.img>


status="default"

##un-zip  the debs
if [[ -e /data/MAIN ]]; then
 rm -rf /data/MAIN/
 mkdir /data/MAIN
else
 mkdir /data/MAIN
fi

##un-zip  the QTI debs
if [[ -e /data/QTI ]]; then
 rm -rf /data/QTI/
 mkdir /data/QTI
else
 mkdir /data/QTI
fi

##un-zip the OSS debs
if [[ -e /data/OSS ]]; then
 rm -rf /data/OSS/
 mkdir /data/OSS
else
 mkdir /data/OSS
fi


unzip -j /data/update_ext4.zip QTI/* -d /data/QTI
if [[ $? = 0 ]]; then
 echo "unzip MAIN packages successfully"
 unzip -j /data/update_ext4.zip OSS/* -d /data/OSS
 status="all"
else
 echo "unzip kernel packages successfully"
 unzip -j /data/update_ext4.zip MAIN/* -d /data/MAIN
 if [[ $? = 0 ]]; then
  echo "unzip MAIN packages successfully"
  status="main"
 else
  echo "unzip kernel packages successfully"
  status="kernel"
 fi
fi

upgrade_pre_fix() {
	echo '############################################'
	echo '#                                          #'
	echo '#          Upgrade the fix install         #'
	echo '#                                          #'
	echo '############################################'
	echo ''
	apt-get -f install
	dpkg --configure -a
}

upgrade_main_debs() {
	##Use apt install command to install the MAIN packages
	echo '############################################'
	echo '#                                          #'
	echo '#            Upgrade the MAIN debs         #'
	echo '#                                          #'
	echo '############################################'
	echo ''
	systemctl stop init_display.service

	echo "last install dpkg -i --force-overwrite: /data/MAIN/*.deb"
	dpkg -i --force-overwrite /data/MAIN/*.deb
}

remove_useless_debs() {
	##Remove some packages if they don't exist in the new version
	echo '############################################'
	echo '#                                          #'
	echo '#        Remove the useless debs           #'
	echo '#                                          #'
	echo '############################################'
	echo ''
	for name in `cat /var/lib/dpkg/qti_deb_list_device`
	do
	grep -Fx "${name}" /data/QTI/qti_deb_list
	if [[ $? = 0 ]]; then
		echo -e "${name} exist"
	else
		echo -e "\n"
		echo -e "${name} doesn't exist in the last version. Need remove it "
		echo -e "#####################################QTI##################################"
		echo -e "# Using the apt remove to remove the pachages                         #"
		echo -e "#####################################QTI##################################"
		if [[ "${name}" = "ota-package-decrypted" ]] || [[ "${name}" = "ota-package-decrypted-dbg" ]] || [[ "${name}" = "ota-upgrade" ]] || [[ "${name}" = "ota-upgrade-dbg" ]] || [[ "${name}" = "checksd" ]] || [[ "${name}" = "checksd-dbg" ]] || [[ "${name}" = "leds-mode" ]]; then
			echo -e "#####################################skip ota & check sd deb##################################"
			echo -e "${name} ota upgrade & check sd deb skip"
			echo -e "######################################QTI#################################"
		else
			apt remove ${name} -y
		fi
	fi
	done
	##Update the QTI pacakges list in the device and remove it from /data/QTI
	cp /data/QTI/qti_deb_list /var/lib/dpkg/qti_deb_list_device -rf
	rm /data/QTI/qti_deb_list
}

upgrade_oss_debs() {
	##Use apt install command to install the OSS packages
	echo '############################################'
	echo '#                                          #'
	echo '#            Upgrade the OSS debs          #'
	echo '#                                          #'
	echo '############################################'
	echo ''

	echo '###############apt update need on-line###################'
	#apt update

	for oss in `cat /data/OSS/oss_deb_list`
	do
		grep -Fx "${oss}" /var/lib/dpkg/oss_deb_list_device
		if [[ $? = 0 ]]; then
			echo -e "${oss} exist"
		else
			echo -e "\n"
			echo -e "${oss} doesn't exist in the device. Need apt install it "
			echo -e "##################################oss#####################################"
			echo -e "# Using the apt install to the pachages                               #"
			echo -e "###################################oss####################################"
			apt install ${oss} -y
		fi
	done

	##Update the OSS pacakges list in the device and remove it from /data/QTI
	cp /data/OSS/oss_deb_list /var/lib/dpkg/oss_deb_list_device -rf
	rm /data/OSS/oss_deb_list
}

upgrade_qti_debs() {
	##Use apt install command to install the QTI packages
	echo '############################################'
	echo '#                                          #'
	echo '#            Upgrade the QTI debs          #'
	echo '#                                          #'
	echo '############################################'
	echo ''

	echo '###############apt update need on-line###################'
	#apt update

	exclude_list=(
	    "ota-upgrade"
	    "ota-package-decrypted"
	    "checksd"
	    "adbd"
	    "qti-libweston"
	    "qti-weston"
	    "weston-init"
	    "leds-mode"
	)

	deb_files=$(find /data/QTI -type f -name "*.deb")
	deb_files_list=$(echo "$deb_files" | tr ' ' '\n')
	# del exclude_list file
	for exclude_str in "${exclude_list[@]}"; do
	    deb_files_list=$(echo "$deb_files_list" | grep -v "$exclude_str")
	done
	files_to_install=$(echo "$deb_files_list" | tr '\n' ' ')

	if [ -n "$files_to_install" ]; then
		echo "#########$files_to_install###########"
		apt install $files_to_install -y
	else
		echo "not found .deb file"
	fi

	for last_file in "${exclude_list[@]}"; do
		echo "last install dpkg -i --force-overwrite: $last_file"
		dpkg -i --force-overwrite /data/QTI/*$last_file*.deb
	done

	#apt-get install -f

	if [[ $? = 0 ]]; then
		echo "APT install successfully"
		echo ''
	else
		echo -e "\n"
		echo -e "################################################################################"
		echo -e "# Sometime packages will updated failed.                                       #"
		echo -e "# There will be below most likely scenarios, please check the log:             #"
		echo -e "#                                                                              #"
		echo -e "# 1.Packages Overwrite issue                                                   #"
		echo -e "# Reason: Some OSS and Updated packages can not co-exit on system of LU.       #"
		echo -e "# They maybe provide same files or package name, but only one file             #"
		echo -e "# can present on system at the same time, then another package will be broken. #"
		echo -e "# Fixed way: Using the update-alternative mechanism and build again to fix     #"
		echo -e "# the updated package.                                                         #"
		echo -e "#                                                                              #"
		echo -e "# 2.Dependence link broken issue                                               #"
		echo -e "# Reason: The dependence link of the packages are broken.                      #"
		echo -e "# Fixed way:                                                                   #"
		echo -e "# Run command: apt --fix-broken install to fix broken dependence               #"
		echo -e "# Run command: apt install /data/QTI/*  to install missing packages            #"
		echo -e "#                                                                              #"
		echo -e "# 3.Network issue                                                              #"
		echo -e "# Reason: The Network is weak link of the packages are broken.                 #"
		echo -e "# Fixed way:                                                                   #"
		echo -e "# Run command: apt update                                                      #"
		echo -e "# Run command: apt install /data/QTI/*  to install packages again              #"
		echo -e "#                                                                              #"
		echo -e "# Check:                                                                       #"
		echo -e "# If the missing packages are installed in second case, type <exit> quit       #"
		echo -e "# Don't do anything else except for handling the dependence issue.             #"
		echo -e "################################################################################"
		echo -e "\n"
	fi
}

common_install() {
	#fix adbd launch command
	if [[ -e /sbin/launch_adbd ]]; then
	 sed -i "s@start-stop-daemon -S -b -a /sbin/adbd@start-stop-daemon -S -b --exec /sbin/adbd@g" /sbin/launch_adbd
	else
	 mv /etc/launch_adbd /sbin/launch_adbd
	 sed -i "s@start-stop-daemon -S -b -a /sbin/adbd@start-stop-daemon -S -b --exec /sbin/adbd@g" /sbin/launch_adbd
	fi

	#fix udev link issue
	sed -i 's/LABEL="persistent_storage_end"/# block\/bootdevice\/by-name links'"\n"'LABEL="persistent_storage_end"/g' /lib/udev/rules.d/60-persistent-storage.rules
	sed -i 's/LABEL="persistent_storage_end"/ENV{ID_PART_ENTRY_SCHEME}=="gpt", ENV{ID_PART_ENTRY_NAME}=="?*", SYMLINK+="block\/bootdevice\/by-name\/$env{ID_PART_ENTRY_NAME}"'"\n\n"'LABEL="persistent_storage_end"/g' /lib/udev/rules.d/60-persistent-storage.rules

	#fix build.prop content missed issue
	chown leprop:leprop /etc/build.prop
	echo "service.adb.root=1" >> /build.prop
	echo ro.build.version.release=`cat /etc/version ` >> /build.prop

	rm -rf /data/QTI/
	rm -rf /data/OSS/
	rm -rf /data/MAIN/

	#systemctl restart update-alternatives-recovery.service

	##upgrade the NON-HLOS and boot.img
	echo ''
	echo '############################################'
	echo '#                                          #'
	echo '#       Upgrade NON-HLOS and boot.img      #'
	echo '#                                          #'
	echo '############################################'
	echo ''

	echo "--update_package=/data/update_ext4.zip" > /cache/recovery/command
	/usr/bin/recovery --update_package=/data/update_ext4.zip

	if [[ $? = 0 ]]; then
	    echo "The NON-HLOS and boot.img generation was successful"
		echo "Check /tmp location for more details"
	else
	    echo "the NON-HLOS and boot.img generation failed"
		echo "Check /tmp location for more details"
	fi

	#End of OTA upgrade
	echo ''
	timer_end=`date +'%Y-%m-%d %H:%M:%S'`
	start_seconds=$(date --date="$timer_start" +%s);
	end_seconds=$(date --date="$timer_end" +%s);
	echo "The total time of OTA upgrade is ： "$((end_seconds-start_seconds))"s"
	echo ''

	#restart the depends-update and reboot the devices
	echo '############################################'
	echo '#               End Upgrade                #'
	echo '#     Restart depends-update and reboot    #'
	echo '#                                          #'
	echo '############################################'
	echo ''
	systemctl restart depends-update

	# clean upgrade package
	echo 'Test Aeroratech'

	/usr/bin/rm -rf /data/update_ext4.zip
	cp /mnt/sdcard/ota/update_ext4.aes.sig /data/update_ext4.aes.sig

	sync
	sync

	systemctl reboot
}


echo "status ="$status
case $status in
  "main")
    echo "main debs and kernel upgrade..."
    upgrade_pre_fix
    upgrade_main_debs
    common_install
    ;;
  "all")
    echo "all debs and kernel upgrade..."
    upgrade_pre_fix
    systemctl stop init_display.service
    remove_useless_debs
    upgrade_oss_debs
    upgrade_qti_debs
    common_install
    ;;
  "kernel")
    echo "non-hlos and boot.img upgrade..."
    common_install
    ;;
  *)
    echo "Invalid option! Please use 'main', 'all', or 'kernel'."
    ;;
esac
