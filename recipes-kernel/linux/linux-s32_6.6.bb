PV = "6.6.5"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "f6a6af30a29174b06ec3f8d8144468250ccfe0a6"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
