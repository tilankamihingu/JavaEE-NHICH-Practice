#!/bin/sh
mvn clean package && docker build -t com.mycompany/HospitalManagement .
docker rm -f HospitalManagement || true && docker run -d -p 9080:9080 -p 9443:9443 --name HospitalManagement com.mycompany/HospitalManagement