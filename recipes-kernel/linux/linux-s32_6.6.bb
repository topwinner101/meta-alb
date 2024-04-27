PV = "6.6.25"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "525de598163cc7aa4582b69b4ddcee2b6c12f56f"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
