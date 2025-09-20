# meta-pi-rtos-gateway

A Yocto layer for building **Pi-RTOS Edge Gateway** images on **Raspberry Pi 4**.

## Overview

This layer provides recipes and configurations to build an embedded Linux gateway with RTOS-inspired tasking and sensor data streaming support.

## Dependencies

* **poky** (OpenEmbedded-Core)
* **meta-raspberrypi**
* **meta-openembedded/meta-oe**
* **meta-openembedded/meta-python**
* **meta-openembedded/meta-networking**

## Quick Start

### 1. Fetch Sources

```bash
git clone -b kirkstone git://git.yoctoproject.org/poky
git clone -b kirkstone https://github.com/agherzan/meta-raspberrypi
git clone -b kirkstone https://github.com/openembedded/meta-openembedded
git clone https://github.com/shrihari099/meta-pi-rtos-gateway
```

### 2. Initialize Build Environment

```bash
cd poky
source oe-init-build-env ../build
```

### 3. Configure Layers (`conf/bblayers.conf`)
refer `build_conf` folder

### 4. Set Build Options (`conf/local.conf`)
refer `build_conf` folder

### 5. Build Image

```bash
bitbake pi-rtos-gateway-image
```

Image output:

tmp/deploy/images/raspberrypi4-64/pi-rtos-gateway-image-raspberrypi4-64.wic.bz2

## Layer Structure

meta-pi-rtos-gateway/
├── conf/layer.conf
├── recipes-core/images/pi-rtos-gateway-image.bb
└── recipes-example/example/example_0.1.bb

## Compatibility

* **Yocto Release**: Kirkstone (LTS)
* **Poky**: 4.0.x
* **Target**: Raspberry Pi 4 (64-bit)

## Author

**Shrihari Vaidya**
📧 [shriharivaidya099@gmail.com](mailto:shriharivaidya099@gmail.com)
