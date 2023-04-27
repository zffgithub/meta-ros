# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Generic Messages for Navigation Objectives in Automotive Automation Software"
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Daniel Stanek <dstanek@autonomoustuff.com>"
HOMEPAGE = "http://github.com/astuff/automotive_navigation_msgs"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "automotive_autonomy_msgs"
ROS_BPN = "automotive_navigation_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    ros-environment \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    geometry-msgs \
    rosidl-default-runtime \
    std-msgs \
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

# matches with: https://github.com/ros2-gbp/automotive_autonomy_msgs-release/archive/release/humble/automotive_navigation_msgs/3.0.4-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/automotive_navigation_msgs"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/automotive_autonomy_msgs-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "3653f841dbb645225fd095948d3ab4c347f5e21a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
