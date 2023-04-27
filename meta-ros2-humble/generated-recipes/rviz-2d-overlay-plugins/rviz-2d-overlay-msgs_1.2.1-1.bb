# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Messages describing 2D overlays for RVIZ, extracted/derived from the jsk_visualization ROS1 packege."
AUTHOR = "Team Spatzenhirn <team-spatzenhirn@uni-ulm.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=19a28aa894d84513b15cf3f44c437682"

ROS_CN = "rviz_2d_overlay_plugins"
ROS_BPN = "rviz_2d_overlay_msgs"

ROS_BUILD_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rviz_2d_overlay_plugins-release/archive/release/humble/rviz_2d_overlay_msgs/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rviz_2d_overlay_msgs"
SRC_URI = "git://git@github.com/ros2-gbp/rviz_2d_overlay_plugins-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "aa7999e82eb9d16f3da86412ce8322a077e9aaf9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
