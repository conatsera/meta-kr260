FILESEXTRAPATHS:append := ":${THISDIR}/u-boot-xlnx-scr"

BOOTMODE:my-k26-smk-sdt = ""

BOOTFILE_EXT:my-k26-smk-sdt = "kria"

SRC_URI:append:my-k26-smk-sdt = " file://boot.cmd.kria"
