PV = "5.10.194"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "54b07aba813619d5121f212f6021175d39eb4043"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
