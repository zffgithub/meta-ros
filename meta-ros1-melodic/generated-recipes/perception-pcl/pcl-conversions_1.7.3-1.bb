# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/pcl_conversions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "perception_pcl"
ROS_BPN = "pcl_conversions"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    pcl \
    pcl-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    libeigen \
    pcl \
    pcl-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_conversions/1.7.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pcl_conversions"
SRC_URI = "git://github.com/ros-gbp/perception_pcl-release;${ROS_BRANCH};protocol=https"
SRCREV = "6c57ccf327a516ec8c56f5583cb20484d5bc2cda"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
