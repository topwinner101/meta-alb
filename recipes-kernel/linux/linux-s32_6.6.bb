PV = "6.6.25"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "872e791ffd4eb613a4c08faf001f9be39e727c96"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
