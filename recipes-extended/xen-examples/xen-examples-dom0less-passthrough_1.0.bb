require recipes-extended/xen-examples/xen-examples.inc

CFG_NAME = "config_s32gen1_dom0less_passthrough"

SRC_URI += "file://config_s32gen1_dom0less_passthrough"

RDEPENDS:${PN} += " xen-passthrough-dts"

do_compile[depends] += " \
    ${DOM0LESS_ROOTFS}:do_image_complete \
    xen-passthrough-dts:do_deploy \
"