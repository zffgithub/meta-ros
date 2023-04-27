# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS2 examples using ROBOTIS DYNAMIXEL SDK"
AUTHOR = "Will Son <willson@robotis.com>"
ROS_AUTHOR = "Will Son <willson@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/dynamixel_sdk"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "dynamixel_sdk"
ROS_BPN = "dynamixel_sdk_examples"

ROS_BUILD_DEPENDS = " \
    dynamixel-sdk \
    dynamixel-sdk-custom-interfaces \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamixel-sdk \
    dynamixel-sdk-custom-interfaces \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamixel-sdk \
    dynamixel-sdk-custom-interfaces \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/dynamixel_sdk-release/archive/release/humble/dynamixel_sdk_examples/3.7.60-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/dynamixel_sdk_examples"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/dynamixel_sdk-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "d39394b495973f99bb73240c1336ae45f688d6e9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
