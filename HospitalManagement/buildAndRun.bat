@echo off
call mvn clean package
call docker build -t com.mycompany/HospitalManagement .
call docker rm -f HospitalManagement
call docker run -d -p 9080:9080 -p 9443:9443 --name HospitalManagement com.mycompany/HospitalManagement