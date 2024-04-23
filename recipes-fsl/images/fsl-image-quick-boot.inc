# Copyright 2024 NXP

IMAGE_INSTALL:remove = "setserial \
    rng-tools \
    udev-extraconf \
    pciutil \
    linux-qspi-tool \
"

# Remove syslog from busybox
PACKAGE_EXCLUDE = " busybox-syslog"
