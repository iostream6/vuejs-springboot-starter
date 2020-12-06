# vuejs-springboot-starter
A Vue.JS + SpringBoot  Maven based starter project


## Prerequisites

Please make sure you have the following components on you machine:

* ``npm``
* ``Vue CLI`` 
* ``JDK 8.0+``

## Development Builds

During development, the front and backend modules may be built seperately.

### Backend Build 
You can use the clean/build/run/debug directly on the backend sub-project (in your favourite IDE, e.g. Netbeans). Note that:

* By default, the backend build will use the frontend resources **previously** copied into its src/main/resources/public folder. 
* If you would like the backend build to use the latest frontend resources, do a combined build (see below) or copy the latest frontend resources into the src/main/resources/public folder.
* The backend server will run on port 8081 (can be changed in application.properties) and by default will be hot-reload enabled.

### Frontend Build 
You can use ``npm run build`` in the frontend folder to build the frontend. This is a production build and is not particlarly useful on its own. A faster, hosted, development build is achieved with ``npm run serve``. This will startup a webpack based server (on port 8080, separate from the backend server). Development builds are useful during debugging or quick iteration cycles.

### Combined Build
A custom `make` shell script is provided to build the full application. The command is  ``./make compile``. Essentially, this first performs a scripted frontend production build, copies the resulting resources to the appropriate backend folders and then does a backend build. The resulting backend jar has everything and can be run normally, to serve both the front and backend resources fromt a single origin.

For convenience, the custom `make` shell script also offers the option to perform a fast, hosted, development build with the ``./make serve`` command.

## Exclusions



