# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Base implementation for CANopen chains node with support for management services and diagnostics"
AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
ROS_AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
HOMEPAGE = "http://wiki.ros.org/canopen_chain_node"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPLv3"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "ros_canopen"
ROS_BPN = "canopen_chain_node"

ROS_BUILD_DEPENDS = " \
    canopen-master \
    diagnostic-updater \
    message-generation \
    pluginlib \
    rosconsole-bridge \
    roscpp \
    roslib \
    socketcan-interface \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    canopen-master \
    diagnostic-updater \
    message-runtime \
    pluginlib \
    rosconsole-bridge \
    roscpp \
    roslib \
    socketcan-interface \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    canopen-master \
    diagnostic-updater \
    message-runtime \
    pluginlib \
    rosconsole-bridge \
    roscpp \
    roslib \
    socketcan-interface \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/ros_canopen-release/archive/release/noetic/canopen_chain_node/0.8.5-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/canopen_chain_node"
SRC_URI = "git://github.com/ros-industrial-release/ros_canopen-release;${ROS_BRANCH};protocol=https"
SRCREV = "91cfbaf6595d6950e51f2bdd3a56d63c3922536b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
