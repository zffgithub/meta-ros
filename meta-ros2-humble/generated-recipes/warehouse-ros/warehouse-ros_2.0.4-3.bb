# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Persistent storage of ROS messages"
AUTHOR = "MoveIt Release Team <moveit_releasers@googlegroups.com>"
ROS_AUTHOR = "Bhaskara Marthi <bhaskara@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/warehouse_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "warehouse_ros"
ROS_BPN = "warehouse_ros"

ROS_BUILD_DEPENDS = " \
    boost \
    geometry-msgs \
    openssl \
    pluginlib \
    rclcpp \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    geometry-msgs \
    openssl \
    pluginlib \
    rclcpp \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    geometry-msgs \
    openssl \
    pluginlib \
    rclcpp \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/warehouse_ros-release/archive/release/humble/warehouse_ros/2.0.4-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/warehouse_ros"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/warehouse_ros-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "7b9b22ef246ffad4ebbba43149d272c47ed8cc58"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
