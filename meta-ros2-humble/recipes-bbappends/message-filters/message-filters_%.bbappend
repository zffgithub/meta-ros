# Copyright (c) 2022 Acceleration Robotics S.L. <contact@accelerationrobotics.com>

# Fix for Honister release only:
inherit distutils3-base

ROS_BUILDTOOL_DEPENDS += " \
    python3-numpy-native \
"
