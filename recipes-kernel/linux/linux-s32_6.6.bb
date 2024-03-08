PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "26a4a2d58ca7d6babf3ad0d5714ef5db702214eb"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
