SUMMARY = "Pi-RTOS Edge Gateway Base Image"
DESCRIPTION = "Minimal Linux image optimized for IoT gateway with RTOS capabilities"

# Inherit from core minimal image
inherit core-image

# Base packages
IMAGE_INSTALL = " \
    packagegroup-core-boot \
    packagegroup-base-wifi \
    kernel-modules \
    linux-firmware-rpidistro-bcm43455 \
    openssh \
    systemd \
    networkmanager \
    "

# Development and build tools
IMAGE_INSTALL:append = " \
    git \
    cmake \
    gcc \
    glibc-dev \
    python3 \
    python3-dev \
    python3-pip \
    "

# IoT and networking
IMAGE_INSTALL:append = " \
    curl \
    wget \
    openssl \
    ca-certificates \
    ntp \
    "

# Image features
IMAGE_FEATURES += " \
    ssh-server-openssh \
    debug-tweaks \
    package-management \
    "

# Boot optimization
IMAGE_ROOTFS_EXTRA_SPACE = "1024000"

