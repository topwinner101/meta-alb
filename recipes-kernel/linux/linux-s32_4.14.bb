require recipes-kernel/linux/linux-s32.inc

SRC_URI = "git://source.codeaurora.org/external/autobsps32/linux;protocol=https;branch=alb/master"
SRCREV = "51d45d23fee0f0c23fb77c4c4ab328df997c0df5"

DELTA_KERNEL_DEFCONFIG_append_s32v234pcie += " \
    blueboxconfig_s32v234pcie_4.14 \
"
DELTA_KERNEL_DEFCONFIG_append_s32v234pciebcm += " \
    blueboxconfig_s32v234pcie_4.14 \
"
DELTA_KERNEL_DEFCONFIG_append_s32v234bbmini += " \
    blueboxconfig_s32v234pcie_4.14 \
"

DELTA_KERNEL_DEFCONFIG_append_s32v234bbmini += "vnet_s32.cfg"

# LXC configuration
DELTA_KERNEL_DEFCONFIG_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'lxc', 'containers_4.1.26.config', '', d)}"

# Docker configuration
DELTA_KERNEL_DEFCONFIG_append += "${@bb.utils.contains('DISTRO_FEATURES', 'docker', 'docker.config', '', d)}"

SRC_URI += "\
    file://build/blueboxconfig_s32v234pcie_4.14 \
    file://build/vnet_s32.cfg \
    file://build/containers_4.1.26.config \
    file://build/docker.config \
"
# add sources for virtual ethernet over PCIe
SRC_URI_append_s32v234bbmini += "\
    git://source.codeaurora.org/external/autobsps32/vnet;protocol=https;branch=alb/master;name=vnet;destsuffix=git/drivers/net/vnet \
    file://0001-vnet-Add-initial-support-to-build-driver-in-kernel.patch \
"
SRCREV_vnet = "213d3b4c6e9150885a44af3b884b90e2ccb3bcd5"
