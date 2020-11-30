# Copyright (c) 2020, The Linux Foundation. All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are
# met:
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
# THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
# WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
# MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
# ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
# BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
# CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
# SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
# BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
# WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
# OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
# IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

## Script to do pre-configurations specific to current layer
## before calling oe-init-build-env

GO_PATH=/usr/local/go/bin

if [ -x "/usr/bin/go" ];then
	echo -e "\033[31m #######################NOTE!!!########################\n \033[0m"
	echo -e "\033[31m Please do not use apt install golang. Remove it. \033[0m"
	echo -e "\033[31m 'sudo apt remove golang'\n 'sudo apt autoremove' \n\033[0m"
	echo -e "\033[31m #######################NOTE!!!######################## \033[0m"
	return -1
fi

if [ ! -x "$GO_PATH/go" ];then
	echo -e "\033[31m #######################NOTE!!!########################\n \033[0m"
	echo -e "\033[34m Please install go1.14.4 by: \033[0m"
	echo -e "\033[34m wget https://dl.google.com/go/go1.14.4.linux-amd64.tar.gz \033[0m"
	echo -e "\033[34m sudo tar -C /usr/local -xzf go1.14.4.linux-amd64.tar.gz\n \033[0m"
	echo -e "\033[31m #######################NOTE!!!######################## \033[0m"
	return -1
fi

