FROM openjdk:17-jdk-alpine

WORKDIR /app

EXPOSE 8080

COPY target/demo.jar /app/demo.jar

CMD ["java", "-jar", "demo.jar"]