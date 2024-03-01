PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "eec647caee3e5fe54dc08e79aea3cef0ded05bb4"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
