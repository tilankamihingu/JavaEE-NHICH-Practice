#!/bin/sh
mvn clean package && docker build -t com.mycompany/ModelExample .
docker rm -f ModelExample || true && docker run -d -p 9080:9080 -p 9443:9443 --name ModelExample com.mycompany/ModelExample