PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "8469f2705cbc6f9c2db90f85d2a75cd9b0710e97"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
