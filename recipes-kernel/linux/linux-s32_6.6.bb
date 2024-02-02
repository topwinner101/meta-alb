PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "c2e5dda46f4f9e38ae9c27bfd5494686556f56a0"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
