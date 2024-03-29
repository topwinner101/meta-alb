PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "9d3e7ac9137f12d07d3107e5a91ce6978ff2fbfc"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
