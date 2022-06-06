# use update-alternatives mechanism
inherit update-alternatives-ubuntu_v2

# set update-alternatives priority for "slang" package
ALTERNATIVE_PRIORITY_slang = "100"

# set update-alternatives register name for "slang" package
ALTERNATIVE_slang = " varray-module.so sysconf-module.so fork-module.so csv-module.so slsh.rc slsh histogram-module.so arrayfuns.sl autoload.sl base64.sl chksum.sl cool.map coolwarm.map copper.map cubicl.map cubicyf.map drywet.map ds9b.map ds9sls.map edge.map gebco.map globe.map gray.map haxby.map hot.map jet.map no_green.map ocean.map polar.map rainbow.map red2green.map relief.map sealand.map seis.map split.map topo.map wysiwyg.map cmdopt.sl csv.sl fcntl.sl fork.sl fswalk.sl glob.sl arrayfuns.hlp base64funs.hlp chksumfuns.hlp cmdopt.hlp csvfuns.hlp forkfuns.hlp fswalk.hlp glob.hlp histfuns.hlp jsonfuns.hlp listfuns.hlp onigfuns.hlp pcrefuns.hlp pngfuns.hlp print.hlp process.hlp profile.hlp randfuns.hlp readascii.hlp require.hlp setfuns.hlp slsmg.hlp sockfuns.hlp statsfuns.hlp structfuns.hlp histogram.sl iconv.sl json.sl listfuns.sl onig.sl pcre.sl png.sl print.sl process.sl profile.sl rand.sl readascii.sl require.sl complete.sl editfuns.sl editor.sl emacskeys.sl history.sl histsrch.sl slrline.rc vikeys.sl jpegsize lsrpm sldb slprof slstkchk svnsh select.sl setfuns.sl sldb.sl sldbcore.sl sldbsock.sl slshhelp.sl slshrl.sl slsmg.sl socket.sl stats.sl stkcheck.sl structfuns.sl sysconf.sl termios.sl varray.sl zlib.sl"

# set update-alternatives symbolic link path or real target path for "slang" package
QTI_SEPECIFIC_LINK[fork-module.so] = "/usr/lib/slang/v2/modules/fork-module.so"
ALTERNATIVE_LINK_NAME[fork-module.so] = "/usr/lib/aarch64-linux-gnu/slang/v2/modules/fork-module.so"

QTI_SEPECIFIC_LINK[varray-module.so] = "/usr/lib/slang/v2/modules/varray-module.so"
ALTERNATIVE_LINK_NAME[varray-module.so] = "/usr/lib/aarch64-linux-gnu/slang/v2/modules/varray-module.so"

QTI_SEPECIFIC_LINK[sysconf-module.so] = "/usr/lib/slang/v2/modules/sysconf-module.so"
ALTERNATIVE_LINK_NAME[sysconf-module.so] = "/usr/lib/aarch64-linux-gnu/slang/v2/modules/sysconf-module.so"

QTI_SEPECIFIC_LINK[csv-module.so] = "/usr/lib/slang/v2/modules/csv-module.so"
ALTERNATIVE_LINK_NAME[csv-module.so] = "/usr/lib/aarch64-linux-gnu/slang/v2/modules/csv-module.so"

ALTERNATIVE_LINK_NAME[slsh.rc] = "/etc/slsh.rc"

ALTERNATIVE_LINK_NAME[slsh] = "/usr/bin/slsh"

ALTERNATIVE_LINK_NAME[histogram-module.so] = "/usr/lib/slang/v2/modules/histogram-module.so"

ALTERNATIVE_LINK_NAME[arrayfuns.sl] = "/usr/share/slsh/arrayfuns.sl"

ALTERNATIVE_LINK_NAME[autoload.sl] = "/usr/share/slsh/autoload.sl"

ALTERNATIVE_LINK_NAME[base64.sl] = "/usr/share/slsh/base64.sl"

ALTERNATIVE_LINK_NAME[chksum.sl] = "/usr/share/slsh/chksum.sl"

