# Copyright (c) 2021 LG Electronics, Inc.

# | FAILED: CMakeFiles/auto_dock.dir/src/laser_processor.cpp.o
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot-native/usr/bin/i686-webos-linux/i686-webos-linux-g++ -DROSCONSOLE_BACKEND_LOG4CXX -DROS_BUILD_SHARED_LIBS=1 -DROS_PACKAGE_NAME=\"fetch_open_auto_dock\" -I/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/git/include -I/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/opt/ros/noetic/include -I/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/opt/ros/noetic/share/xmlrpcpp/cmake/../../../include/xmlrpcpp -I/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/eigen3 -m32 -march=core2 -mtune=core2 -msse3 -mfpmath=sse -fstack-protector-strong  -O2 -D_FORTIFY_SOURCE=2 -Wformat -Wformat-security -Werror=format-security -Werror=return-type  --sysroot=/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot  -O2 -pipe -g -feliminate-unused-debug-types -fmacro-prefix-map=/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0=/usr/src/debug/fetch-open-auto-dock/0.1.2-r0                      -fdebug-prefix-map=/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0=/usr/src/debug/fetch-open-auto-dock/0.1.2-r0                      -fdebug-prefix-map=/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot=                      -fdebug-prefix-map=/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot-native=  -fvisibility-inlines-hidden   -m32 -march=core2 -mtune=core2 -msse3 -mfpmath=sse -fstack-protector-strong  -O2 -D_FORTIFY_SOURCE=2 -Wformat -Wformat-security -Werror=format-security -Werror=return-type  --sysroot=/jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot -Wall -MD -MT CMakeFiles/auto_dock.dir/src/laser_processor.cpp.o -MF CMakeFiles/auto_dock.dir/src/laser_processor.cpp.o.d -o CMakeFiles/auto_dock.dir/src/laser_processor.cpp.o -c /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/git/src/laser_processor.cpp
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/git/src/laser_processor.cpp: In member function 'void laser_processor::SampleSet::appendToCloud(sensor_msgs::PointCloud&, int, int, int)':
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/git/src/laser_processor.cpp:76:16: warning: dereferencing type-punned pointer will break strict-aliasing rules [-Wstrict-aliasing]
# |    76 |   color_val = *reinterpret_cast<float*>(&rgb);
# |       |                ^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# | In file included from /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/c++/11.1.0/map:60,
# |                  from /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/opt/ros/noetic/include/sensor_msgs/LaserScan.h:11,
# |                  from /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/git/include/fetch_auto_dock/laser_processor.h:40,
# |                  from /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/git/src/laser_processor.cpp:35:
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/c++/11.1.0/bits/stl_tree.h: In instantiation of 'static const _Key& std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_S_key(std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_Const_Link_type) [with _Key = laser_processor::Sample*; _Val = laser_processor::Sample*; _KeyOfValue = std::_Identity<laser_processor::Sample*>; _Compare = laser_processor::CompareSample; _Alloc = std::allocator<laser_processor::Sample*>; std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_Const_Link_type = const std::_Rb_tree_node<laser_processor::Sample*>*]':
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/c++/11.1.0/bits/stl_tree.h:1903:36:   required from 'std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::iterator std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_M_lower_bound(std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_Link_type, std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_Base_ptr, const _Key&) [with _Key = laser_processor::Sample*; _Val = laser_processor::Sample*; _KeyOfValue = std::_Identity<laser_processor::Sample*>; _Compare = laser_processor::CompareSample; _Alloc = std::allocator<laser_processor::Sample*>; std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::iterator = std::_Rb_tree<laser_processor::Sample*, laser_processor::Sample*, std::_Identity<laser_processor::Sample*>, laser_processor::CompareSample, std::allocator<laser_processor::Sample*> >::iterator; std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_Link_type = std::_Rb_tree_node<laser_processor::Sample*>*; std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::_Base_ptr = std::_Rb_tree_node_base*]'
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/c++/11.1.0/bits/stl_tree.h:2521:36:   required from 'std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::iterator std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::find(const _Key&) [with _Key = laser_processor::Sample*; _Val = laser_processor::Sample*; _KeyOfValue = std::_Identity<laser_processor::Sample*>; _Compare = laser_processor::CompareSample; _Alloc = std::allocator<laser_processor::Sample*>; std::_Rb_tree<_Key, _Val, _KeyOfValue, _Compare, _Alloc>::iterator = std::_Rb_tree<laser_processor::Sample*, laser_processor::Sample*, std::_Identity<laser_processor::Sample*>, laser_processor::CompareSample, std::allocator<laser_processor::Sample*> >::iterator]'
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/c++/11.1.0/bits/stl_set.h:795:25:   required from 'std::set<_Key, _Compare, _Alloc>::iterator std::set<_Key, _Compare, _Alloc>::find(const key_type&) [with _Key = laser_processor::Sample*; _Compare = laser_processor::CompareSample; _Alloc = std::allocator<laser_processor::Sample*>; std::set<_Key, _Compare, _Alloc>::iterator = std::_Rb_tree<laser_processor::Sample*, laser_processor::Sample*, std::_Identity<laser_processor::Sample*>, laser_processor::CompareSample, std::allocator<laser_processor::Sample*> >::const_iterator; std::set<_Key, _Compare, _Alloc>::key_type = laser_processor::Sample*]'
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/git/src/laser_processor.cpp:132:41:   required from here
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/c++/11.1.0/bits/stl_tree.h:770:15: error: static assertion failed: comparison object must be invocable as const
# |   770 |               is_invocable_v<const _Compare&, const _Key&, const _Key&>,
# |       |               ^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# | /jenkins/mjansa/build/ros/webos-noetic-honister/tmp-glibc/work/qemux86-webos-linux/fetch-open-auto-dock/0.1.2-r0/recipe-sysroot/usr/include/c++/11.1.0/bits/stl_tree.h:770:15: note: 'std::is_invocable_v<const laser_processor::CompareSample&, laser_processor::Sample* const&, laser_processor::Sample* const&>' evaluates to false
# | ninja: build stopped: subcommand failed.
CXXFLAGS += "-std=gnu++14"
