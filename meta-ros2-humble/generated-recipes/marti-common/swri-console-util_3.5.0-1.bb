# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "swri_console_util"
AUTHOR = "P. J. Reed <preed@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_console_util"

ROS_BUILD_DEPENDS = " \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/marti_common-release/archive/release/humble/swri_console_util/3.5.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/swri_console_util"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/marti_common-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "b4ea2f67de4b991f2aaa9c013add38e1e6df3854"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
