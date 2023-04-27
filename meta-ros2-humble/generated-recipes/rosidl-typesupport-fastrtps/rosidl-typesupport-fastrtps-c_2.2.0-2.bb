# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Generate the C interfaces for eProsima FastRTPS."
AUTHOR = "Shane Loretz <shane@openrobotics.org>"
ROS_AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_typesupport_fastrtps"
ROS_BPN = "rosidl_typesupport_fastrtps_c"

ROS_BUILD_DEPENDS = " \
    ament-index-python \
    fastcdr \
    rmw \
    rosidl-cli \
    rosidl-cmake \
    rosidl-runtime-c \
    rosidl-typesupport-fastrtps-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-python-native \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-python \
    fastcdr \
    rmw \
    rosidl-cli \
    rosidl-cmake \
    rosidl-runtime-c \
    rosidl-runtime-cpp \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-interface \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-ros-native \
    fastrtps-cmake-module-native \
    python3-native \
    rosidl-generator-c-native \
"

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    fastcdr \
    rmw \
    rosidl-cli \
    rosidl-cmake \
    rosidl-runtime-c \
    rosidl-typesupport-fastrtps-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    osrf-testing-tools-cpp \
    performance-test-fixture \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/humble/rosidl_typesupport_fastrtps_c/2.2.0-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/rosidl_typesupport_fastrtps_c"
SRC_URI = "git://git@github.com/ros2-gbp/rosidl_typesupport_fastrtps-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "1d638f6ff69336649e4788dcd86b3a33947226a7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
