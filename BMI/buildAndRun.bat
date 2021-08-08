@echo off
call mvn clean package
call docker build -t com.mycompany/BMI .
call docker rm -f BMI
call docker run -d -p 9080:9080 -p 9443:9443 --name BMI com.mycompany/BMI