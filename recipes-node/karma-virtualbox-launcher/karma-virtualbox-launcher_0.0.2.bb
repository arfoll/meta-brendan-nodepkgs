SUMMARY = "A karma launcher for virtualbox VMs"
SECTION = "utils"
HOMEPAGE = "https://nodei.co/npm/karma-virtualbox-launcher"

SRC_URI = "npm://registry.npmjs.org;name=${PN};version=${PV}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cadc725ce709ac546b1f2caaa13c6272"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm
