# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "libpointmatcher is a modular ICP library, useful for robotics and computer vision."
AUTHOR = "Francois Pomerleau <f.pomerleau@gmail.com>"
HOMEPAGE = "https://github.com/ethz-asl/libpointmatcher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "libpointmatcher"
ROS_BPN = "libpointmatcher"

ROS_BUILD_DEPENDS = " \
    boost \
    libeigen \
    libnabo \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libeigen \
    libnabo \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/libpointmatcher-release/archive/release/humble/libpointmatcher/1.3.1-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/libpointmatcher"
SRC_URI = "git://git@github.com/ros2-gbp/libpointmatcher-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "0ed5b47746e28c0e56fde1b7aa17bdc0200bd58c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
