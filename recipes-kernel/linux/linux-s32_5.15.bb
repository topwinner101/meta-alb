PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "7f7eea1dd16439faa9bdb4daeb8b4ea65d167523"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
