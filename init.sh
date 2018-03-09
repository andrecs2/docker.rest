#!/bin/bash 
cd string.stream
mvn clean package -Dmaven.test.skip=truee
docker volume create --name=spring-cloud-config-repo
docker-compose up

