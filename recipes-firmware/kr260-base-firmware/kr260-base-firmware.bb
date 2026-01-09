LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

SRC_URI = "\
        file://shell.json \
        file://kr260_static.bit \
        file://pl.dtsi \
        "

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:my-k26-smk-sdt = "${MACHINE}"
