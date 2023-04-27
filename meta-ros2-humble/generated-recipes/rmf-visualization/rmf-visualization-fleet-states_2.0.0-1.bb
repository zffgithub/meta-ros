# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A package to visualize positions of robots from different fleets in the a building"
AUTHOR = "Morgan Quigley <mquigley@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_visualization"
ROS_BPN = "rmf_visualization_fleet_states"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rmf-fleet-msgs \
    rmf-visualization-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rmf-fleet-msgs \
    rmf-visualization-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rmf-fleet-msgs \
    rmf-visualization-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    rmf-utils \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_visualization-release/archive/release/humble/rmf_visualization_fleet_states/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmf_visualization_fleet_states"
SRC_URI = "git://git@github.com/ros2-gbp/rmf_visualization-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "87633e11dcdba74279b6b23f9b4fbefe33f016df"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
