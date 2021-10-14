# Copyright 2021 NXP
#
SUMMARY = "Sample M7 Bootloader"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=0f00d99239d922ffd13cabef83b33444"

URL ?= "git://source.codeaurora.org/external/autobsps32/m7-sample;protocol=https"
BRANCH ?= "${RELEASE_BASE}"
SRC_URI = "${URL};branch=${BRANCH}"
SRCREV ?= "99599340a7436cce821bdadec9e281741d88d6f3"

S = "${WORKDIR}/git"
BUILD = "${WORKDIR}/build"
BOOT_TYPE = "sdcard qspi"
IVT_FILE_BASE = "${@bb.utils.contains('DISTRO_FEATURES', 'atf', \
	    'fip.s32',\
	    'u-boot-${MACHINE}.s32',\
	    d)}"

do_compile() {
	for suffix in ${BOOT_TYPE}
	do
		ivt_file="${IVT_FILE_BASE}-${suffix}"

		BDIR="${BUILD}-${suffix}"

		mkdir -p "${BDIR}"
		cp -vf "${DEPLOY_DIR_IMAGE}/${ivt_file}" "${BDIR}/"

		oe_runmake CROSS_COMPILE="arm-none-eabi-" \
			BUILD="${BDIR}" \
			A53_BOOTLOADER="${BDIR}/${ivt_file}"
	done
}

do_deploy() {
	install -d ${DEPLOY_DIR_IMAGE}

	for suffix in ${BOOT_TYPE}
	do
		BDIR="${BUILD}-${suffix}"
		cd "${BDIR}"
		ivt_file="${IVT_FILE_BASE}-${suffix}"

		cp -vf "${BDIR}/${ivt_file}.m7" "${DEPLOY_DIR_IMAGE}/"
	done
}

addtask deploy after do_compile

do_compile[depends] += "virtual/bootloader:do_deploy"
do_compile[depends] += "${@bb.utils.contains('DISTRO_FEATURES', 'atf', 'arm-trusted-firmware:do_deploy', '', d)}"
DEPENDS += "cortex-m-toolchain-native"
# hexdump native (used by append_m7.sh) dependency
DEPENDS += "util-linux-native"
