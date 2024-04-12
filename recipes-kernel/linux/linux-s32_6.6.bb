PV = "6.6.23"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "01ce90f1b6f39a1dede2e6ca3f2d6fe7d7eadd8b"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
