VERIFIEDBOOT_CONFIG = "verifiedboot_config.cfg"

DELTA_UBOOT_DEFCONFIG:append:s32cc = " ${VERIFIEDBOOT_CONFIG}"
SRC_URI:append:s32cc = " \
    file://build/${VERIFIEDBOOT_CONFIG} \
"
