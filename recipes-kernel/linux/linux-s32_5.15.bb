PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "86d611627eafc7f2ef72e3529974e58b941233b2"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
