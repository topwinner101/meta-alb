EXTRA_OEMAKE += "PKG_CONFIG=pkg-config"

do_configure:prepend() {
	sed -i 's,PKG_CONFIG = $(CROSS_COMPILE)pkg-config,#PKG_CONFIG,' ${S}/tools/perf/Makefile.perf
}
