PV = "5.15.153"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "a8280cd743d2eaf0da896e51873d0464d7351470"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
