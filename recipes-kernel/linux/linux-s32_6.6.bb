PV = "6.6.12"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "966d7dfbfc3c69977fb7b9f4d917410f0cf0cb3e"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"
