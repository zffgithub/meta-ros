# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ublox_serialization provides header files for serialization of ROS messages to and from u-blox message format."
AUTHOR = "Veronica Lane <vmlane@alum.mit.edu>"
ROS_AUTHOR = "Johannes Meyer"
HOMEPAGE = "http://ros.org/wiki/ublox"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ublox"
ROS_BPN = "ublox_serialization"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ublox-release/archive/release/humble/ublox_serialization/2.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/ublox_serialization"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/ublox-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "fb78feba0d3bf7c3e525e57c14d0c51ad4188112"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
