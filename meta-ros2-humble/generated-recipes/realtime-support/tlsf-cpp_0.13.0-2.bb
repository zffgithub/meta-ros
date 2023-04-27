# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "C++ stdlib-compatible wrapper around tlsf allocator and ROS2 examples"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "Jackie Kay <jackie@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GNU Lesser Public License 2.1 & Apache License 2.0"
LICENSE = "LGPL-2.1-only & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

ROS_CN = "realtime_support"
ROS_BPN = "tlsf_cpp"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
    rclcpp \
    rmw \
    std-msgs \
    tlsf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
    rclcpp \
    rmw \
    std-msgs \
    tlsf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    rmw-implementation-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/realtime_support-release/archive/release/humble/tlsf_cpp/0.13.0-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/tlsf_cpp"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/realtime_support-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "2cc70b113e45e90cfafd2f8d0513cadaf8c378bb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