ALTERNATIVE_LINK_NAME[cool.map] = "/usr/share/slsh/cmaps/cool.map"

ALTERNATIVE_LINK_NAME[coolwarm.map] = "/usr/share/slsh/cmaps/coolwarm.map"

ALTERNATIVE_LINK_NAME[copper.map] = "/usr/share/slsh/cmaps/copper.map"

ALTERNATIVE_LINK_NAME[cubicl.map] = "/usr/share/slsh/cmaps/cubicl.map"

ALTERNATIVE_LINK_NAME[cubicyf.map] = "/usr/share/slsh/cmaps/cubicyf.map"

ALTERNATIVE_LINK_NAME[drywet.map] = "/usr/share/slsh/cmaps/drywet.map"

ALTERNATIVE_LINK_NAME[ds9b.map] = "/usr/share/slsh/cmaps/ds9b.map"

ALTERNATIVE_LINK_NAME[ds9sls.map] = "/usr/share/slsh/cmaps/ds9sls.map"

ALTERNATIVE_LINK_NAME[edge.map] = "/usr/share/slsh/cmaps/edge.map"

ALTERNATIVE_LINK_NAME[gebco.map] = "/usr/share/slsh/cmaps/gebco.map"

ALTERNATIVE_LINK_NAME[globe.map] = "/usr/share/slsh/cmaps/globe.map"

ALTERNATIVE_LINK_NAME[gray.map] = "/usr/share/slsh/cmaps/gray.map"

ALTERNATIVE_LINK_NAME[haxby.map] = "/usr/share/slsh/cmaps/haxby.map"

ALTERNATIVE_LINK_NAME[hot.map] = "/usr/share/slsh/cmaps/hot.map"

ALTERNATIVE_LINK_NAME[jet.map] = "/usr/share/slsh/cmaps/jet.map"

ALTERNATIVE_LINK_NAME[no_green.map] = "/usr/share/slsh/cmaps/no_green.map"

ALTERNATIVE_LINK_NAME[ocean.map] = "/usr/share/slsh/cmaps/ocean.map"

ALTERNATIVE_LINK_NAME[polar.map] = "/usr/share/slsh/cmaps/polar.map"

ALTERNATIVE_LINK_NAME[rainbow.map] = "/usr/share/slsh/cmaps/rainbow.map"

ALTERNATIVE_LINK_NAME[red2green.map] = "/usr/share/slsh/cmaps/red2green.map"

ALTERNATIVE_LINK_NAME[relief.map] = "/usr/share/slsh/cmaps/relief.map"

ALTERNATIVE_LINK_NAME[sealand.map] = "/usr/share/slsh/cmaps/sealand.map"

ALTERNATIVE_LINK_NAME[seis.map] = "/usr/share/slsh/cmaps/seis.map"

ALTERNATIVE_LINK_NAME[split.map] = "/usr/share/slsh/cmaps/split.map"

ALTERNATIVE_LINK_NAME[topo.map] = "/usr/share/slsh/cmaps/topo.map"

ALTERNATIVE_LINK_NAME[wysiwyg.map] = "/usr/share/slsh/cmaps/wysiwyg.map"

ALTERNATIVE_LINK_NAME[cmdopt.sl] = "/usr/share/slsh/cmdopt.sl"

ALTERNATIVE_LINK_NAME[csv.sl] = "/usr/share/slsh/csv.sl"

ALTERNATIVE_LINK_NAME[fcntl.sl] = "/usr/share/slsh/fcntl.sl"

ALTERNATIVE_LINK_NAME[fork.sl] = "/usr/share/slsh/fork.sl"

ALTERNATIVE_LINK_NAME[fswalk.sl] = "/usr/share/slsh/fswalk.sl"

ALTERNATIVE_LINK_NAME[glob.sl] = "/usr/share/slsh/glob.sl"

ALTERNATIVE_LINK_NAME[arrayfuns.hlp] = "/usr/share/slsh/help/arrayfuns.hlp"

