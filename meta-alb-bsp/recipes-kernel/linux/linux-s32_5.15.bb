PV = "5.15.158"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "13e999725109f77711a07ef1a4f88fb50cb757e2"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRC_URI:append:s32cc = "${@ ' file://build/quickboot-generic_${PV_MAJ_VER}.cfg' if d.getVar('QUICK_BOOT_CONFIG', True) else ''}"
DELTA_KERNEL_DEFCONFIG:append:s32cc = "${@ ' quickboot-generic_${PV_MAJ_VER}.cfg' if d.getVar('QUICK_BOOT_CONFIG', True) else ''}"

# Static enablement of eMMC HS400 mode in case Verified-Boot
# and Quick-Boot features are both enabled.
VERIFIED_QUICK_BOOT = "${@bb.utils.contains('DISTRO_FEATURES', 'verifiedboot', ' file://build/0001-dts-Enable-eMMC-HS400-mode_${PV_MAJ_VER}.patch', '', d)}"
SRC_URI:append:s32cc = "${@ '${VERIFIED_QUICK_BOOT}' if d.getVar('QUICK_BOOT_CONFIG', True) else ''}"
