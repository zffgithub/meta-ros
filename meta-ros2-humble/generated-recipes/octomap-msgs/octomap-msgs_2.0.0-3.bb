# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "This package provides messages and serializations / conversion for the <a href="http://octomap.github.com">OctoMap library</a>.    This ROS2 version is based on version 0.3.3 of the ROS1 package."
AUTHOR = "Wolfgang Merkt <opensource@wolfgangmerkt.com>"
ROS_AUTHOR = "Armin Hornung <armin@hornung.io>"
HOMEPAGE = "http://ros.org/wiki/octomap_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "octomap_msgs"
ROS_BPN = "octomap_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/octomap_msgs-release/archive/release/humble/octomap_msgs/2.0.0-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/octomap_msgs"
SRC_URI = "git://git@github.com/ros2-gbp/octomap_msgs-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "47ee915519d7ba2baa8f0f2044eaa2a16401b644"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
