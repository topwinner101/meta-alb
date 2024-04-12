PV = "6.6.23"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "444f9eff4be4ae91c14e45305826e915532fac3f"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
