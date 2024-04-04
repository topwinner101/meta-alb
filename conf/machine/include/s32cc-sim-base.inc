require conf/machine/include/s32-sim-base.inc

KERNEL_DEFCONFIG ?= "s32cc_defconfig"

SOC_FAMILY:append = ":s32cc"
