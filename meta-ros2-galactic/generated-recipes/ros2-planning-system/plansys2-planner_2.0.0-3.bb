# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "This package contains the PDDL-based Planner module for the ROS2 Planning System"
AUTHOR = "Francisco Martin Rico <fmrico@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License, Version 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_CN = "ros2_planning_system"
ROS_BPN = "plansys2_planner"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    lifecycle-msgs \
    plansys2-core \
    plansys2-domain-expert \
    plansys2-msgs \
    plansys2-pddl-parser \
    plansys2-popf-plan-solver \
    plansys2-problem-expert \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    lifecycle-msgs \
    plansys2-core \
    plansys2-domain-expert \
    plansys2-msgs \
    plansys2-pddl-parser \
    plansys2-popf-plan-solver \
    plansys2-problem-expert \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    lifecycle-msgs \
    plansys2-core \
    plansys2-domain-expert \
    plansys2-msgs \
    plansys2-pddl-parser \
    plansys2-popf-plan-solver \
    plansys2-problem-expert \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    ros2run \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/IntelligentRoboticsLabs/ros2_planning_system-release/archive/release/galactic/plansys2_planner/2.0.0-3.tar.gz
ROS_BRANCH ?= "branch=release/galactic/plansys2_planner"
SRC_URI = "git://github.com/IntelligentRoboticsLabs/ros2_planning_system-release;${ROS_BRANCH};protocol=https"
SRCREV = "da9e8ff5bef8a89166ef529e6f9f61e92d885b17"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
