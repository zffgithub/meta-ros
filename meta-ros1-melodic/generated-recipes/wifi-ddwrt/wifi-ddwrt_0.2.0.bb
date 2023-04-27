# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Access to the DD-WRT wifi"
AUTHOR = "Austin Hendrix <ahendrix@willowgarage.com>"
ROS_AUTHOR = "Scott Hassan <hassan@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/wifi_ddwrt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "wifi_ddwrt"
ROS_BPN = "wifi_ddwrt"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-mechanize} \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    pr2-msgs \
    rospy \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-mechanize} \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    pr2-msgs \
    rospy \
    std-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/wifi_ddwrt-release/archive/release/melodic/wifi_ddwrt/0.2.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/wifi_ddwrt"
SRC_URI = "git://github.com/ros-gbp/wifi_ddwrt-release;${ROS_BRANCH};protocol=https"
SRCREV = "2413f09dadf0ccf4d2f5c4ada1ca4a4fe46bcb01"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
