"""
Copyright (c) 2022 Qualcomm Innovation Center, Inc. All rights reserved.
 
Redistribution and use in source and binary forms, with or without
modification, are permitted (subject to the limitations in the
disclaimer below) provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.

    * Redistributions in binary form must reproduce the above
      copyright notice, this list of conditions and the following
      disclaimer in the documentation and/or other materials provided
      with the distribution.
 
    * Neither the name of Qualcomm Innovation Center, Inc. nor the names of its
      contributors may be used to endorse or promote products derived
      from this software without specific prior written permission.
 
NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE
GRANTED BY THIS LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT
HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.




Since ubuntu-toolchain.bb contains all dependece chain.
We expect have a split on it.

For example replacement:
Yocto:  zlib_1.2.11.bb
Ubuntu: zlib-ubuntu.bb

Ubuntu*.bb match dependence as yocto is our expectation.

Usage:  python3 ubuntu_recipe_generator.py [flags] recipe name
  -r (--recipe)  <file>
      input a recipe name, generate a ubuntu recipe to replace yocto recipe.
      This parameter require two files:
      1.Yocto recipe's sysroots-components(we need that as Metadata to match which ubuntu packages)
      2.Yocto recipe's env conguire file. We want to get dependence and provides information match yocto recipe.
        use bitbake -e recipe_name > ../recipe_name_env
        example: bitbake -e zlib > ../zlib_env

  -p (--package) <file>
      input a recipe name, generate a ubuntu recipe.
      input packages name only.
"""


from ast import walk
from ctypes.wintypes import PINT
from doctest import set_unittest_reportflags
from email.policy import default
from pickle import TRUE
from importlib.metadata import files
from itertools import count
from posixpath import split
import sys
from unittest import result
import requests
import re
import datetime
import os
from threading import Thread, Lock
import subprocess
from collections import Counter,defaultdict
from optparse import OptionParser
import linecache
import time
import fnmatch

# gloal vars
pkg_list=[]
lock = Lock()
threads = []
version = "focal"
script_path = os.path.realpath(sys.argv[0])
project_path = script_path[:script_path.rfind("/")] + "/../"
tcmode_path = project_path + "conf/distro/include/tcmode-external-ubuntu.inc"
blacklist_path = project_path + "conf/distro/include/recipes-pn-block.inc"
ubuntubase_path = project_path + "recipes-core/ubuntu-base/ubuntu-base_20.04.inc"


def grep(filename, arg, option):
    process = subprocess.Popen(['grep', option, arg, filename], stdout=subprocess.PIPE)
    stdout, stderr = process.communicate()
    return stdout, stderr


def bb_headerformat():
    os.system("echo 'inherit upkg_base' >> %s-ubuntu.bb" %RN)
    os.system("echo '' >> %s-ubuntu.bb" %RN)
    os.system("echo 'LICENSE = \"\"' >> %s-ubuntu.bb" %RN)
    os.system("echo '' >> %s-ubuntu.bb" %RN)
    os.system("echo '# the information of ubuntu package(s)' >> %s-ubuntu.bb" %RN)


