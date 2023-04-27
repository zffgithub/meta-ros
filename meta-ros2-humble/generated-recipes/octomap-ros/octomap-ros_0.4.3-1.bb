# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "octomap_ros provides conversion functions between ROS and OctoMap's native types.     This enables a convenvient use of the octomap package in ROS."
AUTHOR = "Wolfgang Merkt <opensource@wolfgangmerkt.com>"
ROS_AUTHOR = "Armin Hornung <armin@hornung.io>"
HOMEPAGE = "http://ros.org/wiki/octomap_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "octomap_ros"
ROS_BPN = "octomap_ros"

ROS_BUILD_DEPENDS = " \
    octomap \
    octomap-msgs \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    octomap \
    octomap-msgs \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    octomap \
    octomap-msgs \
    sensor-msgs \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/octomap_ros-release/archive/release/humble/octomap_ros/0.4.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/octomap_ros"
SRC_URI = "git://git@github.com/ros2-gbp/octomap_ros-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "aac3835a57fdfb8d8912c28a0b9609929f65332b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