ALTERNATIVE_LINK_NAME[base64funs.hlp] = "/usr/share/slsh/help/base64funs.hlp"

ALTERNATIVE_LINK_NAME[chksumfuns.hlp] = "/usr/share/slsh/help/chksumfuns.hlp"

ALTERNATIVE_LINK_NAME[cmdopt.hlp] = "/usr/share/slsh/help/cmdopt.hlp"

ALTERNATIVE_LINK_NAME[csvfuns.hlp] = "/usr/share/slsh/help/csvfuns.hlp"

ALTERNATIVE_LINK_NAME[forkfuns.hlp] = "/usr/share/slsh/help/forkfuns.hlp"

ALTERNATIVE_LINK_NAME[fswalk.hlp] = "/usr/share/slsh/help/fswalk.hlp"

ALTERNATIVE_LINK_NAME[glob.hlp] = "/usr/share/slsh/help/glob.hlp"

ALTERNATIVE_LINK_NAME[histfuns.hlp] = "/usr/share/slsh/help/histfuns.hlp"

ALTERNATIVE_LINK_NAME[jsonfuns.hlp] = "/usr/share/slsh/help/jsonfuns.hlp"

ALTERNATIVE_LINK_NAME[listfuns.hlp] = "/usr/share/slsh/help/listfuns.hlp"

ALTERNATIVE_LINK_NAME[onigfuns.hlp] = "/usr/share/slsh/help/onigfuns.hlp"

ALTERNATIVE_LINK_NAME[pcrefuns.hlp] = "/usr/share/slsh/help/pcrefuns.hlp"

ALTERNATIVE_LINK_NAME[pngfuns.hlp] = "/usr/share/slsh/help/pngfuns.hlp"

ALTERNATIVE_LINK_NAME[print.hlp] = "/usr/share/slsh/help/print.hlp"

ALTERNATIVE_LINK_NAME[process.hlp] = "/usr/share/slsh/help/process.hlp"

ALTERNATIVE_LINK_NAME[profile.hlp] = "/usr/share/slsh/help/profile.hlp"

ALTERNATIVE_LINK_NAME[randfuns.hlp] = "/usr/share/slsh/help/randfuns.hlp"

ALTERNATIVE_LINK_NAME[readascii.hlp] = "/usr/share/slsh/help/readascii.hlp"

ALTERNATIVE_LINK_NAME[require.hlp] = "/usr/share/slsh/help/require.hlp"

ALTERNATIVE_LINK_NAME[setfuns.hlp] = "/usr/share/slsh/help/setfuns.hlp"

ALTERNATIVE_LINK_NAME[slsmg.hlp] = "/usr/share/slsh/help/slsmg.hlp"

ALTERNATIVE_LINK_NAME[sockfuns.hlp] = "/usr/share/slsh/help/sockfuns.hlp"

ALTERNATIVE_LINK_NAME[statsfuns.hlp] = "/usr/share/slsh/help/statsfuns.hlp"

ALTERNATIVE_LINK_NAME[structfuns.hlp] = "/usr/share/slsh/help/structfuns.hlp"

ALTERNATIVE_LINK_NAME[histogram.sl] = "/usr/share/slsh/histogram.sl"

ALTERNATIVE_LINK_NAME[iconv.sl] = "/usr/share/slsh/iconv.sl"

ALTERNATIVE_LINK_NAME[json.sl] = "/usr/share/slsh/json.sl"

ALTERNATIVE_LINK_NAME[listfuns.sl] = "/usr/share/slsh/listfuns.sl"

ALTERNATIVE_LINK_NAME[onig.sl] = "/usr/share/slsh/onig.sl"

ALTERNATIVE_LINK_NAME[pcre.sl] = "/usr/share/slsh/pcre.sl"

ALTERNATIVE_LINK_NAME[png.sl] = "/usr/share/slsh/png.sl"

ALTERNATIVE_LINK_NAME[print.sl] = "/usr/share/slsh/print.sl"

