# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The Clover package"
AUTHOR = "Oleg Kalachev <okalachev@gmail.com>"
ROS_AUTHOR = "Oleg Kalachev <okalachev@gmail.com>"
HOMEPAGE = "https://clover.coex.tech/"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "clover"
ROS_BPN = "clover"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-lxml \
    catkin-virtualenv \
    cv-bridge \
    cv-camera \
    geographiclib \
    geometry-msgs \
    led-msgs \
    mavros \
    mavros-extras \
    message-generation \
    nodelet \
    rosbridge-server \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-web-republisher \
    visualization-msgs \
    web-video-server \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-lxml \
    cv-bridge \
    cv-camera \
    geographiclib \
    geometry-msgs \
    led-msgs \
    mavros \
    mavros-extras \
    message-generation \
    nodelet \
    rosbridge-server \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-web-republisher \
    visualization-msgs \
    web-video-server \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-lxml \
    cv-bridge \
    cv-camera \
    geographiclib \
    geometry-msgs \
    led-msgs \
    mavros \
    mavros-extras \
    message-generation \
    nodelet \
    rosbridge-server \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-web-republisher \
    visualization-msgs \
    web-video-server \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ros-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/CopterExpress/clover-release/archive/release/melodic/clover/0.21.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/clover"
SRC_URI = "git://github.com/CopterExpress/clover-release;${ROS_BRANCH};protocol=https"
SRCREV = "dd4a906191e358e015591ffb6c81f7912a2489d9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
