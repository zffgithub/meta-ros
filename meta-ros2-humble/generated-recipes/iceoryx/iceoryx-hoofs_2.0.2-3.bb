# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Eclipse iceoryx inter-process-communication (IPC) middleware basic building blocks"
AUTHOR = "Eclipse Foundation, Inc. <iceoryx-oss-support@apex.ai>"
HOMEPAGE = "https://iceoryx.io"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=80318c4afef111a7690eaf237460856b"

ROS_CN = "iceoryx"
ROS_BPN = "iceoryx_hoofs"

ROS_BUILD_DEPENDS = " \
    acl \
    gcc-runtime \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    acl \
    gcc-runtime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    acl \
    gcc-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/iceoryx-release/archive/release/humble/iceoryx_hoofs/2.0.2-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/iceoryx_hoofs"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/iceoryx-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "9603c027cf9c5901cdfa3449f9a69855ddbf05fb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
