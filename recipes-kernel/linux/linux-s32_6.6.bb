PV = "6.6.23"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "73cd7b2bdd46915defd232ae44ec454ef5951eb3"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
