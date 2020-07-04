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

R="\033[1;31m"
G="\033[1;32m"
B="\033[1;36m"
Y="\033[1;33m"
I="\033[1;34m" ## Indigo
P="\033[1;35m"
O="\033[0m"

function font_color() {
	case $1 in
		'R'|'r') echo -n -e "\033[1;31m";;
		"G"|'g') echo -n -e "\033[1;32m";;
		"Y"|'y') echo -n -e "\033[1;33m";;
		"B"|'b') echo -n -e "\033[1;36m";;
		"P"|'p') echo -n -e "\033[1;34m";;
			  *) echo -n -e "\033[0m";;
	esac
}

function fix_dependence_link() {

	font_color Y
	echo -e "\n"
	echo -e "#######################################################################"
	echo -e "# Fix Steps:                                                          #"
	echo -e "# 1.Run command: apt --fix-broken install to fix broken dependence    #"
	echo -e "# 2.Run command: apt install /data/QTI/*  to install missing packages #"
	echo -e "#######################################################################"
	echo -e "\n"
	font_color

	font_color Y
	echo -e "\n"
	echo -e "#######################################################################"
	echo -e "# Check:                                                              #"
	echo -e "# If the missing packages are installed , type <exit> quit            #"
	echo -e "# Don't do anything else except for handling the dependence issue.    #"
	echo -e "#######################################################################"
	echo -e "\n"
	font_color

	# create tmp rc file
	RC_FILE=$(mktemp)
	cat > ${RC_FILE} << EOF
export PS1="\033[1;31m#DEPENDENCE# \033[1;32m\w/ $ \033[0m"
alias ls='ls --color=auto'
alias grep='grep --color=auto'
alias fgrep='fgrep --color=auto'
alias egrep='egrep --color=auto'
alias ll='ls -alF'
alias la='ls -A'
alias l='ls -CF'
EOF
	bash --rcfile ${RC_FILE} || true

	[ -f "${RC_FILE}" ] && rm ${RC_FILE}

}
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

#un-zip and install teh QTI debs
echo '############################################'
echo '#                                          #'
echo '#            Upgrade the QTI debs          #'
echo '#                                          #'
echo '############################################'
echo ''

if [[ -e /data/QTI ]]; then
 rm -rf /data/QTI/
 mkdir /data/QTI
else
 mkdir /data/QTI
fi

unzip -j /data/update_ext4.zip QTI/* -d /data/QTI
if [[ $? = 0 ]]; then
 echo "unzip update_ext4.zip successfully"
 echo ''
else
 echo "unzip update_ext4.zip failed"
 echo ''
fi

##Use apt install command to install the QTI packages
apt install /data/QTI/*
if [[ $? = 0 ]]; then
	echo "APT install successfully"
	echo ''
else
	font_color Y
	echo -e "\n"
	echo -e "#######################################################################"
	echo -e "# Sometime the dependence link will broken                            #"
	echo -e "# You might want to run 'apt --fix-broken install' to correct.        #"
	echo -e "# Check the error messages to find out the missing packages.          #"
	echo -e "#######################################################################"
	echo -e "\n"
	font_color
	fix_dependence_link
fi

#fix adbd launch command
sed -i "s@start-stop-daemon -S -b -a /sbin/adbd@start-stop-daemon -S -b --exec /sbin/adbd@g" ${IMAGE_ROOTFS}/etc/launch_adbd

rm -rf /data/QTI/*

#un-zip and install the MODULE debs
#For now we don't install this debs since the QTI debs have covered it
#echo ''
#echo '############################################'
#echo '#                                          #'
#echo '#          Upgrade the MODULE debs         #'
#echo '#                                          #'
#echo '############################################'
#echo ''

#if [[ -e /data/MODULE ]]; then
# rm -rf /data/MODULE/
# mkdir /data/MODULE
#else
# mkdir /data/MODULE
#fi

#unzip -j /data/update_ext4.zip MODULE/* -d /data/MODULE
#if [[ $? = 0 ]]; then
# echo "unzip update_ext4.zip successfully"
# echo ''
#else
# echo "unzip update_ext4.zip failed"
# echo ''
#fi

#dpkg -i --force-overwrite /data/MODULE/* > /data/module.log
#if [[ $? = 0 ]]; then
# echo "DPKG MODULE successfully"
# echo ''
#else
# echo '********************************************'
# echo '*                                          *'
# echo "ERROR: DPKG MODULE DEB FAILED"
# echo '*                                          *'
# echo '********************************************'
# echo ''
#fi

#rm -rf /data/MODULE/*

#upgrade the NON-HLOS and boot.img
echo ''
echo '############################################'
echo '#                                          #'
echo '#       Upgrade NON-HLOS and boot.img      #'
echo '#                                          #'
echo '############################################'
echo ''

echo "--update_package=/data/update_ext4.zip" > /cache/recovery/command
./usr/bin/recovery --update_package=/data/update_ext4.zip

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
#reboot
echo 'Please reboot the devices to reset the status!!'
