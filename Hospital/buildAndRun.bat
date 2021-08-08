@echo off
call mvn clean package
call docker build -t com.mycompany/Hospital .
call docker rm -f Hospital
call docker run -d -p 9080:9080 -p 9443:9443 --name Hospital com.mycompany/Hospital