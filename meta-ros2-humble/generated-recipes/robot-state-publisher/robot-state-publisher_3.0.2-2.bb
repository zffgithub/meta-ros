# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "This package take the joint angles of a robot as input, and publishes the 3D poses of the robot links to tf2, using a kinematic tree model of the robot."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "Karsten Knese <karsten@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_state_publisher"
ROS_BPN = "robot_state_publisher"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    kdl-parser \
    orocos-kdl-vendor \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    tf2-ros \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    kdl-parser \
    orocos-kdl-vendor \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    tf2-ros \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    kdl-parser \
    orocos-kdl-vendor \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    std-msgs \
    tf2-ros \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    launch-ros \
    launch-testing-ament-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/robot_state_publisher-release/archive/release/humble/robot_state_publisher/3.0.2-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/robot_state_publisher"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/robot_state_publisher-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "5fa15e3005dc0c6f176d99d91c42dbc643e9a06c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
