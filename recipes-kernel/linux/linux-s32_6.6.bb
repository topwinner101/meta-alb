PV = "6.6.25"

require recipes-kernel/linux/linux-s32.inc

SRCREV = "68b1c62e36f5a4d41fef431786eb611d126b1a50"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV_MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"

# Kernel 6.6 specific support for VirtIO with Xen
DELTA_KERNEL_DEFCONFIG:append = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'xen virtio', 'xen_virtio_${PV_MAJ_VER}.cfg', '', d)} \
"
SRC_URI += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'xen virtio', 'file://build/xen_virtio_${PV_MAJ_VER}.cfg', '', d)} \
"

SRC_URI:append:s32cc = "${@bb.utils.contains('DISTRO_FEATURES', 'quick-boot', ' file://build/quick-boot_${PV_MAJ_VER}.cfg', '', d)}"
DELTA_KERNEL_DEFCONFIG:append:s32cc = "${@bb.utils.contains('DISTRO_FEATURES', 'quick-boot', ' quick-boot_${PV_MAJ_VER}.cfg', '', d)}"

# Static enablement of eMMC HS400 mode in case Verified-Boot
# and Quick-Boot features are both enabled.
VERIFIED_QUICK_BOOT = "${@bb.utils.contains('DISTRO_FEATURES', 'verifiedboot', ' file://build/0001-dts-Enable-eMMC-HS400-mode_${PV_MAJ_VER}.patch', '', d)}"
SRC_URI:append:s32cc = "${@bb.utils.contains('DISTRO_FEATURES', 'quick-boot', '${VERIFIED_QUICK_BOOT}', '', d)}"
