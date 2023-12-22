PV = "5.15.129"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "5af7edc65ff3a87e2c78482c6d00a7b75081740f"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