def generate_bb(pkgs,info_list):
    # search info on ubuntu website
    urls = []
    fulldeb_names = []
    pool_addrs = []
    package_names = []
    for pkg in pkgs:
        urls.append("https://packages.ubuntu.com/%s/arm64/%s/download" %(version, pkg))
        for i in urls:
            print (i)
    for url in urls:
        try:
            html = requests.get(url).text
            #print('success')
        except requests.exceptions.RequestException as e:
            print("Some Ambiguous Exception:", e)
        except requests.exceptions.ConnectionError as ece:
            print("Connection Error:", ece)
        except requests.exceptions.Timeout as et:
            print("Timeout Error:", et)

        fulldeb_names.append(re.findall(r'<kbd>(.*)</kbd>', html))
        pool_addrs.append(re.findall('<tt>(.*)</tt>', html))
        package_names.append(re.findall('<kbd>(.*?)_', html))

    # start filling bb file
    bb_headerformat()
    for deb,fulldeb,link in zip(package_names,fulldeb_names,pool_addrs):
        os.system("echo 'SRC_URI += \"http://ports.ubuntu.com/ubuntu-ports/%s%s;name=%s\"' >> %s" %(link[0],fulldeb[0],deb[0],recipe_path))
        os.system("echo 'SRC_URI[%s.md5sum] = \"%s\"' >> %s" %(deb[0],link[1],recipe_path))
        os.system("echo '' >> %s" %recipe_path)
        os.system("sed -i -e '/LICENSE =/a\LICENSE_%s = \"\"' %s-ubuntu.bb" %(deb[0],RN))
    os.system("echo '# other configs to feed compilation' >> %s" %recipe_path)
    os.system("echo 'PKG_${UPN} = \"%s\"' >> %s" %(deb[0],recipe_path))
    os.system("echo 'DEPENDS += \"%s\"' >> %s" %(info_list[0],recipe_path))
    os.system("echo 'PROVIDES += \"%s\"' >> %s" %(info_list[1],recipe_path))
    # os.system("echo 'RDEPENDS += \"%s\"' >> %s" %(info_list[1],recipe_path))
    print("The recipe has generated:\n")
    print("    %s\n" %recipe_path)


"""
This function distinguish with above just need input package name without any others
"""
def generate_packages_bb(pkgs):
    # search info on ubuntu website
    urls = []
    fulldeb_names = []
    pool_addrs = []
    package_names = []
    for pkg in pkgs:
        urls.append("https://packages.ubuntu.com/%s/arm64/%s/download" %(version, pkg))
        for i in urls:
            print (i)
    for url in urls:
        try:
            html = requests.get(url).text
            #print('success')
        except requests.exceptions.RequestException as e:
            print("Some Ambiguous Exception:", e)
        except requests.exceptions.ConnectionError as ece:
            print("Connection Error:", ece)
        except requests.exceptions.Timeout as et:
            print("Timeout Error:", et)
        fulldeb_names.append(re.findall(r'<kbd>(.*)</kbd>', html))
        pool_addrs.append(re.findall('<tt>(.*)</tt>', html))
        package_names.append(re.findall('<kbd>(.*?)_', html))
    bb_headerformat()
    for deb,fulldeb,link in zip(package_names,fulldeb_names,pool_addrs):
        os.system("echo 'SRC_URI += \"http://ports.ubuntu.com/ubuntu-ports/%s%s;name=%s\"' >> %s" %(link[0],fulldeb[0],deb[0],recipe_path))
        os.system("echo 'SRC_URI[%s.md5sum] = \"%s\"' >> %s" %(deb[0],link[1],recipe_path))
        os.system("echo '' >> %s" %recipe_path)
        os.system("sed -i -e '/LICENSE =/a\LICENSE_%s = \"\"' %s-ubuntu.bb" %(deb[0],RN))
    os.system("echo '# other configs to feed compilation' >> %s" %recipe_path)
    os.system("echo 'PKG_${UPN} = \"%s\"' >> %s" %(deb[0],recipe_path))
    print("The recipe has generated:\n")
    print("    %s\n" %recipe_path)


def add_conf(pkgs):
    # add into tcmode-external-ubuntu.inc
    os.system("sed -i '/PROVIDER_%s /d' %s" %(RN,tcmode_path))
    os.system("sed -i '/PROVIDER_%s-/d' %s" %(RN,tcmode_path))
    os.system("echo 'PREFERRED_PROVIDER_%s = \"%s-ubuntu\"' >> %s" %(RN,RN,tcmode_path))

    # add into recipe-pn-blacklist
    os.system("sed -i '/\[%s\]/d' %s" %(RN,blacklist_path))
    os.system("echo 'PNBLACKLIST[%s] = \"Using %s-ubuntu\"' >> %s" %(RN,RN,blacklist_path))

    # add into ubuntu-base.inc
    locate = "UBUN_PLATFORM_EXTRA_PACKAGES"
    grepoutput = str(subprocess.Popen(["grep -n \"%s \" %s | sed 's/:.*//g'" %(locate,ubuntubase_path)],stdout=subprocess.PIPE,shell=True).communicate())
    lineinsert = int(re.findall('\'(.*)\\\\', grepoutput)[0]) + 2
    for pkg in pkgs:
        os.system("sed -i '/  %s /d' %s" %(pkg,ubuntubase_path))
        os.system("sed -i 'N;%s i %s \\\\' %s" %(lineinsert,pkg,ubuntubase_path))


