PV = "5.15.145"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "487ebccc0a9e5cd7e9cd747c25f3f42f8a2c341a"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
