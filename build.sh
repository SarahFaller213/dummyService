#!/usr/bin/env sh


###################################################################################

echo "make sure you are in the root folder : cart-services-sarah"

echo "Build JAR"
mvn clean install -DskipTests

echo "creating image"
docker build --tag=test.parallel.dummy:latest .

echo "running arquillian cube test"
mvn -U test -DserverUri=unix:///var/run/docker.sock -DdockerContainersFile=$PWD/docker-compose.yml -Darquillian.debug=false


###########################################################################################