def get_url(ele):
    global pkg_list
    global lock
    filename = "%s_%s" %(ele,str(time.time())[-2:])
    if (os.path.exists(filename)):
        filename = filename + "bk"

    try:
        html = requests.get("https://packages.ubuntu.com/search?suite=%s&arch=arm64&searchon=contents&keywords=%s" %(version,ele)).text
        #print('success')
    except requests.exceptions.RequestException as e:
        print("Some Ambiguous Exception:", e)
    except requests.exceptions.ConnectionError as ece:
        print("Connection Error:", ece)
    except requests.exceptions.Timeout as et:
        print("Timeout Error:", et)

    fd = open(filename,"w+")
    fd.write(html)
    fd.close()
    pkg_tmp = re.findall('focal/(.*?)\">', str(grep(filename,"/<span", '-A 4')))
    #print ("pkg_tmp: %s" %pkg_tmp)
    lock.acquire()
    pkg_list.extend(pkg_tmp)
    lock.release()
    os.remove(filename)


def apt_file(files):
    global pkg_list
    global threads
    fileters = ["alpha","armel","armhf","hppa","i386","mips","amd64","riscv","powerpc","m68k","ppc64","ppc64el","s390x","x32","mingw-w64",\
                "sparc64","sh4","msp430","raspi2","raspi","x86-64","i686","arm-none-eabi","arm-linux-gnueabi","arm-linux-gnueabihf","xtensa"]
    for ele in files:
        thread = Thread(target=get_url, args=(ele,))
        threads.append(thread)
        thread.start()
    for t in threads:
        t.join()
    c = Counter(pkg_list)
    print("\nThe files in the recipe \"%s\" may be included in the following ubuntu package" %RN)
    for key,value in c.most_common(len(c)):
        if not any(f in key for f in fileters):
            print("    " + str(value) + " file(s) include in the ubuntu package [" + key + "]"  + "    " \
                     '{:>20}'.format("[https://packages.ubuntu.com/%s/arm64/%s/filelist]"%(version,key)))


def receive_input():
    print("\n######## Please select the ubuntu packages above that can replace \"%s\" recipe ########" %RN)
    print("Input the packages splittly with \",\", likes libc6-dev-arm64-cross,libc6-arm64-cross")
    upkgs = input("Input here: ").split(",")
    print("Your selecion is %s\n" %upkgs)
    for i in range(len(upkgs)):
        upkgs[i] = upkgs[i].replace(' ','')
    return upkgs


def get_sysroots_path(path):
    env_fd = open(path, "r").readlines()
    for content in env_fd:
        if 'COMPONENTS_DIR=' in content:
            content = content.split('"')[1]
            return content


def listdir(path, list_name):
    path = path.replace('\n','')
    #print ("path: ", path)
    for file in os.listdir(path):
        #print ("file: ", file)
        file_path = os.path.join(path,file)
        if os.path.isdir(file_path):
            #print ("file_path: ", file_path)
            listdir(file_path, list_name)
        elif os.path.splitext(file_path)[1]=='.h' or os.path.splitext(file_path)[1]=='.a' or os.path.splitext(file_path)[1]=='.so' \
            or fnmatch.fnmatch(file_path,'*.so.*') or fnmatch.fnmatch(file_path,'*.pc') or fnmatch.fnmatch(file_path,'*.m4') or fnmatch.fnmatch(file_path,'*.py'):
            result = os.path.split(file_path)
            #print (result[1])
            list_name.append(result[1])


