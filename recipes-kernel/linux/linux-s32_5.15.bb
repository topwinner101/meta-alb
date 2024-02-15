PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "daccae646263ac9beaae7c957dce7c94c0602453"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
