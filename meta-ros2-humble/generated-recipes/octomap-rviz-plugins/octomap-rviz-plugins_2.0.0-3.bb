# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A set of plugins for displaying occupancy information decoded from binary octomap messages."
AUTHOR = "Armin Hornung <armin@hornung.io>"
ROS_AUTHOR = "Julius Kammerl <jkammerl@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/octomap_rviz_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "octomap_rviz_plugins"
ROS_BPN = "octomap_rviz_plugins"

ROS_BUILD_DEPENDS = " \
    octomap \
    octomap-msgs \
    qtbase \
    rclcpp \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    octomap \
    octomap-msgs \
    qtbase \
    rclcpp \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    octomap \
    octomap-msgs \
    qtbase \
    rclcpp \
    rviz-common \
    rviz-default-plugins \
    rviz-rendering \
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

# matches with: https://github.com/ros2-gbp/octomap_rviz_plugins-release/archive/release/humble/octomap_rviz_plugins/2.0.0-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/octomap_rviz_plugins"
SRC_URI = "git://github.com/ros2-gbp/octomap_rviz_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "4fb2f6f97134c1ebfed61f6af98cd776ffdfda06"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
