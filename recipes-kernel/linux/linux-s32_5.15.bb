PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "f9c964f9f43ede7c18722c747e280559bc408aaa"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
