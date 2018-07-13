# android-docker-hello-world

This is "hello world" application built with Android and Kotlin. The build environment is inside a Docker container so it is very easy to build and install in a phone.

Build the docker image:

```
docker build -t android-docker .
```

Get a terminal to the container:

```
docker run -it --privileged --volume=$(pwd)/workspace:/opt/workspace android-docker bash
```

Build and install the app:

```
./gradlew installDebug
```
