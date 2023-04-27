# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Example of using rclc_executor"
AUTHOR = "Jan Staschulat <jan.staschulat@de.bosch.com>"
ROS_AUTHOR = "Jan Staschulat <jan.staschulat@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rclc"
ROS_BPN = "rclc_examples"

ROS_BUILD_DEPENDS = " \
    example-interfaces \
    lifecycle-msgs \
    rcl \
    rclc \
    rclc-lifecycle \
    rclc-parameter \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    rclc-parameter \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    example-interfaces \
    lifecycle-msgs \
    rcl \
    rclc \
    rclc-lifecycle \
    rclc-parameter \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rclc-release/archive/release/humble/rclc_examples/4.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rclc_examples"
SRC_URI = "git://git@github.com/ros2-gbp/rclc-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "1740a5eed8f7905a9215597ffb08a31ec92eb938"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
