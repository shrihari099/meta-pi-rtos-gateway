# Short description for this recipe
SUMMARY = "Example recipe for first application"

# Long description of this recipe
DESCRIPTION = "This recipe serves as an example"

# Section under which this recipe will be categorized
SECTION = "examples"

# Recipe revision
PR = "r1"

# License information
LICENSE = "MIT"

# Location of the license file and its md5 checksum
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

# Specify the source file(s) required for building the application
SRC_URI = "file://myhello.c"

# Set source and build directories
S = "${WORKDIR}"
B = "${WORKDIR}"

# Compilation step: build the binary from myhello.c
do_compile(){
    ${CC} ${LDFLAGS} myhello.c -o myhello
}

# Installation step: create the target bin directory and install the compiled binary
do_install(){
    install -d ${D}${bindir}
    install -m 0755 myhello ${D}${bindir}
}

