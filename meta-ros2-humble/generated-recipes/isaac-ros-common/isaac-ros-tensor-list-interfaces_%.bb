
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Interfaces for Isaac ROS tensor list"
AUTHOR = "CY Chen <cyc@nvidia.com>"
ROS_AUTHOR = "Hemal Shah,Ethan Yu"
HOMEPAGE = "https://developer.nvidia.com/isaac-ros-gems/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "NVIDIA Isaac ROS Software License"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "isaac_ros_tensor_list_interfaces"
ROS_BPN = "isaac_ros_tensor_list_interfaces"

ROS_BUILD_DEPENDS = " \
    isaac-ros-common \
	rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
     \
"

ROS_EXEC_DEPENDS = " \
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

# matches with: https://github.com/ros2-gbp/ament_cmake-release/archive/release/humble/ament_cmake/1.3.1-2.tar.gz
ROS_BRANCH ?= "branch=main"
SRC_URI = "git://github.com/zff-ros/isaac_ros_tensor_list_interfaces;${ROS_BRANCH};protocol=https"
SRCREV = "bef45d49173fabc7ceb199e5082697b2a50f349d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
    