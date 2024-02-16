PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "6a68d1e392cd7574e11816cea2162e0984d49208"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
