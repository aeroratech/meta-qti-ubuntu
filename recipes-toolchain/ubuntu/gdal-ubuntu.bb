inherit upkg_base

LICENSE = "Expat"
LICENSE_libgdal-java = "Expat"
LICENSE_libgdal-perl = "Expat"
LICENSE_python3-gdal = "Expat"
LICENSE_gdal-data = "Expat"
LICENSE_gdal-bin = "Expat"
LICENSE_libgdal-dev = "Expat"
LICENSE_libgdal26 = "Expat"

# the information of ubuntu package(s)
SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdal/libgdal26_3.0.4+dfsg-1build3_arm64.deb;name=libgdal26"
SRC_URI[libgdal26.md5sum] = "bf94d9e3f784b816ddb72e80189fbd68"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdal/libgdal-dev_3.0.4+dfsg-1build3_arm64.deb;name=libgdal-dev"
SRC_URI[libgdal-dev.md5sum] = "d7ae45b7724245f3772499ab2c4b024c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdal/gdal-bin_3.0.4+dfsg-1build3_arm64.deb;name=gdal-bin"
SRC_URI[gdal-bin.md5sum] = "4912d09fd958ab54c8e97f6f7c64f252"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdal/gdal-data_3.0.4+dfsg-1build3_all.deb;name=gdal-data"
SRC_URI[gdal-data.md5sum] = "a3ed64cf6232eb5376e45a6d7656a03c"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdal/python3-gdal_3.0.4+dfsg-1build3_arm64.deb;name=python3-gdal"
SRC_URI[python3-gdal.md5sum] = "adce1c7dae54e3f1b85800c8fc3d721d"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdal/libgdal-perl_3.0.4+dfsg-1build3_arm64.deb;name=libgdal-perl"
SRC_URI[libgdal-perl.md5sum] = "7817e5e3f05a5f882b94ee7af13d664f"

SRC_URI += "http://ports.ubuntu.com/ubuntu-ports/pool/universe/g/gdal/libgdal-java_3.0.4+dfsg-1build3_arm64.deb;name=libgdal-java"
SRC_URI[libgdal-java.md5sum] = "ec32b1975598bf24938954d0f0bf57ce"

# other configs to feed compilation
PKG_${UPN} = "libgdal"

DEPENDS += " unixodbc lapack armadillo cfitsio charls curl libdap epsilon expat freexl fyba geos libgeotiff giflib libhdf4 hdf5 json-c libkml xz mysql-8.0 netcdf ogdi-dfsg openjpeg2 pcre3 poppler postgresql proj qhull spatialite sqlite3 tiff uriparser libwebp xerces-c xml2 zstd python3-numpy unixodbc zlib"
