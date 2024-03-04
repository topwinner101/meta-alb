PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "8828a8d65a70dd7354ead6e5d1d7251cde066e5e"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
