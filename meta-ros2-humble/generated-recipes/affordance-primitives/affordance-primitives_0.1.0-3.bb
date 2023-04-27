# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Library for affordance motion primitives."
AUTHOR = "Adam Pettinger <adam.pettinger@utexas.edu>"
ROS_AUTHOR = "Adam Pettinger <adam.pettinger@utexas.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "affordance_primitives"
ROS_BPN = "affordance_primitives"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    tf2-eigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    tf2-eigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    tf2-eigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-clang-format \
    ament-clang-tidy \
    ament-cmake-copyright \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PickNikRobotics/affordance_primitives-release/archive/release/humble/affordance_primitives/0.1.0-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/affordance_primitives"
SRC_URI = "git://github.com/PickNikRobotics/affordance_primitives-release;${ROS_BRANCH};protocol=https"
SRCREV = "4314af7d9f5595083ea8dc9b1ad7e597d034c67b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
