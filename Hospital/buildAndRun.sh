#!/bin/sh
mvn clean package && docker build -t com.mycompany/Hospital .
docker rm -f Hospital || true && docker run -d -p 9080:9080 -p 9443:9443 --name Hospital com.mycompany/Hospital