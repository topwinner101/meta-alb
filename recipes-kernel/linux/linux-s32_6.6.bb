PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "a457b2cac5e4605e592e8e9f96a3cdf1f08c405b"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
