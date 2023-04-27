# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The Extensible Optimization Toolset (EXOTica) is a library for defining problems for robot motion planning. This package serves similar to a metapackage and contains dependencies onto all core-released exotica packages. It also builds the documentation."
AUTHOR = "Vladimir Ivan <v.ivan@ed.ac.uk>"
ROS_AUTHOR = "Vladimir Ivan <v.ivan@ed.ac.uk>"
HOMEPAGE = "https://github.com/ipab-slmc/exotica"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    exotica-aico-solver \
    exotica-collision-scene-fcl-latest \
    exotica-core \
    exotica-core-task-maps \
    exotica-ik-solver \
    exotica-levenberg-marquardt-solver \
    exotica-ompl-solver \
    exotica-python \
    exotica-time-indexed-rrt-connect-solver \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica/6.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/exotica"
SRC_URI = "git://github.com/ipab-slmc/exotica-release;${ROS_BRANCH};protocol=https"
SRCREV = "c627cbd8d2d87f0b29f8227588491b94946a4787"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
