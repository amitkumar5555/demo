FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY /target/demo.jar /app

EXPOSE 8080

CMD["java","-jar","demo.jar"]