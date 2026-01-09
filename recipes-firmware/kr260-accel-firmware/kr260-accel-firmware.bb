LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit dfx_user_dts

FW_INSTALL_DIR = "kr260-base-firmware/VitisRegion/VitisRegion_slot0"

SRC_URI = "\
        file://accel.json \
        file://krnl.bin \
        file://VitisRegion.dtsi \
        "

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE:my-k26-smk-sdt = "${MACHINE}"
