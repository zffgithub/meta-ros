# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A package managing the websocket api endpoints in RMF system."
AUTHOR = "youliang <youliang@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_ros2"
ROS_BPN = "rmf_websocket"

ROS_BUILD_DEPENDS = " \
    boost \
    libeigen \
    nlohmann-json \
    nlohmann-json-schema-validator-vendor \
    rclcpp \
    rmf-utils \
    websocketpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    nlohmann-json \
    nlohmann-json-schema-validator-vendor \
    rclcpp \
    rmf-utils \
    websocketpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    nlohmann-json \
    nlohmann-json-schema-validator-vendor \
    rclcpp \
    rmf-utils \
    websocketpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-catch2 \
    ament-cmake-uncrustify \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_ros2-release/archive/release/humble/rmf_websocket/2.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmf_websocket"
SRC_URI = "git://git@github.com/ros2-gbp/rmf_ros2-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "7ec60720d6a3de5c46b1ca80bccb76de2248324b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
