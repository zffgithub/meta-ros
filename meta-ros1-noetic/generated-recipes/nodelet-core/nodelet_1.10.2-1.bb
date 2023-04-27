# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The nodelet package is designed to provide a way to run multiple     algorithms in the same process with zero copy transport between     algorithms.      This package provides both the nodelet base class needed for     implementing a nodelet, as well as the NodeletLoader class used     for instantiating nodelets."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://ros.org/wiki/nodelet"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "nodelet_core"
ROS_BPN = "nodelet"

ROS_BUILD_DEPENDS = " \
    bondcpp \
    boost \
    cmake-modules \
    message-generation \
    pluginlib \
    rosconsole \
    roscpp \
    std-msgs \
    util-linux \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    bondcpp \
    boost \
    pluginlib \
    rosconsole \
    roscpp \
    std-msgs \
    util-linux \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bondcpp \
    boost \
    message-runtime \
    pluginlib \
    rosconsole \
    roscpp \
    rospy \
    std-msgs \
    util-linux \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/nodelet_core-release/archive/release/noetic/nodelet/1.10.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/nodelet"
SRC_URI = "git://github.com/ros-gbp/nodelet_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "35e8e7d6c9706d3e2b7424f90fcfac749f0171b4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
