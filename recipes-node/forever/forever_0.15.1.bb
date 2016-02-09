SUMMARY = "A simple CLI tool for ensuring that a given script runs continuously (i.e. forever)"
SECTION = "utils"
HOMEPAGE = "https://nodei.co/npm/forever"

SRC_URI = "npm://registry.npmjs.org;name=${PN};version=${PV}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da5360871cfc7e3df08cde6a2adeac25"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm
