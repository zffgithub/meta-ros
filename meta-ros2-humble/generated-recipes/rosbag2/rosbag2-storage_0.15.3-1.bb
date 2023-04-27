# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS2 independent storage format to store serialized ROS2 messages"
AUTHOR = "Geoffrey Biggs <geoff@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosbag2"
ROS_BPN = "rosbag2_storage"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    rcpputils \
    rcutils \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    rcpputils \
    rcutils \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    rcpputils \
    rcutils \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    rosbag2-test-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbag2-release/archive/release/humble/rosbag2_storage/0.15.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rosbag2_storage"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/rosbag2-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "4ae502f7b214bd5dc00ceaa123ec0fe4b7e1cee1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
