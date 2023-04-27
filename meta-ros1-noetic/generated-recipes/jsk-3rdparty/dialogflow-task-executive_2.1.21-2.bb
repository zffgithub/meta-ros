# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A ROS package for Task execution with dialogflow"
AUTHOR = "Shingo Kitagawa <shingogo.5511@gmail.com>"
ROS_AUTHOR = "Yuki Furuta <furushchev@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/dialogflow_task_executive"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_3rdparty"
ROS_BPN = "dialogflow_task_executive"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-dialogflow-pip} \
    message-runtime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-dialogflow-pip} \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_3rdparty-release/archive/release/noetic/dialogflow_task_executive/2.1.21-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/dialogflow_task_executive"
SRC_URI = "git://github.com/tork-a/jsk_3rdparty-release;${ROS_BRANCH};protocol=https"
SRCREV = "87dd9cc4e341eb45d5f86b9277850cce123e94c8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
