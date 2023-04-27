# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "The POPF package"
AUTHOR = "Francisco Martin <fmrico@gmail.com>"
ROS_AUTHOR = "Marc Hanheide"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv2"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "popf"
ROS_BPN = "popf"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-coinor-libcbc-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libcgl-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libclp-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libcoinutils-dev} \
    bison \
    flex \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-coinor-libcbc-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libcgl-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libclp-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libcoinutils-dev} \
    bison \
    flex \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-coinor-libcbc-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libcgl-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libclp-dev} \
    ${ROS_UNRESOLVED_DEP-coinor-libcoinutils-dev} \
    bison \
    flex \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fmrico/popf-release/archive/release/foxy/popf/0.0.12-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/popf"
SRC_URI = "git://github.com/fmrico/popf-release;${ROS_BRANCH};protocol=https"
SRCREV = "d330a0acf2931232413855e91e58450c6a6df0a6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
