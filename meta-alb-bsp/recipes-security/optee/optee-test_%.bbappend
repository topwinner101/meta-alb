require optee-nxp.inc

MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRCREV = "d67af49313ba807a0a2f1bcd3ba08f753bf6db6b"

URL ?= "git://github.com/nxp-auto-linux/optee_test.git;protocol=https"
BRANCH ?= "${RELEASE_BASE}-${MAJ_VER}"
SRC_URI = "\
    ${URL};branch=${BRANCH} \
    file://run-ptest \
"
