KRIA_ADDITIONAL_INCLUDE = ""

KRIA_ADDITIONAL_INCLUDE:my-k26-smk-sdt = "${@'kria-boot-cmd.inc' if d.getVar('MACHINE') == 'my-k26-smk-sdt' else ''}"

include ${KRIA_ADDITIONAL_INCLUDE}

KERNEL_ROOT_RAMDISK:my-k26-smk-sdt = ""