ALTERNATIVE_LINK_NAME[process.sl] = "/usr/share/slsh/process.sl"

ALTERNATIVE_LINK_NAME[profile.sl] = "/usr/share/slsh/profile.sl"

ALTERNATIVE_LINK_NAME[rand.sl] = "/usr/share/slsh/rand.sl"

ALTERNATIVE_LINK_NAME[readascii.sl] = "/usr/share/slsh/readascii.sl"

ALTERNATIVE_LINK_NAME[require.sl] = "/usr/share/slsh/require.sl"

ALTERNATIVE_LINK_NAME[complete.sl] = "/usr/share/slsh/rline/complete.sl"

ALTERNATIVE_LINK_NAME[editfuns.sl] = "/usr/share/slsh/rline/editfuns.sl"

ALTERNATIVE_LINK_NAME[editor.sl] = "/usr/share/slsh/rline/editor.sl"

ALTERNATIVE_LINK_NAME[emacskeys.sl] = "/usr/share/slsh/rline/emacskeys.sl"

ALTERNATIVE_LINK_NAME[history.sl] = "/usr/share/slsh/rline/history.sl"

ALTERNATIVE_LINK_NAME[histsrch.sl] = "/usr/share/slsh/rline/histsrch.sl"

ALTERNATIVE_LINK_NAME[slrline.rc] = "/usr/share/slsh/rline/slrline.rc"

ALTERNATIVE_LINK_NAME[vikeys.sl] = "/usr/share/slsh/rline/vikeys.sl"

ALTERNATIVE_LINK_NAME[jpegsize] = "/usr/share/slsh/scripts/jpegsize"

ALTERNATIVE_LINK_NAME[lsrpm] = "/usr/share/slsh/scripts/lsrpm"

ALTERNATIVE_LINK_NAME[sldb] = "/usr/share/slsh/scripts/sldb"

ALTERNATIVE_LINK_NAME[slprof] = "/usr/share/slsh/scripts/slprof"

ALTERNATIVE_LINK_NAME[slstkchk] = "/usr/share/slsh/scripts/slstkchk"

ALTERNATIVE_LINK_NAME[svnsh] = "/usr/share/slsh/scripts/svnsh"

ALTERNATIVE_LINK_NAME[select.sl] = "/usr/share/slsh/select.sl"

ALTERNATIVE_LINK_NAME[setfuns.sl] = "/usr/share/slsh/setfuns.sl"

ALTERNATIVE_LINK_NAME[sldb.sl] = "/usr/share/slsh/sldb.sl"

ALTERNATIVE_LINK_NAME[sldbcore.sl] = "/usr/share/slsh/sldbcore.sl"

ALTERNATIVE_LINK_NAME[sldbsock.sl] = "/usr/share/slsh/sldbsock.sl"

ALTERNATIVE_LINK_NAME[slshhelp.sl] = "/usr/share/slsh/slshhelp.sl"

ALTERNATIVE_LINK_NAME[slshrl.sl] = "/usr/share/slsh/slshrl.sl"

ALTERNATIVE_LINK_NAME[slsmg.sl] = "/usr/share/slsh/slsmg.sl"

ALTERNATIVE_LINK_NAME[socket.sl] = "/usr/share/slsh/socket.sl"

ALTERNATIVE_LINK_NAME[stats.sl] = "/usr/share/slsh/stats.sl"

ALTERNATIVE_LINK_NAME[stkcheck.sl] = "/usr/share/slsh/stkcheck.sl"

ALTERNATIVE_LINK_NAME[structfuns.sl] = "/usr/share/slsh/structfuns.sl"

ALTERNATIVE_LINK_NAME[sysconf.sl] = "/usr/share/slsh/sysconf.sl"

ALTERNATIVE_LINK_NAME[termios.sl] = "/usr/share/slsh/termios.sl"

ALTERNATIVE_LINK_NAME[varray.sl] = "/usr/share/slsh/varray.sl"

ALTERNATIVE_LINK_NAME[zlib.sl] = "/usr/share/slsh/zlib.sl"

