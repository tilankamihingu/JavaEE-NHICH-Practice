#!/bin/sh
mvn clean package && docker build -t com.mycompany/BMI .
docker rm -f BMI || true && docker run -d -p 9080:9080 -p 9443:9443 --name BMI com.mycompany/BMI