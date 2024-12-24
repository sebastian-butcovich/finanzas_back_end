FROM openjdk:17-slim

WORKDIR /app

COPY target/app.jar /app/demo.jar

EXPOSE 3000

CMD["java", "jar", "/app/demo.jar"]