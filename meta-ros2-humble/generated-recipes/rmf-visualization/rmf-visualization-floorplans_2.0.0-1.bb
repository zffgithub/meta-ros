# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A package to visualize the floorplans for levels in a building"
AUTHOR = "Yadunund <yadunund@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_visualization"
ROS_BPN = "rmf_visualization_floorplans"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    nav-msgs \
    opencv \
    rclcpp \
    rclcpp-components \
    rmf-building-map-msgs \
    rmf-visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    nav-msgs \
    opencv \
    rclcpp \
    rclcpp-components \
    rmf-building-map-msgs \
    rmf-visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libeigen \
    nav-msgs \
    opencv \
    rclcpp \
    rclcpp-components \
    rmf-building-map-msgs \
    rmf-visualization-msgs \
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

# matches with: https://github.com/ros2-gbp/rmf_visualization-release/archive/release/humble/rmf_visualization_floorplans/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmf_visualization_floorplans"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/rmf_visualization-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "28b4b89719fcc0efe626fa3d5a5db08c934e0e97"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
