PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "ea86830d5da99e1c1fff9d4164c65c1010725bc7"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
