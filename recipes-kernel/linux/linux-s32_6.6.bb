PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "2f86dd38e93ce5ec2952fb28f9eb376c4729ee65"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
