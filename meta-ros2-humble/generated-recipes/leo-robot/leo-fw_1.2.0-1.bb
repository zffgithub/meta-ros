# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Binary releases of Leo Rover firmware and related utilities"
AUTHOR = "Fictionlab <support@fictionlab.pl>"
ROS_AUTHOR = "Błażej Sowa <blazej@fictionlab.pl>"
HOMEPAGE = "http://wiki.ros.org/leo_fw"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "leo_robot"
ROS_BPN = "leo_fw"

ROS_BUILD_DEPENDS = " \
    leo-msgs \
    nav-msgs \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    geometry-msgs \
    leo-msgs \
    nav-msgs \
    python3-dbus \
    python3-pyyaml \
    python3-whichcraft \
    rclcpp \
    rclcpp-components \
    rclpy \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/leo_robot-release/archive/release/humble/leo_fw/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/leo_fw"
SRC_URI = "git://git@git.ddt.dev/rbt/soc/ros2-gbp/leo_robot-release;${ROS_BRANCH};protocol=ssh"
SRCREV = "14af8330f4378ce485ba6d40c41f8396a28bf5c4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
