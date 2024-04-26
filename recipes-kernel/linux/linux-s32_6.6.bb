PV = "6.6.25"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "3554008e9b815a85a5047a3f9ce1fdcf546b2aac"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
