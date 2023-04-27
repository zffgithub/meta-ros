# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "<p>       ROS2 message, service and action interfaces for the Kobuki.     </p>"
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "https://index.ros.org/k/kobuki_ros_interfaces/github-kobuki-base-kobuki_ros_interfaces"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_ros_interfaces"
ROS_BPN = "kobuki_ros_interfaces"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/kobuki_ros_interfaces-release/archive/release/humble/kobuki_ros_interfaces/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/kobuki_ros_interfaces"
SRC_URI = "git://git@github.com/ros2-gbp/kobuki_ros_interfaces-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "b9cf881332db5857b6623eb712bba4b2adf09d22"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
