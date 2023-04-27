# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "dynamically set the tf trensformation"
AUTHOR = "Ryohei Ueda <garaemon@gmail.com>"
ROS_AUTHOR = "Manabu Saito <saito@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/dynamic_tf_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_common"
ROS_BPN = "dynamic_tf_publisher"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    rospy \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    rospy \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_common-release/archive/release/noetic/dynamic_tf_publisher/2.2.11-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/dynamic_tf_publisher"
SRC_URI = "git://github.com/tork-a/jsk_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "f85b85725cd1a85a0f8987bee9ee0537d44e54e2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
