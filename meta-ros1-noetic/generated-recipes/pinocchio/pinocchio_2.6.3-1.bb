# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A fast and flexible implementation of Rigid Body Dynamics algorithms and their analytical derivatives."
AUTHOR = "Justin Carpentier <justin.carpentier@inria.fr>"
HOMEPAGE = "https://github.com/stack-of-tasks/pinocchio"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pinocchio"
ROS_BPN = "pinocchio"

ROS_BUILD_DEPENDS = " \
    boost \
    doxygen \
    eigenpy \
    git \
    libeigen \
    python3 \
    python3-numpy \
    urdfdom \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    eigenpy \
    libeigen \
    python3 \
    python3-numpy \
    urdfdom \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    catkin \
    eigenpy \
    libeigen \
    python3 \
    python3-numpy \
    urdfdom \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipab-slmc/pinocchio_catkin-release/archive/release/noetic/pinocchio/2.6.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pinocchio"
SRC_URI = "git://github.com/ipab-slmc/pinocchio_catkin-release;${ROS_BRANCH};protocol=https"
SRCREV = "6d2806307de97abb4e6a1511ff487980bdbcc940"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
