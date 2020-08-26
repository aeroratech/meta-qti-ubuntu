get_full_path(){
	echo "$( cd "$1" ; pwd -P )"
}

push_linux(){
	pushd $linux_dir >/dev/null
}

copy_dir(){
	from="$1"
	to="$2"

	if [[ -d "$from" ]]; then
		cp -a "$from" "$to"
	fi
}

copy_mkdir(){
	local target_dir="$1"
	local rel_path="$2"

	mkdir -p "$target_dir/$(dirname $rel_path)"
	cp "$rel_path" "$target_dir/$rel_path"
}

make_header(){

#!/bin/bash
set -e; set -o pipefail

target_dir=$1
linux_dir="${S}"
obj_dir=$3
karch="arm64"
prefix=$5
hostcc="${KERNEL_CC}"
hostcc_native="${KERNEL_CC}"


build_opts=""

karch_dir="$linux_dir/arch/$karch"
target_karch_dir="$target_dir/arch/$karch"


cp "${obj_dir}/.config" "${obj_dir}/Module.symvers" "$target_dir"

extra_header_dirs="$linux_dir/drivers/md"
echo Running modules_prepare...
oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${H} modules_prepare
push_linux
trap "popd >/dev/null" EXIT



if [[ -n "$prefix" ]]; then
	mv "$target_dir"/scripts "$target_dir"/xscripts
	if [ -d "$target_dir/tools" ]; then
		mv "$target_dir"/tools "$target_dir"/xtools
	fi
fi
for f in Makefile kernel/Makefile Documentation/DocBook/Makefile; do
	if [ -f "$f" ]; then
		install -D -m644 "$f" "$target_dir/$f"
	fi
done

find include -mindepth 1 -maxdepth 1 -type d | \
    xargs -I {} cp -a "{}" "$target_dir/include"

for d in include $extra_header_dirs; do
	[ -d "$d" ] && mkdir -p "$target_dir/$d"
done

mkdir -p "$target_karch_dir"
copy_dir "$karch_dir/include" "$target_karch_dir"
copy_dir "$karch_dir/tools" "$target_karch_dir"
for f in $(find $karch_dir -iname '*.h' -o -name 'Makefile' -o -iname '*.tbl' -o -iname '*.sh'); do
	copy_mkdir "$target_dir" "$f"
done

for f in $(find security -iname '*.h'); do
	copy_mkdir "$target_dir" "$f"
done

mkdir -p "$target_dir/tools"
copy_dir "$linux_dir/tools/include" "$target_dir/tools"
copy_dir "$linux_dir/tools/objtool" "$target_dir/tools"
copy_dir "$linux_dir/tools/lib" "$target_dir/tools"
copy_dir "$linux_dir/tools/scripts" "$target_dir/tools"
copy_dir "$linux_dir/tools/build" "$target_dir/tools"
cp "$linux_dir/tools/Makefile" "$target_dir/tools"

copy_dir scripts "$target_dir"

mkdir -p "$target_karch_dir/kernel"
cp "$karch_dir/Makefile" "$target_karch_dir"

for f in Makefile_32.cpu kernel/asm-offsets.s; do
	p="$karch_dir/$f"
	[ -f $p ] && cp "$p" "$target_karch_dir/$f"
done

mkdir -p "$target_karch_dir/kernel/vdso"
for f in gettimeofday.S note.S sigreturn.S; do
	p="$karch_dir//kernel/vdso/$f"
	[ -f $p ] && cp "$p" "$target_karch_dir/kernel/vdso/$f"
done

for d in $extra_header_dirs; do
	[ -d "$d" ] && (cp $d/*.h "$target_dir/$d" || true)
done


for f in $(find . -name "Kconfig*"); do
	copy_mkdir "$target_dir" "$f"
done

if [ "$karch" = "arm64" ] && [ -f "$karch_dir/include/asm/opcodes.h" ]; then
	copy_mkdir "$target_dir" "./arch/arm/include/asm/opcodes.h"
fi

if [ "$karch" = "arm64" ] && [ -f "arch/arm64/kernel/module.lds" ]; then
	copy_mkdir "$target_dir" "./arch/arm64/kernel/module.lds"
fi

echo Done!
}

#Delete the files of the host architecture.
rm_host_arch_files(){

#!/bin/bash

target_dir=$1

find ${target_dir}/scripts -name "*.o" | xargs rm -f
rm -f ${target_dir}/source

rm -f ${target_dir}/scripts/bin2c
rm -f ${target_dir}/scripts/kallsyms
rm -f ${target_dir}/scripts/pnmtologo
rm -f ${target_dir}/scripts/conmakehash
rm -f ${target_dir}/scripts/recordmcount
rm -f ${target_dir}/scripts/sortextable
rm -f ${target_dir}/scripts/asn1_compiler
rm -f ${target_dir}/scripts/extract-cert
rm -f ${target_dir}/scripts/dtc/dtc
rm -f ${target_dir}/scripts/mod/mk_elfconfig
rm -f ${target_dir}/scripts/mod/modpost
rm -f ${target_dir}/scripts/basic/fixdep
rm -f ${target_dir}/scripts/kconfig/conf
rm -f ${target_dir}/scripts/selinux/mdp/mdp
rm -f ${target_dir}/scripts/selinux/genheaders/genheaders
rm -f ${target_dir}/scripts/genksyms/genksyms
rm -f ${target_dir}/scripts/sign-file

}
