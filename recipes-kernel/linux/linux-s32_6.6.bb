PV = "6.6.5"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "4628954dddafda35d2f2fa513d6a8dc69a77d090"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
