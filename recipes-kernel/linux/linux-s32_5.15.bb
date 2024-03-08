PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "0fa5208dfa1ed08a2fb28684cd273647a71c1965"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
