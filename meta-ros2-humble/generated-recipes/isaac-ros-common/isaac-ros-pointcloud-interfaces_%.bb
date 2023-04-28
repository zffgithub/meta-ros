
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Pointcloud interfaces for Isaac ROS NITROS"
AUTHOR = "Ashwin Varghese Kuruttukulam <ashwinvk@nvidia.com>"
ROS_AUTHOR = "A,s,h,w,i,n, ,V,a,r,g,h,e,s,e, ,K,u,r,u,t,t,u,k,u,l,a,m"
HOMEPAGE = "https://developer.nvidia.com/blog/accelerating-ai-modules-for-ros-and-ros-2-on-jetson/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "NVIDIA Isaac ROS Software License"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=2b6e0a5c88ec02de7e0bbf9853b106ce"

ROS_CN = "isaac_ros_pointcloud_interfaces"
ROS_BPN = "isaac_ros_pointcloud_interfaces"

ROS_BUILD_DEPENDS = " \
    rosidl-default-generators \
	isaac-ros-common \
"

ROS_BUILDTOOL_DEPENDS = " \
     \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
	std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
     \
"

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
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
SRC_URI = "git://github.com/zff-ros/isaac_ros_pointcloud_interfaces;${ROS_BRANCH};protocol=https"
SRCREV = "f4244d0258314ff12f979ae3001b79ff709626eb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
    