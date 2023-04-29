# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "AWS RoboMaker package for a warehouse world to use in manufacturing and logistics robot applications."
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT-0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=8dc6050b5352930bf6569c8220212db1"

ROS_CN = "aws-robomaker-small-warehouse-world"
ROS_BPN = "aws_robomaker_small_warehouse_world"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    gazebo-plugins \
    gazebo-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/aws_robomaker_small_warehouse_world-release/archive/release/humble/aws_robomaker_small_warehouse_world/1.0.5-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/aws_robomaker_small_warehouse_world"
SRC_URI = "git://git@github.com/ros2-gbp/aws_robomaker_small_warehouse_world-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "f9c9070e9cd91a1427854905bb1f46810f66d37d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}