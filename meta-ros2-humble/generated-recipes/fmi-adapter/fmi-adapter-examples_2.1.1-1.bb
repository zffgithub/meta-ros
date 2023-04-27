# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Provides small examples for use of the fmi_adapter package"
AUTHOR = "Ralph Lange <ralph.lange@de.bosch.com>"
HOMEPAGE = "http://wiki.ros.org/fmi_adapter"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "fmi_adapter"
ROS_BPN = "fmi_adapter_examples"

ROS_BUILD_DEPENDS = " \
    fmi-adapter \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fmi-adapter \
    launch \
    launch-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/fmi_adapter-release/archive/release/humble/fmi_adapter_examples/2.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/fmi_adapter_examples"
SRC_URI = "git://git@github.com/ros2-gbp/fmi_adapter-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "283b188b0d72435a2a745076791bf6e56274154b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
