PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "8835ed9e6f7ac4b8f115a5669385d1bfe1de745d"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
