# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The linux_networking package"
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "TODO"
LICENSE = "TODO-CATKIN-PACKAGE-LICENSE"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "linux_networking"
ROS_BPN = "linux_networking"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    access-point-control \
    asmach \
    asmach-tutorials \
    ddwrt-access-point \
    hostapd-access-point \
    ieee80211-channels \
    linksys-access-point \
    multi-interface-roam \
    network-control-tests \
    network-detector \
    network-monitor-udp \
    network-traffic-control \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    access-point-control \
    asmach \
    asmach-tutorials \
    ddwrt-access-point \
    hostapd-access-point \
    ieee80211-channels \
    linksys-access-point \
    multi-interface-roam \
    network-control-tests \
    network-detector \
    network-monitor-udp \
    network-traffic-control \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/linux_networking/1.0.16-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/linux_networking"
SRC_URI = "git://github.com/pr2-gbp/linux_networking-release;${ROS_BRANCH};protocol=https"
SRCREV = "f99acdbd4d85fd16f0dc630be9364f60e54689d9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
