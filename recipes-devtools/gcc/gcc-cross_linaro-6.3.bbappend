require gcc-${PV}-fsl.inc

EXTRA_OECONF_append = " --with-isl=${STAGING_DIR_NATIVE}${prefix_native} \
"
