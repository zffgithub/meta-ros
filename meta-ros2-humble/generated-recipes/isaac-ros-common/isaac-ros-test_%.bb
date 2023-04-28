
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Isaac ROS testing utilities"
AUTHOR = "Hemal Shah <hemals@nvidia.com>"
ROS_AUTHOR = "Ethan Yu,Isaac Chang,Jaiveer Singh"
HOMEPAGE = "https://developer.nvidia.com/isaac-ros-gems/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "NVIDIA Isaac ROS Software License"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=014cba44c78c106f2ddc84dee51782c6"

ROS_CN = "isaac_ros_test"
ROS_BPN = "isaac_ros_test"

ROS_BUILD_DEPENDS = " \
     \
"

ROS_BUILDTOOL_DEPENDS = " \
     \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
     \
"

ROS_EXEC_DEPENDS = " \
    cv-bridge \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-flake8 \
	ament-pep257 \
	python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ament_cmake-release/archive/release/humble/ament_cmake/1.3.1-2.tar.gz
ROS_BRANCH ?= "branch=main"
SRC_URI = "git://github.com/zff-ros/isaac_ros_test;${ROS_BRANCH};protocol=https"
SRCREV = "ebb1981692a29d4bf566a4bc2d3dff3acd7e16c1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
    