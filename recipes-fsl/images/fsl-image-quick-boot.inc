# Copyright 2024 NXP

IMAGE_INSTALL:remove = "setserial \
    rng-tools \
    udev-extraconf \
    pciutil \
    linux-qspi-tool \
"

# Remove syslog from busybox
PACKAGE_EXCLUDE = " busybox-syslog"

autologin() {
    sed -i '/^ExecStart=/s/[^ ]*$/& --autologin root/' ${IMAGE_ROOTFS}${systemd_system_unitdir}/serial-getty@.service
}

ROOTFS_POSTPROCESS_COMMAND:append = " autologin;"
