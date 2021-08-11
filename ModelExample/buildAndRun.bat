@echo off
call mvn clean package
call docker build -t com.mycompany/ModelExample .
call docker rm -f ModelExample
call docker run -d -p 9080:9080 -p 9443:9443 --name ModelExample com.mycompany/ModelExample