# Copyright 2023 NXP
#

SUMMARY = "NXP HSE PKCS#11 Module"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=f03611747c1e7d618ef405a8484ed48d"

URL ?= "git://github.com/nxp-auto-linux/pkcs11-hse;protocol=https"
BRANCH ?= "${RELEASE_BASE}"
SRC_URI = "${URL};branch=${BRANCH}"
SRCREV ?= "36d77a193a7a1e304a675bc36c62a3dc1aab043b"

DEPENDS += "libp11 openssl hse-firmware"
RDEPENDS:${PN} += "libp11 openssl hse-firmware"

S = "${WORKDIR}/git"

CFLAGS:append = " ${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS}"

EXTRA_OEMAKE += " \
                CROSS_COMPILE=${TARGET_PREFIX} \
                HSE_FWDIR=${STAGING_INCDIR}/hse-interface \
                OPENSSL_DIR=${STAGING_EXECPREFIXDIR} \
                LIBP11_DIR=${STAGING_EXECPREFIXDIR} \
                "

do_install() {
        install -d ${D}${libdir}
        install -d ${D}${bindir}

        oe_runmake -C "${S}" install INSTALL_LIBDIR=${D}${libdir} INSTALL_BINDIR=${D}${bindir}
}

include ${@bb.utils.contains('DISTRO_FEATURES', 'optee', 'recipes-bsp/hse/pkcs11-hse-tz-kp.inc', '', d)}