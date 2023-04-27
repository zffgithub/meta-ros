# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>API for interacting with running RT-Components and managing RTM-based systems using OpenRTM-aist.</p>"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Geoffrey Biggs <git@killbots.net>"
HOMEPAGE = "http://ros.org/wiki/openrtm_tools"
SECTION = "devel"
LICENSE = "EPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=b1456987590b6d6fb15d36f398651b8b"

ROS_CN = "rtctree"
ROS_BPN = "rtctree"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-setuptools \
    ${ROS_UNRESOLVED_DEP-python-omniorb} \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/rtctree-release/archive/release/melodic/rtctree/3.0.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rtctree"
SRC_URI = "git://github.com/tork-a/rtctree-release;${ROS_BRANCH};protocol=https"
SRCREV = "ba713f024d8aedf81a9042ecdd5fc44bfb9f29fa"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
