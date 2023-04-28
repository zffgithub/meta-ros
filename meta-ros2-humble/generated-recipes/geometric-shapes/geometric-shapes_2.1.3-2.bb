# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
AUTHOR = "Tyler Weaver <tyler@picknik.ai>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://ros.org/wiki/geometric_shapes"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometric_shapes"
ROS_BPN = "geometric_shapes"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    console-bridge-vendor \
    eigen-stl-containers \
    geometry-msgs \
    libeigen \
    octomap \
    pkgconfig \
    qhull \
    random-numbers \
    rclcpp \
    resource-retriever \
    shape-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    eigen3-cmake-module-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    console-bridge-vendor \
    eigen-stl-containers \
    geometry-msgs \
    libeigen \
    octomap \
    qhull \
    random-numbers \
    rclcpp \
    resource-retriever \
    shape-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    console-bridge-vendor \
    eigen-stl-containers \
    geometry-msgs \
    octomap \
    qhull \
    random-numbers \
    rclcpp \
    resource-retriever \
    rosidl-default-runtime \
    shape-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/geometric_shapes-release/archive/release/humble/geometric_shapes/2.1.3-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/geometric_shapes"
SRC_URI = "git://github.com/ros2-gbp/geometric_shapes-release;${ROS_BRANCH};protocol=https"
SRCREV = "04928b0236682c23c4d05a5cb43fc79b6fd422f3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
