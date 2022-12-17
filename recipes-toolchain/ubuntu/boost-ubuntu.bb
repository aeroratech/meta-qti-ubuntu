inherit upkg_base

LICENSE = "BSL-1.0"
LICENSE_libboost1.71-dev = "BSL-1.0"
LICENSE_libboost-wave1.71-dev = "BSL-1.0"
LICENSE_libboost-wave1.71.0 = "BSL-1.0"
LICENSE_libboost-type-erasure1.71-dev = "BSL-1.0"
LICENSE_libboost-type-erasure1.71.0 = "BSL-1.0"
LICENSE_libboost-timer1.71-dev = "BSL-1.0"
LICENSE_libboost-timer1.71.0 = "BSL-1.0"
LICENSE_libboost-thread1.71-dev = "BSL-1.0"
LICENSE_libboost-thread1.71.0 = "BSL-1.0"
LICENSE_libboost-test1.71-dev = "BSL-1.0"
LICENSE_libboost-test1.71.0 = "BSL-1.0"
LICENSE_libboost-system1.71-dev = "BSL-1.0"
LICENSE_libboost-system1.71.0 = "BSL-1.0"
LICENSE_libboost-stacktrace1.71-dev = "BSL-1.0"
LICENSE_libboost-stacktrace1.71.0 = "BSL-1.0"
LICENSE_libboost-serialization1.71-dev = "BSL-1.0"
LICENSE_libboost-serialization1.71.0 = "BSL-1.0"
LICENSE_libboost-regex1.71-dev = "BSL-1.0"
LICENSE_libboost-regex1.71.0 = "BSL-1.0"
LICENSE_libboost-random1.71-dev = "BSL-1.0"
LICENSE_libboost-random1.71.0 = "BSL-1.0"
LICENSE_libboost-python1.71-dev = "BSL-1.0"
LICENSE_libboost-python1.71.0 = "BSL-1.0"
LICENSE_libboost-program-options1.71-dev = "BSL-1.0"
LICENSE_libboost-program-options1.71.0 = "BSL-1.0"
LICENSE_libboost-numpy1.71-dev = "BSL-1.0"
LICENSE_libboost-numpy1.71.0 = "BSL-1.0"
LICENSE_libboost-mpi-python1.71-dev = "BSL-1.0"
LICENSE_libboost-mpi-python1.71.0 = "BSL-1.0"
LICENSE_libboost-mpi1.71-dev = "BSL-1.0"
LICENSE_libboost-mpi1.71.0 = "BSL-1.0"
LICENSE_libboost-math1.71-dev = "BSL-1.0"
LICENSE_libboost-math1.71.0 = "BSL-1.0"
LICENSE_libboost-log1.71-dev = "BSL-1.0"
LICENSE_libboost-log1.71.0 = "BSL-1.0"
LICENSE_libboost-locale1.71-dev = "BSL-1.0"
LICENSE_libboost-locale1.71.0 = "BSL-1.0"
LICENSE_libboost-iostreams1.71-dev = "BSL-1.0"
LICENSE_libboost-iostreams1.71.0 = "BSL-1.0"
LICENSE_libboost-graph-parallel1.71-dev = "BSL-1.0"
LICENSE_libboost-graph-parallel1.71.0 = "BSL-1.0"
LICENSE_libboost-graph1.71-dev = "BSL-1.0"
LICENSE_libboost-graph1.71.0 = "BSL-1.0"
LICENSE_libboost-filesystem1.71-dev = "BSL-1.0"
LICENSE_libboost-filesystem1.71.0 = "BSL-1.0"
LICENSE_libboost-fiber1.71-dev = "BSL-1.0"
LICENSE_libboost-fiber1.71.0 = "BSL-1.0"
LICENSE_libboost-exception1.71-dev = "BSL-1.0"
LICENSE_libboost-date-time1.71-dev = "BSL-1.0"
LICENSE_libboost-date-time1.71.0 = "BSL-1.0"
LICENSE_libboost-coroutine1.71-dev = "BSL-1.0"
LICENSE_libboost-coroutine1.71.0 = "BSL-1.0"
LICENSE_libboost-contract1.71-dev = "BSL-1.0"
LICENSE_libboost-contract1.71.0 = "BSL-1.0"
LICENSE_libboost-context1.71-dev = "BSL-1.0"
LICENSE_libboost-context1.71.0 = "BSL-1.0"
LICENSE_libboost-container1.71-dev = "BSL-1.0"
LICENSE_libboost-container1.71.0 = "BSL-1.0"
LICENSE_libboost-chrono1.71-dev = "BSL-1.0"
LICENSE_libboost-chrono1.71.0 = "BSL-1.0"
LICENSE_libboost-atomic1.71-dev = "BSL-1.0"
LICENSE_libboost-atomic1.71.0 = "BSL-1.0"
LICENSE_libboost1.71-all-dev = "BSL-1.0"
LICENSE_libboost1.71-tools-dev = "BSL-1.0"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost1.71-tools-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost1.71-tools-dev"
SRC_URI[libboost1.71-tools-dev.md5sum] = "81c39078b48e34d5e56282eb542b6870"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost1.71-all-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost1.71-all-dev"
SRC_URI[libboost1.71-all-dev.md5sum] = "24d04243f03ad9ba524265b9e324787b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-atomic1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-atomic1.71.0"
SRC_URI[libboost-atomic1.71.0.md5sum] = "0af40c578eae17e785bce6f10b8edf8d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-atomic1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-atomic1.71-dev"
SRC_URI[libboost-atomic1.71-dev.md5sum] = "5a39405312aaf1ead203ee1aa4e64a1d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-chrono1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-chrono1.71.0"
SRC_URI[libboost-chrono1.71.0.md5sum] = "1e77a673fbced175b885206a94ddba92"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-chrono1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-chrono1.71-dev"
SRC_URI[libboost-chrono1.71-dev.md5sum] = "954d145b0fa65332f590b149708a7215"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-container1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-container1.71.0"
SRC_URI[libboost-container1.71.0.md5sum] = "c030b8d0572cfd770a1afe563ea6a7fa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-container1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-container1.71-dev"
SRC_URI[libboost-container1.71-dev.md5sum] = "7f3ae83b28755be459e4a50c25395bb1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-context1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-context1.71.0"
SRC_URI[libboost-context1.71.0.md5sum] = "69259ef2a08577e80e31ccfa1f2f3bec"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-context1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-context1.71-dev"
SRC_URI[libboost-context1.71-dev.md5sum] = "9660d529a8a90066f552a36916ef5d0d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-contract1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-contract1.71.0"
SRC_URI[libboost-contract1.71.0.md5sum] = "abc395f28915176651060e9daf2b0121"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-contract1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-contract1.71-dev"
SRC_URI[libboost-contract1.71-dev.md5sum] = "466b6fd3fc883d8160bc1f09903ee46d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-coroutine1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-coroutine1.71.0"
SRC_URI[libboost-coroutine1.71.0.md5sum] = "c06e8849faec7263005c36682beb585b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-coroutine1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-coroutine1.71-dev"
SRC_URI[libboost-coroutine1.71-dev.md5sum] = "c5649474a85b57e3cce07cebbd2f11ab"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-date-time1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-date-time1.71.0"
SRC_URI[libboost-date-time1.71.0.md5sum] = "f591e776e2512c8287a67be4ce7cce3c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-date-time1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-date-time1.71-dev"
SRC_URI[libboost-date-time1.71-dev.md5sum] = "cfd22e081be9c3fbe15619626972a6a1"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-exception1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-exception1.71-dev"
SRC_URI[libboost-exception1.71-dev.md5sum] = "96aefb08da30cfa4f834dd747ee616ae"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-fiber1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-fiber1.71.0"
SRC_URI[libboost-fiber1.71.0.md5sum] = "639cc9078b8e19a71900f3e23a940e0c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-fiber1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-fiber1.71-dev"
SRC_URI[libboost-fiber1.71-dev.md5sum] = "a09ac34a851995727567600256a39f00"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-filesystem1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-filesystem1.71.0"
SRC_URI[libboost-filesystem1.71.0.md5sum] = "1cae00079dbcacc082dfcd21ef6e24ee"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-filesystem1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-filesystem1.71-dev"
SRC_URI[libboost-filesystem1.71-dev.md5sum] = "ee79f20a7174177c585043f383139ca4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-graph1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-graph1.71.0"
SRC_URI[libboost-graph1.71.0.md5sum] = "054b63ff90b80363119b495fb3c74c7e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-graph1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-graph1.71-dev"
SRC_URI[libboost-graph1.71-dev.md5sum] = "f0c29430bd0e9932fc8ec710b11d796c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-graph-parallel1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-graph-parallel1.71.0"
SRC_URI[libboost-graph-parallel1.71.0.md5sum] = "2b4e358d1be9ebd82bb8ced26a3d385a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-graph-parallel1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-graph-parallel1.71-dev"
SRC_URI[libboost-graph-parallel1.71-dev.md5sum] = "9497feab397547a001a9dd2253b441f6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-iostreams1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-iostreams1.71.0"
SRC_URI[libboost-iostreams1.71.0.md5sum] = "f0b266ac8bd88d700b7d59f221820009"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-iostreams1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-iostreams1.71-dev"
SRC_URI[libboost-iostreams1.71-dev.md5sum] = "7418ec4528c50862a632e1fe6009f088"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-locale1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-locale1.71.0"
SRC_URI[libboost-locale1.71.0.md5sum] = "fda6992cbcf2bbd2a805d997c9b923fc"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-locale1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-locale1.71-dev"
SRC_URI[libboost-locale1.71-dev.md5sum] = "a1c6a5a806378a1cc26f798942299cf9"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-log1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-log1.71.0"
SRC_URI[libboost-log1.71.0.md5sum] = "812304383ca76db3ac5800672490ce19"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-log1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-log1.71-dev"
SRC_URI[libboost-log1.71-dev.md5sum] = "25c6f39174cb6d15b37a1beab2429704"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-math1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-math1.71.0"
SRC_URI[libboost-math1.71.0.md5sum] = "36aebdb3eb434a72b2a0a3923edb7064"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-math1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-math1.71-dev"
SRC_URI[libboost-math1.71-dev.md5sum] = "add62ffe6207837b8d1d00c9118bf598"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-mpi1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-mpi1.71.0"
SRC_URI[libboost-mpi1.71.0.md5sum] = "d220dd2ff5620da0d0d98e6518b859a7"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-mpi1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-mpi1.71-dev"
SRC_URI[libboost-mpi1.71-dev.md5sum] = "d09779159da37c50b271e7d5fba162a4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-mpi-python1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-mpi-python1.71.0"
SRC_URI[libboost-mpi-python1.71.0.md5sum] = "431b2c3aeb31884828a92fb60182e6ae"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-mpi-python1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-mpi-python1.71-dev"
SRC_URI[libboost-mpi-python1.71-dev.md5sum] = "2c63ad38fa1e9ac4d20cd1336bcb1d46"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-numpy1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-numpy1.71.0"
SRC_URI[libboost-numpy1.71.0.md5sum] = "d00fb7a9b614d6ac1524cd536992dea8"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-numpy1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-numpy1.71-dev"
SRC_URI[libboost-numpy1.71-dev.md5sum] = "082fa1d0d38a9e83fb009541c6dfeb45"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-program-options1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-program-options1.71.0"
SRC_URI[libboost-program-options1.71.0.md5sum] = "97ccf02b8e6967d90f8353365c0f5a78"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-program-options1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-program-options1.71-dev"
SRC_URI[libboost-program-options1.71-dev.md5sum] = "b35f28e72a8f58f44f6d9a06270ff65b"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-python1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-python1.71.0"
SRC_URI[libboost-python1.71.0.md5sum] = "61dec176d4bc39653baafe6812583703"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-python1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-python1.71-dev"
SRC_URI[libboost-python1.71-dev.md5sum] = "04fdd70afe7a286d7881dc3a3074c7f5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-random1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-random1.71.0"
SRC_URI[libboost-random1.71.0.md5sum] = "016c46eec9e003929d8abe2cfd632b0a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-random1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-random1.71-dev"
SRC_URI[libboost-random1.71-dev.md5sum] = "eb70ca63f95fb1c524332b23b045ab90"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-regex1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-regex1.71.0"
SRC_URI[libboost-regex1.71.0.md5sum] = "5795693795c7b993efcee1baea0521fa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-regex1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-regex1.71-dev"
SRC_URI[libboost-regex1.71-dev.md5sum] = "65a69accf24416f57b306ce1eb41c4b6"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-serialization1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-serialization1.71.0"
SRC_URI[libboost-serialization1.71.0.md5sum] = "c3cfe9c32b1982bd24a93adc9a537d46"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-serialization1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-serialization1.71-dev"
SRC_URI[libboost-serialization1.71-dev.md5sum] = "4e519b771356a91720a7b406f2f4f928"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-stacktrace1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-stacktrace1.71.0"
SRC_URI[libboost-stacktrace1.71.0.md5sum] = "52f3eae0db5a0f580d48f3cf3b20dd86"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-stacktrace1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-stacktrace1.71-dev"
SRC_URI[libboost-stacktrace1.71-dev.md5sum] = "1c5242a071b3a742120615b67dc266aa"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-system1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-system1.71.0"
SRC_URI[libboost-system1.71.0.md5sum] = "c7c3c6a045f8316c59e6ba1e72b654b5"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-system1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-system1.71-dev"
SRC_URI[libboost-system1.71-dev.md5sum] = "143ea5e72f7d964b9ab021e412e9489c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-test1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-test1.71.0"
SRC_URI[libboost-test1.71.0.md5sum] = "384c7f048f1eaed9952599291723d3b4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-test1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-test1.71-dev"
SRC_URI[libboost-test1.71-dev.md5sum] = "cc5f6ed7b21705b91f52462676e5d944"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-thread1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-thread1.71.0"
SRC_URI[libboost-thread1.71.0.md5sum] = "e0dc6a1edbfa2a8ad54fbb79165b5216"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost-thread1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-thread1.71-dev"
SRC_URI[libboost-thread1.71-dev.md5sum] = "0343099dac1197c6bb6c9cf16a1ca67a"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-timer1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-timer1.71.0"
SRC_URI[libboost-timer1.71.0.md5sum] = "8d9f18315b6b5b1d21c2dde37c4e7c87"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-timer1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-timer1.71-dev"
SRC_URI[libboost-timer1.71-dev.md5sum] = "2f9410626b6446daf54b853bcb8f7861"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-type-erasure1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-type-erasure1.71.0"
SRC_URI[libboost-type-erasure1.71.0.md5sum] = "aecb2fc4f0ccc3a906bf5e9176cff490"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-type-erasure1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-type-erasure1.71-dev"
SRC_URI[libboost-type-erasure1.71-dev.md5sum] = "39f1e70dd0542e3361947eee6b41c9b4"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-wave1.71.0_1.71.0-6ubuntu6_arm64.deb;name=libboost-wave1.71.0"
SRC_URI[libboost-wave1.71.0.md5sum] = "3fd17195cfff21fdab4ac0661982d717"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/b/boost1.71/libboost-wave1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost-wave1.71-dev"
SRC_URI[libboost-wave1.71-dev.md5sum] = "c7120a23930e7e3f8308429865a5169e"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/main/b/boost1.71/libboost1.71-dev_1.71.0-6ubuntu6_arm64.deb;name=libboost1.71-dev"
SRC_URI[libboost1.71-dev.md5sum] = "df68da3a735a45eae0017a2532d9eb91"

# other configs to feed compilation
PKG_${UPN} = "libboost1.71-dev"
DEPENDS += "virtual/aarch64-linux-gnu-gcc virtual/aarch64-linux-gnu-compilerlibs virtual/libc zlib bzip2 icu python3"
PROVIDES += "boost "
