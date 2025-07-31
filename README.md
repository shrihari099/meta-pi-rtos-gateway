# Yocto Project: Minimal Linux Image for Raspberry Pi 4B

This repository contains all configuration, scripts, and example meta-layers needed to build, flash, and boot a minimal Embedded Linux image for the Raspberry Pi 4B using the Yocto Project.

## Repository Structure

- `meta-test/` &nbsp; — Custom Yocto meta-layer for additional recipes or configuration.
- `raspi4Build/`
    - `conf/` — Contains `bblayers.conf` and `local.conf` tailored for Raspberry Pi 4B.
    - (Plus scripts for automated build/flash, if included.)
- `README.md` — Project documentation and usage instructions.

## Features

- Built, configured, and flashed a minimal Linux image for Raspberry Pi 4B.
- Custom meta-layer example (`meta-test`).
- Automated the build and flashing process with shell scripts for reproducibility.
- Image booted and validated via UART serial console.
- Step-by-step documentation to help you reproduce this setup.

## Requirements

- Host machine: Ubuntu 20.04+ (or similar Linux distro)
- Basic Yocto dependencies: `git`, `repo`, Python3, `gcc`, `g++`, `make`, etc.
- Raspberry Pi 4B with microSD card
- UART-to-USB adapter/cable for serial debugging (optional but recommended)

## Quick Start

1. **Clone the repository:**
    ```
    git clone https://github.com/yourusername/yocto-rpi4b-core-image-minimal.git
    cd yocto-rpi4b-core-image-minimal
    ```

2. **Set up your build environment:**
    ```
    cd raspi4Build
    # Source the Yocto environment if needed
    source oe-init-build-env
    ```

3. **Configure layers:**
    - Make sure `meta-test` is included in your `bblayers.conf`.

4. **Build the minimal core image:**
    ```
    # Run the provided build script, or use BitBake directly
    ./build.sh
    # or, manually
    bitbake core-image-minimal
    ```

5. **Flash the image:**
    ```
    # Example flash script provided
    ./flash.sh
    ```

6. **Boot and test via UART:**
    - Connect using your favorite serial terminal (e.g., `minicom` or `screen`)
    - Default baud rate: 115200

## Directory Details

| Directory/File | Purpose                                  |
|----------------|------------------------------------------|
| `meta-test/`   | Example meta-layer for Yocto             |
| `raspi4Build/` | Build directory with configuration files |
| `README.md`    | Project documentation (this file)        |

## Customization

- Edit `conf/local.conf` and `conf/bblayers.conf` in `raspi4Build/` as needed for your setup.
- Place additional recipes/layers in `meta-test/`.

## License

[MIT License](LICENSE)  
(C) 2025 Shrihari Vaidya

## Author

- Shrihari (`shriharivaidya099gmail.com`)

---

*For questions and troubleshooting, open an issue or create a pull request!*

