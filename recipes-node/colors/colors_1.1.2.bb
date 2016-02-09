SRC_URI = "npm://registry.npmjs.org;name=${PN};version=${PV}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5bc6c72caa0dcc082d24a52a6ae12112"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm
