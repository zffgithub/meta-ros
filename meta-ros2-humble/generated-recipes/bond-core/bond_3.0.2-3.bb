# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A bond allows two processes, A and B, to know when the other has     terminated, either cleanly or by crashing.  The bond remains     connected until it is either broken explicitly or until a     heartbeat times out."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Stuart Glaser"
HOMEPAGE = "http://www.ros.org/wiki/bond"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "bond_core"
ROS_BPN = "bond"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
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

# matches with: https://github.com/ros2-gbp/bond_core-release/archive/release/humble/bond/3.0.2-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/bond"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/bond_core-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "737763f459640e20bc0519f346c7ba7931e98938"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
