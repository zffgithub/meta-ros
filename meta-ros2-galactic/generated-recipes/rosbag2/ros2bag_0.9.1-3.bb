# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Entry point for rosbag in ROS 2"
AUTHOR = "Karsten Knese <karsten@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosbag2"
ROS_BPN = "ros2bag"

ROS_BUILD_DEPENDS = " \
    ros2cli \
    rosbag2-py \
    rosbag2-transport \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ros2cli \
    rosbag2-py \
    rosbag2-transport \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros2cli \
    rosbag2-py \
    rosbag2-transport \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    launch-testing \
    launch-testing-ros \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbag2-release/archive/release/galactic/ros2bag/0.9.1-3.tar.gz
ROS_BRANCH ?= "branch=release/galactic/ros2bag"
SRC_URI = "git://github.com/ros2-gbp/rosbag2-release;${ROS_BRANCH};protocol=https"
SRCREV = "9b58c7887be7de169510e3df01d31ac596bac625"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
