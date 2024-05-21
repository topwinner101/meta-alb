PV = "5.15.153"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "087f0c035102d399d137a25e9c71e3115f391cf3"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRC_URI:append:s32cc = "${@bb.utils.contains('DISTRO_FEATURES', 'quick-boot', ' file://build/quick-boot_${PV_MAJ_VER}.cfg', '', d)}"
DELTA_KERNEL_DEFCONFIG:append:s32cc = "${@bb.utils.contains('DISTRO_FEATURES', 'quick-boot', ' quick-boot_${PV_MAJ_VER}.cfg', '', d)}"
