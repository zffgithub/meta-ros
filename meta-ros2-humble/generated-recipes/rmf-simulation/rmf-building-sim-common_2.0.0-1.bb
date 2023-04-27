# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Common utility functions for Gazebo-classic and Gazebo building plugins"
AUTHOR = "Morgan Quigley <morgan@openrobotics.org>"
ROS_AUTHOR = "Morgan Quigley"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "rmf_simulation"
ROS_BPN = "rmf_building_sim_common"

ROS_BUILD_DEPENDS = " \
    menge-vendor \
    rclcpp \
    rmf-building-map-msgs \
    rmf-door-msgs \
    rmf-lift-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    menge-vendor \
    rclcpp \
    rmf-building-map-msgs \
    rmf-door-msgs \
    rmf-lift-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    menge-vendor \
    rclcpp \
    rmf-building-map-msgs \
    rmf-door-msgs \
    rmf-lift-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_simulation-release/archive/release/humble/rmf_building_sim_common/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmf_building_sim_common"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/rmf_simulation-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "cc80986d3b486b9f2602fd8f3974bbb53e594934"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
