PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "a5b67fb29586eee0da4d2f9d8816f5f31c714ccc"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
