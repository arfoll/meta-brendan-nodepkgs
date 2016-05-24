DESCRIPTION = "Provides communication to the Intel XDK"
LICENSE = "Proprietary"

LIC_FILES_CHKSUM = "file://LICENSE;md5=121fc3cd97e5c1db39627399a7d72288"

DEPENDS = "nodejs-native"
RDEPENDS_${PN} = "nodejs bash"

PR = "r0"

SRC_URI = "http://download.xdk.intel.com/iot/xdk-daemon-0.1.3.tar.bz2 \
           file://node_modules.tar.bz2"

SRC_URI[md5sum] = "ffc1f11eb390e5846093c2b89fae052e"
SRC_URI[sha256sum] = "23a8c1bb025a9b4dbc22e8e656a1bebfefcaba23831b14b52e8fe9966448571e"

inherit npm

# overrriding source dir has to be done after inheriting npm
S = "${WORKDIR}/${PN}-${PV}"

do_compile_prepend () {
    cp -a ${WORKDIR}/node_modules ${WORKDIR}/${PN}-${PV}/
}

do_install () {
    install -d ${D}/opt/xdk-daemon/
    cp -a ${S}/* ${D}/opt/xdk-daemon/

    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${S}/xdk-daemon-mdns.service ${D}${systemd_unitdir}/system/xdk-daemon.service
}

inherit systemd

SYSTEMD_SERVICE_${PN} = "xdk-daemon.service"

FILES_${PN} = "/opt/xdk-daemon/ \
               ${systemd_unitdir}/system/xdk-daemon.service \
               ${bindir}/"