def search_rn_dir(PATH, RN):
    Header_list = []
    #print ("PATH = %s" %PATH)
    print ("recipe = %s" %RN)
    search_cmd = "find " + PATH + " -maxdepth 2 -name " + RN
    #print (search_cmd)
    output = os.popen(search_cmd).readline()
    if len(output) == 0:
        print ("NOT found recipe sysroots dir on sysroots_path")
        print ("Please make sure bitbake recipe firstly and sysroots_path must exists !!!")
        sys.exit()
    #print (output)
    print("RN_sysroot_path = %s" %output)
    output = os.path.join(PATH,output)
    listdir(output, Header_list)
    if len(Header_list) == 0:
        print ("Please make sure bitbake recipe firstly and RN_sysroots_path not empty !!!")
        sys.exit()
    return Header_list


def get_provides_depends_info(path):
    env_fd = open(path, "r").readlines()
    ENV_info_list = []
    temp = []
    for content in env_fd:
        if re.match('DEPENDS=',content) :
            #print (content)
            content = content.split('"')[1]
            if "native" in content:
                for i in range(len(content.split(' '))):
                    if 'native' not in content.split(' ')[i]:
                        temp.append(content.split(' ')[i])
                content = " ".join(temp)
            ENV_info_list.append(content)
        elif re.match('PROVIDES=',content):
            content = content.split('"')[1]
            ENV_info_list.append(content)
            return ENV_info_list

# Parser the input options

usage = "python3 ubuntu_recipe_generator.py [options]\n" \
        "\nExample invocations:\n" \
        "  python buildex.py -r reicpeA" + "\n" \
        "  python buildex.py -p reicpeB"

parser = OptionParser(usage)

parser.add_option('-r', '--recipe', action="store",
                 dest="recipe",
                 default = False,
                 help="the recipe you want to replace. " + "\n" \
                    "Example: python buildex.py -r python3-nose")

parser.add_option('-p', '--package', action="store",
                 dest="package",
                 default = False,
                 help="input only to generate recipe. " + "\n" \
                     "Example: python buildex.py -p my_recipe")

(options, args) = parser.parse_args()

# Argv number Error checking
if (len(sys.argv)) < 3:
    print("Please input right parameters, use -h get usage")
    sys.exit()

#Main function
if options.recipe:
    RN= options.recipe
    #print ("RN = %s" %RN)

    recipe_path = project_path + "scripts/%s-ubuntu.bb" %RN
    env_path = project_path + "../../" + "%s_env" %RN
    #env_path = "/workdir/build_dir/../glibc_env"
    sysroots_path = get_sysroots_path(env_path)
    #sysroots_path = "/workdir/build_dir/sysroots-components"
    print ("sysroots_path = %s" %sysroots_path)
    if (os.path.exists(recipe_path)):
        print ("%s-ubuntu.bb file exists, please check if need remove firstly"%RN)
        sys.exit()


    # Actions
    #files1 = ["a.out","argp-ldbl.h","byteswap.h"] #demo list input
    files1 = search_rn_dir(sysroots_path,RN)
    rn_info_list = get_provides_depends_info(env_path)
    print ("DEPENDS info: %s" %rn_info_list[0])
    print ("PROVIDES info: %s" %rn_info_list[1])
    print("**********************Sysroots Provide Info***********************")
    print(files1)
    print("**********************Info End*************************************")
    print('\n')

    print ("")
    apt_file(files1)
    upkgs = receive_input()
    generate_bb(upkgs,rn_info_list)
    add_conf(upkgs)

if options.package:
    RN= options.package
    recipe_path = project_path + "scripts/%s-ubuntu.bb" %RN
    if (os.path.exists(recipe_path)):
        print ("%s-ubuntu.bb file exists, please check if need remove firstly"%RN)
        sys.exit()
    upkgs = receive_input()
    generate_packages_bb(upkgs)
    add_conf(upkgs)
