PV = "5.15.153"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "feed8be87401543d01e3e11bb12fecb15d5d7e9c"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
