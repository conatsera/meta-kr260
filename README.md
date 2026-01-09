### recipes-bsp/embeddedsw (disabled)
A patch for the FSBL XFsbl_HookAfterBSDownload hook that switches IOPLL to AUX_REF_CLK from the PL and sets some resets (currently done in boot.scr while this is disabled)
### recipes-bsp/image-recovery
Manually override the custom machine to use the k26-smk recovery images
### recipes-bsp/u-boot
Customized kria starter kit boot.scr that sets RGMII-to-GMII and VCU resets along with retrieving bootargs from device tree. Currently sets to single-core to simplify debugging over coresight DAP
### recipes-firmware
Unused, but still enabled, DFX recipes. These can be used with xmutil/dfx-mgr as an alternative to xclbins loaded via xrt/opencl API.
### recipes-kernel/linux
Enables debug config options
### recipes-xrt (disabled)
Some patches to help with debugging xrt/zocl