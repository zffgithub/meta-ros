# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "C++ driver library for Kobuki:     Pure C++ driver library for Kobuki. This is for those who do not wish to use ROS on their systems."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier"
HOMEPAGE = "https://index.ros.org/k/kobuki_driver/github-kobuki-base-kobuki_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_core"
ROS_BPN = "kobuki_driver"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-command-line \
    ecl-config \
    ecl-converters \
    ecl-devices \
    ecl-geometry \
    ecl-mobile-robot \
    ecl-sigslots \
    ecl-threads \
    ecl-time \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-command-line \
    ecl-config \
    ecl-converters \
    ecl-devices \
    ecl-geometry \
    ecl-mobile-robot \
    ecl-sigslots \
    ecl-threads \
    ecl-time \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/stonier/kobuki_core-release/archive/release/eloquent/kobuki_driver/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/kobuki_driver"
SRC_URI = "git://github.com/stonier/kobuki_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "d9a101051c84b52f6676d8d077613006e9e2e14e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
