# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Msg and srv definitions for rc_reason_clients"
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_reason_clients"
ROS_BPN = "rc_reason_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    rc-common-msgs \
    shape-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rc-common-msgs \
    shape-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rc-common-msgs \
    rosidl-default-runtime \
    shape-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rc_reason_clients-release/archive/release/humble/rc_reason_msgs/0.2.1-4.tar.gz
ROS_BRANCH ?= "branch=release/humble/rc_reason_msgs"
SRC_URI = "git://git@github.com/ros2-gbp/rc_reason_clients-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "84c2876ab13c6e63db9fd734f22fc89226debd61"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
