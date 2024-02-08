PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "beec4e49dd6b75e7f6ee59631b107d7f88aa3321"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
