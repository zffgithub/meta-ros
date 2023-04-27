# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "RMF Building map tools"
AUTHOR = "Morgan Quigley <mquigley@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_traffic_editor"
ROS_BPN = "rmf_building_map_tools"

ROS_BUILD_DEPENDS = " \
    rmf-building-map-msgs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-fuel-tools7} \
    ${ROS_UNRESOLVED_DEP-python3-fiona} \
    ${ROS_UNRESOLVED_DEP-python3-rtree} \
    ${ROS_UNRESOLVED_DEP-python3-shapely} \
    ${ROS_UNRESOLVED_DEP-sqlite3} \
    ament-index-python \
    python3-pyproj \
    python3-pyyaml \
    python3-requests \
    rclpy \
    rmf-building-map-msgs \
    rmf-site-map-msgs \
    std-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_traffic_editor-release/archive/release/humble/rmf_building_map_tools/1.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmf_building_map_tools"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/rmf_traffic_editor-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "215563d599fee7307de471eb503d95f6ecf87d42"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
