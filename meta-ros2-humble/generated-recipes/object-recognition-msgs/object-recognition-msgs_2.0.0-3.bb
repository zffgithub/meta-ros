# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Object_recognition_msgs contains the ROS message and the actionlib definition used in object_recognition_core"
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/object_recognition"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "object_recognition_msgs"
ROS_BPN = "object_recognition_msgs"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    rosidl-default-generators \
    sensor-msgs \
    shape-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    geometry-msgs \
    rosidl-default-runtime \
    sensor-msgs \
    shape-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/object_recognition_msgs-release/archive/release/humble/object_recognition_msgs/2.0.0-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/object_recognition_msgs"
SRC_URI = "git://git@github.com/ros2-gbp/object_recognition_msgs-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "f039ec36be03ee7b713cbffc86a5d6a4534ba2a2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
