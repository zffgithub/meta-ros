# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Parse a multiple poses from yaml and provide as topic and service. This package is highly inspired by yocs_waypoints_navi"
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Jihoon Lee"
HOMEPAGE = "http://ros.org/wiki/yocs_waypoint_provider"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yujin_ocs"
ROS_BPN = "yocs_waypoint_provider"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    roscpp \
    visualization-msgs \
    yaml-cpp \
    yocs-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    roscpp \
    visualization-msgs \
    yaml-cpp \
    yocs-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    roscpp \
    visualization-msgs \
    yaml-cpp \
    yocs-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_waypoint_provider/0.8.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/yocs_waypoint_provider"
SRC_URI = "git://github.com/yujinrobot-release/yujin_ocs-release;${ROS_BRANCH};protocol=https"
SRCREV = "ed38300f613b6e9d0e0a93a3226474e3b762278f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
