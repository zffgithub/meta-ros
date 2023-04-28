
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Isaac ROS NITROS Flat Scan Type"
AUTHOR = "Ashwin Varghese Kuruttukulam <ashwinvk@nvidia.com>"
ROS_AUTHOR = "A,s,h,w,i,n, ,V,a,r,g,h,e,s,e, ,K,u,r,u,t,t,u,k,u,l,a,m"
HOMEPAGE = "https://developer.nvidia.com/isaac-ros-gems/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "NVIDIA Isaac ROS Software License"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=274c4a64447201befa6cf0b740c72b80"

ROS_CN = "isaac_ros_nitros_flat_scan_type"
ROS_BPN = "isaac_ros_nitros_flat_scan_type"

ROS_BUILD_DEPENDS = " \
    isaac-ros-common \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
	rclcpp-components \
	isaac-ros-nitros \
	isaac-ros-pointcloud-interfaces \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
     \
"

ROS_EXEC_DEPENDS = " \
    rclcpp \
	rclcpp-components \
	isaac-ros-nitros \
	isaac-ros-pointcloud-interfaces \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
	ament-lint-common \
	isaac-ros-test \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ament_cmake-release/archive/release/humble/ament_cmake/1.3.1-2.tar.gz
ROS_BRANCH ?= "branch=main"
SRC_URI = "git://github.com/zff-ros/isaac_ros_nitros_flat_scan_type;${ROS_BRANCH};protocol=https"
SRCREV = "66035afa525e20ca7d006e610cfb785e0ff165ca"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
    