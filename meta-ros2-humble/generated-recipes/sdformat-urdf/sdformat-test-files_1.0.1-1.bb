# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Example SDFormat XML files for testing tools using hthis format."
AUTHOR = "Shane Loretz <sloretz@osrfoundation.org>"
ROS_AUTHOR = "Shane Loretz <sloretz@openrobotics.org>"
HOMEPAGE = "https://github.com/ros/sdformat_test_files"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "sdformat_urdf"
ROS_BPN = "sdformat_test_files"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/sdformat_urdf-release/archive/release/humble/sdformat_test_files/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/sdformat_test_files"
SRC_URI = "git://git@github.com/ros2-gbp/sdformat_urdf-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "dbaf4d1985698ef3b2a69c5e1684d61f70aa2ba6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
