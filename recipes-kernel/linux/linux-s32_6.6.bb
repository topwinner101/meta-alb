PV = "6.6.5"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "417fd7d6e2d1d724abc29fb0ca14b360fdc89b0f"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
