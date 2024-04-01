PV = "6.6.23"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "c204d449865e1db85e16e2c4ef15525354952e80"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
