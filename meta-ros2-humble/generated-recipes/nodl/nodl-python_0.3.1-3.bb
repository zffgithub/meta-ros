# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Implementation of the NoDL API in Python."
AUTHOR = "Ubuntu Robotics <ubuntu-robotics@lists.launchpad.net>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "nodl"
ROS_BPN = "nodl_python"

ROS_BUILD_DEPENDS = " \
    ament-index-python \
    python3-lxml \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ament-index-python \
    python3-lxml \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    python3-lxml \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-flake8 \
    ament-lint-auto \
    ament-lint-common \
    ament-mypy \
    python3-pytest \
    python3-pytest-mock \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/nodl-release/archive/release/humble/nodl_python/0.3.1-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/nodl_python"
SRC_URI = "git://git@github.com/ros2-gbp/nodl-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "ba0378ae4a2c0c9ae5fcad598984e06497652e5e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
