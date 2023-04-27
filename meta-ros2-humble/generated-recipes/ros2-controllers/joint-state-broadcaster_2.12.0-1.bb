# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Broadcaster to publish joint state"
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2_controllers"
ROS_BPN = "joint_state_broadcaster"

ROS_BUILD_DEPENDS = " \
    control-msgs \
    controller-interface \
    hardware-interface \
    pluginlib \
    rclcpp-lifecycle \
    rcutils \
    realtime-tools \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    control-msgs \
    controller-interface \
    hardware-interface \
    rclcpp-lifecycle \
    realtime-tools \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-msgs \
    controller-interface \
    hardware-interface \
    pluginlib \
    rclcpp-lifecycle \
    rcutils \
    realtime-tools \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    controller-manager \
    rclcpp \
    ros2-control-test-assets \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_controllers-release/archive/release/humble/joint_state_broadcaster/2.12.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/joint_state_broadcaster"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/ros2_controllers-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "35a3c956d66a44c85a3ea6f417bdbf22b7f96bac"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
