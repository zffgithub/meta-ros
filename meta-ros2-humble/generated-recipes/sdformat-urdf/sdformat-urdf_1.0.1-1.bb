# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "URDF plugin to parse SDFormat XML into URDF C++ DOM objects."
AUTHOR = "Shane Loretz <sloretz@osrfoundation.org>"
ROS_AUTHOR = "Shane Loretz <sloretz@openrobotics.org>"
HOMEPAGE = "https://github.com/ros/sdformat_urdf"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "sdformat_urdf"
ROS_BPN = "sdformat_urdf"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-sdformat12} \
    pluginlib \
    rcutils \
    tinyxml2-vendor \
    urdf \
    urdf-parser-plugin \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-sdformat12} \
    pluginlib \
    rcutils \
    tinyxml2-vendor \
    urdf \
    urdf-parser-plugin \
    urdfdom-headers \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-sdformat12} \
    tinyxml2-vendor \
    urdf \
    urdf-parser-plugin \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    sdformat-test-files \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/sdformat_urdf-release/archive/release/humble/sdformat_urdf/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/sdformat_urdf"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/sdformat_urdf-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "e38ebf3d65da9dc30fd1ccbea26ac029550085df"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
